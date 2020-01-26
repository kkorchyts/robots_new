package Robots;

import sun.awt.windows.ThemeReader;

import java.util.ArrayList;

public class RobotFabric {
    private ArrayList<BaseRobot> list;

    public RobotFabric(){
        list = new ArrayList<BaseRobot>();
    }

    public void CreateRobot(RobotType robottype) {
        if (robottype == RobotType.cleaner)
            list.add(new Cleaner());
        if (robottype == RobotType.doctor)
            list.add(new Doctor());
    }

    public void CreateRobot(RobotType robottype, int capacity, int velocity, String name) {
        if (robottype == RobotType.cleaner)
            list.add(new Cleaner(capacity, velocity, name));
        if (robottype == RobotType.doctor)
            list.add(new Doctor(capacity, velocity, name));
    }


    public void run () {
        for (BaseRobot robot : list) {
            Thread t = new Thread(robot);
            t.start();
        }

        boolean appisrunning = true;

        do {
            appisrunning = false;
            for (IRobot irobot : list) {
                if (irobot.getStatus() != RobotStatus.finished)
                    appisrunning = true;
                break;
            }
        } while (appisrunning);


    }

    @Override
    public String toString(){
        String result;
        result = "Count of robots: " + list.size() + "\r\n";
        for (BaseRobot robot : list) {
            BaseRobot baserobot = robot;
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
