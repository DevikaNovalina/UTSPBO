/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package KartuMahasiswa;

/**
 *
 * @author Devika Novalina
 * anggota : febrinda eka, dilla rahma,fidlela latifa
 * NIM = 25104410038,25104410046, 25104410042, 25104410059
 * Kelas = 2B
 * Prodi = Teknik Informatika
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private int semester;
    private double ipk;
    
    public Mahasiswa() {
        nama = "";
        nim = "";        
        jurusan = "";
        semester = 1;
        ipk = 0.0;
    }
    public Mahasiswa(String nama,String nim){
        this.nama = nama;
        this.nim = nim;
        jurusan = "";
        semester = 1;
        ipk = 0.0;
    }
    public Mahasiswa (String nama, String nim, String jurusan, int semester,double ipk){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.semester = semester;
        this.ipk = ipk;
                
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    
    public void tampilData(){
        System.out.println("nama = "+ nama);
        System.out.println("nim = " + nim);
        System.out.println("jurusan = " + jurusan);
        System.out.println("semester = "+ semester);
        System.out.println("ipk = " + ipk);
        System.out.println("______________________");
    }
    public void tampilData(boolean denganHeader){
        if (denganHeader == true){
            System.out.println("==== DATA MAHASISWA =====");
            tampilData();
        }
        
    }
     
    @SuppressWarnings("unused")
   boolean isLulus(){
       return this.ipk >= 3.0 && this.semester == 8;
   }
   void naikSemester() {
       if (semester < 8){
           semester++;
       }
   }
}