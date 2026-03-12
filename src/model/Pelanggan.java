/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;
public class Pelanggan {
    private static int counter = 1;
    private final String idPelanggan;
    private String nama;
    private String nomorTelepon;

    public Pelanggan(String nama, String nomorTelepon) {

        this.idPelanggan = String.format("P%03d", counter++);

        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }
    public String getIdPelanggan() {
        return idPelanggan;
    }
    public String getNama() {
        return nama;
    }
    public String getNomorTelepon() {
        return nomorTelepon;
    }}