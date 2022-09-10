
package pertemuan3;
import java.util.*;

public class Berhitung {
    public static void main (String[] args)
    {
        int A, B, operator, hasil;
        hasil = 0;
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        
        A = sc.nextInt();
        operator = sc.next().charAt(0);
        B = sc.nextInt();
       
        if ((A >= 1 && A<= 1000)&&(B >= 1 && B <= 1000))
        {
            switch(operator){
                case '+':
                    hasil = A+B;
                    break;
                 case '-':
                    hasil = A-B;
                    break;
                 case '*':
                    hasil = A*B;
                    break;
                 case '/':
                    hasil = A/B;
                    break;               
                 case '%':
                    hasil = A%B;
                    break;              
            }
            System.out.println("Hasil = " + hasil);
        }
    }
}

