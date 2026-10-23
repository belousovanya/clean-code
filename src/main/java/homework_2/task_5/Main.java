package homework_2.task_5;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory;

        String typeOfFurniture = "Современная";

        if ("Классическая".equals(typeOfFurniture)) {
            furnitureFactory = new ClassicFurnitureFactory();
        } else {
            furnitureFactory = new ModernFurnitureFactory();
        }

        furnitureFactory.createChair().sitOn();
        furnitureFactory.createTable().use();
    }
}