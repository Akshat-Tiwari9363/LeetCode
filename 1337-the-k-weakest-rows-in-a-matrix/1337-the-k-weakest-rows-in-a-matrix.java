class Solution {

    private int weak(int idx[]) {
        int mi = 0, i;
        for (i = 1; i < idx.length; i++) {
            if (idx[i] < idx[mi]) {
                mi = i;
            }
        }
        idx[mi] = Integer.MAX_VALUE;
        return mi;
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        int idx[] = new int[mat.length];
        int r[] = new int[k];
        int i, j;
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    break;
                }
            }
            idx[i] = j;
        }
        for (i = 0; i < k; i++) {
            r[i] = weak(idx);
        }
        return r;
    }
}