package pl.image;

import org.junit.Test;
import pl.cost.Cost;
import pl.image.gui.ImageFrame;

import java.util.concurrent.TimeUnit;

/**
 * Created by Krzysztof on 12.01.2017.
 */
public class ImageTest {
    @Test
    public void run() throws Exception {
        String filename = "src/main/resources/1.png";
        Image img = new Image(filename);
        ImageFrame iff = new ImageFrame(img);
        iff.display();

        //TODO: dlaczego on nie czeka???
//        TimeUnit.SECONDS.sleep(2);


        System.out.println(Cost.get(img, 0, img.getWidth(), 0, img.getHeight()));

        System.out.println(Cost.get(img, 0, 100, 0, img.getHeight())
                + Cost.get(img, 100, img.getWidth(), 0, img.getHeight())
        );
    }

}