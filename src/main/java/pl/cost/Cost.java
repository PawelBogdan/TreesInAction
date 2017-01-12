package pl.cost;

import pl.image.Image;

/**
 * Created by Krzysztof on 12.01.2017.
 */
public class Cost {
    public static double get(Image im, int x_min, int x_max, int y_min, int y_max){
        double mean = 0, ret = 0;
        int size = 0;
        //get mean
        for(int x = x_min; x < x_max; ++x){
            for(int y = y_min; y < y_max; ++y){
                mean += im.getRed(x, y); //just for grayscale images
                ++size;
            }
        }
        mean /= size;

        //get variance
        for(int x = x_min; x < x_max; ++x){
            for(int y = y_min; y < y_max; ++y){
                ret += (mean - im.getRed(x, y)) * (mean - im.getRed(x, y));
            }
        }
        ret /= (size -1);
        return size * Math.sqrt(ret);
    }
}
