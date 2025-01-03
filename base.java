import java.util.Scanner;
import java.util.ArrayList;

public class base{
    public static ArrayList<Integer>harga = new ArrayList<>();
    public static ArrayList<String>merk = new ArrayList<>();
    public static ArrayList<Integer>ppn = new ArrayList<>();
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
            System.out.println("0. Exit ");
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
                    update obj2 = new update();
                    obj2.updatedata();
                    break;
                case 0:
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