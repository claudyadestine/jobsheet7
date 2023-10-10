import java.util.Scanner;

public class DowhileCuti08_1 {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti : ");
        jatahCuti = sc08.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc08.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari : ");
                jumlahHari = sc08.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti : " + jatahCuti);
                } else if (jatahCuti == 0){
                    break;
                }else {
                    System.out.println("Jatah cuti tidak tersedia, sisa jatah cuti anda tinggal " + jatahCuti);
                }
            }
        } while (jatahCuti > 0);
    }
}