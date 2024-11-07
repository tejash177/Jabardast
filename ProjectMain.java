package Project;

import java.util.Scanner;

public class ProjectMain {

            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Device[] devices = {
                    new Smartphone(),
                    new Tablet()
            };

            while (true) {
                System.out.println("\n--- Main Menu ---");
                System.out.println("1. Smartphone");
                System.out.println("2. Tablet");
                System.out.println("3. Exit");
                System.out.print("Choose a device: ");
                int deviceChoice = scanner.nextInt();

                if (deviceChoice == 3) {
                    break;
                }

                Device selectedDevice = devices[deviceChoice - 1];
                while (true) {
                    selectedDevice.showFeatures();
                    int featureChoice = scanner.nextInt();


                    switch (featureChoice) {
                        case 1:
                            Smartphone currentDevice = new Smartphone();
                            break;
                        case 2:
                            if (selectedDevice instanceof Smartphone) {
                                ((Smartphone) selectedDevice).useMediaPlayer();
                            } else {
                                ((Tablet) selectedDevice).useMediaPlayer();
                            }
                            break;
                        case 3:
                            if (selectedDevice instanceof Smartphone) {
                                ((Smartphone) selectedDevice).useCalculator();
                            } else {
                                ((Tablet) selectedDevice).useCalculator();
                            }
                            break;
                        case 4:
                            if (selectedDevice instanceof Smartphone) {
                                ((Smartphone) selectedDevice).makeCall();
                            }
                            break;
                        case 5:
                            if (selectedDevice instanceof Smartphone) {
                                ((Smartphone) selectedDevice).sendText();
                            }
                            break;
                        case 6:
                            if (selectedDevice instanceof Smartphone) {
                                ((Smartphone) selectedDevice).browseWeb();
                            } else if (selectedDevice instanceof Tablet) {
                                ((Tablet) selectedDevice).browseWebb();
                            }
                            break;
                        case 7:
                            break;
                        case 8:
                            return; // Go back to the main menu
                        default:
                            System.out.println("Invalid option. Try again.");
                    }
                }
            }
        }
    }
