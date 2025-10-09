import java.util.Scanner;

public class SKPerMataKuliah {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================== Hasil Nilai Akademik ==================");
        System.out.print("Nama Mahasiswa : ");
        String NamaMahasiswa = sc.nextLine();
        System.out.print("NIM Mahasiswa  : ");
        String NimMahasiswa = sc.nextLine();

        System.out.println("\n--- Mata Kuliah 1 ---");
        System.out.print("Nama Mata Kuliah : ");
        String MataKuliah1 = sc.nextLine();
        System.out.print("Nilai UTS        : ");
        double NilaiUTS1 = sc.nextDouble();
        System.out.print("Nilai UAS        : ");
        double NilaiUAS1 = sc.nextDouble();
        System.out.print("Nilai Tugas      : ");
        double NilaiTugas1 = sc.nextDouble();

        sc.nextLine();

         System.out.println("\n--- Mata Kuliah 2 ---");
        System.out.print("Nama Mata Kuliah : ");
        String MataKuliah2 = sc.nextLine();
        System.out.print("Nilai UTS        : ");
        double NilaiUTS2 = sc.nextDouble();
        System.out.print("Nilai UAS        : ");
        double NilaiUAS2 = sc.nextDouble();
        System.out.print("Nilai Tugas      : ");
        double NilaiTugas2 = sc.nextDouble();

        double NilaiAkhir1 = (NilaiUTS1 * 0.3) + (NilaiUAS1 * 0.4) + (NilaiTugas1 * 0.3);
        double NilaiAkhir2 = (NilaiUTS2 * 0.3) + (NilaiUAS2 * 0.4) + (NilaiTugas2 * 0.3);
        String NilaiHuruf1;
        String NilaiHuruf2;
        String Status1;
        String Status2;

        if (NilaiAkhir1 >= 80) {
                NilaiHuruf1 = "A";
            } else if (NilaiAkhir1 > 73) {
                NilaiHuruf1 = "B+";
            } else if (NilaiAkhir1 > 65) {
                NilaiHuruf1 = "B";
            } else if (NilaiAkhir1 > 60) {
                NilaiHuruf1 = "C+";
            } else if (NilaiAkhir1 > 50) {
                NilaiHuruf1 = "C";
            } else if (NilaiAkhir1 > 39) {
                NilaiHuruf1 = "D";
            } else {
                NilaiHuruf1 = "E";
            }

        if (NilaiAkhir2 >= 80) {
                NilaiHuruf2 = "A";
            } else if (NilaiAkhir2 > 73) {
                NilaiHuruf2 = "B+";
            } else if (NilaiAkhir2 > 65) {
                NilaiHuruf2 = "B";
            } else if (NilaiAkhir2 > 60) {
                NilaiHuruf2 = "C+";
            } else if (NilaiAkhir2 > 50) {
                NilaiHuruf2 = "C";
            } else if (NilaiAkhir2 > 39) {
                NilaiHuruf2 = "D";
            } else {
                NilaiHuruf2 = "E";
            }

        if (NilaiAkhir1 >= 60) {
            Status1 = "Lulus";
        } else {
            Status1 = "Tidak Lulus";
        }

                if (NilaiAkhir2 >= 60) {
            Status2 = "Lulus";
        } else {
            Status2 = "Tidak Lulus";
        }

        String StatusSemester = "";

        if (Status1.equals("Lulus") && Status2.equals("Lulus")) {
            if ((NilaiAkhir1 >= 70) && (NilaiAkhir2 >= 70)) {
                StatusSemester = "Lulus";
            } else {
                StatusSemester = "Tidak Lulus";
            }
        } else {
            StatusSemester = "Tidak Lulus";
        }

        System.out.println("\n================ HASIL PENILAIAN AKADEMIK ================");
        System.out.println("Nama : " + NamaMahasiswa);
        System.out.println("NIM  : " + NimMahasiswa);
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.printf("%-25s %-5s %-5s %-7s %-11s %-18s %-23s\n", 
                "Mata Kuliah", "UTS", "UAS", "Tugas", "Nilai Akhir", "Nilai Huruf","Status");
        System.out.println("--------------------------------------------------------------------------------------");

        System.out.printf("%-26s %-5.0f %-5.0f %-9.0f %-13.2f %-10s %-12s\n",
                MataKuliah1, NilaiUTS1, NilaiUAS1, NilaiTugas1, NilaiAkhir1, NilaiHuruf1, Status1);
        System.out.printf("%-26s %-5.0f %-5.0f %-9.0f %-13.2f %-10s %-12s\n",
                MataKuliah2, NilaiUTS2, NilaiUAS2, NilaiTugas2, NilaiAkhir2, NilaiHuruf2, Status2);

        System.out.println("--------------------------------------------------------------------------------------");

        double RataRata = (NilaiAkhir1+NilaiAkhir2)/2;
        System.out.println("Rata-rata nilai akhir : " + RataRata);
        System.out.println("Status Semester : " + StatusSemester);

        sc.close();
        }
    }
