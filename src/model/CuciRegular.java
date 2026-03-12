/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
public class CuciRegular extends PaketCuci {

    public CuciRegular(int hargaDasar) throws DataPaketTidakValidException {
        super("Cuci Regular", hargaDasar);
    }

    @Override
    public int hitungTotalBiaya() {
        return hargaDasar;
    }
}

