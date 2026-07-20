class Solution {
    public void mergeArrays(int a[], int b[]) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i < a.length; i++){
            minHeap.add(a[i]);
        }
        for(int i = 0; i < b.length; i++){
            minHeap.add(b[i]);
        }
        for(int i = 0; i < a.length; i++){
            a[i] = minHeap.poll();
        }
        for(int i = 0; i < b.length; i++){
            b[i] = minHeap.poll();
        }
    }
}
