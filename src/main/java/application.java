import Robots.RobotFabric;
import Robots.RobotType;

public class application {
    public static void main(String[] args) {
        RobotFabric robotfabric = new RobotFabric();
        robotfabric.CreateRobot(RobotType.doctor);
        robotfabric.CreateRobot(RobotType.doctor);
        robotfabric.CreateRobot(RobotType.cleaner);
        robotfabric.CreateRobot(RobotType.doctor);
        System.out.println(robotfabric);
    }
}
