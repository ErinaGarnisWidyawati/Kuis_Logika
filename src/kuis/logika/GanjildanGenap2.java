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
public class GanjildanGenap2 {
    
    public void proses(){
        Scanner sc = new Scanner(System.in);
        
        int input;
        
        System.out.println("Berapa Jumlah Angka Yang Ingin Anda Inputkan?");
        input = sc.nextInt();
        
        int[] angka = new int[input];
        for (int i = 0; i < angka.length; i++){
            System.out.println("Masukkan Angka ke-" +(i+1) + " : ");
            angka[i] = sc.nextInt();
        }
        System.out.print("(");
        for(int i=0; i < angka.length; i++){
            if (angka[i] % 2 == 0){
                if (i == (angka.length-1)){
                    System.out.print("Genap");
            } else {
                    System.out.print("Genap, ");
                } 
        }else {
            if (i == (angka.length - 1)){
                    System.out.print("Ganjil");   
            } else {
                System.out.print("Ganjil, ");
            }
        }
        
    }
        System.out.println(")");
}
     public static void main(String[] args) {
        GanjildanGenap2 hitung = new GanjildanGenap2();

        hitung.proses();
    }
}
        
    
    
