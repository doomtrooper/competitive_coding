package gfg;

/**
 * Created by anand.p on 5/25/17.
 */
public class SortArray012 {
    public static void main(String[] args){
        int[] arr = {0, 1 , 2, 0, 1, 2};
     //   sortArray012(arr);
        System.out.println(getMaxDollars(12));
        //System.out.println(getMaxDollars(2));
        //System.out.println(getMaxDollars(100));
        //System.out.println(getMaxDollars(121));
        System.out.println(getMaxDollars(120));
    }

    private static void sortArray012(int[] arr) {
        int low=0, high = arr.length-1, mid = 0;
        while (mid<=high){
            switch (arr[mid]){
                case 0:
                    arr[mid] = arr[low];
                    arr[low] = 0;
                    mid++;
                    low++;
                    break;
                case 1:
                    mid++;
                    break;

                case 2:
                    arr[mid] = arr[high];
                    arr[high] = 2;
                    high--;
                    break;
            }
        }
    }


    private static int getMaxDollars(int i) {
        int[] dp = new int[i+1];
        return getMaxDollarsUtil(i, dp);
    }

    private static int getMaxDollarsUtil(int i, int[] dp) {
        if (i<12) return i;
        if (dp[i]==0){
            dp[i] = Math.max(getMaxDollarsUtil(i/2, dp)+getMaxDollarsUtil(i/3, dp)+getMaxDollarsUtil(i/4, dp),i);
        }
        return dp[i];
    }
}
