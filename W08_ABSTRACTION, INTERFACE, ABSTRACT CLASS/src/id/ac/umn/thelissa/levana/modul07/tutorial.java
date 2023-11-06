package id.ac.umn.thelissa.levana.modul07;

public class tutorial {
    public static void main(String[] args) {
        Office office = new Office();

        office.registerEmployeeAddedListener(new PrintNameEmployeeAddedListener());

        office.addEmployee(new Employee("Andre", "IT Manager"));
        office.addEmployee(new Employee("Vincent", "Senior Programmer"));
        office.addEmployee(new Employee("Jonathan", "Internship Manager"));
    }
}
