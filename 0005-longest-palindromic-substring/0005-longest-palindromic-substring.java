class Solution {
    public boolean ispalin(String s){
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))
            return false;
            l++;
            r--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        // if(s.length()==1)
        // return s;
        String p="",r="";
        int i,j;
        for(i=0;i<s.length();i++){
            for(j=i+1;j<=s.length();j++){
                p=s.substring(i,j);
                if(ispalin(p)){
                    if(r.length()<p.length()){
                        r=p;
                    }
                }
            }            
        }
        return r;
    }
}