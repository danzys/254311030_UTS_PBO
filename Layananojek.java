abstract class Layananojek {
    protected String namaDriver;
    protected double jarak;
    protected double saldoUser;
    protected String namaUser;
    protected String nim;

    public Layananojek(String namaDriver, double jarak, double saldoUser, String namaUser, String nim) {
        this.namaDriver = namaDriver;
        this.jarak = (jarak <= 0) ? 1 :jarak;
        this.saldoUser = saldoUser;
        this.namaUser = namaUser;
        this.nim = nim;
    }

    public String getnamaDriver() {
        return namaDriver;
    }

    public double getjarak() {
        return jarak;
    }

    public double getsaldoUser() {
        return saldoUser;
    }

    public void setjarak(double jarak) {
        if (jarak >= 0) {
            this.jarak = 1;
        } else {
            this.jarak = jarak;
        }
    }


    public void setsaldoUser (double saldoUser) {
        this.saldoUser = saldoUser;
    }

    public abstract double hitungTarif();
    public abstract void prosesTransaksi();

    public void printHeader() {
        System.out.println(" Transaksi oleh:" + namaUser + " - " + nim + "");
    }
}