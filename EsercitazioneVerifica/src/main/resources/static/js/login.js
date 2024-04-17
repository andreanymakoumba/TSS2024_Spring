
let username = document.querySelector("#elUsername");
let password = document.querySelector("#elPassword");
let btnLogin = document.querySelector("#btnLogin");

class Utente {
    constructor(user, password, testCompl, punteggio) {
        this.user = user;
        this.password = password;
        this.testCompl= testCompl;
        this.punteggio = punteggio;
    }
}
let arrayUtenti = JSON.parse(sessionStorage.getItem("utenti") || "[]");


btnLogin.addEventListener("click", registraUtente);

function registraUtente() {

    let esiste = arrayUtenti.find(utente => utente.user === username.value);
    
    let u = new Utente(username.value, password.value, false, 0);
    console.log(u.user);
    if (!esiste) {
        arrayUtenti.push(u);   
    }
    sessionStorage.setItem("userConnesso", JSON.stringify(u));
    sessionStorage.setItem("utenti", JSON.stringify(arrayUtenti));

}