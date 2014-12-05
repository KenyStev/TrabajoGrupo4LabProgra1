/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajogrupo4;

/**
 *
 * @author zerokull
 */
public class ITunes {
    private Song[] songs;
    public static int MAX_SONGS = 20;
    private int cont=0;

    public ITunes() {
        songs = new Song[MAX_SONGS];
    }
    
    public int validarCodigo(int code){
        for (int i = 0; i < cont; i++) {
            if(songs[i] != null && songs[i].validar(code)){
                return i;
            }
        }
        return -1;
    }
    
    public int searchIndex(boolean nullObject, int code){
        for (int i = 0; i < songs.length; i++) {
            if(nullObject){
             if(songs[i]==null){
                return i;
            }   
            }else{
                if(songs[i] != null && songs[i].validar(code)){
                    return i;
                }
            }
            
        }
        return -1;
    }
    
    public boolean addSong(int codigo, String nombre, double precio){
        int unico = validarCodigo(codigo);
        if(unico==-1 && cont<=songs.length){
//            int index = searchIndex(true, 0);
//            if(index>=0){
                songs[cont++] = new Song(nombre, codigo, precio);
                return true;
//            }
        }
        return false;
    }
    
    public Song searchSong(int code){
        int index = searchIndex(false, code);
        if(index>=0){
            return songs[index];
        }
        return null;
    }
    
    public void rateSong(int cant, int code){
        Song temp = searchSong(code);
        if(temp!=null){
            int index = searchIndex(false, code);
            songs[index].addStars(cant);
            songs[index].print();
        }else{
            System.out.println("Song no existe!");
        }
    }
    
    public void printSongs(){
        for (int i = 0; i < cont; i++) {
            songs[i].print();
        }
    }
}
