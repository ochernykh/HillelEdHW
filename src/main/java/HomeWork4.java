public class HomeWork4 {

    public static void main(String[] args) {

        HW4 hw4 = new HW4();

        int nonStaticAddition =  hw4.addNumbers(1,2);
        int staticAddition = HW4.addNumbers(3,4,5);
        double nonStaticAdditionDouble = hw4.addNumbers(1.0, 3.0);

        int nonStaticSubtraction = hw4.subtractNumbers(4,6);
        double staticSubtraction = HW4.subtractNumbers(4.7, 3.0);

        int nonStaticMultiplication = hw4.multiplyNumbers(3 , 5);
        int staticMultiplication = HW4.multiplyNumbers(4,6,8);

        double staticDivision = HW4.divideNumbers(3,9);

        System.out.println(String.format("nonStaticAddition result = %s", nonStaticAddition));
        System.out.println(String.format("staticAddition result = %s", staticAddition));
        System.out.println(String.format("nonStaticAdditionDouble result = %s", nonStaticAdditionDouble));
        System.out.println(String.format("nonStaticSubtraction result = %s", nonStaticSubtraction));
        System.out.println(String.format("staticSubtraction result = %s", staticSubtraction));
        System.out.println(String.format("nonStaticMultiplication result = %s", nonStaticMultiplication));
        System.out.println(String.format("staticMultiplication result = %s", staticMultiplication));
        System.out.println(String.format("staticDivision result = %s", staticDivision));

    }
}
