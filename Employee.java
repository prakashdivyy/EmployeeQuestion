/**
 * Created by prakash on 5/19/17.
 */
public abstract class Employee implements Payable {
    private String id;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPayment() {
        return payment;
    }

    private String name;
    private Double payment;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }

    @Override
    public double getPaymentAmmount() {
        return 0;
    }

    @Override
    public int compareTo(Payable o) {
        if (this.getPaymentAmmount() > o.getPaymentAmmount()) {
            return -1;
        } else if (this.getPaymentAmmount() == o.getPaymentAmmount()) {
            return 0;
        } else {
            return 1;
        }
    }
}
