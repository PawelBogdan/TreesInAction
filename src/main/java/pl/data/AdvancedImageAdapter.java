package pl.data;

import pl.cluster.Point;

import java.io.IOException;
import java.util.List;

/**
 * Created by Krzysztof on 12.01.2017.
 */
public class AdvancedImageAdapter {

    AdvancedImageReader advancedImageReader;

    public AdvancedImageAdapter(String imageType) {
        if (imageType == null){
            throw new UnsupportedOperationException("Not supported yet.");
        } else {
            advancedImageReader = new AdvancedImageReader();
        }
    }

    public List<Point> read(String filename) throws IOException {
        return advancedImageReader.read(filename);
    }

}
