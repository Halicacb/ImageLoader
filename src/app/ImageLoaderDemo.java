package app;

public class ImageLoaderDemo {
    public static void main(String[] args) {
        JPGImage jpgImage = new JPGImage("image1.jpg");
        PNGImage pngImage = new PNGImage("image2.png");

        ImageAdapter jpgAdapter = new JPGImageAdapter(jpgImage);
        ImageAdapter pngAdapter = new PNGImageAdapter(pngImage);

        displayImageInfo(jpgAdapter);
        displayImageInfo(pngAdapter);
    }

    public static void displayImageInfo(ImageAdapter adapter) {
        System.out.println("Format: " + adapter.getFormatTitle());
        System.out.println("File Name: " + adapter.getFileNameWithExtension());
        adapter.viewImage();
        System.out.println();
    }
}

