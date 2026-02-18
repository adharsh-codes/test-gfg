
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> result= new ArrayList<>();
        int start=0;
        int currentsum=0;
        for(int i=0;i<arr.length;i++){
            currentsum += arr[i];
            while(currentsum> target && start  <=i){
                currentsum -= arr[start];
                start++;
            }
            if(currentsum==target){
                result.add(start+1);
                result.add(i+1);
                return result;
            }
        }
        result.add(-1);
        return result;
    }
}
