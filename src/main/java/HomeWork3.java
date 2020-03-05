
public class HomeWork3 {

    public static void main(String[] args) {

        //Task 1. Solution 1.
        System.out.println("---Task 1. Solution 1.---");
        checkSmallestNumber(4,9,3,6);
        System.out.println();

        //Task 1. Solution 2.
        System.out.println("---Task 1. Solution 2.---");
        int smallestNumber = checkSmallestByMathLib(4,9,3,6);
        System.out.println("The smallest number is: " + smallestNumber);
        System.out.println();

        //Task 2.
        System.out.println("---Task 2.---");
        checkEquality(1,1,1,1);
        checkEquality(1,1,2,2);
        checkEquality(1,1,1,2);
        checkEquality(1,2,3,4);
        System.out.println();

        //Task 3.
        System.out.println("---Task 3");
        calculateNumbers(1,2,'+');
        calculateNumbers(2,2,'-');
        calculateNumbers(3,5,'*');
        calculateNumbers(70,9, '/');

    }

    //Task 1. Solution 1.
    private static void checkSmallestNumber(int a, int b, int c, int d ){
        if ((a<=b)&&(a<=c)&&(a<=d)){
            System.out.println("The smallest number is: " +a);
        }else if ((b<=c)&&(b<d)){
            System.out.println("The smallest number is: " +b);
        }else if (c<=d){
            System.out.println("The smallest number is: " +c);
        }else {
            System.out.println("The smallest number is " + d);
        }
    }

    //Task 1. Solution 2.
    private static int checkSmallestByMathLib(int a, int b, int c, int d){
        return Math.min(a,Math.min(b,Math.min(c,d)));
    }

    //Task 2. Solution 1.

    private static void checkEquality(int a, int b, int c, int d){
        int match = (isEqual(a,b)+ isEqual(a,c)+ isEqual(a,d)+isEqual(b,c)+isEqual(b,d) + isEqual(c,d));
        if (match==0){
            System.out.println("All numbers are equal");
        }else if (match==3){
            System.out.println("Three numbers are equal");
        }else if(match==4||match==5){
            System.out.println("Two numbers are equal");
        }else {
            System.out.println("All numbers are different");
        }
    }

    private static int isEqual(int number1 , int number2){
        if (number1==number2){
            return 0;
        }
        else {
            return 1;
        }
    }


    //Task 3.
    private static void calculateNumbers(double firstNumber, double secondNumber, char operator ){
        double result;
        switch (operator){
            case '+':
                result = firstNumber + secondNumber;
                System.out.println(String.format("%s %c %s = %s" , firstNumber,operator,secondNumber,result));
                break;
            case '-':
                result = firstNumber - secondNumber;
                System.out.println(String.format("%s %c %s = %s" , firstNumber,operator,secondNumber,result));
                break;
            case '/':
                result = firstNumber / secondNumber;
                System.out.println(String.format("%s %c %s = %s" , firstNumber,operator,secondNumber,result));
                break;
            case '*':
                result = firstNumber * secondNumber;
                System.out.println(String.format("%s %c %s = %s" , firstNumber,operator,secondNumber,result));
                break;
            default:
                System.out.println("Wrong operator");
        }


    }

}
