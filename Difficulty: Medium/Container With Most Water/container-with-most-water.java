class Solution {
    public int maxWater(int arr[]) {
        int maxArea = Integer.MIN_VALUE;;
        int ptr1 = 0;
        int ptr2 = arr.length-1;
        
        for(int i = 0; i < arr.length; i++){
            int h = Math.min(arr[ptr1], arr[ptr2]);
            int len = ptr2 - ptr1;
            maxArea = Math.max(maxArea, len * h);
            if(arr[ptr1] < arr[ptr2]) ptr1++;
            else ptr2--;
        }
        return maxArea;
    }
}