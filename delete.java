import java.util.ArrayList;
import java.util.Scanner;

public class delete {
    void deletedaftarmobil() {
        ArrayList<Integer> harga = base.harga;
        ArrayList<String> merk = base.merk;
        ArrayList<Integer> ppn = base.ppn;

        Scanner input = new Scanner(System.in);
        ppn obj1 = new ppn();
        obj1.ppnmobil();

        for (int i = 0; i < harga.size(); i++) {
            System.out.print((i+1) +" Merk Mobil : " + merk.get(i)+" ||");
            System.out.println("Harga Mobil : " + harga.get(i));
    }
    System.out.println("==================================");
        int sellect = input.nextInt();
            if (sellect > 0 &&sellect <= harga.size()) {
                sellect--;
                harga.remove(sellect);
                merk.remove(sellect);
                ppn.remove(sellect);
            }
            else{
                deletedaftarmobil();
            }

    }
}