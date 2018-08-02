package J08;
public class Contoh2 {
    public static void main(String[] arg)
    {
        //FOR
        int x;
        for(x = 1; x <= 10; x++)
        {
            System.out.print(x + " ");
            
        }
        
        System.out.println(" ");
        x = 1;
        
        //While
        while(x <= 10)
        {
            System.out.print(x + " ");
            x++;
        }    
        
        x = 1;
        System.out.println(" ");
        
        //Do While
        do
        {
            System.out.print(x + " ");
            x++;
        }
        while(x <= 10);
    }
    
}
