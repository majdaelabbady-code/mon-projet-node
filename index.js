// addition(a, b) -> retourne la somme
function addition(a, b) {
  return a + b; // simple addition
}

if (require.main === module) {
  console.log("Résultat:", addition(5, 3));
}

module.exports = { addition };