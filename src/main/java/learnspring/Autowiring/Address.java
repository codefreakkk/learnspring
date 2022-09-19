package learnspring.Autowiring;

public class Address {
    public String city;

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

}


// autowired can set on constructor, method, property