//Toggle Class Active untuk Hamburger Menu
const navbarNav = document.querySelector(".navbar-nav");
//Ketika Hamburger Menu diklik
document.querySelector("#hamburger-menu").onclick = (e) => {
  navbarNav.classList.toggle("active");
  e.preventDefault();
};

//Toogle class active untuk search form
const searchForm = document.querySelector(".search-form");
const searchBox = document.querySelector("#search-box");

document.querySelector("#search-button").onclick = (e) => {
  searchForm.classList.toggle("active");
  searchBox.focus();
  e.preventDefault();
};

// Toogle Class Active untuk Shopping-Cart
const shoppingCart = document.querySelector(".shopping-cart");
document.querySelector("#shopping-cart-button").onclick = (e) => {
  shoppingCart.classList.toggle("active");
  e.preventDefault();
};

// Perubahan di sini
//Klik di luar Elemen
const hm = document.querySelector("#hamburger-menu");
const sb = document.querySelector("#search-button");
const sc = document.querySelector("#shopping-cart-button");

document.addEventListener("click", function (e) {
  if (!hm.contains(e.target) && !navbarNav.contains(e.target)) {
    navbarNav.classList.remove("active");
  }
  if (!sb.contains(e.target) && !searchForm.contains(e.target)) {
    searchForm.classList.remove("active");
  }
  if (!sc.contains(e.target) && !shoppingCart.contains(e.target)) {
    shoppingCart.classList.remove("active");
  }
});

// Modal Box Deluxe
const itemDetailModalDeluxe = document.querySelector(
  "#item-detail-modal-deluxe"
);
const itemDetailButtonDeluxe = document.querySelector(
  ".item-detail-button-deluxe"
);

itemDetailButtonDeluxe.onclick = (e) => {
  itemDetailModalDeluxe.style.display = "flex";
  e.preventDefault();
};

// Klik tombol Close
document.querySelector(".close-icon-deluxe").onclick = (e) => {
  itemDetailModalDeluxe.style.display = "none";
  e.preventDefault();
};

// Klik di luar Modal
const modalDeluxe = document.querySelector("#item-detail-modal-deluxe");
window.onclick = (e) => {
  if (e.target == modalDeluxe) {
    modalDeluxe.style.display = "none";
    e.preventDefault();
  }
};

// Modal Box Twin
const itemDetailModalTwin = document.querySelector("#item-detail-modal-twin");
const itemDetailButtonTwin = document.querySelector(".item-detail-button-twin");

itemDetailButtonTwin.onclick = (e) => {
  itemDetailModalTwin.style.display = "flex";
  e.preventDefault();
};

// Klik tombol Close
document.querySelector(".close-icon-twin").onclick = (e) => {
  itemDetailModalTwin.style.display = "none";
  e.preventDefault();
};

// Klik di luar Modal
const modalTwin = document.querySelector("#item-detail-modal-twin");
window.onclick = (e) => {
  if (e.target == modalTwin) {
    modalTwin.style.display = "none";
    e.preventDefault();
  }
};

// Modal Box Family
const itemDetailModalFamily = document.querySelector(
  "#item-detail-modal-family"
);
const itemDetailButtonFamily = document.querySelector(
  ".item-detail-button-family"
);

itemDetailButtonFamily.onclick = (e) => {
  itemDetailModalFamily.style.display = "flex";
  e.preventDefault();
};

// Klik tombol Close
document.querySelector(".close-icon-family").onclick = (e) => {
  itemDetailModalFamily.style.display = "none";
  e.preventDefault();
};

// Klik di luar Modal
const modalFamily = document.querySelector("#item-detail-modal-family");
window.onclick = (e) => {
  if (e.target == modalFamily) {
    modalFamily.style.display = "none";
    e.preventDefault();
  }
};

// Modal Box PentHouse
const itemDetailModalPenthouse = document.querySelector(
  "#item-detail-modal-penthouse"
);
const itemDetailButtonPenthouse = document.querySelector(
  ".item-detail-button-penthouse"
);

itemDetailButtonPenthouse.onclick = (e) => {
  itemDetailModalPenthouse.style.display = "flex";
  e.preventDefault();
};

// Klik tombol Close
document.querySelector(".close-icon-penthouse").onclick = (e) => {
  itemDetailModalPenthouse.style.display = "none";
  e.preventDefault();
};

// Klik di luar Modal
const modalPenthouse = document.querySelector("#item-detail-modal-penthouse");
window.onclick = (e) => {
  if (e.target == modalPenthouse) {
    modalPenthouse.style.display = "none";
    e.preventDefault();
  }
};
