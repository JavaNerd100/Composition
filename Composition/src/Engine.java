public class Engine implements Vehicle {

    private String fuelType;
    private String carType;
    private int numberOfCylinder;
    private int horsePower;

    public Engine() {
    }

    private int torque;

    public Engine(String fuelType, String carType, int numberOfCylinder, int horsePower, int torque) {
        this.fuelType = fuelType;
        this.carType = carType;
        this.numberOfCylinder = numberOfCylinder;
        this.horsePower = horsePower;
        this.torque = torque;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    @Override
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String getCarType() {
        return carType;
    }

    @Override
    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public int getNumberOfCylinder() {
        return numberOfCylinder;
    }

    @Override
    public void setNumberOfCylinder(int numberOfCylinder) {
        this.numberOfCylinder = numberOfCylinder;
    }

    @Override
    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public int getTorque() {
        return torque;
    }

    @Override
    public void setTorque(int torque) {
        this.torque = torque;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuelType='" + fuelType + '\'' +
                ", carType='" + carType + '\'' +
                ", numberOfCylinder=" + numberOfCylinder +
                ", horsePower=" + horsePower +
                ", torque=" + torque +
                '}';
    }
}
