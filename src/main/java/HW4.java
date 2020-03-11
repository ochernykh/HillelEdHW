public class HW4 {

    public int addNumbers(int first, int second){
        return first + second;
    }

    public static int addNumbers(int first, int second, int third){
        return first + second + third;
    }

    public double addNumbers(double first, double second){
        return first + second;
    }

    public int subtractNumbers (int first, int second){
        return first - second;
    }

    public static double subtractNumbers (double first, double second){
        return first - second;
    }

    public int multiplyNumbers(int first, int second){
        return first * second;
    }

    public static int multiplyNumbers (int first, int second, int third){
        return first * second * third;
    }

    public static double divideNumbers (double first, double second){
        if (second == 0){
            System.out.println("Can't divide by zero. ");
            return -1;
        }else {
            return first/second;
        }
    }






}


