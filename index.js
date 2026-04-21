function addition(a, b) {
    return a + b;
}

function soustraction(a, b) {
    return a - b;
}

if (require.main === module) {
    console.log("Addition:", addition(5, 3));
    console.log("Soustraction:", soustraction(5, 3));
}

module.exports = { addition, soustraction };