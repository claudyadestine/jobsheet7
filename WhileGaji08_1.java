import java.util.Scanner;

public class WhileGaji08_1 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        int jumlahKaryawan;
        int jumlahJamLembur;
        double gajiLembur = 0;
        double totalGajiLembur = 0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan : ");
        jumlahKaryawan = input08.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke - " + (i + 1) + ":");
            jabatan = input08.next();
            System.out.print("Masukkan jumlah jam lembur : ");
            jumlahJamLembur = input08.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("Direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("Manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("Karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            } else {
                System.out.println("Jabatan invalid");
                i--;
                gajiLembur = jumlahJamLembur * 0;
            }

            totalGajiLembur += gajiLembur;
        }
            System.out.print("Total gaji lembur : " + totalGajiLembur);

    }
}