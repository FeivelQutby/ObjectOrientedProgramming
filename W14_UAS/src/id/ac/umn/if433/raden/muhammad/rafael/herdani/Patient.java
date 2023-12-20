package id.ac.umn.if433.raden.muhammad.rafael.herdani;

public class Patient {
    private String name;
    private int age;
    private String category;
    private int visit;
    private String diagnosis;

    Patient(String name, int age, String category, int visit) {
        this.name = name;
        this.age = age;
        this.category = category;
        this.visit = visit;
        this.diagnosis = "Not Been Diagnosed";
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getCategory() {
        return this.category;
    }

    public int getVisit() {
        return this.visit;
    }

    public String getDiagnosis() {
        return this.diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
