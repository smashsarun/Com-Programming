
public class Employee {

    private long empId;
    private String empName;
    private double payrate;

    public Employee(long empId, String empName, double payrate) {
        this.empId = empId;
        this.empName = empName;
        this.payrate = payrate;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getPayrate() {
        return payrate;
    }

    public void setPayrate(double payrate) {
        this.payrate = payrate;
    }

    public double pay() {
        return this.payrate;
    }

    @Override
    public boolean equals(Object obj) {
        Employee temp;
        if (obj != null && obj instanceof Employee) {
            temp = (Employee)obj;
            if (empId == temp.empId) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", empName=" + empName + ", payrate=" + payrate + '}';
    }

}
