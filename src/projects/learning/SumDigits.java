package projects.learning;

public class SumDigits{
    public static int sumDigits(int number){
        int sum = number;
        if(number >= 10){
            sum = 0;
            while(number > 0){
                // pull out last digit in number
                int lastDigit = number % 10;
                sum += lastDigit;
                // drop last digit in number
                number /= 10;
            }
        }
        System.out.println(sum);
        return sum;
    }
}