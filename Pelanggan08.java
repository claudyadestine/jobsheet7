import java.util.Scanner;

public class Pelanggan08{
    public static void main(String[] args){
        Scanner sc08 = new Scanner(System.in);
        String nama;
        char jawab;
        int jml = 0; 
        do{
            System.out.printf("Masukkan nama pelanggan: ");
            nama = sc08.nextLine();
            jml++;
            System.out.print("Apakah Anda ingin memasukkan nama pelanggan baru (Y/T) ?");
            jawab = sc08.nextLine(). charAt(0);
        }while (jawab == 'Y' || jawab == 'T');
        System.out.println("Jumlah pelanggan yang Anda masukkan = " + jml);

        



       



    }
}