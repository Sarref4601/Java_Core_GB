import java.util.Arrays;

class LessonFruits {
    public static void main(String[] args) {
        doLesson_Fruits();

        Integer[] integers = {5,4,3,2,1};
        doLesson_Array(integers, 1,2);
    }

    private static void doLesson_Fruits() {
        BoxFruit<Apples> appleBox = new BoxFruit<Apples>(1);
        BoxFruit<Oranges> orangeBox = new BoxFruit<Oranges>(2);
        BoxFruit<Apples> appleBox2 = new BoxFruit<Apples>(1);

        for (int i = 0; i < 3; i++) {
            orangeBox.addFruit(new Oranges(1));
            appleBox.addFruit(new Apples(1));
            appleBox2.addFruit(new Apples(1));
        }

        appleBox.addFruit(new Apples(1));
        appleBox.addFruit(new Apples(1));

        appleBox2.addFruit(new Apples(1));


        System.out.println("Weight appleBox: " + appleBox.getBoxWeight());
        System.out.println("Weight orangeBox: " + orangeBox.getBoxWeight());
        System.out.println("Weights equals - " + appleBox.compare(orangeBox));
        System.out.println("---------------------------------------------");

        appleBox.addFruits(appleBox2);

    }

    private static void doLesson_Array(Integer[] integers, int i, int j) {

        Integer a = integers[i];
        Integer b = integers[j];

        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;

        integers[i] = a;
        integers[j] = b;

        printArray(integers);
    }


    private static void printArray(Object[] array) {
        System.out.println(Arrays.toString(array));
    }
}
