class Solution {
    public long sumAndMultiply(int n) {
        long x=0,s=0,i,p=0;
        for(i=n;i!=0;i=i/10){
            if(i%10!=0){
                x=x*10+i%10;
                s=s+i%10;
            }
        }
        i=x;x=0;
        while(i!=0){
            x=x*10+i%10;
            i=i/10;
        }
        return s*x;        
    }
}