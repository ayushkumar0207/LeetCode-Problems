class Solution {
    public int firstUniqChar(String s) {
        int ar[] = new int[26];
        for(int i=0; i<s.length(); i++)
            ar[s.charAt(i)-'a'] ++;
        for(int i=0; i<s.length(); i++){
            if(ar[s.charAt(i)-'a'] == 1)
                return i;
        }
        return -1;
    }
}