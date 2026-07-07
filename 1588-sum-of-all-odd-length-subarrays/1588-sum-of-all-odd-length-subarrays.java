class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        // int answer = 0;
        // int n = arr.length;

        // for (int start = 0; start < n; start++) {

        //     for (int end = start; end < n; end++) {

        //         int length = end - start + 1;

        //         if (length % 2 != 0) {

        //             int sum = 0;

        //             for (int k = start; k <= end; k++) {
        //                 sum += arr[k];
        //             }

        //             answer += sum;
        //         }
        //     }
        // }

        // return answer;

        int answer =0;

        for(int i=0; i<arr.length; i++){
            int left = i+1;
            int right = arr.length-i;

            int total = left * right;

            int oddcount = (total+1)/2;

            int contrubution = arr[i]* oddcount;

            answer = answer+ contrubution;

        }

        return answer;


            
        } 
    }
