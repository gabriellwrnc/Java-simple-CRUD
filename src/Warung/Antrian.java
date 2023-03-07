package Warung;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Antrian {
    public static void main(String[] args) throws IOException {
        ArrayList antrian = new ArrayList<>();

        String pelanggan;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while (true) {
            Tampilan tampil = new Tampilan();

            tampil.outputSambutan();
            tampil.outputFitur();

            int menu = Integer.parseInt(br.readLine());
            if (menu == 1) {
                tampil.tanyaInputPelanggan();
                pelanggan = br.readLine();
                Fitur1 objFitur1 = new Fitur1(pelanggan);
                antrian.add(objFitur1.pelanggan);
                objFitur1.fitur1Sukses();
            } else if (menu == 2) {
                Fitur2 objFitur2 = new Fitur2(antrian.size());
                objFitur2.fitur2TampilanTotal();

                for (int i = 0; i < antrian.size(); i++) {
                    int n = i;
                    n++;
                    System.out.println(n + ". " + antrian.get(i));
                }
            } else if (menu == 3) {
                while (true) {
                    tampil.tanyaUpdateAntrian();
                    int inputNomorAntrian = Integer.parseInt(br.readLine());
                    int idxAntrian = inputNomorAntrian - 1;

                    tampil.tanyaUpdatePelanggan();
                    String pelangganBaru = br.readLine();

                    Fitur3 objFitur3 = new Fitur3(inputNomorAntrian, antrian.get(idxAntrian), pelangganBaru);

                    objFitur3.konfirmasiUpdate();
                    int konfirmasi = Integer.parseInt(br.readLine());
                    if (konfirmasi == 1) {
                        antrian.set(idxAntrian, pelangganBaru);
                        break;
                    }
                }
            } else if (menu == 4) {
                while (true) {
                    tampil.tanyaHapusAntrian();
                    int inputNomorAntrianHapus = Integer.parseInt(br.readLine());
                    int idxAntrianHapus = inputNomorAntrianHapus - 1;

                    Fitur4 objFitur4 = new Fitur4(inputNomorAntrianHapus, antrian.get(idxAntrianHapus));

                    objFitur4.konfirmasiHapus();
                    int konfirmasi = Integer.parseInt(br.readLine());
                    if (konfirmasi == 1) {
                        antrian.remove(idxAntrianHapus);
                        break;
                    }
                }
            }
        }

    }
}
