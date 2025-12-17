package OOP_P2_DAY_10_THROW_THROWS;

//8. Throw exception inside constructor.


class InvalidLoginException extends Exception{
    InvalidLoginException(String message){
        super(message);
    }
}

class Login{
    Login(String username, String password) throws InvalidLoginException{

        if(username == null || username.isEmpty()){
            throw new InvalidLoginException("Username cannot be empty");    
        }
     if (password.length() < 6){
        throw new InvalidLoginException(" must be at least 6 characters");
     }   

     System.out.println("Login successfull");
    }
}
public class InsideConstructor {
    public static void main(String[] args) {
        
        try{
            Login l1 = new Login("admin", "admin123");
            Login l2 = new Login("", "123");
        }
        catch(InvalidLoginException e){
            System.out.println("Login failed: " + e.getMessage());
        }
    }
}
