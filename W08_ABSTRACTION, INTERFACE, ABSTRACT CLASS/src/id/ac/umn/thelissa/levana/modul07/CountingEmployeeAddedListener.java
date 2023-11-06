package id.ac.umn.thelissa.levana.modul07;

public class CountingEmployeeAddedListener implements EmployeeAddedListener {

    private static int employeesAddedCount = 0;

    @Override
    public void onEmployeeAdded(Employee employee) {
        employeesAddedCount++;
        System.out.println("Total karyawan : " + employeesAddedCount);
    }
}
