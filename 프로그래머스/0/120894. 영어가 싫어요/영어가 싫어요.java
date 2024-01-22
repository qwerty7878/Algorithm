class Solution {
    public long solution(String numbers) {
        String[] NumArr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for(int i = 0; i < NumArr.length; i++){
            numbers = numbers.replaceAll(NumArr[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
    /*
    numbers = numbers.replace("zero", "0");
    numbers = numbers.replace("one", "1");
    numbers = numbers.replace("two", "2");
    numbers = numbers.replace("three", "3");
    numbers = numbers.replace("four", "4");
    numbers = numbers.replace("five", "5");
    numbers = numbers.replace("six", "6");
    numbers = numbers.replace("seven", "7");
    numbers = numbers.replace("eight", "8");
    numbers = numbers.replace("nine", "9");
    replaceAll대신 replace를 사용해서 1개씩 해도됨
    */
}