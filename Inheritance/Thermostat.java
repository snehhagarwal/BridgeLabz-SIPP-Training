package Inheritance;

public class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status); // Call superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus(); // Call Device's displayStatus
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
