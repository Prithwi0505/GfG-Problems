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
    public void rotateArr(int arr[], int d) {
        d = d % arr.length;
        d = arr.length - d;
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
    }
}