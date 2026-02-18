package isPalindrome;

public class Palindrome {
    private static boolean checkPalindrome(String str) {

        // melekher deux indices wahda temchi melisar lel imin lo5ra l3aks w ychekiw ken yl9ao 3aks b3adhhom yo5rjou false sinon true ;
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;

        }
        return true;
    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String num = x + ""; // lehne badalna el int into string
        return checkPalindrome(num);

    }
}