import java.util.Scanner;

public class PrestasiMahasiswa {
    
    static Scanner revalinda = new Scanner(System.in);

    static void DataPrestasiMahasiswa() {
        String[][] Prestasi = new String[100][5];
        int JumlahData = 0;
        int Data;

        System.out.print("Masukkan tahun saat ini: ");
        int Tahun = revalinda.nextInt();
        revalinda.nextLine();

        do {
            System.out.println("\n===== MENU PRESTASI =====");
            System.out.println("1. Input Prestasi");
            System.out.println("2. Lihat Semua Prestasi");
            System.out.println("3. Cari Prestasi Berdasarkan Jenis");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            Data = revalinda.nextInt();
            revalinda.nextLine();

            switch (Data) {
                case 1:
                    JumlahData = InputPrestasi(Prestasi, JumlahData, Tahun);
                    break;
                case 2:
                    TampilkanSemua(Prestasi, JumlahData);
                    break;
                case 3:
                    JenisPrestasi(Prestasi, JumlahData);
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (Data != 4);
    }

    static int InputPrestasi(String[][] P, int index, int TahunSaatIni) {

        System.out.print("Nama Mahasiswa  : ");
        P[index][0] = revalinda.nextLine();

        System.out.print("NIM             : ");
        P[index][1] = revalinda.nextLine();

        System.out.print("Jenis Prestasi  : ");
        P[index][2] = revalinda.nextLine();

        String[] TingkatValid = {"Lokal", "Nasional", "Internasional"};
        boolean cocok;

        do {
            cocok = false;
            System.out.print("Tingkat Prestasi: ");
            P[index][3] = revalinda.nextLine();

            for (int i = 0; i < TingkatValid.length; i++) {
                if (P[index][3].equalsIgnoreCase(TingkatValid[i])) {
                    cocok = true;
                    break;
                }
            }

            if (!cocok) {
                System.out.println("Tingkat tidak valid!");
            }
        } while (!cocok);

        int TahunPrestasi;
        do {
            System.out.print("Tahun Prestasi  : ");
            TahunPrestasi = revalinda.nextInt();
            revalinda.nextLine();

            if (TahunPrestasi < 2010 || TahunPrestasi > TahunSaatIni) {
                System.out.println("Tahun tidak valid!");
            }
        } while (TahunPrestasi < 2010 || TahunPrestasi > TahunSaatIni);

        P[index][4] = TahunPrestasi + " ";


        System.out.println("Prestasi Tersimpan.");
        return index + 1;
    }

    static void TampilkanSemua(String[][] P, int Jumlah) {

        if (Jumlah == 0) {
            System.out.println("Belum ada data.");
            return;
        }

        String[] Kolom = {"Nama", "NIM", "Jenis", "Tingkat", "Tahun"};

        for (int i = 0; i < Jumlah; i++) {
            for (int j = 0; j < Kolom.length; j++) {
                System.out.println(Kolom[j] + " : " + P[i][j]);
            }
            System.out.println("-----------------------------");
        }
    }

    static void JenisPrestasi(String[][] P, int Jumlah) {

        System.out.print("Jenis prestasi yang dicari: ");
        String Cari = revalinda.nextLine();
        boolean Ada = false;

        for (int i = 0; i < Jumlah; i++) {
            if (P[i][2].equalsIgnoreCase(Cari)) {
                System.out.println("Nama    : " + P[i][0]);
                System.out.println("NIM     : " + P[i][1]);
                System.out.println("Tingkat : " + P[i][3]);
                System.out.println("Tahun   : " + P[i][4]);
                System.out.println("----------------------");
                Ada = true;
            }
        }

        if (!Ada) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        DataPrestasiMahasiswa();
    }
}
