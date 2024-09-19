
package automaticdoor;

public class Main {
    // to can put SECONED TIME throws InterruptedException
    public static void main(String[] args) throws InterruptedException {
        Automatic_Door door = new Automatic_Door();
        Sensor sensor = new Sensor(door);

        // SENARIO of the automatic door
          // DETECTED
       // now sensor deteced
        sensor.motionDetected(); // Now sensoir 
        Thread.sleep(4000); // it will open all on 4 seconed
        door.doorFullOpen(); // Door is open now (fullyopen)
        
     
       Thread.sleep(4000);  ////////// after 4 seconed 
        
        
        // after 4 seconed 
        // NO DETECTED
        sensor.noMotionDetected(); // door no sensoir ? it will cllosed
        Thread.sleep(4000); //it will closed all on 4 seconed
        door.doorFullClosed(); // Door is fully closed
    }
}

