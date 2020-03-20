public class HomeWork5 {

    public static void main(String[] args) {

        int[][] array = new int[5][5];
        fillRandomNumbersArray(array);
        printArray(array);
    }


    private static void printArray(int[][]arr){
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    private static void fillRandomNumbersArray(int[][]arr ){
        for (int i=0;i < arr.length;i++){
            for (int j=0;j < arr[i].length;j++){
                arr[i][j]=(int)(Math.random()*10);
            }
        }
    }
}
