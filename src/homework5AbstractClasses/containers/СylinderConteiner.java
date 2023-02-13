package homework5AbstractClasses.containers;

public class СylinderConteiner extends Containers{
    public СylinderConteiner(int radius, int height) {
        super(radius, height);
    }

    @Override
    public double getVolume() {
        double cylinderVolume = Math.PI * Math.pow(radius, 2) * height;
        return cylinderVolume;
    }

}
