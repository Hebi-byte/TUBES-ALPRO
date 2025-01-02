import java.util.Scanner;
import java.util.ArrayList;

public class base{
    public static ArrayList<Integer>harga = new ArrayList<>();
    public static ArrayList<String>merk = new ArrayList<>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("==================================");
            System.out.println("Deeler Mobil");
            System.out.println("==================================");
            System.out.println("1. Input data ");
            System.out.println("2. Daftar data ");
            System.out.println("3. Edit data ");
            System.out.println("4. Harga Mobil tertinggi dan terendah ");
            System.out.println("5. Exit ");
            System.out.println("==================================");
            int x = input.nextInt();
            switch (x) {
                case 1:
                    inputdata obj = new inputdata();
                    obj.inputdatamobil();
                    break;
                case 2:
                    daftardata obj1 = new daftardata();
                    obj1.daftardatamobil();
                    break;
                case 3:
                    edit obj2 = new edit();
                    obj2.editmobil();
                    break;
                case 5:
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            } 
        }
    }
}