/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package W4_Encapsulation;

import java.util.Scanner;

/**
 *
 * @author Eka Prasetiawan NIM: 22104410028
   Teknik Informatika TI-A
 */
public class MainKinetic {
    double massa, kecepatan;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double hitungEnergiKinetic() {
        return 0.5 * massa * Math.pow(kecepatan, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainKinetic objek = new MainKinetic();

        System.out.print("Masukkan massa objek :");
        double massa = scanner.nextDouble();
        objek.setMassa(massa);

        System.out.print("Masukkan kecepatan objek :");
        double kecepatan = scanner.nextDouble();
        objek.setKecepatan(kecepatan);

        double energiKinetic = objek.hitungEnergiKinetic();

        System.out.println("Energi Kinetic :" + energiKinetic);
        
    }
}