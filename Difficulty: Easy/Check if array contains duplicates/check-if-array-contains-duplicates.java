class Solution {
    public boolean checkDuplicates(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}