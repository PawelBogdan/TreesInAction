package pl.cluster;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Krzysztof on 12.01.2017.
 */
public class PointTest {
    @Test
    public void createRandomPoint() throws Exception {
        for(int i =0; i < 10; ++i){
            System.out.println(Point.createRandomPoint(1, 2, 5));
        }
    }

}