package Warung;

public class Tampilan {
    void outputSambutan() {
        System.out.println("Selamat Datang di Bulek Sayang");
        System.out.println("Silahkan masukkan antrian");
    }

    void outputFitur() {
        System.out.println("1. Masukkan Nama Pelanggan");
        System.out.println("2. Lihat Antrian");
        System.out.println("3. Update Antrian");
        System.out.println("4. Hapus Antrian");
        System.out.println("5. Selesai");

        System.out.print("Masukkan Pilihan : ");
    }

    void tanyaInputPelanggan() {
        System.out.print("Masukkan Nama Pelanggan : ");
    }

    void tanyaUpdateAntrian() {
        System.out.print("Masukkan Nomor Antrian : ");
    }

    void tanyaUpdatePelanggan() {
        System.out.print("Masukkan Nama Pelanggan yang Baru : ");
    }

    void tanyaHapusAntrian() {
        System.out.print("Masukan Nomor Antrian yang Ingin Dihapus : ");
    }
}
