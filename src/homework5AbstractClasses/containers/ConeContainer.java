package homework5AbstractClasses.containers;

public class ConeContainer extends Containers{

    public ConeContainer(int radius, int height) {
        super(radius, height);
    }




    @Override
    public double  getVolume() {
        double coneVolume =   (Math.PI * Math.pow(radius, 2) * height)/3;
        //System.out.println(coneVolume);
        return coneVolume;

    }

}
