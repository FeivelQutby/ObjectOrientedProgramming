package id.ac.umn.if433.raden.muhammad.rafael.herdani;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        doctors.add(Doctor.randomizeDoctor());
        doctors.add(Doctor.randomizeDoctor());
        doctors.add(Doctor.randomizeDoctor());
        doctors.add(Doctor.randomizeDoctor());
        doctors.add(Doctor.randomizeDoctor());

        ArrayList<Patient> patients = new ArrayList<Patient>();
        patients.add(new Patient("Anna Johnson", 33, "BPJS", 4));
        patients.add(new Patient("Sophie Williams", 61, "Asuransi", 7));
        patients.add(new Patient("María Rodríguez", 45, "Pribadi", 2));
        patients.add(new Patient("Siti Rahma Putri", 50, "Asuransi", 9));
        patients.add(new Patient("Alessia Rossi", 72, "BPJS", 5));

        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("Admin", "admin@sayasehat.com", "admin"));
        // email dokter "nama@doctor.com" password "doctor"
        // contoh email dokter "emilydavis@doctor" password "doctor"

        while (true) {
            System.out.println("WELCOME TO SIMRS");
            System.out.println("1. Login");
            System.out.println("2. Sign Up");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("=== LOGIN ===");
                    System.out.print("Email    : ");
                    String email = scanner.nextLine();
                    System.out.print("Password : ");
                    String password = scanner.nextLine();

                    boolean loggedIn = false;
                    User loggedInUser = null;

                    for (User user : users) {
                        if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                            loggedIn = true;
                            loggedInUser = user;
                            System.out.println("Login success");
                            break;
                        }
                    }

                    if (loggedIn) {
                        if (loggedInUser instanceof Doctor) {
                            // Doctor menu
                            boolean isTrue = true;
                            while (isTrue) {

                                System.out.println("Welcome, " + loggedInUser.getName() + "!");
                                System.out.println("=== DOCTOR MENU ===");
                                System.out.println("1. Show list of patients");
                                System.out.println("2. Input consultation data");
                                System.out.println("3. Show consultation data");
                                System.out.println("0. Log out");
                                System.out.print("Choose: ");
                                int choice2 = scanner.nextInt();
                                scanner.nextLine();

                                switch (choice2) {
                                    case 1:
                                        System.out.println("=== LIST OF PATIENTS ===");
                                        int j = 1;
                                        for (Patient patient : patients) {
                                            System.out.println(
                                                    j + " " + patient.getName() + " (" + patient.getAge() + ") - "
                                                            + patient.getCategory() + " - " + patient.getVisit());
                                            j++;
                                        }
                                        break;
                                    case 2:
                                        System.out.println("=== INPUT CONSULTATION DATA ===");
                                        System.out.print("Patient's name: ");
                                        String patientName = scanner.nextLine();

                                        boolean patientFound = false;
                                        for (Patient patient : patients) {
                                            if (patient.getName().equals(patientName)) {
                                                patientFound = true;
                                                System.out.println("Patient found");
                                                System.out.print("Diagnosis : ");
                                                String diagnosis = scanner.nextLine();
                                                patient.setDiagnosis(diagnosis);
                                                break;
                                            }
                                        }
                                        if (!patientFound) {
                                            System.out.println("Patient not found");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("=== SHOW CONSULTATION DATA ===");
                                        int i = 1;
                                        for (Patient patient : patients) {
                                            if (patient.getDiagnosis() != null) {
                                                System.out.println(
                                                        i + " " + patient.getName() + " - " + patient.getDiagnosis());
                                            }
                                            i++;
                                        }
                                        break;
                                    case 0:
                                        isTrue = false;
                                        System.out.println("You have been logged out");
                                        break;
                                    default:
                                        System.out.println("Invalid choice");
                                        break;
                                }
                            }
                        } else {
                            // Admin menu
                            boolean isTrue = true;
                            while (isTrue) {
                                System.out.println("=== ADMIN MENU ===");
                                System.out.println("Welcome, " + loggedInUser.getName() + "!");
                                System.out.println("1. Show list of doctors");
                                System.out.println("2. Show list of patients");
                                System.out.println("3. Add new patient");
                                System.out.println("0. Log out");
                                System.out.print("Choose: ");
                                int choice2 = scanner.nextInt();
                                scanner.nextLine();

                                switch (choice2) {
                                    case 1:
                                        System.out.println("=== LIST OF DOCTORS ===");
                                        int i = 1;
                                        for (Doctor doctor : doctors) {
                                            System.out
                                                    .println(i + " " + doctor.getName() + " (" + doctor.getSpeciality()
                                                            + ") - " + doctor.getHonor());
                                            i++;
                                        }
                                        break;
                                    case 2:
                                        System.out.println("=== LIST OF PATIENTS ===");
                                        int j = 1;
                                        for (Patient patient : patients) {
                                            System.out.println(
                                                    j + " " + patient.getName() + " (" + patient.getAge() + ") - "
                                                            + patient.getCategory() + " - " + patient.getVisit());
                                            j++;
                                        }
                                        break;
                                    case 3:
                                        System.out.println("=== ADD NEW PATIENT ===");
                                        System.out.print("Name     : ");
                                        String name2 = scanner.nextLine();
                                        System.out.print("Age      : ");
                                        int age = scanner.nextInt();
                                        scanner.nextLine();
                                        System.out.println("Category List: ");
                                        System.out.println("1. BPJS");
                                        System.out.println("2. Asuransi");
                                        System.out.println("3. Pribadi");
                                        System.out.print("Category: ");
                                        int category = scanner.nextInt();
                                        scanner.nextLine();

                                        String categoryChoice = "";
                                        if (category == 1) {
                                            categoryChoice = "BPJS";
                                        } else if (category == 2) {
                                            categoryChoice = "Asuransi";
                                        } else if (category == 3) {
                                            categoryChoice = "Pribadi";
                                        } else {
                                            System.out.println("Invalid choice");
                                        }
                                        int visit = 0;

                                        Patient newPatient = new Patient(name2, age, categoryChoice, visit);
                                        patients.add(newPatient);
                                        System.out.println("Add patient success");
                                        break;
                                    case 0:
                                        isTrue = false;
                                        System.out.println("You have been logged out");
                                        break;
                                    default:
                                        System.out.println("Invalid choice");
                                        break;
                                }
                            }
                        }
                    } else {
                        System.out.println("Invalid email or password");
                    }
                    break;
                case 2:
                    System.out.println("=== SIGN UP ===");
                    System.out.print("Name     : ");
                    String name = scanner.nextLine();
                    System.out.print("Email    : ");
                    String email2 = scanner.nextLine();
                    System.out.print("Password : ");
                    String password2 = scanner.nextLine();

                    if (email2.contains("@") && email2.contains(".")) {
                        User newUser = new User(name, email2, password2);
                        users.add(newUser);
                        System.out.println("Sign up success");
                    } else {
                        System.out.println("Invalid email");
                    }
                    break;
                case 0:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
