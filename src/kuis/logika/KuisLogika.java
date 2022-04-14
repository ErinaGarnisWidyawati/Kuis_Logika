/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis.logika;

/**
 *
 * @author RYZEN5
 */
import java.util.Scanner;
public class KuisLogika {

    /**
     * @param args the command line arguments
     */
    
    int a;
    int b;
    
    public void angka(int a, int b){
        if (a>b){
            System.out.println("Angka Yang Lebih Besar Adalah = "+a);
        } else {
            System.out.println("Angka Yang Lebih Besar Adalah = "+b);
        }
    }
    public static void main(String[] args) {
        KuisLogika angka = new KuisLogika();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan Angka Pertama : ");
        angka.a = sc.nextInt();
        
        System.out.println("Masukkan Angka Kedua : ");
        angka.b = sc.nextInt();
        
        angka.angka(angka.a, angka.b);
                
                
                
                
        
        
        
        
    }
    
}
