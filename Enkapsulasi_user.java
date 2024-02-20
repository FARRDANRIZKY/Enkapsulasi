
package enkapsulasi_user;

public class Enkapsulasi_user {
   

    public static void main(String[] args) {
      user fardan = new user("fardan", "opo",0);
      
      fardan.setUsername("fardan");
      fardan.setPassword("opo");
      fardan.getId();
      fardan.setStatus();
      
      System.out.println("Username: " + fardan.getUsername());
      System.out.println("Password: " + fardan.getPassword()); 
        System.out.println("id: " + fardan.getId());
        System.out.println("status: " + fardan.isStatus());
    }
    
}
