package pl.data;

import pl.cluster.Point;

import java.io.IOException;
import java.util.List;

/**
 * Created by Krzysztof on 12.01.2017.
 */
public abstract class DataReader {
    DataReader successor;
    public abstract boolean type(String type);

    public void setSuccessor(DataReader successor) {
        this.successor = successor;
    }

    public abstract List<Point> read(String filename, String type) throws IOException;
}

