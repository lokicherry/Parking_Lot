package Bean;

public class Vehicle {
    private String RegistrationNumber;
    private String colorOfCar;
    private Spot parkingSpot;

    public void setColorOfCar(String colorOfCar) {
        this.colorOfCar = colorOfCar;
    }

    public void setParkingSpot(Spot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public void setRegistrationNumber(String registrationNumber) {
        RegistrationNumber = registrationNumber;
    }

    public Spot getParkingSpot() {
        return parkingSpot;
    }

    public String getColorOfCar() {
        return colorOfCar;
    }

    public String getRegistrationNumber() {
        return RegistrationNumber;
    }
}
