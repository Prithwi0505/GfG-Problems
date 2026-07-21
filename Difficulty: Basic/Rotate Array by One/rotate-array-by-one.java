class Solution {
    public void reverse(int[] arr, int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] arr) {
        reverse(arr, 0, arr.length-1);
        reverse(arr, 1, arr.length-1);
    }
}