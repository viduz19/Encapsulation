public class Employee {
    private int emp_no ;
    private String email ;
    private float salary ;
    private int acc_no ;

    public int getEmp_no () {
        return emp_no;
    }

    public String getEmail() {
        return email;
    }

    public float getSalary() {
        return salary;
    }

    public int getAcc_no() {
        return acc_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }
}
class Test3 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmp_no(8120641);
        e.setEmail("sandunividusha9@gmail.com");
        e.setSalary(500000f);
        e.setAcc_no(1234567655);
        System.out.println("Employee's Emp_no : "+ e.getEmp_no() );
        System.out.println("Employee's Email : "+ e.getEmail() );
        System.out.println("Employee's Salary : "+ e.getSalary() );
        System.out.println("Employee's Account No : "+ e.getAcc_no() );
    }
}