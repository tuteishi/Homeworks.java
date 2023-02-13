package homework5AbstractClasses;

import homework5AbstractClasses.containers.ConeContainer;
import homework5AbstractClasses.containers.Containers;
import homework5AbstractClasses.decks.Decks;
import homework5AbstractClasses.port.Port;
import homework5AbstractClasses.ships.Ships;

public class Main {
    public static void main(String[] args) {
        ConeContainer coneContainer = new ConeContainer(10,22);
//        double a = coneContainer.getVolume();
//        Decks deck = new Decks();
//        deck.addContainerToDeck(coneContainer);
//        Ships ship = new Ships();
//        ship.addDeckToShip(deck);
//        Port port = new Port();
//        port.addShipToPort(ship);

        double b = coneContainer.getVolume();
        System.out.println(b);

    }
}
