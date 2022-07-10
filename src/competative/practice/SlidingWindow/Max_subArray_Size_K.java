package competative.practice.SlidingWindow;

public class Max_subArray_Size_K {


    // Approach 1 : Optimal Approach
    // T.C = O(n)
    // S.C = O(1)
    static int getMaxSubArraySize_Approach1(int[] a, int k){
        int windowSize = 0;
        int maxSum = 0;

        // calculate first sliding window
        for(int i =0; i< k; i++){
            windowSize += a[i];
            maxSum = windowSize;
        }
        // remaining Sliding window
        for(int j =k ; j < a.length; j++){
            windowSize += a[j] - a[j-k];
            maxSum = Math.max(maxSum, windowSize);
        }
        return maxSum;
    }

    // Approach 2: Brute Force
    // T.C = O(n*k) ~ O(n2)
    // S.C : O(1)
    static int getMaxSumOfArray_Approach2(int[] a, int k){
        int max_sum = 0;

        // array size - subarray size
        for (int i=0; i <= a.length - k; i++){
            // add and add sum to windowsize
            int max_window_size = 0;
            for(int j= i; j < i + k; j++) {
                max_window_size += a[j];
            }
            max_sum = Math.max(max_window_size, max_sum);
        }

        return max_sum;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 5, 8, 10, 2, 7, 9};
        System.out.println(getMaxSubArraySize_Approach1(a,4));
//        System.out.println(getMaxSumOfArray_Approach2(a,4));
    }
}
