import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Lab4 {
    public static void main(String[] args) {
        List<Echipamente> echipamente = new ArrayList<Echipamente>();
        echipamente.add(new Echipamente("A", 1, 10, "Rand A"));
        echipamente.add(new Echipamente("B", 2, 20, "Rand B"));

        for (Echipamente e : q)
            System.out.println(e);
    }

    enum stare {achizitionat, expus, vandut};
    class echipamente {
        private final String denumire;
        private final int nr_inv;
        private final float pret;
        private final String zona_mag;

        echipamente(String denumire, int nr_inv, float pret, String zona_mag) {
            this.denumire = denumire;
            this.nr_inv = nr_inv;
            this.pret = pret;
            this.zona_mag = zona_mag;
        }
    }

    enum mod_tiparire {color, alb_negru};
    class imprimanta extends echipamente {
        private final int ppm;
        private final int rezolutie;
        private final int p_car;
        private final String mod_tiparire;

        imprimanta(String denumire, int nr_inv, float pret, String zona_mag, int ppm, int rezolutie, int p_car, String mod_tiparire) {
            super(denumire, nr_inv, pret, zona_mag);
            this.ppm = ppm;
            this.rezolutie = rezolutie;
            this.p_car = p_car;
            this.mod_tiparire = mod_tiparire;
        }
    }

    enum format {A3, A4};
    class copiatoare extends echipamente {
        private final int p_ton;
        private final String format;

        copiatoare(String denumire, int nr_inv, float pret, String zona_mag, int p_ton, String format) {
            super(denumire, nr_inv, pret, zona_mag);
            this.p_ton = p_ton;
            this.format = format;
        }
    }

    enum sistem_operare {Windows, Linux};

    class sisteme extends echipamente {
        private final String tip_mon;
        private final int vit_proc;
        private final int c_hdd;
        private final String sis_op;

        sisteme(String denumire, int nr_inv, float pret, String zona_mag, String tip_mon, int vit_proc, int c_hdd, String sis_op) {
            super(denumire, nr_inv, pret, zona_mag);
            this.tip_mon = tip_mon;
            this.vit_proc = vit_proc;
            this.c_hdd = c_hdd;
            this.sis_op = sis_op;
        }
    }
}


