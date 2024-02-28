package Challenge2_Savalia;

public class TruckChallenge_Savalia {
    public static void main(String[] args) {
        TruckFleet warehouse = new TruckFleet();

        Truck truck1 = new Truck(200, 15, "Freehold", "Warehouse");
        Truck truck2 = new Truck(100, 7, "Manalapan", "Warehouse");
        Truck truck3 = new Truck(75, 2, "Colts Neck", "Warehouse");
        Truck truck4 = new Truck(300, 25, "Howell", "Warehouse");
        Truck truck5 = new Truck(250, 21, "Marlboro", "Warehouse");

        warehouse.addTruck(truck1);
        warehouse.addTruck(truck2);
        warehouse.addTruck(truck3);
        warehouse.addTruck(truck4);
        warehouse.addTruck(truck5);

        Package package1 = new Package(20, "Manalapan", "101 Road St");
        Package package2 = new Package(100, "Manalapan", "300 Street Rd");
        Package package3 = new Package(150, "Freehold", "32 Avenue Rd");
        Package package4 = new Package(10, "Freehold", "1 Main St");
        Package package5 = new Package(15, "Freehold", "15 Temple Rd");
        Package package6 = new Package(16, "Freehold", "3 My Rd");
        Package package7 = new Package(1, "Marlboro", "4 Goldstein Way");
        Package package8 = new Package(15, "Marlboro", "15 Goldstein Way");
        Package package9 = new Package(35, "Freehold", "53 CompSci Ct");
        Package package10 = new Package(54, "Marlboro", "32 ColtsNeck Rd");

        warehouse.addPackage(package1);
        warehouse.addPackage(package2);
        warehouse.addPackage(package3);
        warehouse.addPackage(package4);
        warehouse.addPackage(package5);
        warehouse.addPackage(package6);
        warehouse.addPackage(package7);
        warehouse.addPackage(package8);
        warehouse.addPackage(package9);
        warehouse.addPackage(package10);

        System.out.println("Truck 1: " + truck1.getNextLocation());
        System.out.println("Truck 2: " + truck2.getNextLocation());
        System.out.println("Truck 3: " + truck3.getNextLocation());
        System.out.println("Truck 4: " + truck4.getNextLocation());
        System.out.println("Truck 5: " + truck5.getNextLocation());

        while (!truck1.getPackages().isEmpty() || !truck2.getPackages().isEmpty() || !truck3.getPackages().isEmpty() || !truck4.getPackages().isEmpty() || !truck5.getPackages().isEmpty()) {
            if (!truck1.getPackages().isEmpty())
                truck1.unloadPackage();
            if (!truck2.getPackages().isEmpty())
                truck2.unloadPackage();
            if (!truck3.getPackages().isEmpty())
                truck3.unloadPackage();
            if (!truck4.getPackages().isEmpty())
                truck4.unloadPackage();
            if (!truck5.getPackages().isEmpty())
                truck5.unloadPackage();
        }


        truck1.setLocation("Warehouse");
        truck2.setLocation("Warehouse");
        truck3.setLocation("Warehouse");
        truck4.setLocation("Warehouse");
        truck5.setLocation("Warehouse");

        System.out.println("Package 1: " + package1.getStatus());
        System.out.println("Package 2: " + package2.getStatus());
        System.out.println("Package 3: " + package3.getStatus());
        System.out.println("Package 4: " + package4.getStatus());
        System.out.println("Package 5: " + package5.getStatus());
        System.out.println("Package 6: " + package6.getStatus());
        System.out.println("Package 7: " + package7.getStatus());
        System.out.println("Package 8: " + package8.getStatus());
        System.out.println("Package 9: " + package9.getStatus());
        System.out.println("Package 10: " + package10.getStatus());


        warehouse.test();
    }
}