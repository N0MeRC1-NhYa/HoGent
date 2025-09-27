// Utility functions for conversions
function toBin(n) { return n.toString(2); }
function toOct(n) { return n.toString(8); }
function toHex(n) { return n.toString(16).toUpperCase(); }
function fromBin(s) { return parseInt(s, 2); }
function fromOct(s) { return parseInt(s, 8); }
function fromHex(s) { return parseInt(s, 16); }

// Generate a random integer and float
function randomInt(min = 10, max = 255) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}
function randomFloat(min = 1, max = 255, decimals = 2) {
    const num = Math.random() * (max - min) + min;
    return parseFloat(num.toFixed(decimals));
}

function renderExercises() {
    
    let val = randomInt();

    const representations = [
        { name: '10', value: val.toString() },
        { name: '2', value: toBin(val) },
        { name: '8', value: toOct(val) },
        { name: '16', value: toHex(val) }
    ];

    // Pick a random representation to display
    const shownIndex = Math.floor(Math.random() * representations.length);
    const shownRep = representations[shownIndex];

    let targetIndex;
    do {
        targetIndex = Math.floor(Math.random() * representations.length);
    } while (targetIndex === shownIndex);
    const targetRep = representations[targetIndex];

    const intContainer = document.getElementById('integer');
    intContainer.childNodes.forEach(
        n => n.innerHTML = `(${shownRep.value})\
        <sub>${shownRep.name}</sub>\
         = (\
         <div class="hide">\
         </div>\
         <div class="target_value">\
         ${targetRep.value}\
         </div>)\
         <sub>${targetRep.name}</sub>`
    );

    intContainer.childNodes.forEach(n => n.querySelector('.hide').onclick = () => {
        n.querySelector('.hide').style.display = n.querySelector('.hide').style.display === 'none' ? 'inline-block' : 'none';
        n.querySelector('.target_value').style.display = n.querySelector('.target_value').style.display === 'none' ? 'inline-block' : 'none';
        console.log('clicked');
    });
}
// Create a conversion exercise section
function createConversionSection(type) {
    const container = document.createElement('div');
    container.className = 'conversion-section';

    // Generate values
    let value, valueStr;
    if (type === 'integer') {
        value = randomInt();
        valueStr = value.toString();
    } else {
        value = randomFloat();
        valueStr = value.toString();
    }

    // Prepare representations
    const representations = [
        { name: '10', value: valueStr },
        { name: '2', value: type === 'integer' ? toBin(value) : toBin(Math.floor(value)) },
        { name: '8', value: type === 'integer' ? toOct(value) : toOct(Math.floor(value)) },
        { name: '16', value: type === 'integer' ? toHex(value) : toHex(Math.floor(value)) }
    ];

    // Pick a random representation to display
    const shownIndex = Math.floor(Math.random() * representations.length);
    const shownRep = representations[shownIndex];

    // Pick a random target system (not the same as shown)
    let targetIndex;
    do {
        targetIndex = Math.floor(Math.random() * representations.length);
    } while (targetIndex === shownIndex);
    const targetRep = representations[targetIndex];


    // Exercise text
    const exercise = document.createElement('div');
    exercise.innerHTML = `
        <div>(${shownRep.value})<sub>${shownRep.name}</sub> = (<div class="hide"></div><div class="target_value">${targetRep.value}</div>)<sub>${targetRep.name}</sub></div>
    `;
    container.appendChild(exercise);

    const hideDiv = exercise.querySelector('.hide');
    const targetDiv = exercise.querySelector('.target_value');
    hideDiv.onclick = () => {
        targetDiv.style.display = targetDiv.style.display === 'none' ? 'block' : 'none';
    };


    // Refresh button
    
    return container;
}


window.onload = function() {
    renderExercises();
}