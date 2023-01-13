package bitmap.transformer;

import java.io.IOException;
import java.awt.image.BufferedImage;


public class BitMap {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new App().getGreeting());
//to read the file
        image = ImageIO.read(input_file);

    public BitMap(String fileName) throws IOException {
            File f = new File(fileName);
            this.pixelData = ImageIO.read(f);
        }
    }
}

