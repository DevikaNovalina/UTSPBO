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
public class ManajemenMahasiswa {
    public static void main(String[] args) {
        
        Mahasiswa[] daftarMhs = new Mahasiswa[10];
        
        int counter = 0, pilihan;
        // input user
        Scanner sc = new Scanner(System.in);
        boolean lapor = false;

        // bagian menu
        do {            
            System.out.println("==Menu Manajemen Mahasiswa==");
            System.out.println("1. Tambah Mahasiswa ");
            System.out.println("2. Tampilkan Semua Mahasiswa");
            System.out.println("3. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("4. Tampilkan Mahasiswa yang Lulus");
            System.out.println("5. Naikkan Semester Semua Mahasiswa");
            System.out.println("6. Keluar");
            System.out.print("Masukkan pilihan : ");
            pilihan = sc.nextInt();
            //supaya enter tidak menjalankan kode berikutnya
            sc.nextLine();

            switch (pilihan) {
                case 1 -> {
                    // menambah mahasiswa
                    System.out.println("\n==Tambah Mahasiswa==");

                    if (counter >= 10) {
                        System.out.println("- Maaf data sudah mencapai limit (Maks 10)");
                    } else {
                        //input data mahasiswa untuk memanggil setter (encapsulasi)
                        System.out.print("Masukkan NIM : ");
                        String setNim = sc.nextLine();

                        if (setNim.isEmpty()) {
                            System.out.println("invalid");
                        } else {
                            System.out.print("Masukkan nama : ");
                            String setNama = sc.nextLine();

                            System.out.print("Masukkan jurusan : ");
                            String setJurusan = sc.nextLine();

                            System.out.print("Masukkan semester : ");
                            int setSemester = sc.nextInt();
                            sc.nextLine();
                            
                            if (setSemester < 0 || setSemester > 8) {
                                System.out.println("Invalid");
                            } else {
                                System.out.print("Masukkan IPK : ");
                                double setIPK = sc.nextDouble();
                                sc.nextLine();
                                
                                if (setIPK < 0.0 || setIPK > 4.0) {
                                    System.out.println("invalid");
                                } else {
                                  
                                    daftarMhs[counter] = new Mahasiswa(setNim, setNama, setJurusan, setSemester, setIPK);
                                    
                                    counter++;
                                    System.out.println("- Data mahasiswa berhasil ditambahkan\n");
                                }
                            }
                        }
                    }
                }
                case 2 -> {
                    // menampilkan semua mahasiswa
                    if (counter == 0) {
                        System.out.println("\nMaaf belum ada data\n");
                    } else {
                        
                        for (Mahasiswa lihatMhs : daftarMhs) {
                            
                            if (lihatMhs !=null) {
                                System.out.println("");
                                lihatMhs.tampilData();
                                System.out.println("");
                                lapor = true;
                            }
                        }
                        if (!lapor) {
                            System.out.println("- tidak ditemukan data yang anda cari\n");
                        }
                    }
                }
                case 3 -> {
                    // mencari mahasiswa berdasarkan nim
                    if (counter == 0) {
                        System.out.println("\nMaaf belum ada data\n");
                    } else {
                        System.out.println("\n==Cari Mahasiswa Berdasarkan NIM==");
                        System.out.print("Masukkan NIM : ");
                        String nimTemp = sc.nextLine();
                        
                        for (int i = 0; i < counter; i++) {
                            
                            if (daftarMhs[i].getNim().equals(nimTemp)) {
                                daftarMhs[i].tampilData();
                                lapor = true;
                                System.out.println("");
                            } 
                        }
                        if (!lapor) {
                            System.out.println("- Maaf data yang anda cari tidak ada\n");
                        }
                    }
                }
                case 4 -> {
                    // menampilkan mahasiswa lulus
                    if (counter == 0) {
                        System.out.println("\nMaaf belum ada data\n");
                    } else {
                        for (int y = 0; y < counter; y++) {
                            //memanggil method lulus
                            if (daftarMhs[y].isLulus()) {
                                System.out.println("");
                                System.out.println("==Data Mahasiswa yang Lulus==");
                                daftarMhs[y].tampilData();
                                System.out.println("");
                                lapor = true;
                            } 
                        }
                        if (!lapor) {
                            System.out.println("- Maaf data yang anda cari tidak ada\n");
                        }
                    }
                }
                case 5 -> {
                    // menaikkan semester semua mahasiswa
                    if (counter == 0) {
                        System.out.println("\nMaaf belum ada data\n");
                    } else {
                        for (int j = 0; j < counter; j++) {
                            // memanggil method getSemester
                            if (daftarMhs[j].getSemester() < 8) {
                                daftarMhs[j].naikSemester();
                                System.out.println("\n- Semester mahasiswa berhasil dinaikkan\n");
                            }
                        }
                    }
                }
                case 6 -> //keluar
                    System.out.println("\nTerima kasih telah menggunakan program kami\n");
                default -> throw new AssertionError();
            }
            // ulangi program dalam do selama input bukan 6
        } while (pilihan !=6);
    }
}
