function solution(year) {
     return Math.floor(year/100) + ((year%100 ? 1 : year) % 10 ? 1 : 0);
}