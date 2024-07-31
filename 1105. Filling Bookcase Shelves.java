/* 1105. Filling Bookcase Shelves */

class Solution {
    Integer[][] memo;
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int n = books.length;
        memo = new Integer[n][shelfWidth + 1];
        return solve(books, shelfWidth, 0, 0, 0);
    }
    private int solve(int[][] books, int shelfWidth, int width, int index, int maxHeight){
        if(index == books.length) return 0;
        if(memo[index][width] != null) return memo[index][width];
        int addToNewRack = books[index][1] + solve(books, shelfWidth, books[index][0], index + 1, books[index][1]);
        int addToExistingRack = Integer.MAX_VALUE;
        if (shelfWidth >= width + books[index][0]){
           addToExistingRack = Math.max(books[index][1] - maxHeight, 0) + solve(books, shelfWidth, width + books[index][0], index+1, Math.max(maxHeight, books[index][1]));
        }

        return memo[index][width] = Math.min(addToNewRack, addToExistingRack);
    }
}
