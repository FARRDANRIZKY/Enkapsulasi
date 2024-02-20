
package enkapsulasi_user;


public class user {
    private String username;
    private String password;
    private int id;
    private boolean status;
    
    public user(String username, String password, int id){
        this.username = username;
        this.password = password;
        this.id = id;
        this.status = status;
    }
   public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;

    }
    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public boolean isStatus(){
        return status;
    }
    public void setStatus(){
        this.status = status;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
}
    

