package longestCommonPrefix;

public class longestCprefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }
        String First = strs[0] ;
        for (int i=0 ; i< First.length() ; i++ ) {
            char ch = First.charAt(i);
               for ( int j = 1 ; j < strs.length ; j++ ) {
                   if (i > strs[j].length() || ch != strs[j].charAt(i)) {
                       return First.substring(0,i) ;
                   }
               }
        }
    return First ;
    }


}
