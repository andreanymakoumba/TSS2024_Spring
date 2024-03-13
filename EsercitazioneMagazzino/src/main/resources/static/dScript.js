const urlParams = new URLSearchParams(window.location.search);
const id = urlParams.get("id");
let nome = document.querySelector("#nome");
let prezzo = document.querySelector("#prezzo");
let descrizione = document.querySelector("#descrizione");

fetch("http://localhost:9010/api/prodotti/" + id)
  .then((res) => {
    return res.json();
  })
  .then((data) => {
    nome.textContent = "Nome: " + data.nome;
    prezzo.textContent = `Prezzo: ${data.prezzo}€`;
    descrizione.textContent = "Descrizione: " + data.descrizione;
  });

  fetch("http://localhost:9010/api/movimenti")
    .then((res) => {
      return res.json();
    })
    .then((data) => {
      data.forEach(mov => {
        if (mov.id_prodotto == id) {
          creazioneTabella(mov);
        }
      });
    })

  function creazioneTabella(movimento) {
    const TR = document.createElement("tr");
    const TD1 = document.createElement("td");
    const TD2 = document.createElement("td");
    const TD3 = document.createElement("td");
    
    TD1.textContent = movimento.data;
    TD2.textContent = movimento.entrate;
    TD3.textContent = movimento.uscite;
    
    TR.append(TD1, TD2, TD3);
    document.querySelector("table tbody").append(TR);
  }

let btnAddMov = document.querySelector("#btnAddMov");

btnAddMov.addEventListener("click", () => {
  let entrate = document.querySelector("#entrate").value;
  let uscite = document.querySelector("#uscite").value;
  let data = document.querySelector("#data").value;
  console.log(data);
  let movimento = {
    id_prodotto: id,
    entrate: entrate,
    uscite: uscite,
    data: data,
  };
  fetch("http://localhost:9010/api/movimenti", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(movimento),
  }).then((data) => {
      return data.json();
    });
    event.preventDefault();
});
