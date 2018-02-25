
public class HourlyWork extends Employee{
    private double getHourWork;

    public HourlyWork(double getHourWork, long empId, String empName, double payrate) {
        super(empId, empName, payrate);
        this.getHourWork = getHourWork;
    }

    public double getGetHourWork() {
        return getHourWork;
    }

    public void setGetHourWork(double getHourWork) {
        this.getHourWork = getHourWork;
    }
    
    @Override
    public double pay(){
        return super.getPayrate() * this.getHourWork;
    }

    @Override
    public String toString() {
        return "HourlyWork{" + "getHourWork=" + getHourWork + '}' + super.toString();
    }
    
    
}
