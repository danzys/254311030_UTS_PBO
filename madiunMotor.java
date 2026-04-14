class madiunMotor extends Layananojek {
    public madiunMotor(String namaDriver, double jarak, double saldoUser, String namaUser, String nim){
        super(namaDriver, jarak, saldoUser, namaUser, nim);
    }

    @Override
    public double hitungTarif() {
        return jarak * 2500;
    }

    @Override
    public void prosesTransaksi() {
        double total = hitungTarif();

        printHeader();

        if (saldoUser >= total) {
            saldoUser -= total;
            System.out.println("Driver:" + namaDriver);
            System.out.println("Jarak:" + jarak + "km");
            System.out.println("Total Bayar:" + total);
            System.out.println("Sisa Saldo:" + saldoUser);
        } else {
            System.out.println("Saldo anda tidak mencukupi untuk perjalanan ini");
        }
    }
}