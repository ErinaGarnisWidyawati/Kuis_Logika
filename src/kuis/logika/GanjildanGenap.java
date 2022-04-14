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
public class GanjildanGenap {
    
    int a;
    
    public void hitung(int a){
        if (a % 2 == 0){
            System.out.println(a+" merupakan bilangan genap");
        } else {
            System.out.println(a+ " merupakan bilangan ganjil");
        }
    }
    public static void main(String[] args){
        GanjildanGenap proses = new GanjildanGenap();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan Angka : ");
        proses.a = sc.nextInt();
        
        proses.hitung(proses.a);
        
    }
    
}