/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajogrupo4;

/**
 *
 * @author Shamsize
 */
public class Main {
    public static void main(String[] args){
        
        ITunes jdk= new ITunes();
        jdk.addSong(1, "fma", 5);
        jdk.rateSong(3,2);
        jdk.printSong();
        
    }
}
