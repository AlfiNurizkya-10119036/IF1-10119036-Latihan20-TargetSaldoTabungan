/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfi Nurizkya
 * Nama  : ALFI NURIZKYA
 * Kelas : IF-1
 * NIM   : 10119036
 * Deskripsi Program : Menghitung Saldo Tabungan
 */
public class IF110119036Latihan20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int SaldoAwal, SaldoTarget, Bunga;
         double BungaPersen;
         boolean target = true;
        
        
        SaldoAwal = 3500000;
        BungaPersen = 0.08;
        SaldoTarget = 0;
        int i;
        i=1;
        do{
            Bunga = (int) (SaldoAwal * BungaPersen);
            SaldoTarget = SaldoAwal + Bunga;
            SaldoAwal = SaldoTarget;
            System.out.println("Saldo Di Bulan Ke-" + i++ + " Rp." + SaldoTarget );
            
            if (SaldoTarget >= 6000000) {
                target = false;
            }
        }while(target);
    }
    
}
