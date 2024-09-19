package automaticdoor;


public class Sensor {
    private Automatic_Door door;

    public Sensor(Automatic_Door door) {
        this.door = door;
    }

    public void motionDetected() {
        // If motion is detected and the door is closed, transition to "OPENING"
        if (door.getState() == DoorState.FULLCLOSED) {
            door.GoTo(DoorState.OPENING);
        }
    }

    public void noMotionDetected() {
        // If there is no motion and the door is open, transition to "CLOSING"
        if (door.getState() == DoorState.FULLOPEN) {
            door.GoTo(DoorState.CLOSING);
        }
    }
}