/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
public abstract class PaketCuci {
    protected String namaPaket;
    protected int hargaDasar;

    public PaketCuci(String namaPaket, int hargaDasar) throws DataPaketTidakValidException {

        if (hargaDasar <= 0) {
            throw new DataPaketTidakValidException("Harga dasar harus lebih dari 0!");
        }

        this.namaPaket = namaPaket;
        this.hargaDasar = hargaDasar;
    }

    public String getNamaPaket() {
        return namaPaket;
    }

    public abstract int hitungTotalBiaya();
}