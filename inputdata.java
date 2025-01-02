import java.util.ArrayList;
import java.util.Scanner;

public class inputdata {
    void inputdatamobil()  {
        ArrayList<Integer> harga = base.harga;
        ArrayList<String> merk = base.merk;
        System.out.println("==================================");
        System.out.println("input merk mobil dan harga mobil");
        System.out.println("==================================");

        Scanner input = new Scanner(System.in);
        System.out.println("masukkan merk mobil : ");
        merk.add(input.next());
        System.out.println("masukkan harga mobil : ");
        harga.add(input.nextInt());
        return;
    }   
}
