package framwork.assig;

public class Custemer {
	
	private String id;
    private String name;
    private String contact;
    private Address address;
 
    public Custemer(){
       
    }
 
   
    public Custemer(String id, String name,
            String contact, Address address) {
        super();
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.address = address;
    }
 
    
    public String getID() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getContact() {
        return contact;
    }
    
    public Address getAddress() {
        return address;
    }
    
 
   
    public void printCustemerDetail(){
 
        System.out.println("Custemer ID \t\t: " + id);
        System.out.println("Custemer Name \t\t: " + name);
        System.out.println("Custemer Contact \t: " + contact);
 
        System.out.println("\n Address  & Printing Address details\n");
        address.printAddressDetail();

    }
}
