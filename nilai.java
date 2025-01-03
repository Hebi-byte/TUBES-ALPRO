import java.util.ArrayList;

public class nilai {
    void nilaitertinggi() {
        ArrayList<Integer> harga = base.harga;
        ArrayList<String> merk = base.merk;
        ArrayList<Integer> ppn = base.ppn;

        int max = harga.get(0);
        String maxmerk = merk.get(0);
        int maxppn = ppn.get(0);
        for (int i = 0; i < harga.size(); i++) {
            if (harga.get(i) > max) {
                max = harga.get(i);
                maxmerk = merk.get(i);
                maxppn = ppn.get(i);
            }
        }
        System.out.println("nilai tertinggi");
        System.out.println("Merk Mobil "+maxmerk + " || Harga Mobil : " + max +" || Harga PPN : " + maxppn);
    } 

    void nilaiterendah() {
        ArrayList<Integer> harga = base.harga;
        ArrayList<String> merk = base.merk;
        ArrayList<Integer> ppn = base.ppn;

        int min = harga.get(0);
        String minmerk = merk.get(0);
        int minppn = ppn.get(0);
        for (int i = 0; i < harga.size(); i++) {
            if (harga.get(i) < min) {
                min = harga.get(i);
                minmerk = merk.get(i);
                minppn = ppn.get(i);
            }
        }
        System.out.println("nilai terendah");
        System.out.println("Merk Mobil "+minmerk + " || Harga Mobil : " + min +" || Harga PPN : " + minppn);

    }
}