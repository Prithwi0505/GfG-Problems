class Solution {
    public String reverseWords(String s) {
        List<String> lis = new ArrayList<>();
        int left = 0;
        int right = 0;
        for(int i = 0; i < s.length(); i++){
            while(left < s.length() && s.charAt(left) == '.'){
                left++;
                right++;
            }
            if(left >= s.length())
                break;
            while(right < s.length() && s.charAt(right) != '.')
                right++;
            lis.add(s.substring(left, right));
            left = right;
            right = left + 1;
        }
        // lis.add(s.substring(left, s.length()));
        Collections.reverse(lis);
        String res = String.join(".",lis);
        int start = 0;
        int end = res.length()-1;
        while(res.charAt(start) == '.') start++;
        while(res.charAt(end) == '.') end--;
        return res.substring(start, end+1);
    }
}
