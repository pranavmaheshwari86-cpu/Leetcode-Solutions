class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char charr[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char ch : charr) {
            if(Character.isAlphabetic(ch) || Character.isDigit(ch)){
                sb.append(ch + "");
            }
        }
        StringBuilder sb1 = new StringBuilder(sb.toString());

        String revstr = sb1.reverse().toString();

        return sb.toString().equals(revstr);
    }
}