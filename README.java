# palindrome
import java.util.Scanner;
public class Aaaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int b,c=0,a,temp;
        System.out.println("enter num");
        Scanner in=new Scanner(System.in);
        b=in.nextInt();
        temp=b;
        while(b>0)
        {
            
            a=b%10;
            b=b/10;
            c=(c*10)+a;
            
            System.out.println(+c);
        }
        
        
    }
