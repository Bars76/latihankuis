/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laundrykita;
import java.util.ArrayList;
import java.util.Scanner;
import model.*;

public class LaundryKita {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Pesanan> daftarPesanan = new ArrayList<>();
    public static void main(String[] args) {
        int menu;
        do {
            System.out.println("\n=== SISTEM MANAJEMEN LAUNDRY - LaundryKita ===");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Keluar");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            input.nextLine();
            if (menu == 1) {
                try {
                    System.out.println("\n--- Data Pelanggan ---");
                    System.out.print("Nama : ");
                    String nama = input.nextLine();
                    System.out.print("Nomor Telepon : ");
                    String telp = input.nextLine();
                    if (!telp.matches("[0-9]+")) {
                        throw new Exception("Nomor telepon hanya boleh berisi angka!");
                    }
                    System.out.println("\n--- Data Paket ---");
                    System.out.print("Harga Dasar : ");
                    int harga = input.nextInt();
                    System.out.print("Jenis Paket (1. Regular / 2. Express): ");
                    int jenis = input.nextInt();
                    input.nextLine();
                    Pelanggan pelanggan = new Pelanggan(nama, telp);
                    PaketCuci paket;
                    if (jenis == 1) {
                        paket = new CuciRegular(harga);
                    } else {
                        paket = new CuciExpress(harga);
                    }
                    Pesanan pesanan = new Pesanan(pelanggan, paket);
                    daftarPesanan.add(pesanan);
                    System.out.println("\n[OK] Pesanan berhasil ditambahkan!");
                }
                catch (DataPaketTidakValidException e) {
                    System.out.println("[ERROR] " + e.getMessage());
                }
                catch (Exception e) {
                    System.out.println("[ERROR] " + e.getMessage());
                    input.nextLine();
                }
            }
        } while (menu != 2);
        tampilRekap();
    }
    static void tampilRekap() {
        System.out.println("\n=========== REKAP PESANAN ===========");
        for (Pesanan p : daftarPesanan) {
            p.tampilRekap();
        }
        System.out.println("=====================================");}}