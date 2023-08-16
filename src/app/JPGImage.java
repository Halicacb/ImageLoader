package app;

public class JPGImage {
    private String fileName;

    public JPGImage(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void loadJPGImage() {
        System.out.println("Loading JPG image: " + fileName);
    }
}

