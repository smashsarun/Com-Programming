
public class Manager extends Employee {

    private double positionAllowance;
    private String empId;

    public Manager(double positionAllowance, long empId, String empName, double payrate) {
        super(empId, empName, payrate);
        this.positionAllowance = positionAllowance;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public double getPositionAllowance() {
        return positionAllowance;
    }

    public void setPositionAllowance(double positionAllowance) {
        this.positionAllowance = positionAllowance;
    }

    @Override
    public double pay() {
        return positionAllowance + super.getPayrate();
    }

    @Override
    public String toString() {
        return "Manager{" + "positionAllowance=" + positionAllowance + ", empId=" + empId + '}' + super.toString();
    }

}
