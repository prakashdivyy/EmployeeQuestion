/**
 * Created by prakash on 5/19/17.
 */
public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String id, String name, double weeklySalary) {
        super(id, name);
        this.weeklySalary = weeklySalary;
    }

    public double getPaymentAmmount() {
        return weeklySalary;
    }
}
