package pl.cluster;

import org.ejml.simple.SimpleMatrix;

/**
 * Created by Krzysztof on 12.01.2017.
 */
public interface ClusterLike {

    double getWeight();

    SimpleMatrix getMean();

    SimpleMatrix getCov();

    int getCardinality();

}