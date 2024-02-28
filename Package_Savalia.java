package Challenge2_Savalia;

class Package {
    private int weight;
    private String destinationArea;
    private String destinationAddress;
    private String status;

    public Package(int weight, String destinationArea, String destinationAddress) {
        this.weight = weight;
        this.destinationArea = destinationArea;
        this.destinationAddress = destinationAddress;
        this.status = "In warehouse";
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDestinationArea() {
        return destinationArea;
    }

    public void setDestinationArea(String destinationArea) {
        this.destinationArea = destinationArea;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return "Package: [Weight=" + weight + ", Destination Area=" + destinationArea + ", Destination Address=" + destinationAddress + ", Status=" + status + "]";
    }
}