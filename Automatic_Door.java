package automaticdoor;


public class Automatic_Door {
    private DoorState state;

    public Automatic_Door() {
        // constructor the state of the door to "CLOSED" when created
        state = DoorState.FULLCLOSED;
    }

    
    // goto closing-->full closed  or  opening -->full 
    
    public void GoTo(DoorState newState) { 
        state = newState;
        System.out.println("Door    " + state);
    }

    
    
    
    public void doorFullOpen() {
 
        if (state == DoorState.OPENING) {
            GoTo(DoorState.FULLOPEN);
        }
    }

    public void doorFullClosed() {
       
        if (state == DoorState.CLOSING) {
           GoTo(DoorState.FULLCLOSED);
        }
    }

    public DoorState getState() {
        return state;
    }
}



