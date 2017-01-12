package pl.data;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Krzysztof on 12.01.2017.
 */
public class DataTest {
    @Test
    public void read() throws Exception {
        Data d = new Data();
        d.read("src/main/resources/input2.txt", "text/space-separated-values");
        assertTrue(d.getSize() > 0);
    }

}