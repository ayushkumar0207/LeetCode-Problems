class Solution {
    public int maxIceCream(int[] costs, int coins) {
       Arrays.sort(costs);
        int res = 0;
        for(int i=0; i<costs.length; i++){
            if(coins - costs[i] >= 0){
                res ++;
                coins -= costs[i];
            }
            }else
                break;
        }
        return res;
    }
}