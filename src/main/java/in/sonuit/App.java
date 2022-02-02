package in.sonuit;

import in.sonuit.security.service.PasswordService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       PasswordService service= new PasswordService();
       
       String passowrd="test@123";
       String encyptrdPassword = service.encode(passowrd);
       System.out.println("encrypted password : "+encyptrdPassword);
       
       String decryptedPassword = service.decode(encyptrdPassword);
       
       System.out.println(" decrypted password : "+decryptedPassword);
    }
}
