package samples.demo;

public class Location {
	
	//new private attribute
    private String city;
    private String country;
    
    //new second attributes
    private double latitude;

    // Constructor
    public Location(String city, String country, double latitude) {
        this.city = city;
        this.country = country;
        this.latitude = latitude;
    }

    public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
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