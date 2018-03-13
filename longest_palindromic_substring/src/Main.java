public class Main {

    public static void main(String[] args) {
	// write your code here
        String test_string = "caba";
        Solution s = new Solution();
        System.out.println(s.longestPalindrome(test_string));
    }
}
class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1){
            return s;
        }
        int center = 0, range = 0;
        int start = 0, end = 0;


        for (center = 0; center + (end - start)/2 - 1 < s.length(); center++){
            for (range = (end-start)/2; center - range >= 0 && center + range < s.length() && end != s.length() - 1; range ++){


                String odd_substring = s.substring(center - range, center + range + 1);
                // Check if odd substring is longer than current longest substring
                if (string_is_palindromic (odd_substring)){
                    if (range * 2 > end - start){
                        start = center - range;
                        end = center + range;
                    }
                }
                // Check if even substring is longer than current longest substring
                if (center + range + 1 < s.length()){
                    String even_substring = s.substring(center - range, center + range + 2);
                    if (string_is_palindromic (even_substring)) {
                        if (range * 2 >= end - start) {
                            start = center - range;
                            end = center + range + 1;
                        }
                    }
                }
            }
        }
        if (start == end){
            return s.substring(0,1);
        }
        return s.substring(start,end + 1);
    }
    private Boolean string_is_palindromic (String s) {
        int index = 0;
        for (index = 0; index < s.length()/2; index ++){
            if (s.charAt(index) != s.charAt(s.length() - 1 - index)) {
                return false;
            }
        }
        return true;
    }

}