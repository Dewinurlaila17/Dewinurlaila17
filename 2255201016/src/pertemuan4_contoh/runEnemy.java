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
public class runEnemy {
    public static void main(String[] args) {
        enemy monster = new enemy();
        monster.attack();
        
        zombi zumba = new zombi();
        zumba.walk();
        
        pocong poci = new pocong();
        poci.jump();
        
        burung buwung = new burung();
        buwung.fly();
    }
    
}
