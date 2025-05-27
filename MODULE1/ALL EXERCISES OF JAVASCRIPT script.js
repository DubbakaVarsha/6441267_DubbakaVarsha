function showConfirmation() {
    document.getElementById("confirmationMsg").value = "Registration Successful!";
  }

  function validatePhone() {
    const phone = document.getElementById("phone").value;
    if (!/^\d{10}$/.test(phone)) alert("Enter 10-digit phone number.");
  }

  function showFee(value) {
    document.getElementById("feeDisplay").textContent = `Fee: $${value}`;
  }

  function enlarge(img) {
    img.style.width = "200px";
  }

  function countChars(el) {
    document.getElementById("charCount").textContent = `${el.value.length} characters`;
  }

  function videoReady() {
    document.getElementById("videoMsg").textContent = "Video ready to play";
  }

  window.onbeforeunload = function() {
    return "You have unsaved changes!";
  };

  function savePref(val) {
    localStorage.setItem("preferredEvent", val);
  }

  function clearPrefs() {
    localStorage.clear();
    sessionStorage.clear();
  }

  window.onload = function() {
    const saved = localStorage.getItem("preferredEvent");
    if (saved) document.getElementById("eventSelect").value = saved;
  };

  function findEvents() {
    if (navigator.geolocation) {
      navigator.geolocation.getCurrentPosition(showLocation, showError, { enableHighAccuracy: true });
    } else {
      document.getElementById("locationOutput").textContent = "Geolocation not supported.";
    }
  }

  function showLocation(position) {
    document.getElementById("locationOutput").textContent =
      `Lat: ${position.coords.latitude}, Lon: ${position.coords.longitude}`;
  }

  function showError(error) {
    document.getElementById("locationOutput").textContent = "Error: " + error.message;
  }