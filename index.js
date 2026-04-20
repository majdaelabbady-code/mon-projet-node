function addition(a, b) {
  return a + b;
}

function soustraction(a, b) {
  return a - b;
}

// MODIF ICI (ajoute un texte différent)
console.log("Feature branch");

if (require.main === module) {
  console.log("Résultat addition:", addition(5, 3));
  console.log("Résultat soustraction:", soustraction(5, 3));
}

module.exports = { addition, soustraction };