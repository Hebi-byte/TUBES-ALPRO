import java.util.Scanner;

public class update {
    void updatedata(){
        System.out.println("==================================");
        System.out.println("Update data mobil");
        System.out.println("==================================");
        System.out.println("1. Update merk mobil dan harga mobil");
        System.out.println("2. hapus data mobil");
        System.out.println("0. kembali");
        System.out.println("==================================");

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        switch (x) {
            case 1:
                edit obj = new edit();
                obj.editmobil();
                break; 
            case 2:
                delete obj1 = new delete();
                obj1.deletedaftarmobil();
                break;
            case 0:
                return;
            default:
                System.out.println("Pilihan tidak ada");
                updatedata();
        }
   } 
}
