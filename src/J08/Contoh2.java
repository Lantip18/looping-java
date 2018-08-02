package J08;
import java.util.Scanner;
public class Contoh2 {
    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in);
        int x,l;
        System.out.print("Berapakali akan diulang? : ");
        l = scanner.nextInt();
//FOR
        for(x = 1; x <= l; x++)
        {
            System.out.print(x + " ");
            
        }
        
        System.out.println();
        
        //While
        x=1;
        while(x<=l)
        {
            System.out.print(x + " ");
            x++;
        }    
        
        System.out.println();
        
        //Do While
        x=1;
        do
        {
            System.out.print(x + " ");
            x++;
        }
        while(x<=l);
    }
    
}
