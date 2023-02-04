public class RecursiveDigitSum {

    public static int superDigit(String n, int k) {

        int temp = findSum(n) * k;

        if(temp>9){
            temp = findSum(String.valueOf(temp));
        }

        return temp;

    }
    static int findSum(String num){
        if(num.length() == 1){
            return Integer.parseInt(num);
        }

        int sum =0;
        for(int i=0; i<num.length(); i++){
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        return findSum(String.valueOf(sum));
    }

}
