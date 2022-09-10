package pertemuan3;

import java.util.Scanner;

public class GajiAgent {
    public static void main(String[] args){
        int gaji = 500000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Penjualan bulan ini: ");
        int penjualan = sc.nextInt();        
        double total=0;
        
        if(penjualan >= 40 && penjualan <= 80)
        {
            total = gaji + ((50000*penjualan)*0.25);
        }else if(penjualan > 80){
            total = gaji + ((50000*penjualan)*0.35);
        }
        else if (penjualan < 15)
        {
            penjualan = 15-penjualan;
            total = gaji - ((50000*penjualan)*0.15);
        }
        else
        {
            total = gaji + ((50000*penjualan)*0.1);
        }
        System.out.println("total gaji= " + total );
    }
}
