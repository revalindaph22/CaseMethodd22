package CaseMethod1;
import java.util.Scanner;

public class InputDataMahasiswa22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama Mahasiswa : ");
        String NamaMahasiswa = sc.nextLine();
        System.out.print("Nim Mahasiswa  : ");
        String NimMahasiswa = sc.nextLine();

        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS   : ");
        int NilaiUTS1 = sc.nextInt();
        System.out.print("Nilai UAS   : ");
        int NilaiUAS1 = sc.nextInt();
        System.out.print("Nilai Tugas : ");
        int NilaiTugas1 = sc.nextInt();

        System.out.println("\n--- Mata Kuliah 2 : Struktur Data ---");
        System.out.print("Nilai UTS   : ");
        int NilaiUTS2 = sc.nextInt();
        System.out.print("Nilai UAS   : ");
        int NilaiUAS2 = sc.nextInt();
        System.out.print("Nilai Tugas : ");
        int NilaiTugas2 = sc.nextInt();

        sc.close();
    }
}