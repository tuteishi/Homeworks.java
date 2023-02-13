package homework5AbstractClasses.containers;

import java.util.Random;

public abstract class Containers{
    protected int radius;
    protected int height;
//    protected int height = 5+(int) Math.random()*100;
//    final int BIG_RADIUS = 10;
//    final int SMALL_RADIUS = 5;
//    Random random = new Random();
    public abstract double getVolume();

//    public double radius (){
//        if (height < 48){
//            return  BIG_RADIUS;
//        }else
//            return SMALL_RADIUS;
//    }


    public Containers(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
}


