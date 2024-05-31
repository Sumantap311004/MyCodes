function validateForm() {
  var name = document.getElementById("name").value;
  var email = document.getElementById("email").value;
  var phone = document.getElementById("phone").value;
  var idNumber = document.getElementById("id-number").value;

  var nameRegex = /^[A-Z][a-zA-Z\s]*$/;
  var emailRegex = /^[^\s@]+@gmail\.com$/;
  var phoneRegex = /^\d+$/;

  if (!nameRegex.test(name)) {
    alert(
      "Nama harus diawali huruf kapital dan hanya boleh berisi huruf dan spasi."
    );
    return false;
  }

  if (!emailRegex.test(email)) {
    alert("Email harus valid dan menggunakan domain @gmail.com.");
    return false;
  }

  if (!phoneRegex.test(phone)) {
    alert("Nomor telepon harus berupa angka.");
    return false;
  }

  if (!phoneRegex.test(idNumber)) {
    alert("Nomor KTP harus berupa angka.");
    return false;
  }

  return true;
}

function calculateDuration() {
  var checkIn = new Date(document.getElementById("check-in").value);
  var checkOut = new Date(document.getElementById("check-out").value);

  var duration = Math.floor((checkOut - checkIn) / (1000 * 60 * 60 * 24));
  document.getElementById("duration").textContent =
    "Durasi Menginap: " + duration + " hari";
}

document
  .getElementById("check-in")
  .addEventListener("change", calculateDuration);
document
  .getElementById("check-out")
  .addEventListener("change", calculateDuration);

function updateClock() {
  var now = new Date();
  var hours = now.getHours();
  var minutes = now.getMinutes();
  var seconds = now.getSeconds();

  hours = hours < 10 ? "0" + hours : hours;
  minutes = minutes < 10 ? "0" + minutes : minutes;
  seconds = seconds < 10 ? "0" + seconds : seconds;

  var time = hours + ":" + minutes + ":" + seconds;
  document.getElementById("clock").textContent = time;

  setTimeout(updateClock, 1000);
}

updateClock();
