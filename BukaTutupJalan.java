package pertemuan3;

import java.util.*;
import java.math.*;

public class BukaTutupJalan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ", 4);
        long[] container = new long[4];
        int x = 0;
        long result = 0;

        for (String a : arr) {
            container[x] = Long.parseLong(a);
            result = result + container[x];
            x = x + 1;
        }

        if ((result - 999999) / 5 == 0) {
            System.out.println("Jalan");
        } else {
            System.out.println("Berhenti");
        }
    }
}

