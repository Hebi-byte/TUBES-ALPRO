import java.util.ArrayList;
import java.util.Scanner;

public class daftardata {
    void daftardatamobil() {
        ArrayList<Integer> harga = base.harga;
        ArrayList<String> merk = base.merk;
        ArrayList<Integer> ppn = base.ppn;

        ppn obj1 = new ppn();
        obj1.ppnmobil();

        Scanner input = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Daftar Harga Mobil");
        System.out.println("==================================");
        for (int i = 0; i < harga.size(); i++) {
                System.out.print((i+1)+". Merk Mobil : " + merk.get(i)+" || ");
                System.out.print("Harga Mobil : " + harga.get(i)+" || ");
                System.out.println("harga PPN :" + ppn.get(i));     
        }
        System.out.println("==================================");
        System.out.println("0. kembali");
        System.out.println("==================================");
        int sellect = input.nextInt();
        if (sellect == 0) {
            return;
        }
        else {
            System.out.println("Pilihan tidak ada");
            daftardatamobil();
        }
    }
}
