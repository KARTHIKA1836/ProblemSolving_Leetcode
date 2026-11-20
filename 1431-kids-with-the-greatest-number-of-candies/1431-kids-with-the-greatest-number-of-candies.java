class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = Arrays.stream(candies).max().getAsInt();
        List<Boolean> res = new ArrayList<>();
        for(int candy : candies){
            res.add(candy + extraCandies >= maxCandy);
        }
        return res;
    }
}