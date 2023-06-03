package samples.demo;

public class Location {
	
	//new private attribute
    private String city;
    private String country;

    // Constructor
    public Location(String city, String country) {
        this.city = city;
        this.country = country;
    }

    // Getters and Setters
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}