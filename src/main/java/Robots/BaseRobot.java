package Robots;

import java.awt.*;

enum RobotStatus {readytowork, inprogress, finished}
// branch multithread 2

public class BaseRobot implements IRobot , Runnable {
    private int capacity;
    private  int velocity;
    private String name;
    private RobotStatus status;

    public BaseRobot (){
        this.capacity = 10;
        this.velocity = 100;
        this.name = "noname";
        this.status = RobotStatus.readytowork;
    }

    public BaseRobot (int capacity, int velocity, String name){
        this.capacity = capacity;
        this.velocity = velocity;
        this.name = name;
        this.status = RobotStatus.readytowork;
    }

    public String getFullName (){
        return this.getClass().getSimpleName() + " : " + name;
    }



    public void start() {
        run();
    }

    public void pause() {

    }

    public void drop() {

    }

    public void killhimself() {

    }

    public RobotStatus getStatus() {
        return status;
    }

    public void run() {
        int delay = (int) 100 / velocity;
        if (delay < 1)
            delay = 1;
//        System.out.println("BEFORESTART" +getFullName() + "v: " + velocity + " c: " + capacity + " d: " + delay);

        if (status != RobotStatus.readytowork)
            return;
        try {
            status = RobotStatus.inprogress;
            for (int i = 0; i < capacity; i++) {
                System.out.println(getFullName() + " : Iteration - " + i );
                Thread.sleep(delay);
            }
            status = RobotStatus.finished;
        }
        catch (InterruptedException e) {

        }

    }
}
