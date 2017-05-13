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

function getRecord(s){
    var highest = [s[0]];
    var lowest = [s[0]];
    var countHighest = 0;
    var countLowest = 0;
    for(var i = 1; i < s.length; i++) {
        if(s[i] > highest[i - 1]) {
            highest.push(s[i]);
            countHighest++;
        } else {
            highest.push(highest[i - 1]);
        }

        if(s[i] < lowest[i - 1]) {
            lowest.push(s[i]);
            countLowest++;
        } else {
            lowest.push(lowest[i - 1]);
        }
    }
    return [countHighest, countLowest];
}

function main() {
    var n = parseInt(readLine());
    s = readLine().split(' ');
    s = s.map(Number);
    var result = getRecord(s);
    console.log(result.join(" "));
}
