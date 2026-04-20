// VERSION MASTER
function addition(a, b) {
  return a + b;
}

// AUTRE MODIF ICI
console.log("Master branch");

// MODIF ICI (ajoute un texte différent)
console.log("Feature branch");

if (require.main === module) {
  console.log("Résultat:", addition(5, 3));
}

module.exports = { addition };