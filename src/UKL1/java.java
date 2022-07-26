
package UKL1;
import java.util.*;
/**
 *
 * @author Fahmi Hakim
 */
public class java {
    
    public static void main(String[] args) {
        int a = 19;
        int b = 6;
        int n1 = 16;
        int n2 = 31;
        int u = a;       
        int s = a;      
        
        System.out.println("Deret Aritmatika");
        for(int i =n1; i<= n2; i++){
            System.out.println("suku ke -" +i+ " adalah " +u);
            u=u+b;
            s=s+u;
        }
         s= s-u;
             System.out.println("total "+s);
      }
    }
    
    
        
    
       
       
    

    
    

