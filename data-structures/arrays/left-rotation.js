function processData(input) {
    var sparateEnter = input.split("\n");
    var denote = sparateEnter[0].split(" ");
    var numbersV1 = sparateEnter[1].split(" ");
    var numbersV2 = [];
    var rotation = 0;
    for(var i = 0; i < parseInt(denote[0]); i++) {
        if((i + parseInt(denote[1])) > (parseInt(denote[0]) - 1)) {
            rotation = (i + parseInt(denote[1])) - (parseInt(denote[0]));
        } else {
            rotation = i + parseInt(denote[1]);
        }
        numbersV2.push(parseInt(numbersV1[rotation]));
    }
    console.log(numbersV2.join(" "));
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});
