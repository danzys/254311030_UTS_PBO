import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        String nama = "Budi";
        String nim = "254311030";

        ArrayList<Layananojek> list = new ArrayList<>();

        list.add(new madiunMotor("Budi", 5, 20000, nama, nim));
        list.add(new madiunMobil("Heru", 3, 50000, nama, nim));

        for (Layananojek layanan : list) {
            System.out.println("---------------------");
            System.out.println("Tarif: Rp " + layanan.hitungTarif());
            layanan.prosesTransaksi();
        }
    }
}