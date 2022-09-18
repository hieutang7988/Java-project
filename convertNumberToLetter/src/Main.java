import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number");
        int number = scanner.nextInt();
        int hunred = number / 100;
        int tens = (number % 100) / 10;
        int one = (number % 100) % 10;
        String yournumber = " ";
        String result1 = null;
        String result2 = null;
        String result3 = null ;
        String result4 = null;

        switch (hunred) {
            case 1:
                result1 = "one hundred";
                break;
            case 2:
                result1 = "two hundred";
                break;
            case 3:
                result1 = "three hundred";
                break;
            case 4:
                result1 = "four hundred";
                break;
            case 5:
                result1 = "five hundred";
                break;
            case 6:
                result1 = "six hundred";
                break;
            case 7:
                result1 = "seven hundred";
                break;
            case 8:
                result1 = "eight hundred";
                break;
            case 9:
                result1 = "nine hundred";
                break;
        }


        switch (tens) {

            case 0:
                if (one !=0)
                    result2 = "and";
                break;
            case 1:
                result2 = "ten";
                break;
            case 2:
                result2 = "twenty";
                break;
            case 3:
                result2 = "thirty";
                break;
            case 4:
                result2 = "fourty";
                break;
            case 5:
                result2 = "fifty";
                break;
            case 6:
                result2 = "sixty";
                break;
            case 7:
                result2 = "seventy";
                break;
            case 8:
                result2 = "eightty";
                break;
            case 9:
                result2 = "ninety";
                break;
        }

        switch (one) {

            case 0:
                result3 = "" ;
                  break;
            case 1:
                result3 = "one";
                break;
            case 2:
                result3 = "two";
                break;
            case 3:
                result3 = "three";
                break;
            case 4:
                result3 = "four";
                break;
            case 5:
                result3 = "five";
                break;
            case 6:
                result3 = "six";
                break;
            case 7:
                result3 = "seven";
                break;
            case 8:
                result3 = "eight";
                break;
            case 9:
                result3 = "nine";
                break;
            case 10:
                result3 = "ten";
                break;
            default:
                result3 = " ";
                break;
        }

        switch (number % 100){
            case 10:
                result4= "ten";
                break;
            case 11: result4 = "eleven"; break;
            case 12: result4 = "twelth"; break;
            case 13: result4 = "thirteen"; break;
            case 14: result4 = "fourteen"; break;
            case 15: result4 = "fifteen"; break;
            case 16:result4 = "sixteen"; break;
            case 17: result4 = "seventeen"; break;
            case 18: result4 = "eighteen"; break;
            case 19: result4 = "nineteen"; break;
        }

        if (number < 10) {
            System.out.printf("The number '%d' has %s ", number, result3);
        } else if (number < 20) {
            System.out.printf("The number '%d' has %s ", number, result4);
        } else if (number < 100) {
            yournumber = result2 + "\t" + result3;
            System.out.printf("The number '%d' has %s ", number, yournumber);
        } else if (number < 1000 ) {
            if (number%100==0){
                yournumber = result1;
                System.out.printf("The number '%d' has %s ", number, yournumber);
            }

            else if(number%100 <10) {
                yournumber = result1 +"\t" +"and" + "\t"+ result3;
                System.out.printf("The number '%d' has %s ", number, yournumber);
            }

             else if(number%100 <20) {
                yournumber = result1 + "\t" + result4;
                System.out.printf("The number '%d' has %s ", number, yournumber);
            }

           else  {
                yournumber = result1 + "\t" + result2 + "\t" + result3;
                System.out.printf("The number '%d' has %s ", number, yournumber);
            }
        }

        else {
            System.out.println("số bạn nhập vào không hợp lệ");
        }
    }
}