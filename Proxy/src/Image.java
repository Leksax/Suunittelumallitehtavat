import java.util.ArrayList;
import java.util.List;

interface Image {
    void displayImage();
    void showData();
}

// On System A
class RealImage implements Image {
    private final String filename;

    /**
     * Constructor
     * @param filename
     */
    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    /**
     * Loads the image from the disk
     */
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        System.out.println("Displaying " + filename);
    }
    @Override
    public void showData() {
        System.out.println(filename);
    }
}

// On System B
class ProxyImage implements Image {
    private final String filename;
    private RealImage image;

    /**
     * Constructor
     * @param filename
     */
    public ProxyImage(String filename) {
        this.filename = filename;
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        if (image == null) {
            image = new RealImage(filename);
        }
        image.displayImage();
    }
    @Override
    public void showData() {
        System.out.println(filename);
    }
}

class ProxyExample {
    /**
     * Test method
     */
    public static void main(final String[] arguments) {
        List<Image> images = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            images.add(new ProxyImage("HiRes_10MB_Photo" + i));
            images.get(i).showData();
            images.get(i).displayImage();
        }
    }
}
