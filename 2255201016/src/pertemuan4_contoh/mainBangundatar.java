/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4_contoh;

/**
 *
 * @author WINDOWS
 */
public class mainBangundatar {
    public static void main(String[] args) {
       
        persegi Persegi = new persegi();
        Persegi.sisi = 5;
        
        lingkaran Lingkaran = new lingkaran();
        Lingkaran.r = 21;
        
        persegiPanjang Persegipanjang = new persegiPanjang();
        Persegipanjang.panjang = 10;
        Persegipanjang.lebar = 3;
        
        segitiga Segitiga = new segitiga();
        Segitiga.alas = 5;
        Segitiga.tinggi = 7;
        
        Persegi.keliling();
        Persegi.luas();
        
        Lingkaran.luas();
        Lingkaran.keliling();
        
        Persegipanjang.luas();
        Persegipanjang.keliling();
        
        Segitiga.luas();
        Segitiga.keliling();
        
    }
    
}
