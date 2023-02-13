package homework5AbstractClasses.port;

import homework5AbstractClasses.containers.ConeContainer;
import homework5AbstractClasses.ships.Ships;

public class Port {
    Ships ship = new Ships();
    Ships[] ship1 = new Ships[1];
    ConeContainer coneContainer = new ConeContainer(10,45);

    public void addShipToPort (Ships ship1){
        ship1 = ship;

    }

    public void massa(){
        double b = coneContainer.getVolume() * 1000;
        System.out.println(b);
    }
}
