package Project;

import java.util.Scanner;

abstract class Device {

    String deviceName;
    Scanner scanner = new Scanner(System.in);


    public Device(String deviceName) {
        this.deviceName = deviceName;
    }

    abstract void showFeatures();
}

