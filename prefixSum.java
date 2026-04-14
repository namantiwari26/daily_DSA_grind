public class prefixSum{
    //BruteForce
    public static int rangeSumBrute(int[] arr,int L,int R){
        int sum=0;
        for(int i=L;i<=R;i++){
            sum+=arr[i];
        }
        return sum;

    }
    //Optimized Approach
    public static int[] buildPrefix(int[] arr){
        int n=arr.length;
        int[] prefix=new int[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+arr[i];
        }
        return prefix;
    }
    public static int rangeSum(int[] prefix,int L,int R){
        return prefix[R+1]-prefix[L];
        
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int L=2;
        int R=4;
        int[] prefix=buildPrefix(arr);
        System.out.println(rangeSumBrute(arr, L, R));
        System.out.println(rangeSum(prefix, L, R));


    }
}