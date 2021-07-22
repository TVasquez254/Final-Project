
import java.util.*;
import java.util.Scanner;  // Import the Scanner class

public interface user {
  default public void data(){
	int decision;
    long library_card,phone_number;
    String name = "";
    // Using Scanner for Getting Input from User
    Scanner in = new Scanner(System.in);
    System.out.println("enter name: ");
    name = in.nextLine();

    System.out.println("enter libary card: ");
    library_card = in.nextLong();

    System.out.println("enter phone number w/o dashes: ");
    phone_number = in.nextLong();
    System.out.println(phone_number);

    System.out.println("Name: " + name + "\nLibrary card number:  " + library_card + "\nPhone Number:"+phone_number);
    System.out.println("Is this correct? 1 for YES and 0 for NO");
    decision = in.nextInt();
    System.out.println("input: "+decision);
    if(decision == 1){
      System.out.println("tru");
    }else{
      System.out.println("false");
      data();
    }

}; // interface method (does not have a body)
  public void second_meth(); // interface method (does not have a body)
}
