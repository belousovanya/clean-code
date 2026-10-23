package homework_2.task_10;

public class Kilometers implements Distance {
    private double kilometers;

    public Kilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    @Override
    public double getDistance() {
        return kilometers;
    }
}
