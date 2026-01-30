package in.practice.challange79;

public class TestEmployee {
    public static void main(String[] args) {

        Employee emp = new Employee ( "Narayan", 23, 15000 );
        System.out.println (emp.getEmployeeDetails ());
        emp.setName ( "Ankit" );
        System.out.println (emp.getEmployeeDetails ());
    }
}
