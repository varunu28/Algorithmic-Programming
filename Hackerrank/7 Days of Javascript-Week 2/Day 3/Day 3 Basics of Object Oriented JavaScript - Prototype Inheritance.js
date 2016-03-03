function Alpha(){}

Alpha.prototype.isAlpha = function(letter){
    return /^[a-zA-Z]$/.test(letter);
};

function Vowel(){}
Vowel.prototype = new Alpha() //Write in blank to inherit from Alpha

Vowel.prototype.isVowel = function(letter){
    return /^[aeiuoyAEIOUY]$/.test(letter);
};


function Consonant(){}
Consonant.prototype = new Alpha()  //Write in blank to inherit from Alpha

Consonant.prototype.isConsonant = function(letter){
    return /^[^aeiouyAEIOUY]$/.test(letter);
}


function processData(input) {
    var a = new Alpha();
    console.log(`'${input[0]}' is ${a.isAlpha(input[0])? ``: `not `}a letter.`);
    
    var b = new Vowel();
    console.log(`'${input[1]}' is ${b.isAlpha(input[1])? `a letter ${b.isVowel(input[1])? `and`: `but not`} a vowel.`: "not a letter."} `);
    
    var c = new Consonant();
    console.log(`'${input[2]}' is ${c.isAlpha(input[2])? `a letter ${c.isConsonant(input[2])? `and`: `but not`} a consonant.`: "not a letter."} `);
    
} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input.split(' '));
});
