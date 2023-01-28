package class12;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CredentialChecker {
    public static void main(String[] args) {
        /*
        Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
        Password should be minimum 8 characters, if less → message=”Password is too short”.
        Password cannot contain username if so, → message=”Password cannot contain username”.
        Password should match confirmed password, if not  → message=“Passwords do not match”.

        Only after all requirements met → message “Your username and password has been created”
         */
        Scanner inp=new Scanner(System.in);
        System.out.println("Please enter your user Name");
        String userName=inp.next();
        System.out.println("Please enter your password");
        String password=inp.next();
        System.out.println("Please enter your password again");
        String confirmPassword=inp.next();

        if (userName.isEmpty() || password.isEmpty()){
            System.out.println("User name and Password can not be empty");
        } else if (password.length()<8) {
            System.out.println("Password is too short");
            System.out.println("Please enter your password");
            inp.next();
        } else if (password.contains(userName)) {
            System.out.println("Password can not contain username");
        }else if (!password.equalsIgnoreCase(confirmPassword)){
            System.out.println("Password do not match ");
            System.out.println("Please enter your password again");
            inp.next();
        }else {
            System.out.println("Your username and password has been created");
        }

    }
}
