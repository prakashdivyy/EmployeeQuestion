import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Payable> alp = new ArrayList<>();
        alp.add(new SalariedEmployee("01", "ani", 1000000));
        alp.add(new HourlyEmployee("02", "budi", 20000, 40));
        alp.add(new SalariedEmployee("03", "charli", 1200000));
        alp.add(new HourlyEmployee("04", "dedi", 25000, 40));
        System.out.println(getHighestPaidEmployee(alp)); //output: charli
        System.out.println(getTotalHourlyEmployeeSalary(alp)); //output: 1800000.0
    }

    public static String getHighestPaidEmployee(ArrayList<Payable> al) {
        Collections.sort(al);
        Employee x = (Employee) al.get(0);
        return x.getName();
    }

    public static double getTotalHourlyEmployeeSalary(ArrayList<Payable> al) {
        double salary = 0;
        for (int ii = 0; ii < al.size(); ii++) {
            Payable x = al.get(ii);
            if (x instanceof HourlyEmployee) {
                salary += x.getPaymentAmmount();
            }
        }
        return salary;
    }

}