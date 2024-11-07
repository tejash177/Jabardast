package Project;

public class Tablet extends Device {


        private MediaPlayer mediaPlayer;
        private Calculator calculator;
        private Camera camera;
        private WebBrowser webBrowser;

        // Constructor to initialize the features and call the superclass constructor
        public Tablet() {
            super("Tablet"); // Calls the constructor of the superclass (Device)
            mediaPlayer = new MediaPlayer();
            calculator = new Calculator();
            camera = new Camera();
            webBrowser = new WebBrowser();
        }

    @Override
    void showFeatures() {
        System.out.println("\nFeatures of " + deviceName + ":");
        System.out.println("1. Camera");
        System.out.println("2. Media Player");
        System.out.println("3. Calculator");
        System.out.println("5. Web Browser");
        System.out.println("6. Go Back");
        System.out.println("7. Go to Main Menu");
    }

    // Rest of the methods for features...
    public void browseWebb() {
        System.out.print("Enter the URL to browse: ");
        String url = scanner.next();
        webBrowser.browse(url);
    }

    public void useCalculator() {
        while (true) {
            System.out.println("\n--- Calculator ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Go Back");
            System.out.print("Choose an operation: ");
            int choice = scanner.nextInt();

            double num1, num2;
            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    calculator.add(num1, num2);
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    calculator.subtract(num1, num2);
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    calculator.multiply(num1, num2);
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    calculator.divide(num1, num2);
                    break;
                case 5:
                    return; // Go back to the previous menu
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }


    }
    public void useCamera() {
        while (true) {
            System.out.println("\n--- Camera ---");
            System.out.println("1. Take Photo");
            System.out.println("2. View Photos");
            System.out.println("3. Go Back");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    camera.takePhoto();
                    break;
                case 2:
                    camera.viewPhotos();
                    break;
                case 3:
                    return; // Go back to the previous menu
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    public void useMediaPlayer() {
        while (true) {
            System.out.println("\n--- Media Player ---");
            System.out.println("1. Play");
            System.out.println("2. Pause");
            System.out.println("3. Stop");
            System.out.println("4. Go Back");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    mediaPlayer.play();
                    break;
                case 2:
                    mediaPlayer.pause();
                    break;
                case 3:
                    mediaPlayer.stop();
                    break;
                case 4:
                    return; // Go back to the previous menu
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}


