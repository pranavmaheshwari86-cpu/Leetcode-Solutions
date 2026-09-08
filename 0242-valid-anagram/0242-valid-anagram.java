class Solution {
    public boolean isAnagram(String s, String t) {
        char charr1[] = s.toCharArray();
        char charr2[] = t.toCharArray();

        Arrays.sort(charr1);
        Arrays.sort(charr2);

        s = String.valueOf(charr1);
        t = String.valueOf(charr2);

        if(s.equals(t))
            return true;
        return false;
    }
}