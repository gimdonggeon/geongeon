class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int avg = 0;        
        for (int i=0; i < numbers.length; i++){
            avg += numbers[i];
        }
        answer = (double)avg / numbers.length;
        
        return answer;
    }
}