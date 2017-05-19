/**
 * Created by prakash on 5/19/17.
 */
public interface Payable extends Comparable<Payable> {
    double getPaymentAmmount();

    @Override
    int compareTo(Payable o);
}
