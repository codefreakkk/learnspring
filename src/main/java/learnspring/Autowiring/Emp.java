package learnspring.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
    public Address address;

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address.city +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    @Autowired
    // name of the bean for autowiring
    @Qualifier("Address1")
    public void setAddress(Address address) {
        System.out.println("Setting using method");
        this.address = address;
    }
}
