/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6_tugassetter;

/**
 *
 * @author WINDOWS
 */
public class mainketua {
    public static void main(String[]args){
        ketuakelas nama = new ketuakelas();
        
        nama.setKetua("Tolib");
        nama.setSuara(35);
        
        System.out.println("Calon ketua kelas = " +  nama.GetKetua());
        System.out.println("Perolehan suara = " + nama.GetSuara());
    }
}
