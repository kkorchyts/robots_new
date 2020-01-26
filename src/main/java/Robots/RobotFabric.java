package Robots;

import java.util.ArrayList;

public class RobotFabric {
    private ArrayList<IRobot> list;

    public RobotFabric(){
        list = new ArrayList<IRobot>();
    }

    public void CreateRobot(RobotType robottype) {
        if (robottype == RobotType.cleaner)
            list.add(new Cleaner());
        if (robottype == RobotType.doctor)
            list.add(new Doctor());
    }

    @Override
    public String toString(){
        String result;
        result = "Count of robots: " + list.size() + "\r\n";
        for (IRobot iRobot : list) {
            BaseRobot baserobot = (BaseRobot)iRobot;
            if (baserobot instanceof Doctor ){
                result += "Doctor\n\r";
            }
            if (baserobot instanceof Cleaner ){
                result += "Cleaner\n\r";
            }
        }
        return result;
    }
}
