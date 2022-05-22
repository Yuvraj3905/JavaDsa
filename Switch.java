import java.util.*;
public class Switch {
    public static void main(String[] args){
        Scanner sd=new Scanner(System.in);
        int age=sd.nextInt();
               switch (age){
           case 12:
               System.out.println("You are 12 years old");
               break;
           case 56:
               System.out.println("You are 56 years old");
               break;
           case 16:
               System.out.println("You are 16 years old");
               break;
           default:
               System.out.println("You did not match any of the cases");
       }
    }
}
