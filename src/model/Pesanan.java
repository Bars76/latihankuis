/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
public class Pesanan {

    private Pelanggan pelanggan;
    private PaketCuci paket;

    public Pesanan(Pelanggan pelanggan, PaketCuci paket) {
        this.pelanggan = pelanggan;
        this.paket = paket;
    }

    public void tampilRekap() {

        System.out.println("Pelanggan : " + pelanggan.getNama());
        System.out.println("Paket     : " + paket.getNamaPaket());
        System.out.println("Total     : Rp " + paket.hitungTotalBiaya());

        if (paket instanceof LayananAntar) {
            ((LayananAntar) paket).cetakInfoAntar();
        } else {
            System.out.println("Antar     : -");
        }

        System.out.println("------------------------------------");
    }
}