import Robots.*;

import javax.print.Doc;

public class application {

    public static class myRunnable implements Runnable {

        public void run() {
            for (int i = 0; i < 100 ; i++) {
                System.out.println(i);

            }
        }
    }

    public static void main(String[] args) {
        RobotFabric robotfabric = new RobotFabric();
        robotfabric.CreateRobot(RobotType.doctor, 4, 20, "Doctor 1");
        robotfabric.CreateRobot(RobotType.doctor, 15, 2, "Doctor 2");
        robotfabric.CreateRobot(RobotType.cleaner, 14, 12, "Cleaner 1");
        robotfabric.CreateRobot(RobotType.doctor, 3, 1, "Doctor 3");
        robotfabric.run();
    }
}
