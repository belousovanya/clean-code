package homework_2.task_11;

public class DoorFacade {
    private DoorOpen openDoor;
    private DoorClose closeDoor;
    private DoorLock lockDoor;

    public DoorFacade(DoorOpen openDoor, DoorClose closeDoor, DoorLock lockDoor) {
        this.openDoor = openDoor;
        this.closeDoor = closeDoor;
        this.lockDoor = lockDoor;
    }

    public void doorControl(String action) {
        switch (action) {
            case "open" -> openDoor.open();
            case "close" -> closeDoor.close();
            case "lock" -> lockDoor.lock();
            default -> System.out.println("Неизвестная команда");
        }
    }
}
