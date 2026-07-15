class Solution {
    int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == key) return mid;
            
            else if(arr[low] <= arr[mid]){
                if(arr[mid] >= key && arr[low] <= key) high = mid-1;
                else low = mid+1;
            }
            
            else{           //arr[low] > arr[mid] or arr[mid] <= arr[high]
                if(arr[mid] <= key && arr[high] >= key) low = mid+1;
                else high = mid-1;
            }
        }
        return -1;
    }
}