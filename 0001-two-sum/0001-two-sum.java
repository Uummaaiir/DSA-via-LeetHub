class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                     arr[0]=i;
                     arr[1]=j;

                     return arr;
                }
            }
        } 

        return arr;
    }    
}
    


//     public class minmax {
// tge
//     static void main() {
//         int[] arr ={ 1,2,3,4,6,4,7};

//         int target =9;

//         int min = 0;

//         int max = arr.length-1;

//         while(min < max){
//             int current = arr[min]+arr[max];

//             if(current == target){
//                 System.out.println("number is found  " + min+ ","+ max);
//                 min++;
//                 max--;
//             }else if (current< target){
//                 min ++;

//             }else {
//                 max--;
//             }



//         }

//     }
// }
