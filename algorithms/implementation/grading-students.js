process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////

function solve(grades){
    var lastNumber = 0;
    for(var i = 0; i < grades.length; i++) {
        lastNumber = Math.abs(grades[i]) % 10;
        if((grades[i] + 2) >= 40) {
            if(((lastNumber > 2) && (lastNumber < 5)) || ((lastNumber > 7) && (lastNumber < 10))) {
               if((lastNumber + 2) == 6 || (lastNumber + 2) == 11) {
                    grades[i] += 1;
               } else {
                    grades[i] += 2;
               }
            }
        }
    }
    return grades;
}

function main() {
    var n = parseInt(readLine());
    var grades = [];
    for(var grades_i = 0; grades_i < n; grades_i++){
       grades[grades_i] = parseInt(readLine());
    }
    var result = solve(grades);
    console.log(result.join("\n"));
}
