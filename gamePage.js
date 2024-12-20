var rivalLoveMeter=50;
var UserConMeter= 50;
var roundCount=0;
var result= "";
var userCard=0;
var compCard=0;
//need to add a function for keeping count of cards in hand//
//starts at zero to allow a fill hand and refill//
var playerHand= [];

const deck=[];
const healthValues = [1, 2, 5, 10, 15, 20];
const healthAmt = [3, 2, 5, 3, 1, 1];
const attackValues = [1, 2, 5, 10, 15, 20];
const attackAmt = [3, 2, 5, 3, 1, 1];
const boostValues = [2, 1, 5, 10, 15, 'x2'];
const boostAmt = [3, 2, 5, 3, 1, 1];

document.getElementsByClassName("rivalLove")[0].innerHTML=rivalLoveMeter;
document.getElementsByClassName("userCon")[0].innerHTML=UserConMeter;
document.getElementsByClassName("roundNumber")[0].innerHTML=roundCount;
document.getElementsByClassName("result")[0].innerHTML=result;

function rlmadd(){
    if (rivalLoveMeter <= 100 || rivalLoveMeter <= 0 ) { 
        rivalLoveMeter += 5;
    }
    checkrlm (rivalLoveMeter)
    return document.getElementsByClassName("rivalLove")[0].innerHTML=rivalLoveMeter;
}


function rlmminus(){
    if (rivalLoveMeter <= 100 || rivalLoveMeter >= 0 ) { 
        rivalLoveMeter -= 5;
    }
    checkrlm(rivalLoveMeter)
    return document.getElementsByClassName("rivalLove")[0].innerHTML=rivalLoveMeter;
}

function checkrlm(rivalLoveMeter) {
    switch (true) { 
        case rivalLoveMeter <= 0: 
            document.getElementsByClassName("result")[0].innerHTML = "Loss Love: Try Again";
            break;
        case rivalLoveMeter >=100:
            document.getElementsByClassName("result")[0].innerHTML = "You got em!";
            break;
        default:
            document.getElementsByClassName("result")[0].innerHTML = "";
            break;
    }
}

function ucmadd(){
    if (UserConMeter <= 100 || UserConMeter <= 0 ) { 
        UserConMeter += 5;
    }
    checkucm (UserConMeter)
    return document.getElementsByClassName("userCon")[0].innerHTML=UserConMeter;
}


function ucmminus(){
    if (UserConMeter <= 100 || UserConMeter >= 0 ) { 
        UserConMeter -= 5;
    }
    checkucm(UserConMeter)
    return document.getElementsByClassName("userCon")[0].innerHTML=UserConMeter;
}

function checkucm(UserConMeter) {
    switch (true) { 
        case UserConMeter <= 0: 
            document.getElementsByClassName("result")[0].innerHTML = "Loss Love: Try Again";
            break;
        case UserConMeter >=100:
            document.getElementsByClassName("result")[0].innerHTML = "You got em!";
            break;
        default:
            document.getElementsByClassName("result")[0].innerHTML = "";
            break;
    }
}


function roundadd(){
    roundCount+=1
    return document.getElementsByClassName("roundNumber")[0].innerHTML=roundCount;
}

function createCards(type, values, amt) {
    let cards = [];
    for (let i = 0; i < values.length; i++) {
        for (let j = 0; j < amt[i]; j++) {
            cards.push({ type: type, value: values[i] });
        }
    }
    return cards;
}

deck.push(...createCards('Health', healthValues, healthAmt));
deck.push(...createCards('Attack', attackValues, attackAmt));
deck.push(...createCards('Boost', boostValues, boostAmt));

// Fisher-Yates Shuffle
function shuffleDeck(deck) {
    for (let i = deck.length - 1; i > 0; i--) {
        const j = Math.floor(Math.random() * (i + 1));
        [deck[i], deck[j]] = [deck[j], deck[i]]; // Swap elements
    }
}

shuffleDeck(deck);
console.log(deck);

function drawCards(deck, hand, numberOfCards) {
    for (let i = 0; i < numberOfCards; i++) {
        if (deck.length > 0) {
            hand.push(deck.pop()); // Remove a card from the deck and add it to the hand
        } else {
            console.log("The deck is empty!");
            break;
        }
    }
}

function displayHand(hand) {
    console.log("Player's Hand:");
    hand.forEach((card, index) => {
        console.log(`Card ${index + 1}: Type - ${card.type}, Value - ${card.value}`);
    });
}

