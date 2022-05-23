import java.util.*;
public class Reverse_Star_Pattern{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int pat=s.nextInt();
        for(int i=0;i<=pat;i++){
            for(int j=i;j<pat;j++){
              System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
       
    }
}
