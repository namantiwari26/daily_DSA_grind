import java.util.*;

public class Two_Sum {

    public static int[] twoSum(int[] nums,int target){
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int remaining=target-nums[i];

            if(map.containsKey(remaining)){
                return new int[]{map.get(remaining),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        int[] result = twoSum(nums,target);
        System.out.println("Output: "+Arrays.toString(result));
    }
    
}
