/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package KartuMahasiswa;
import java.util.Scanner;
/**
 *
 * @author Devika Novalina
 * anggota : febrinda eka, dilla rahma,fidlela latifa
 * NIM = 25104410038, 25104410046, 25104410042, 25104410059
 * Kelas = 2B
 * Prodi = Teknik Informatika
 */
public class ManaJemenMahasiswa {
    public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    
    Mahasiswa[] daftarMahasiswa = new Mahasiswa[10];
    
    int jumlah = 0;
    
    int pilihan;
    
     do {
         System.out.println("\n===== MENU =====");
         System.out.println("1. Tambah Mahasiswa");
         System.out.println("2. Tampilkan semua mahasiswa");
         System.out.println("3. Cari Mahasiswa Berdasarkan NIM");
         System.out.println("4. Tampilkan Mahasiswa Lulus (ipk >= 3.0)");
         System.out.println("5. Naikan Semester Semua Mahasiswa");
         System.out.println("6. Keluar");
         System.out.print("pilih : ");
         pilihan = input.nextInt();
         input.nextLine();
         
         switch (pilihan) {
             case 1 -> {
                 if (jumlah < 10){
                  Mahasiswa mhs = new Mahasiswa();
        
        System.out.printf("%-10s: ", "NIM");
        String nim = input.nextLine();
        if (nim.trim().isEmpty()) {
            System.out.println("NIM tidak boleh kosong!");
            break;
        }
        mhs.setNim(nim);
        
        System.out.printf("%-10s: ", "NAMA");
        mhs.setNama(input.nextLine());
        
        System.out.printf("%-10s: ", "JURUSAN");
        mhs.setJurusan(input.nextLine());
        
        System.out.printf("%-10s: ", "SEMESTER");
        int semester = input.nextInt();
        mhs.setSemester(semester);
        
        System.out.printf("%-10s: ", "IPK");
        double ipk = input.nextDouble();
        mhs.setIpk(ipk);
        
        input.nextLine(); // bersihkan newline setelah nextDouble
        
        daftarMahasiswa[jumlah] = mhs;
        jumlah++;
        System.out.println("Data Berhasil Ditambahkan!");
    } else {
        System.out.println("Data Penuh!");
    }
    break;
            }
                     
             case 2 -> {
                 if (jumlah == 0){
                     System.out.println("Belum Ada Data! ");
                 }else{
                     for (int i = 0; i < jumlah; i++){
                         daftarMahasiswa[i].tampilData();
                     }
                 }
            }
             
        case 3 -> {
            System.out.print("Masukkan NIM yang dicari: ");
            String cariNim = input.nextLine();
            boolean ditemukan = false;
            
            for (int i = 0; i < jumlah; i++){
                if (daftarMahasiswa[i].getNim().equals(cariNim)){
                    daftarMahasiswa[i].tampilData();
                    ditemukan = true;
                }
            }
            if (!ditemukan) {
                System.out.println("Mahasiswa tidak ditemukan! ");
            }   }
             
        case 4 -> {
            System.out.println("Mahasiswa Lulus (IPK >= 3.0):");
            for (int i = 0; i < jumlah; i++) {
                if (daftarMahasiswa[i].getIpk() >= 3.0) {
                    daftarMahasiswa[i].tampilData();
                    
                }
            }      }
        
    case 5 -> {
        for (int i = 0; i < jumlah; i++) {
            daftarMahasiswa[i].naikSemester();
        }
        System.out.println("Semua mahasiswa naik semester!");
            }
        
    case 6 -> System.out.println("Terima kasih!");
         
         default -> System.out.println("Pilihan tidak valid!");
}

        }while (pilihan != 6);
    }
}
