package Inheritance;

public class SmartHomeApp {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat(
            "TH-001",
            "ON",
            22.5
        );

        thermostat.displayStatus();
    }
}

