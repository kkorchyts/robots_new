package Robots;

public interface IRobot {
    void start();
    void pause();
    void drop();
    void killhimself();
    int getStatus();
}