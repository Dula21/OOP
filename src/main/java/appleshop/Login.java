
package appleshop;


public class Login {

    static void LoginUI() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getRole() {
        return Role;
    }

    
    public void setRole(String Role) {
        this.Role = Role;
    }

     private String Role;
     
    public String getUsername() {
        return Username;
    }

    
    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    private String Username;
    private String Password;

    
     public void CreateAccounts(Login obj)
    {
        String LoginString=obj.getUsername()+" "+obj.getPassword()+" "+obj.getRole()+" ";
        System.out.println(""+LoginString);
        LoginDBConnection con=new LoginDBConnection();
        con.makeConnection(LoginString,"AccountLogin.txt");
    } 

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
