/**
 * Created by prakash on 5/19/17.
 */
public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String id, String name, double wage, double hours) {
        super(id, name);
        this.wage = wage;
        this.hours = hours;
    }

    public double getPaymentAmmount() {
        double payment = this.wage * this.hours;
        if (hours > 40) {
            payment += (hours - 40) * 1.5 * wage;
        }
        return payment;
    }
}
