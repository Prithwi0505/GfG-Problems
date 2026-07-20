// User function Template for Java

class Solution {

    String calc_Sum(int arr1[], int arr2[]) {
        StringBuilder ans = new StringBuilder();
        int ptr1 = arr1.length-1;
        int ptr2 = arr2.length-1;
        int carry = 0;
        while(ptr1 >= 0 || ptr2 >= 0 || carry > 0){
            int sum = carry;
            if(ptr1 >= 0) sum += arr1[ptr1--];
            if(ptr2 >= 0) sum += arr2[ptr2--];
            ans.append(sum % 10);
            carry = sum / 10;
        }
        return ans.reverse().toString();
    }
}
