const URL = "http://localhost:9012/api/";
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
    
    if (!esiste) {
        let u = new Utente(username.value, password.value, false, 0);
        fetch(URL+`persone`, {
            method: "POST",
            headers: {
              "Content-Type": "application/json",
            },
            body: JSON.stringify(new Utente(username.value, 0)),
          }).then((data) => {
            return data.json();
          }).then(()=>{
              console.log(u.user);
              document.getElementById("login-error").innerText = "Utente non trovato. Registrazione effettuata.";
            //   sessionStorage.setItem("userConnesso", JSON.stringify(u));
              arrayUtenti.push(u);   
              event.preventDefault();
              sessionStorage.setItem("utenti", JSON.stringify(arrayUtenti));
        });
    }else{
        let userConnesso = JSON.parse(this.sessionStorage.getItem("userConnesso") || null);
        sessionStorage.setItem("userConnesso", JSON.stringify(userConnesso));
        sessionStorage.setItem("utenti", JSON.stringify(arrayUtenti));
        
    }

}