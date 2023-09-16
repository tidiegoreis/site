function solution(inputString) {

 var len = inputString.length;
 for (var i = 0; i < len/2; i++) {
   if (inputString[i] !== inputString[len - 1 - i]) {
       return false;
   }
 }
 return true;
}
