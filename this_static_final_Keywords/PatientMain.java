package this_static_final_Keywords;

// PatientMain.java
import java.util.Scanner;

public class PatientMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input patient data
        System.out.print("Enter Patient ID: ");
        int patientID = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Patient Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Ailment: ");
        String ailment = sc.nextLine();

        // Create Patient object
        Patient patient = new Patient(patientID, name, age, ailment);

        // Use instanceof check
        if (patient instanceof Patient) {
            System.out.println("\n--- Patient Details ---");
            patient.displayPatientDetails();
        } else {
            System.out.println("Invalid patient object.");
        }

        // Show total patients
        Patient.getTotalPatients();

        sc.close();
    }
}

