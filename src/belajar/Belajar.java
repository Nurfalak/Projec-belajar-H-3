/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar;

import java.util.Scanner;




/**
 *
 * @author Nurfalak29
 */
public class Belajar {
    
//                         Materi yang pernah di pelajari di sekolah
//    Tipe data :
//    String
//    Short
//    byte
//    long
//    bolean
//    Float
//    Double
//            
//            
//            Looping  :
//            While
//            for
//            do while
//            
//            
//            Statement  :
//            If
//            Switch case
//            
//            
//            Activity Diagram:
//            
//            Method, Parameter:
//                    
//                    
////          Snanner = (input data):
    
//                        H 3
 
// desimal to biner   
// desimal to hexa
//  desimal to octal
//ARRAY
                        
                        
//                Pengenalan
//                
    public static void main(String[] args) {
//        System.out.println("Nurfalak");
    

    
    
//                 Integer    (angka, Dll di dalam ruang)
    
//        int x;
//        x = 20;
//                     ATAU bisa juga
//          int x = 20;
//        System.out.println(x+30);


//              double (digunakan untuk angka ber koma) 
                      
//            double  phi = 3.14;
//            System.out.println(phi);
            
            
            
//                    String
//                Perlu di perhatikan dalam pemanggilan code harus sama contoh Nama mengangil Nama...
//                Dan tipe data String menggunakan dua titik di dalam isinya

//            String Nama;
//                   Nama = "Nurfalak29";
//            System.out.println(Nama);



//                  Integer, Double dan String Kombinasi
//
//              int x;
//                  x= 20;
//                        ATAU
//              int x = 20;

////                 
//
//              String Nama;
//                     Nama = " Nurfalak29";
//                  Atau
//                  String Nama = "Nurfalak29";
//                Double phi = 3.14;
////                                         Bisa juga di tambah  kalimat  out yang lain
//              System.out.print( x + Nama +" " + phi +" Kumaha cak aing");



//              Scanner
//              Harus ada import java.util.Scanner; Letaknya di bawah public class

//            Scanner input  =  new Scanner(System.in);
//            System.out.println(input.nextLine());


        
//               Matematika di java
//       int jeruk, apel,  total;
//       jeruk = 20;
//       apel = 10;
//               Terserah kalian Bisa (+ - / * %) sesuai kebutuhan
//       total = jeruk + apel;    
//       System.out.println(total);


//                 Perbandingan Matematika
//       int jeruk, apel,  total;
//       jeruk = 20;
//       apel = 10;
//       total = jeruk + apel;    
//          Menggunakan symbol  (==, <, >, <=, >=, !=) @Jika benar = TRUE   @Jika salah = FALSE
// == : Sama dengan   < : Kurang dari  > : Lebih besar dari  <= : kurang dari sama dengan  
// >= : lebih besar sama dengan  != : Tidak sama  dengan
//       System.out.println(jeruk<20);



//                     If 
//             
//         int jeruk;
////         Jika if dan jeruk nilainya sama... maka akan keluar Jeruk gua sedikit doang jangan mau ya!!!
//         jeruk = 1; 
//         if (jeruk == 1) {
//             System.out.println("Jeruk gua sedikit doang jangan mau ya!!!");
             
             
             
//                     If dan else
//           int jeruk;
////           jika nilai jeruk sama yang keluar adalah IF jika Nilai Berbeda yang keluar adalah else
//         jeruk = 1; 
//         if (jeruk == 1) {
//             System.out.println("Jeruk gua sedikit doang jangan mau ya!!!");
//         } else {
//             System.out.println("Saya punya banyak silahkan ambil!!!");

//        Contoh ke2

//            int Nilai; 
//                        Jika nilai yang di masukan kurang dari 100 Nilainya A dan seterusnya!!!
//                Nilai =99; 
//            if (Nilai >= 100){
//        System.out.println("Anda Menadaptkan juara satu!!!");
//     } else if (Nilai >= 90) {
//             System.out.println("Nilai anda A!!!");   
//     } else if (Nilai >= 80) {
//             System.out.println("Nilai anda B!!!");
//     } else if (Nilai >= 75) {
//             System.out.println("Nilai anda C!!!");
//     } else if (Nilai >= 70) {
//             System.out.println("CIEE KENA REMEDIAL WHAAHAHAHHAHAAAAA!!!");
            



//            (11). If Dan else lebih dalam (Logika OR dan AND)

//              Konsep     AND (&&)=  Statement1      Statement2  =   Hasil
//                                       False     +       False     =  False
//                                       False     +       True      =  False
//                                       True      +      False     =  False
//                                       True      +       True      =  True

//          int Jeruk, Apel;
//          Jeruk = 11;
//          Apel = 1;
////          Printah AND (&&) dan OR (||) berbeda Fungsinya
//          if ((Jeruk >= 10) && (Apel  >= 10)){
//           System.out.println("Buahnya lebih  ");
//    }else{
//         System.out.println("Buahnya kurang");

//                   Konsep OR (||)    Statement1      Statement2  =   Hasil
//                                       False     +       False     =  False
//                                       False     +       True      =  True
//                                       True      +       False     =  True
//                                       True      +       True      =  True

//          int Jeruk, Apel;
//          Jeruk = 11;
//          Apel = 1;
////          Printah AND (&&) dan OR (||) berbeda Fungsinya
//          if ((Jeruk >= 10) || (Apel  >= 10)){
//           System.out.println("Buahnya lebih  ");
//    }else{
//         System.out.println("Buahnya kurang");






//             (12)   Switch Statement (Melakukan suatu Pemilihan pada kondisi tertentu)

//            int Umur;
//                Umur = 1;
//                
//           switch (Umur){
//               case 1 :
//                    System.out.println(" Baru Lahir");
//                    break;
//               case 2 :
//                    System.out.println(" Bisa Merakngkak ");
//                    break;
//               case 3 :
//                    System.out.println(" Bisa Berjalan");
//                    break;
//               case 4 :
//                    System.out.println(" Bisa Berlari");
//                    break;
//            default:
//                    System.out.println(" Udah Menjadi  Anak-anak");




//                  (13) For-Loop  (Perulangan)

//     for (int i=1; i<10; i++){
//         System.out.println( i +"Saya Akan Selalu Berjuang Untuk Bisa Menguasai Java");
         
         
         
//                    (14) While loop (Perulangan part2)

//                int i = 1;
//                   while (i <= 10) {
//                     System.out.println(i);
//                   i++;


//                      (15) Multiple Class (Banyak Class)
//            Pada Dasarnya Kita bisa memanggil Class Yang Lain di Bawah Main
//
//          Falak Tesfalak = new Falak();
//          Tesfalak.Pastibisa();


//                        (16) Method Berparameter (Parameter input)
//         System.out.println("Masukkan nama anda!!!");
//         Scanner input = new Scanner(System.in);
//         String inputNama = input.nextLine();
//                
//              Coding di bawah memanggil class ke 2
//            Falak Tesfalak = new Falak();
//            Tesfalak.Pastibisa("Nurfalak29");

//                          
//                           (17) Hak acess pada java (Belum di peraktekan puyeng)

//                             (18) Belum ngerti

//                             (19) Belum





                }
 }
    


