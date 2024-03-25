public class Car implements Vehicle{
    private String licenseNumber;
    private String manufacture;
    private String model;
    private double price;

    //Composition Technique
    Vehicle vehicle = new Engine();

    public Car(String licenseNumber, String manufacture, String model, double price) {
        this.licenseNumber = licenseNumber;
        this.manufacture = manufacture;
        this.model = model;
        this.price = price;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licenseNumber='" + licenseNumber + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", vehicle=" + vehicle +
                '}';
    }

    //Delegate Methods of Composition
     public String getFuelType() {
        return vehicle.getFuelType();
    }

    public void setFuelType(String fuelType) {
        vehicle.setFuelType(fuelType);
    }

    public String getCarType() {
        return vehicle.getCarType();
    }

    public void setCarType(String carType) {
        vehicle.setCarType(carType);
    }

    public int getNumberOfCylinder() {
        return vehicle.getNumberOfCylinder();
    }

    public void setNumberOfCylinder(int numberOfCylinder) {
        vehicle.setNumberOfCylinder(numberOfCylinder);
    }

    public int getHorsePower() {
        return vehicle.getHorsePower();
    }

    public void setHorsePower(int horsePower) {
        vehicle.setHorsePower(horsePower);
    }

    public int getTorque() {
        return vehicle.getTorque();
    }

    public void setTorque(int torque) {
        vehicle.setTorque(torque);
    }
}
