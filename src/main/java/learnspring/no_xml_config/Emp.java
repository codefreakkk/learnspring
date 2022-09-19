package learnspring.no_xml_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Emp {

    // auto wired can be used on properties
//    @Autowired
    public Address address;

    // autowired cannot be used on getter functions
    public Address getAddress() {
        return address;
    }

    // auto wired can be used on constructor
//    @Autowired
//    public Emp(Address address) {
//        this.address = address;
//    }

    // auto wired can be used on setter methods
    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    public void work() {
        this.address.display();
    }
}
