package samples.demo;

public class Location {
	
	//new private attribute
    private String country;
    
    //new second attributes
    private double latitude;

    // Constructor
    public Location(String country, double latitude) {
        this.country = country;
        this.latitude = latitude;
    }

    public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}