class Solution {
    public boolean isAnagram(String s, String t) {
        int[] store=new int[26];
        for(int i=0;i<s.length();i++){
            store[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            store[t.charAt(i)-'a']--;
        }
        for(int i:store)
            if(i!=0){
                return false;
            }
        return true;
            
    }
}
