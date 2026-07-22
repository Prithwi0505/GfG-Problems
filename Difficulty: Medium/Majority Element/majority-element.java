class Solution {
    int majorityElement(int arr[]) {
        int maj = arr[0];
        int c = 1;
        for(int i = 1; i < arr.length; i++){
            if(c == 0){
                maj = arr[i];
                c++;
            }
            else if(maj == arr[i]) c++;
            else c--;
        }
        c = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == maj) c++;
        }
        if(c > arr.length/2) return maj;
        return -1;
    }
}