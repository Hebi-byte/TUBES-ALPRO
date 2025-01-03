import java.util.ArrayList;

public class nilai {
    void nilaitertinggi(){
       ArrayList<Integer> harga = base.harga;
        ArrayList<String> merk = base.merk;
        ArrayList<Integer> ppn = base.ppn;
        
        int max = harga.get(0);
        for (int i = 0; i < harga.size(); i++) {
            if (harga.get(i) > max) {
                max = harga.get(i);
            }
        }
        System.out.println("Merk Mobil : " + merk.get(harga.indexOf(max)) + " || Harga Mobil : " + max + " || Harga PPN : " + ppn.get(harga.indexOf(max)));
    } 

    void nilaiterendah(){
        ArrayList<Integer> harga = base.harga;
        ArrayList<String> merk = base.merk;
        ArrayList<Integer> ppn = base.ppn;
        
        int min = harga.get(0);
        for (int i = 0; i < harga.size(); i++) {
            if (harga.get(i) < min) {
                min = harga.get(i);
            }
        }
        System.out.println("Merk Mobil : " + merk.get(harga.indexOf(min)) + " || Harga Mobil : " + min + " || Harga PPN : " + ppn.get(harga.indexOf(min)));

    }
}