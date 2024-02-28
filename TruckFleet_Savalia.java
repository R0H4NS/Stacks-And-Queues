package Challenge2_Savalia;

import java.util.*;

class TruckFleet {
    private Stack<Truck> trucks;
    private Stack<Package> storage;

    public TruckFleet() {
        this.trucks = new Stack<>();
        this.storage = new Stack<>();
    }

    public List<Truck> getTrucks() {
        return new ArrayList<>(trucks);
    }

    public void addTruck(Truck truck) {
        trucks.push(truck);
    }

    public void addPackage(Package pack) {
        boolean loaded = false;
        for (Truck truck : trucks) {
            if (truck.getServingArea().equals(pack.getDestinationArea()) && truck.getNumPackages() < truck.getMaxCapacity() && truck.getTotalWeight() + pack.getWeight() <= truck.getMaxWeight()) {
                truck.loadPackage(pack);
                loaded = true;
                break;
            }
        }
        if (!loaded) {
            storage.push(pack);        }
    }

    public void searchPackage(String destinationArea) {
        for (Truck truck : trucks) {
            for (Package pack : truck.getPackages()) {
                if (pack.getDestinationArea().equals(destinationArea)) {
                    return;
                }
            }
        }
        for (Package pack : storage) {
            if (pack.getDestinationArea().equals(destinationArea)) {
                return;
            }
        }
    }

    public void searchTruck(String location) {
        for (Truck truck : trucks) {
            if (truck.getLocation().equals(location)) {
                return;
            }
        }
    }

    public void declarePackageDelivered(Package pack) {
        pack.setStatus("Delivered");
    }

    public void declareTruckReturned(Truck truck) {
        truck.deliverPackages();
        truck.setLocation("Warehouse");
    }

    public void test() {
        //returns nothing but null
    }
}