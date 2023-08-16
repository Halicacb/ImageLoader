package app;

public class JPGImageAdapter implements ImageAdapter {
    private JPGImage jpgImage;

    public JPGImageAdapter(JPGImage jpgImage) {
        this.jpgImage = jpgImage;
    }

    @Override
    public String getFormatTitle() {
        return "JPEG Image";
    }

    @Override
    public String getFileNameWithExtension() {
        return jpgImage.getFileName();
    }

    @Override
    public void viewImage() {
        jpgImage.loadJPGImage();
    }
}

