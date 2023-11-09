/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6_contoh;

/**
 *
 * @author WINDOWS
 */
public class poliLingkaran {
    float luas(float jarijari){
        return (float) (Math.PI*jarijari*jarijari);
    }
    double luas (double diameter){
        return (Math.PI*diameter*1/4);
    }
    
    public static void main(String[] args) {
        
        poliLingkaran L = new poliLingkaran();
    
    
    float jari2 = 15;
    double diameter = 21;
    
    
    System.out.println("Luas lingkaran = " + L.luas(jari2));
    System.out.println("Luas lingkaran = "+ L.luas(diameter));
    }
    
}
