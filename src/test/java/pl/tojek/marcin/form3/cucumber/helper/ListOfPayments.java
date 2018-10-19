package pl.tojek.marcin.form3.cucumber.helper;

import java.io.Serializable;
import java.util.List;

public class ListOfPayments implements Serializable {

    private List<Payment> payments;

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
