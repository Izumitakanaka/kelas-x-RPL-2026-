
package xrpl;

public class xrpl {

    public static void main(String[] args) {
     murid objek = new murid();
        System.out.println("nama saya adalah : "+objek.nama);
        System.out.println("usia saya adalah : "+objek.usia);
        System.out.println("");
        System.out.println("");
        
        objek.DataSiswa();
        System.out.println("");
        int TampilanLuas=objek.MenghitungPersegi();
        System.out.println("luas persegi adalah :"+TampilanLuas);
        System.out.println("");
       
        
        
        
     siswa indo = new siswa();  
     
       
        indo.Hobi();
        System.out.println("");
        int TampilanTahun=indo.MenghitungTahunLahir();
        System.out.println("Tahun Lahir Saya Adalah : "+TampilanTahun);
        
    }
    
}
