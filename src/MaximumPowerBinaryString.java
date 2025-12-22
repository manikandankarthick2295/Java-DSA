public class MaximumPowerBinaryString {

    public static void main(String[] args) {

        String s = "000100101";   // Sample input

        int zeroCount = 0;
        int maxPower = 0;

        // Traverse the string
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '0') {
                zeroCount++;                 // count zeros
            }
            else { // when character is '1'
                maxPower = Math.max(maxPower, zeroCount);
            }
        }

        if(s.charAt(s.length()-1)=='1'){
            maxPower-=1;
        }

        System.out.println("Maximum Power = " + maxPower);
    }
}
