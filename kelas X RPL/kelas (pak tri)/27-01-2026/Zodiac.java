
import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Cek Zodiak Gratis");
        System.out.print("Masukkan Tanggal Lahir (1-31): ");
        int tanggal = input.nextInt();
        
        System.out.print("Masukkan bulan lahir (1-12): ");
        int bulan = input.nextInt();
        
        String zodiak = "";
        
        // Validasi input
        if (tanggal < 1 || tanggal > 31 || bulan < 1 || bulan > 12) {
            System.out.println("Input tidak valid!");
        } else {
            
            
            if ((bulan == 1 && tanggal >= 20) || (bulan == 2 && tanggal <= 18)) {
                zodiak = "AQUARIUS";
            } else if ((bulan == 2 && tanggal >= 19 && tanggal <= 29) || (bulan == 3 && tanggal <= 20)) {
                zodiak = "PISCES";
            } else if ((bulan == 3 && tanggal >= 21) || (bulan == 4 && tanggal <= 19)) {
                zodiak = "ARIES";
            } else if ((bulan == 4 && tanggal >= 20) || (bulan == 5 && tanggal <= 20)) {
                zodiak = "TAURUS";
            } else if ((bulan == 5 && tanggal >= 21) || (bulan == 6 && tanggal <= 20)) {
                zodiak = "GEMINI";
            } else if ((bulan == 6 && tanggal >= 21) || (bulan == 7 && tanggal <= 22)) {
                zodiak = "CANCER";
            } else if ((bulan == 7 && tanggal >= 23) || (bulan == 8 && tanggal <= 22)) {
                zodiak = "LEO";
            } else if ((bulan == 8 && tanggal >= 23) || (bulan == 9 && tanggal <= 22)) {
                zodiak = "VIRGO";
            } else if ((bulan == 9 && tanggal >= 23) || (bulan == 10 && tanggal <= 22)) {
                zodiak = "LIBRA";
            } else if ((bulan == 10 && tanggal >= 23) || (bulan == 11 && tanggal <= 21)) {
                zodiak = "SCORPIO";
            } else if ((bulan == 11 && tanggal >= 22) || (bulan == 12 && tanggal <= 21)) {
                zodiak = "SAGITTARIUS";
            } else if ((bulan == 12 && tanggal >= 22) || (bulan == 1 && tanggal <= 19)) {
                zodiak = "CAPRICORN";
            } 
            
            // Output hasil
            System.out.println("");
            System.out.println("Hasil Cek Zodiac Anda :");
            System.out.println("");
            System.out.println("Tanggal Lahir Anda " + tanggal);
            System.out.println("Dan Bulan Lahir Anda " + bulan);
            System.out.println("Zodiak Anda Yang Pasti Adalah " + zodiak);
            System.out.println("");
            System.out.println("Terima Kasih Sudah Menggunakan Jasa Cek Zodiak Kami");
        }
       
    }
}
