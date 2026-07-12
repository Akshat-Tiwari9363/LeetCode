class Solution {
    public int[] arrayRankTransform(int[] a) {
        HashMap<Integer ,Integer> rk=new HashMap<>();
        int r[]=new int[a.length];
        int i,rnk=1;
        for(i=0;i<a.length;i++){
            r[i]=a[i];
        }
        Arrays.sort(r);
        for(i=0;i<r.length;i++){
            if(!(rk.containsKey(r[i]))){
                rk.put(r[i],rnk);
                rnk++;
            }
        }
        for(i=0;i<a.length;i++){
            a[i]=rk.get(a[i]);
        }
        return a;
    }
}