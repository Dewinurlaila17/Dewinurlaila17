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
public class ketuakelas {
    private String ketua;
    private int suara;
    
    public void setKetua(String ketua){
        this.ketua = ketua;
    }
    
    public void setSuara(int suara){
        this.suara = suara;
    }
    public String GetKetua(){
        return this.ketua;
    }
    
    public int GetSuara(){
        return this.suara;
    }
}
