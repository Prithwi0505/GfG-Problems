class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int largest2 = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest2 = largest;
                largest = arr[i];
            }
            if(arr[i] > largest2 && arr[i] < largest) largest2 = arr[i];
        }
        if(largest2 != Integer.MIN_VALUE) return largest2;
        return -1;
    }
}