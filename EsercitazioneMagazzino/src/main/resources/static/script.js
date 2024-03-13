const URL = "http://localhost:9010/api/prodotti";
fetch(URL)
  .then((data) => {
    return data.json();
  })
  .then((response) => {
    response.forEach((prodotto) => {
      creazioneTabella(prodotto);
    });
  });

startTooltips();

function startTooltips() {
  const tooltipTriggerList = document.querySelectorAll(
    '[data-bs-toggle="tooltip"]'
  );
  const tooltipList = [...tooltipTriggerList].map(
    (tooltipTriggerEl) => new bootstrap.Tooltip(tooltipTriggerEl)
  );
}

function creazioneTabella(prodotto) {
  const TR = document.createElement("tr");
  const TD1 = document.createElement("td");
  const TD2 = document.createElement("td");
  const TD3 = document.createElement("td");
  const btn = document.createElement("button");
  btn.setAttribute("class", "btn btn-primary");

  btn.addEventListener("click", () => {
    window.location = `dettaglio.html?id=${prodotto.id}`;
  });
  TD1.textContent = prodotto.nome;
  TD2.textContent = `${prodotto.prezzo} €`;
  TD3.textContent = prodotto.descrizione;
  btn.textContent = "Dettaglio";
  TR.append(TD1, TD2, TD3, btn);
  document.querySelector("table tbody").append(TR);
}

let btnAdd = document.querySelector("#btnAddProdotto");

btnAdd.addEventListener("click", function () {
  let nome = document.querySelector("#nome");
  let prezzo = document.querySelector("#prezzo");
  let descrizione = document.querySelector("#descrizione");
  let prodotto = {
    nome: nome.value,
    prezzo: prezzo.value,
    descrizione: descrizione.value,
  };
  fetch(URL, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(prodotto),
  }).then((data) => {
    return data.json();
  });

  location.reload();
});
