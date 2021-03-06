/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis_1H_Hairullah;

/**
 *
 * @author irulg
 */
public class SepedaMotor {
    public String merk;
    public boolean kontakMotor = false;
    public int kecepatanMotor;
    
    SepedaMotor(){
        
    }
    
    SepedaMotor(String merk){
        this.merk = merk;
    }
    
    void nyalakanMotor(boolean kontak){
        this.kontakMotor = kontak;
    }
    
    void matikanMotor(boolean kontak){
        this.kontakMotor = kontak;
    }
    
    void tambahKecepatanMotor(int kec){
        if(kecepatanMotor >= 100){
            System.out.println("----------------------------------");
            System.out.println("Maksimal kecepatan adalah 100 km");
            System.out.println("----------------------------------");
        }else{
            this.kecepatanMotor += kec;
        }
    }
    
    void kurangiKecepatanMotor(int kec){
        if(kecepatanMotor <= 0){
            System.out.println("-------------------------------");
            System.out.println("Minimal kecepatan adalah 0 km");
            System.out.println("-------------------------------");
        }else{
            this.kecepatanMotor -= kec;
        }
    }
    
    void info(){
        System.out.println("--------------------------------");
        if(kecepatanMotor <= 0){
            if(kontakMotor == true){
                System.out.println("SEPEDA MOTOR TELAH HIDUPKAN");
            }else{
                System.out.println("SEPEDA MOTOR TELAH DIMATIKAN");
            }
            System.out.println("KECEPATAN : " + kecepatanMotor);
        }else{
            System.out.println("KECEPATAN : " + kecepatanMotor);
        }
        System.out.println("--------------------------------");
    }
}
