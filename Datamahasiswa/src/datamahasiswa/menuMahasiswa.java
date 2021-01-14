/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Alvinkrwn
 */
public class menuMahasiswa {
    public static ArrayList<Mahasiswa> collection = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    Mahasiswa k = new Mahasiswa();
    
    void menuUtama(){
        System.out.println("MENU");
        System.out.println("1.Tambah Data");
        System.out.println("2.Lihat Data");
        System.out.println("3.Cari Data");
        System.out.println("4.Hapus Data");
        System.out.println("5.exit");
        System.out.print("Masukkan menu pilihan Anda: ");
        
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                tambahData();
                break;
            case 2:
                lihatData();
                break;
            case 3:
                cariData();
                break;
            case 4:
                hapusData();
                break;
            default:
                System.exit(0);
                break;
        }
    }
    
    public void tambahData() {
        System.out.print("Masukkan Nama: ");
        k.nama = input.nextLine();
        input.nextLine();
        System.out.print("Masukkan NIM: ");
        k.nim = input.nextLine();
        System.out.println("Masukkan Tanggal Lahir Mahasiswa: ");
        System.out.print("Tahun: ");
        int YYYY = input.nextInt();
        System.out.print("Bulan: ");
        int MM = input.nextInt();
        System.out.print("Tanggal: ");
        int DD = input.nextInt();
        k.setTanggalLahir(YYYY, MM, DD);
        input.nextLine();
        System.out.print("Gender (1.Perempuan 0.Lak-Laki: ");
        k.gender = input.nextInt() > 1;
        
        collection.add(k);
        
        
        System.out.println("==================================");
        System.out.println("1.Tambah Data Lagi?");
        System.out.println("2.Kembali Ke Menu Utama?");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                tambahData();
                break;
            case 2:
                menuUtama();
                break;
            default:
                menuUtama();
                break;
        }
        
    }
    

    public void lihatData() {
        collection.forEach((mahasiswa) -> {
            mahasiswa.print();
        });
        this.menuUtama();
        
    }

    public void cariData() {
        System.out.println("Cari Data Mahasiswa: ");
        String mahasiswaygdicari = input.nextLine();
        collection.forEach((mahasiswa) -> {
            if (mahasiswa.nim.equals(mahasiswaygdicari)) {
                mahasiswa.print();
            }
        });
        System.out.println("1.Cari Data Lagi?");
        System.out.println("2.Kembali Ke Menu Utama?");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                cariData();
                break;
            case 2:
                menuUtama();
                break;
            default:
                menuUtama();
                break;
        }
        
    }

    public void hapusData() {
        System.out.println("Cari Data Mahasiswa: ");
        String mahasiswaygdihapus = input.nextLine();
        int index;
        boolean ditemukan = false;
        for (int i = 0; i < menuMahasiswa.collection.size(); i++) {
            if (menuMahasiswa.collection.get(i).nim.equals(mahasiswaygdihapus)) {
                index = i;
                ditemukan = true;
                if (ditemukan == true) {
                    menuMahasiswa.collection.removeIf(item -> item.nim.equals(mahasiswaygdihapus));
                    System.out.println("[Data Karyawan " + mahasiswaygdihapus + " berhasil dihapus]");
                } else {
                    System.out.println("=================================");
                    System.out.println("[Data Karyawan tidak ditemukan]");
                }
            }
            
        }
        
        System.out.println("1.Hapus Data Lagi?");
        System.out.println("2.Kembali Ke Menu Utama?");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                hapusData();
                break;
            case 2:
                menuUtama();
                break;
            default:
                menuUtama();
                break;
        }
    }
}
