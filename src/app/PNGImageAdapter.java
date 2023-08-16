package app;

public class PNGImageAdapter implements ImageAdapter {
    private PNGImage pngImage;

    public PNGImageAdapter(PNGImage pngImage) {
        this.pngImage = pngImage;
    }

    @Override
    public String getFormatTitle() {
        return "PNG Image";
    }

    @Override
    public String getFileNameWithExtension() {
        return pngImage.getFileName();
    }

    @Override
    public void viewImage() {
        pngImage.loadPNGImage();
    }
}