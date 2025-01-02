import java.util.ArrayList;
import java.util.Scanner;

public class edit {
    void editmobil() {
        ArrayList<Integer> harga = base.harga;
        ArrayList<String> merk = base.merk;
        Scanner input = new Scanner(System.in);
        int no = 1;
        System.out.println("==================================");
        System.out.println("Edit data mobil"); 
        System.out.println("==================================");

        for (int i = 0; i < harga.size(); i++) {
                System.out.print(no +" Merk Mobil : " + merk.get(i)+" ||");
                System.out.println("Harga Mobil : " + harga.get(i));
                no++;
        }
        System.out.println("==================================");
        int sellect = input.nextInt();
            if (sellect <= harga.size()) {
                sellect--;
                System.out.println("merk mobil : "+merk.get(sellect)+" || harga mobil : "+harga.get(sellect));
                System.out.println("==================================");
                System.out.println("masukkan merk mobil : ");
                merk.set(sellect, input.next());
                System.out.println("masukkan harga mobil : ");
                harga.set(sellect, input.nextInt());  
            }
        return;
    }
}
