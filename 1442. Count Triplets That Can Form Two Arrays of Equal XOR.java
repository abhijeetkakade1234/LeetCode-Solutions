/* 1442. Count Triplets That Can Form Two Arrays of Equal XOR */

class Solution {
    public int countTriplets(int[] arr) {
        int  n = arr.length;
        int count = 0;
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++)
        {
            prefix[i + 1] = prefix[i] ^ arr[i];
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if(prefix[i] == prefix[j + 1])
                {
                    count += (j - i);
                }
            }
        }

        return count;
    }
}
