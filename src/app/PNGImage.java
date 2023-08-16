package app;

public class PNGImage {
    private String fileName;

    public PNGImage(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void loadPNGImage() {
        System.out.println("Loading PNG image: " + fileName);
    }
}

