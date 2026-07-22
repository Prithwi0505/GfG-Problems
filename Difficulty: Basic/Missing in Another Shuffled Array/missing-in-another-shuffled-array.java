class Solution {
    public int findMissing(int[] arr1, int[] arr2) {
        int ogSum = 0;
        for(int num : arr1){
            ogSum += num;
        }
        int sum2 = 0;
        for(int num2 : arr2){
            sum2 += num2;
        }
        return ogSum - sum2;
        
    }
}