package Challenge2_Savalia;

import java.util.*;

class Truck {
    private static int truckCount = 0;
    private int truckNumber;
    private int maxCapacity;
    private int maxWeight;
    private String servingArea;
    private String location;
    private Stack<Package> packages;
    private String status;

    public Truck(int maxCapacity, int maxWeight, String servingArea, String location) {
        this.truckNumber = ++truckCount;
        this.maxCapacity = maxCapacity;
        this.maxWeight = maxWeight;
        this.servingArea = servingArea;
        this.location = location;
        this.packages = new Stack<>();
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getServingArea() {
        return servingArea;
    }

    public void setServingArea(String servingArea) {
        this.servingArea = servingArea;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Stack<Package> getPackages() {
        return packages;
    }

    public int getNumPackages() {
        return packages.size();
    }

    public int getTotalWeight() {
        int totalWeight = 0;
        for (Package pack : packages) {
            totalWeight += pack.getWeight();
        }
        return totalWeight;
    }

    public String getNextLocation() {
        if (!packages.isEmpty()) {
            String nextDestination = packages.peek().getDestinationArea();
            return "Moving to " + nextDestination;
        } else {
            return "Remaining at " + location;
        }
    }


    public void loadPackage(Package pack) {
        if (getNumPackages() < maxCapacity && getTotalWeight() + pack.getWeight() <= maxWeight) {
            packages.push(pack);
        }
    }

    public void unloadPackage() {
        if (!packages.isEmpty()) {
            Package pack = packages.pop();
        }
    }

    public void deliverPackages() {
        while (!packages.isEmpty()) {
            Package pack = packages.pop();
            pack.setStatus("Delivered");
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return "Truck " + truckNumber + ": [Max Capacity=" + maxCapacity + ", Max Weight=" + maxWeight + ", Serving Area=" + servingArea + ", Location=" + location + "]";
    }
}