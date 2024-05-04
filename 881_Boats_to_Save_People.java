/* 881. Boats to Save People */

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        Arrays.sort(people);
        int boatcount = 0;
        for (int i = 0, j = n - 1; i <= j; )
        {
            int sum = people[i] + people[j];
            if (sum <= limit)
            {
                boatcount++;
                i++;
                j--;
            }
            else if (people[j] <= limit)
            {
                boatcount++;
                j--;
            }
            
        }
        return boatcount;
    }
}
