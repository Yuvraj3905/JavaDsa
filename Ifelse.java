import java.util.*;
public class Ifelse {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int age=s.nextInt();
        if(age>20){
            System.out.println("You are an adult");

        }else if(age<5){
            System.out.println("You are a kid");

        }else{
            System.out.println("You are a Human");
        }
    }
}
