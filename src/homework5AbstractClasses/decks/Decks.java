package homework5AbstractClasses.decks;

import homework5AbstractClasses.containers.*;

import java.util.Random;

public class Decks {
    int randomCase = 1+(int) Math.random()*3;
    CubeContainer CubeContainer = new CubeContainer(12,45);
    ConeContainer ConeContainer = new ConeContainer(45,78);
    СylinderConteiner СylinderConteiner = new СylinderConteiner (45,8);
    Containers [] containers = new Containers[2];

    public void addContainerToDeck(Containers containers){
        containers = ConeContainer;
    }

public void getMass (){
        double mass = ConeContainer.getVolume();
    System.out.println(mass);

}

}
