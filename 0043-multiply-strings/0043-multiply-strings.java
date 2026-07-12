import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        // int n1 = Integer.parseInt(num1);
        // int n2 = Integer.parseInt(num2);

        // int product = n1*n2;

        // String s1 = String.valueOf(product);

        // return s1;

        BigInteger value1 = new BigInteger(num1);
        BigInteger value2 = new BigInteger(num2);

        BigInteger product = value1.multiply(value2);

        return product.toString();

        
    }
}