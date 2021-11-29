package framwork.assig;

public class Address {
	
	   private String street;
	    private String city;
	    private String state;
	    private String zipcode;
	    private String country;
	 
	    public Address(){
	        
	    }
	 
	   
	    public Address(String street, String city, String state, String zipcode, String country) {
	        super();
	        this.street = street;
	        this.city = city;
	        this.state = state;
	        this.zipcode = zipcode;
	        this.country = country;
	    }
	 
	    
	    public String getStreet() {
	        return street;
	    }
	   
	    public String getCity() {
	        return city;
	    }
	    
	    public String getState() {
	        return state;
	    }
	   
	    public String getZipcode() {
	        return zipcode;
	    }
	    
	    public String getCountry() {
	    	return country;
	    }
	   
	 
	   
	    public void printAddressDetail(){
	 
	        System.out.println("Address Street \t\t: " + street);
	        System.out.println("Address City \t\t: " + city);
	        System.out.println("Address State \t\t: " + state);
	        System.out.println("Address Zip Code \t: " + zipcode);
	        System.out.println("Address country \t:" + country);

}
}
