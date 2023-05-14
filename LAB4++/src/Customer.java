import java.util.ArrayList;
import java.util.Calendar;

public class Customer {
    private String name;
    private String address;
    private Calendar dateOdBirth;
    private boolean creditStatus;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean getCreditStatus() {
        return this.creditStatus;
    }

    public void setCreditStatus(boolean creditStatus) {
        this.creditStatus = creditStatus;
    }


    public Calendar getDateOdBirth() {
        return this.dateOdBirth;
    }

    public Customer(String name, String address, Calendar dateOdBirth){
        this.name = name;
        this.address = address;
        this.dateOdBirth = dateOdBirth;
        creditStatus = false;

    }



}
