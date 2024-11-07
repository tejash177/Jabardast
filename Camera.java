package Project;

public class Camera {
    private boolean isPhotoTaken = false;

    public void takePhoto() {
        if (!isPhotoTaken) {
            System.out.println("Taking a photo...");
            isPhotoTaken = true;
        } else {
            System.out.println("You already took a photo.");
        }
    }

    public void viewPhotos() {
        if (isPhotoTaken) {
            System.out.println("Viewing your photo...");
        } else {
            System.out.println("You don't have any photos yet.");
        }
    }
}
