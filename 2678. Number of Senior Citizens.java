/* 2678. Number of Senior Citizens */

class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for (String passengerInfo : details){
            int age = Integer.parseInt(passengerInfo.substring(11, 13));

            if (age > 60) count++;
        }

        return count;
    }
}
