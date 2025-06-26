package this_static_final_Keywords;

// Patient.java
public class Patient {
    // Static members
    public static String hospitalName = "Sunrise Multi-Speciality Hospital";
    private static int totalPatients = 0;

    // Instance members
    private String name;
    private int age;
    private String ailment;
    private final int patientID; // unique and final

    // Constructor using 'this'
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    // Static method to display total patients
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Instance method to display patient details
    public void displayPatientDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }
}

