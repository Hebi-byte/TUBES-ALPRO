import java.util.ArrayList;

public class ppn {
    void ppnmobil() {
        ArrayList<Integer> harga = base.harga;
        ArrayList<Integer> ppn = base.ppn;

        for (int i = 0; i < harga.size(); i++) {
              ppn.add((harga.get(i) * 12 / 100)+harga.get(i));
        }
    }
    
}
