class Solution {
    public double medianOf2(int a[], int b[]) {
        int[] merged = new int[a.length + b.length];
        int ptr1 = 0;
        int ptr2 = 0;
        int idx = 0;
        while(ptr1 < a.length && ptr2 < b.length){
            if(a[ptr1] <= b[ptr2]) merged[idx++] = a[ptr1++];
            else merged[idx++] = b[ptr2++];
        }
        while(ptr1 < a.length){
            merged[idx++] = a[ptr1++];
        }
        while(ptr2 < b.length){
            merged[idx++] = b[ptr2++];
        }
        double res;
        if(merged.length % 2 == 0) res = (merged[merged.length/2] + merged[(merged.length/2)-1]) / 2.0;
        else res = merged[merged.length/2];
        return res;
    }
}