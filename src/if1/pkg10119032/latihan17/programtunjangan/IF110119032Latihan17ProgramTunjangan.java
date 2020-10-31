package if1.pkg10119032.latihan17.programtunjangan;
import java.util.Scanner;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menampilkan
 * gaji, tunjangan, dan totalnya ke layar
 */
public class IF110119032Latihan17ProgramTunjangan {

    public static void main(String[] args) {
        
        //menginstansiasikan kelas Scanner agar dapat digunakan
        Scanner scan = new Scanner(System.in);
        
        //pengguna memasukkan nominal gaji bersih bulanan
        System.out.println("========== Program Tunjangan ==========");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp. ");
        int gaji = scan.nextInt();
        
        //pengguna memasukkan status menikah
        System.out.print("Status Anda? (Menikah/Belum) : ");
        String nikah = scan.next();
        
        //inisialisasi nominal tunjangan
        int tunjangan = 0;
        
        //percabangan untuk memberikan tunjangan kepada yang berstatus menikah
        if (nikah.equals("menikah") || nikah.equals("Menikah")) {
            tunjangan = (gaji*35)/100;
        }
        
        //mekanisme perhitungan total gaji
        int totalGaji = gaji + tunjangan;
        
        //menampilkan hasil perhitungan gaji
        System.out.println("===== Hasil Perhitungan Gaji Anda =====");
        System.out.println("Gaji Pokok \t\t : Rp " + gaji);
        System.out.println("Tunjangan \t\t : Rp " + tunjangan);
        System.out.println("Total Gaji \t\t : Rp " + totalGaji);
        System.out.println("Developed by : Ginanjar Tubagus Gumilar");
    }
    
}
