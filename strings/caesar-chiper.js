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

    var resultCode = [];
    var resultString = '';
    k = k % 26;
    for(var i = 0; i < s.length; i++) {
        if(s.charAt(i).match(/[a-zA-Z]/) !== null) {

            var charCode = s.charCodeAt(i) + k;
            if(s.charCodeAt(i) < 91) {
                if(charCode > 90) {
                    charCode = charCode - 90 + 64;
                    resultCode.push(charCode);
                } else {
                    resultCode.push(charCode);
                }
            }
            else if(s.charCodeAt(i) > 96 && s.charCodeAt(i) < 123){
                if(charCode > 122) {
                    charCode = charCode - 122 + 96;
                    resultCode.push(charCode);
                } else {
                    resultCode.push(charCode);
                }
            }
        } else {
            resultCode.push(s.charCodeAt(i));
        }
    }
    for(var j = 0; j < resultCode.length; j++) {
        resultString += String.fromCharCode(resultCode[j]);
    }
    console.log(resultString);
}
