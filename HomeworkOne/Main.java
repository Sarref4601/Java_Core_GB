package HomeworkOne;

public class Main {
    public static void main(String[] args) {
    Team burunduki = new Team("Burunduki",
            new Player("Vasya", 10),
            new Player("Kolya", 5),
            new Player("Alesha", 4),
            new Player("Masha", 9));

        Course course = new Course(new Cross(6), new Fight(7));
        course.doIt(burunduki);
    }
}
