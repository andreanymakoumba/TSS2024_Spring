const URL = "http://localhost:9012/api/";
let today = getCurrentDate();
let testoIniziale = document.querySelector("#testoIniziale");
let domandeContainer = document.querySelector("#domandeContainer")
let btnInvia = document.querySelector("#btnInvia");

let userConnesso = JSON.parse(this.sessionStorage.getItem("userConnesso"));



function getCurrentDate() {
    const currentDate = new Date();
    const day = currentDate.getDate().toString().padStart(2, '0');
    const month = (currentDate.getMonth() + 1).toString().padStart(2, '0'); // Months are zero-based
    const year = currentDate.getFullYear();
    return `${year}-${month}-${day}`;
}

let risposte = [];
function createTest() {
    fetch(URL+"domandatest")
        .then((data) =>{
            return data.json();
        })
        .then((response) => {
            let i = 0;
            response.forEach(element => {
                if (element.test.dataTest === today) {
                    risposte.push(element.domanda.rispostaEsatta);
                    console.log(risposte);
                    creaDomanda(element, i++);
                }
            });
        })
}

function creaDomanda(elem, i) {
    let divDom = document.createElement("div");
    let domanda = document.createElement("h3");
    domanda.innerHTML =`${elem.domanda.testoDomanda}`;
    let risposta = document.createElement("textarea");
    risposta.setAttribute("id",`domanda${i}`);
    risposta.setAttribute("points", `${elem.domanda.punteggioDomanda}`)

    divDom.append(domanda, risposta);
    domandeContainer.appendChild(divDom);
}

btnInvia.addEventListener("click", ()=>{
    let punteggio = userConnesso.punteggio;
    let domande = document.querySelectorAll('[id^="domanda"]');
    console.log(punteggio);
    console.log(domande);

    let f = 0; 
    domande.forEach((elem)=>{
        if (elem.value == risposte[f++]) {
            punteggio += Number(elem.getAttribute("points"));
        }
    })
    // Inserire il test fatto in session
    userConnesso.punteggio = punteggio;
    userConnesso.testCompl = true;
    sessionStorage.setItem("userConnesso", JSON.stringify(userConnesso));
    console.log(punteggio);
});


function checkTestFatto() {
    if (!userConnesso.testCompl) {
        //fai test giornaliero
        testoIniziale.innerText = "Puoi fare il test"
        createTest();
        // userConnesso.testCompl = true;
        // sessionStorage.setItem("userConnesso", JSON.stringify(userConnesso));
    } else {
        //non fare test
        testoIniziale.innerText = `Hai già fatto il test di oggi, il tuo punteggio è: ${userConnesso.punteggio}`
        
    }
}

window.addEventListener("DOMContentLoaded", checkTestFatto);
