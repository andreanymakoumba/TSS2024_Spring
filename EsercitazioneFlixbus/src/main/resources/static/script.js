const URLEndpoint = "http://localhost:9007/api/"

function caricaPrenotazioni() {
    fetch(URLEndpoint+"prenotazioni")
      .then((data) => {
        return data.json();
      })
      .then((response) => {
        response.forEach((prenotazione) => {
          console.log(prenotazione);
        });
    });
}
function caricaViaggi() {

  let div = document.querySelector("#listViaggi");
    fetch(URLEndpoint+"viaggi")
      .then((data) => {
        return data.json();
      })
      .then((response) => {
        response.forEach((viaggio) => {
          div.appendChild(creaCard(viaggio))
          console.log(viaggio);
        });
    });
}
function caricaUtenti() {
    fetch(URLEndpoint+"utenti")
      .then((data) => {
        return data.json();
      })
      .then((response) => {
        response.forEach((utenti) => {
          console.log(utenti);
        });
    });
}

window.addEventListener("DOMContentLoaded", caricaViaggi());

function creaCard(viaggio) {
  let divP = document.createElement("div");
  divP.setAttribute("class", "card shadow text-bg-light m-3");
  divP.setAttribute("style", "width: 18rem;");
  let divF = document.createElement("div");
  divF.classList.add("card-body");
  let h5 = document.createElement("h5");
  h5.setAttribute("class", "card-title position-relative");
  h5.innerText = viaggio.origine;
  let h6 = document.createElement("h6");
  h6.setAttribute("class", "card-subtitle mb-2 text-body-secondary text-wrap");
  h6.innerText = viaggio.destinazione;
  let p = document.createElement("p");
  p.classList.add("card-text");
  p.innerText = viaggio.data;
  let btnPrenota = document.createElement("button");
  btnPrenota.setAttribute("class","align-items-center btn btn-success m-3");
  let f =`<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-cart-fill" viewBox="0 0 16 16">
  <path d="M0 1.5A.5.5 0 0 1 .5 1H2a.5.5 0 0 1 .485.379L2.89 3H14.5a.5.5 0 0 1 .491.592l-1.5 8A.5.5 0 0 1 13 12H4a.5.5 0 0 1-.491-.408L2.01 3.607 1.61 2H.5a.5.5 0 0 1-.5-.5M5 12a2 2 0 1 0 0 4 2 2 0 0 0 0-4m7 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4m-7 1a1 1 0 1 1 0 2 1 1 0 0 1 0-2m7 0a1 1 0 1 1 0 2 1 1 0 0 1 0-2"/>
  </svg>`;
  btnPrenota.innerHTML = f;
  
  btnPrenota.addEventListener("click", ()=>{
    btnPrenota.setAttribute("disabled", "");
  })
  divF.append(h5, h6, p);
  divP.append(divF, btnPrenota);
  return divP;
}