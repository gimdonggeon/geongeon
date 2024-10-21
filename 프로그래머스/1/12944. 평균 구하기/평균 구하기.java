class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++){
            avg += arr[i];
        }
        answer = (double)avg / arr.length;
        return answer;
    }
}