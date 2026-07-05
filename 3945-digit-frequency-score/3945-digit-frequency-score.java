class Solution {
    public int digitFrequencyScore(int n) {

        int sum = 0;
        int a= 0;

        while(n!=0){
            a = n%10;
            sum= sum +a;
            n=n/10;
        }

        return sum;

    }
}

// class Solution {
//     public int score(int n) {

//         // Array to store the frequency of digits 0 to 9
//         int[] freq = new int[10];

//         // Count the frequency of each digit
//         while (n > 0) {
//             int digit = n % 10;   // Get the last digit
//             freq[digit]++;        // Increase the frequency of that digit
//             n = n / 10;           // Remove the last digit
//         }

//         // Calculate the score
//         int score = 0;

//         for (int i = 0; i < 10; i++) {
//             score = score + (i * freq[i]);
//         }

//         return score;
//     }
// }