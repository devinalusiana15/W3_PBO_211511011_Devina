package pertemuan3;

import java.util.*;
import java.math.*;

public class BigNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        BigInteger a = new BigInteger(sc.nextLine());
        System.out.println("Enter second number: ");
        BigInteger b = new BigInteger(sc.nextLine());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));      
    }
}
