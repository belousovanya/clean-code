package homework_2.task_10;

public class Main {
    public static void main(String[] args) {
        Miles miles = new Miles(1.0);
        MilesToKilometersAdapter adapter = new MilesToKilometersAdapter(miles);

        System.out.println(adapter.getDistance());
    }
}
