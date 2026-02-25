class Solution {
    public int[] distributeCandies(int candies, int num_people) {
    int[] result = new int[num_people];
    int give = 1;     
    int index = 0;
    while (candies > 0) {  
        int currentGive = Math.min(give, candies);   
        result[index] += currentGive;
        candies -= currentGive;    
        give++;
        index = (index + 1) % num_people;
    }
    return result;
}
    

}