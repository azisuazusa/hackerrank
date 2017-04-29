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

function main() {
    var n = parseInt(readLine());
    var s = readLine();
    var k = parseInt(readLine());

    var matches = s.match(/[a-zA-Z-]+/g);
    var string = matches[0];
    var resultCode = [];
    var resultString = '';
    for(var i = 0; i < string.length; i++) {
        if(string.charAt(i) !== '-') {
            if(string.charCodeAt(i) + k > 90 && string.charCodeAt(i) < 97) {
                resultCode.push(string.charCodeAt(i) + k - 90 + 64);
            }
            else if((string.charCodeAt(i) + k) > 122){
                resultCode.push(string.charCodeAt(i) + k - 122 + 96);
            } else {
                resultCode.push(string.charCodeAt(i) + k);
            }
        } else {
            resultCode.push(string.charCodeAt(i));
        }
    }
    for(var j = 0; j < resultCode.length; j++) {
        resultString += String.fromCharCode(resultCode[j]);
    }
    console.log(resultString);

}
