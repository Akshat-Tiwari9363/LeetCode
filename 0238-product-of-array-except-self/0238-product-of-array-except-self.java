class Solution {
    public int[] productExceptSelf(int[] n) {
        int m=1,i,z=0;
        for(i=0;i<n.length;i++){
            if(n[i]==0){
                z++;
            }else{
                m=m*n[i];
            }
        }
        for(i=0;i<n.length;i++){
            if(z==0){
                n[i]=m/n[i];
            }else if(z==1){
                if(n[i]==0){
                    n[i]=m;
                }else{
                    n[i]=0;
                }
            }else{
                n[i]=0;
            }
        }
        return n;
    }
}