/* 165. Compare Version Numbers */

class Solution {
    public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\."); 
        String[] s2 = version2.split("\\.");
        int n = s1.length;
        int m = s2.length;

        int l = Math.max(n,m);

        for(int i = 0; i < l; i++)
        {
            Integer v1 = i < n ? Integer.parseInt(s1[i]) : 0; 
            Integer v2 = i < m ? Integer.parseInt(s2[i]) : 0;

            int comp = v1.compareTo(v2);
            if (comp != 0) return comp;
        }

        return 0;
    }
}
