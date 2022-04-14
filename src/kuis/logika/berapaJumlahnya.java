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
public class berapaJumlahnya {
    
    int a;
    
    public void proses(int a){
        
        int total = 0;
        
        for(int i = 1; i <= a; i++){
            total += i;
            
            if (i==a){
                System.out.print(i);
            } else {
                System.out.print(i+ " + ");
            }
        }
        System.out.println(" = "+ total);
    }
    public static void main(String[] args){
        berapaJumlahnya proses = new berapaJumlahnya();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan Angka : ");
        proses.a = sc.nextInt();
        
        proses.proses(proses.a);
        
    }
    
    
    
}
