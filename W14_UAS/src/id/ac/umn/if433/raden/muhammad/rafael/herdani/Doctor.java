package id.ac.umn.if433.raden.muhammad.rafael.herdani;

public class Doctor extends User {
    private String speciality;
    private int honor;

    Doctor(String name, String email, String password, String speciality, int honor) {
        super(name, email, password);
        this.speciality = speciality;
        this.honor = honor;
    }

    public static Doctor randomizeDoctor() {
        String[] names = { "Dr. Emily Davis", "Dr. Abdul Rahman Al-Mansoori", "Dr. Isabella Martinez",
                "Dr. Kenji Suzuki", "Dr. Olivia Johnson" };
        String[] specialities = { "Sp. Penyakit Dalam", "Sp. Pediatri", "Sp. THT", "Sp. Gigi", "Sp. Umum" };
        int[] honors = { 75000, 70000, 65000, 60000, 50000 };

        int randomIndex = (int) (Math.random() * names.length);
        String doctorName = names[randomIndex].replace("Dr. ", "").toLowerCase().replace(" ", "");

        return new Doctor(names[randomIndex],
                doctorName + "@doctor.com", "doctor",
                specialities[randomIndex], honors[randomIndex]);
    }

    public String getSpeciality() {
        return this.speciality;
    }

    public int getHonor() {
        return this.honor;
    }
}
