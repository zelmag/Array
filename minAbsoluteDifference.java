//returns a list of pairs with a minDifference
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr); //sort the arr
        int minDifference = Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1]-arr[i]<=minDifference){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i+1]);
                if(arr[i+1]-arr[i]==minDifference){
                    res.add(pair);
                }else{
                    res.clear();
                    res.add(pair);
                    minDifference=arr[i+1]-arr[i];
                }
            }
        }
        return res;
    }
}
