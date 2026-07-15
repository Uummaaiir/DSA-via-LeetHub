import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int index = 0;
        int[] arr = new int[m + n];

        for (int i = 0; i < m; i++) {
            arr[index] = nums1[i];
            index++;
        }

        for (int i = 0; i < n; i++) {
            arr[index] = nums2[i];
            index++;
        }

        Arrays.sort(arr);

        
       for(int i=0; i<arr.length; i++){
         nums1[i]=arr[i];
       }
    }
}