const binapp = document.querySelector(".binusapp");
const biapp = document.querySelector(".binus-app");
const biapp2 = document.querySelector(".binus-app2");

biapp.addEventListener("click", showapp);

let showlist = false;

function showapp() {
  if (!showlist) {
    binapp.style.display = "none";
    biapp.style.display = "inline-flex";
    biapp2.style.display = "inline-flex";
    showlist = true;
  } else {
    binapp.style.display = "inline-flex";
    biapp.style.display = "none";
    biapp2.style.display = "none";
    showlist = false;
  }
}

document.addEventListener("click", function (e) {
  if (
    !binapp.contains(e.target) &&
    !biapp.contains(e.target) &&
    !biapp2.contains(e.target)
  ) {
    binapp.style.display = "inline-flex";
    biapp.style.display = "none";
    biapp2.style.display = "none";
    showlist = false;
  }
});
