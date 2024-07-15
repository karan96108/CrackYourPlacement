class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int min =Integer.MAX_VALUE;
        int max= 0;
        // int profit =0;
        for(int price : prices){
            if(price <min){
                min = price;
            }
            else if(price -min > max){
                max = price -min;
            }

        }


        return max; 
    }
}
