package id.ac.umn.thelissa.levana.modul07;

public class PrintNameEmployeeAddedListener implements EmployeeAddedListener {

    @Override
    public void onEmployeeAdded(Employee employee) {
        System.out.println("Ditambahkan karyawan baru dengan posisi '" + employee.getPosition() + "' Bernama '"
                + employee.getName() + "'");
    }
}
