const seluser = document.querySelector(".select_user");
const ele = document.querySelector(".element");
const ele2 = document.querySelector(".element2");

let list = false;

function userlist() {
  if (!list) {
    ele.style.display = "inline-flex";
    ele2.style.display = "inline-flex";
    list = true;
  } else {
    ele.style.display = "none";
    ele2.style.display = "none";
    list = false;
  }
}