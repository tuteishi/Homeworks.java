package homework5AbstractClasses.containers;

import java.util.Random;

public class CubeContainer extends Containers{
    public CubeContainer(int radius, int height) {
        super(radius, height);
    }

    @Override
    public double getVolume() {
        double cubeVolume =  ((Math.pow(radius, 2))/2) * height;
        return cubeVolume;
    }
}
