const URL = "https://api.tvmaze.com/singlesearch/shows?q=";
let nome = document.querySelector("#titolo");
let genere = document.querySelector("#genere");
let valutazione = document.querySelector("#valutazione");
let trama = document.querySelector("#trama");

let btn = document.querySelector("#btnSearch");
btn.addEventListener("click", cerca);

function cerca() {
  let titolo = document.querySelector("#nomeSerie").value;
  console.log(URL + titolo);
  fetch(URL + titolo)
    .then((res) => res.json())
    .then((res) => {
      nome.value = res.name;
      genere.value = res.genres;
      valutazione.value = res.rating.average;
      trama.value = res.summary;
    })
    .catch((e) => console.log("Errore " + e));
}

