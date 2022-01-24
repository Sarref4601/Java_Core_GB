public class Main {
    public static void main(String[] args) {
        printArray(new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "ggggg"}});
    }

    public static void printArray(String[][] array) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    System.out.print(array[i][j]);
                } catch (ArrayIndexOutOfBoundsException MyArraySizeException) {
                    System.out.println(MyArraySizeException + "ОШИБКА РАЗМЕРА МАССИВА");
                }

                int[][] arr2 = new int[4][4];
                    arr2[i][j] = Integer.parseInt(array[i][j]);
                            System.out.println(arr2[i][j] + arr2[i][j]);
            }
        }
    }
}