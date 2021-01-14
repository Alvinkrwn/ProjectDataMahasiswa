/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;

import java.time.LocalDate;

public class Mahasiswa {

    //attribut
    String nama;
    String nim;
    boolean gender;
    LocalDate tl;

    public void setTanggalLahir(int YYYY, int MM, int DD) {
        tl = LocalDate.of(YYYY, MM, DD);
    }

    public void print() {
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("====+PROFIL MAHASISWA+====");
        System.out.println("Nama Karyawan           : " + this.nama);
        System.out.println("Nim Karyawan            : " + this.nim);
        System.out.println("Tanggal Lahir Mahasiswa : " + this.tl);
        System.out.println("Jenis Kelamin           : " + this.getGender());
    }

    public String getGender() {
        if (gender) {
            return "Laki laki";
        } else {
            return "Perempuan";
        }

    }
}
