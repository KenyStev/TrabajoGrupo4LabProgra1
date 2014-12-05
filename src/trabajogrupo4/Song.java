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
public class Song {
    private int codigo, reviews, stars;
    private String nombre;
    private double precio, rating;
    
    public Song(String nom, int c, double prec){
        nombre= nom;
        codigo= c;
        precio= prec;
    }
    public String getNombre(){
        return nombre;
    }
    public int getCodigo(){
        return codigo;
    }
    public double getPrecio(){
        return precio;
    }
    public void addStars(int st){
        if (st<= 5 && st>=0){
            stars+=st;
            reviews++;
            songRating();
        }
        else{
            System.out.println("Rating invalida");
        }
    }
    public double songRating(){
        rating= stars/reviews;
        return rating;
    }
    public void print(){
        System.out.println("Codigo: "+codigo+ ", Nombre: "+ nombre+ ", Precio: "+ precio+ ", Rating: "+ rating);
    }
    public boolean validar(int c){
        return c== codigo;
    }
}
