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
import java.util.Scanner;
public class SepedaMain {
    static Scanner sc = new Scanner(System.in);
    static SepedaMotor mnMtr = new SepedaMotor();
    static SepedaMotor[] spdMtr = new SepedaMotor[4];
    public static void main(String[] args) {
        spdMtr[0] = new SepedaMotor("HONDA");
        spdMtr[1] = new SepedaMotor("YAMAHA");
        spdMtr[2] = new SepedaMotor("DUCATI");
        spdMtr[3] = new SepedaMotor("SUZUKI");
        menu();
    }
    static void menu(){
        System.out.println("Pilih Sepeda Motor");
        for(int i=0;i<spdMtr.length;i++){
            System.out.println((i+1) + " " + spdMtr[i].merk);
        }
        
        System.out.print("[1-4] o> ");
        int option = sc.nextInt();
        
        switch(option){
            case 1:
                spd(spdMtr[0].merk);
                break;
            case 2:
                spd(spdMtr[1].merk);
                break;
            case 3:
                spd(spdMtr[2].merk);
                break;
            case 4:
                spd(spdMtr[3].merk);
                break;
            default:
                System.out.println("Tidak ada pilihan");
        }
    }
    
    static void spd(String motor){
        System.out.println("OPSI SEPEDA MOTOR " + motor);
        if(mnMtr.kontakMotor == false){
            System.out.println("0. Hidupkan Motor");
            System.out.println("4. Menu Awal");
        }else if(mnMtr.kontakMotor == true){
            System.out.println("1. Matikan Motor");
            System.out.println("2. Tambah Kecepatan Motor");
            System.out.println("3. Kurangi Kecepatan Motor");
        }
        
        System.out.print("o> ");
        int opMtr = sc.nextInt();
        if(opMtr == 0){
            mnMtr.matikanMotor(true);
            mnMtr.info();
            spd(motor);
        }else if(opMtr == 1){
            mnMtr.matikanMotor(false);
            mnMtr.info();
            spd(motor);
        }else if(opMtr == 2){
            mnMtr.tambahKecepatanMotor(5);
            mnMtr.info();
            spd(motor);
        }else if(opMtr == 3){
            mnMtr.kurangiKecepatanMotor(5);
            mnMtr.info();
            spd(motor);
        }else if(opMtr == 4){
            menu();
        }else{
            spd(motor);
        }
    }
}
