public class Main {

    public static void main(String[] args) {
	// write your code here
        String test_string = "aaassssaaassassaas";
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
        int largest_range = 0, selected_center = 0;
        Boolean even_center = null;


        for (center = 0; center < s.length(); center++){
            for (range = largest_range; center - range >= 0 && center + range + 1 <= s.length() ; range ++){

                if (is_palindromic_odd (s, center, range)){
                    if (range > largest_range){
                        selected_center = center;
                        largest_range = range;
                        even_center = false;
                    }
                }
                if (center + range + 1 < s.length()){
                    if (is_palindromic_even(s, center, range)){
                        if (range >= largest_range){
                            selected_center = center;
                            largest_range = range;
                            even_center = true;
                        }
                    }
                }
            }
        }
        if (even_center == null){
            return s.substring(0,1);
        }
        else if (even_center){
            return s.substring(selected_center - largest_range, selected_center + largest_range + 2);
        }
        else{
            return s.substring(selected_center - largest_range, selected_center + largest_range + 1);
        }


    }
    public Boolean is_palindromic_even (String s, int center, int range) {
        int index = 0;
        String sub_s = s.substring(center - range, center + range + 2);
        for (index = 0; index < sub_s.length()/2; index ++){
            if (sub_s.charAt(index) != sub_s.charAt(sub_s.length() - 1 - index)) {
                return false;
            }
        }
        return true;
    }



    public Boolean is_palindromic_odd(String s, int center, int range){
        int index = 0;
        String sub_s = s.substring(center - range, center + range + 1);
        for (index = 0; index < sub_s.length()/2; index ++){
            if (sub_s.charAt(index) != sub_s.charAt(sub_s.length() - 1 - index)) {
                return false;
            }
        }
        return true;
    }
}