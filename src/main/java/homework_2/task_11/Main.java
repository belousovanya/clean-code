package homework_2.task_11;

public class Main {
    public static void main(String[] args) {
        DoorOpen open = new DoorOpen();
        DoorClose close = new DoorClose();
        DoorLock lock = new DoorLock();

        DoorFacade door = new DoorFacade(open, close, lock);

        door.doorControl("open");
        door.doorControl("close");
        door.doorControl("lock");
    }
}
