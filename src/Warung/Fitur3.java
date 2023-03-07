package Warung;

public class Fitur3 {
    int nomorAntrian;
    String pelangganBaru;
    Object pelanggan;

    public Fitur3(int NomorAntrian, Object Pelanggan, String PelangganBaru) {
        this.nomorAntrian = NomorAntrian;
        this.pelanggan = Pelanggan;
        this.pelangganBaru = PelangganBaru;
    }

    void konfirmasiUpdate() {
        System.out.println("Apakah anda yakin ingin melakukan update pelanggan dibawah ini ?");
        System.out.println("Nomor Antrian " + nomorAntrian);
        System.out.println("Nama pelanggan lama " + pelanggan);
        System.out.println("Nama pelanggan baru " + pelangganBaru);
        System.out.println("1. Yakin");
        System.out.println("2. Tidak");
    }
}
