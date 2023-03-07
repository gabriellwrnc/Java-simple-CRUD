package Warung;

public class Fitur4 {
    int nomorAntrian;
    Object pelanggan;

    public Fitur4(int NomorAntrian, Object Pelanggan) {
        this.nomorAntrian = NomorAntrian;
        this.pelanggan = Pelanggan;
    }

    void konfirmasiHapus() {
        System.out.println("Apakah anda yakin ingin melakukan penghapusan pada pelanggan dibawah ini ?");
        System.out.println("Nomor Antrian " + nomorAntrian);
        System.out.println("Nama pelanggan " + pelanggan);
        System.out.println("1. Yakin");
        System.out.println("2. Tidak");
    }
}
