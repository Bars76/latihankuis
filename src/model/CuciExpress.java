/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
public class CuciExpress extends PaketCuci implements LayananAntar {

    public CuciExpress(int hargaDasar) throws DataPaketTidakValidException {
        super("Cuci Express", hargaDasar);
    }

    @Override
    public int hitungTotalBiaya() {
        return hargaDasar + 20000;
    }

    @Override
    public void cetakInfoAntar() {
        System.out.println("Antar     : Layanan Antar-Jemput Gratis LaundryKita");
    }
}