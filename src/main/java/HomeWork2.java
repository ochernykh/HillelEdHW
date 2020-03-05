public class HomeWork2 {

    public static void main(String[] args) {

        byte varByte = 1;
        short varShort = 2;
        int varInt = 3;
        long varLong = 4;
        float varFloat = 5.0f;
        double varDouble = 6.0;
        char varChar = 'a';
        boolean varBoolean = true;

        long add = varInt + varLong;
        long sub = varLong - varInt;
        double mult = varDouble * varFloat;
        int div = varShort / varByte;
        int mod = varInt%2;

        System.out.println(String.format("varInt + varLong = %s", add));
        System.out.println("------*------");
        System.out.println(String.format("varLong - varInt =  %s", sub));
        System.out.println("------*------");
        System.out.println(String.format("varDouble * varFloat =  %s", mult));
        System.out.println("------*------");
        System.out.println(String.format("varShort / varByte =  %s", div));
        System.out.println("------*------");
        System.out.println(String.format("Incremented varInt = %s", ++varInt ));
        System.out.println("------*------");
        System.out.println(String.format("Decremented varLong = %s", --varDouble));
        System.out.println("------*------");
        System.out.println(String.format("varInt mod 2 = %s", mod));

    }
}
