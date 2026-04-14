class madiunMobil extends Layananojek {

    public madiunMobil(String namaDriver, double jarak, double saldoUser, String namaUser, String nim) {
        super(namaDriver, jarak, saldoUser, namaUser, nim);
        this.nim = nim;
    }

    private double hitungBiayaAdmin() {
        int duaDigit = Integer.parseInt(nim.substring(nim.length() - 2));
        return 3000 + (duaDigit * 100);
    }

    @Override
    public double hitungTarif() {
        return (jarak * 5000) + hitungBiayaAdmin();
    }

    @Override
    public void prosesTransaksi() {
        double total = hitungTarif();

        printHeader();

        if (saldoUser >= total) {
            saldoUser -= total;
            System.out.println("Driver: " + namaDriver);
            System.out.println("Jarak: " + jarak + "km");
            System.out.println("Total Bayar :" + total);
            System.out.println("Sisa Saldo: " + saldoUser);
        } else {
            System.out.println("Saldo anda tidak mencukupi untuk perjalanan ini");
        }
    }
}