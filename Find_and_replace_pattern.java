class Solution {
    
    boolean verify(String a, String b){
            for(int i=0;i<a.length();i++){
                if(a.indexOf(a.charAt(i))!=b.indexOf(b.charAt(i)))
                    return false;
               
            }
        return true;
        }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res=new ArrayList<String>();
        for(String i: words){
            if(verify(i, pattern))
                res.add(i);
        }
        return res;
        
    }
}
