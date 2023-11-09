/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4_tugas;

/**
 *
 * @author WINDOWS
 */
public class runHewan {
    public static void main(String[] args) {
        hewan Hewan = new hewan();
        Hewan.vertebrata();
        
        kucing Persia = new kucing();
        Persia.kaki();
        
        ikan Paus = new ikan();
        Paus.berenang();
    }
    
}
