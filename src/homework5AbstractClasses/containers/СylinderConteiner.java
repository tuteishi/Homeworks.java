package homework5AbstractClasses.containers;

public class –°ylinderConteiner extends Containers{
    public –°ylinderConteiner(int radius, int height) {
        super(radius, height);
    }

    @Override
    public double getVolume() {
        double cylinderVolume = Math.PI * Math.pow(radius, 2) * height;
        return cylinderVolume;
    }

}
