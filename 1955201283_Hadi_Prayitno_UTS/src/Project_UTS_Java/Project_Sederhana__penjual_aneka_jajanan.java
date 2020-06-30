/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_UTS_Java;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author LENOVO 330
 */
public class Project_Sederhana__penjual_aneka_jajanan {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Selamat datang di aneka jajan khas kami");
        System.out.println("Aneka Jajanan");
        System.out.println("jual : Martabak Telur"
                       + "\n       Martabak Manis (Terang Bulan)"
                       + "\n       Roti Bakar"
                       + "\n       Pisang nugget");
        Scanner scan = new Scanner(System.in);
        System.out.println("pilih menu aneka jajanan ? ");
        int M3nu ;
        String menu = scan.nextLine();
       
        
        InputStreamReader isr = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(isr);
        
       int MartabakTelur, 
           MartabakManis, 
           RotiBakar,  
           pisangNugget; 
       
        if ("martabak telur".equals(menu)){
         
        System.out.println("varian rasa Martabak Telur  \n 1. Rasa : Daging jamur"
                                                     + "\n 2. Rasa : Daging ayam"
                                                     + "\n 3. Rasa : Daging sapi"
                                                     + "\n 4. Rasa : Daging ayam + keju mozarela"
                                                     + "\n 5. Rasa : Daging sapi + keju mozarela"
                                                     + "\n 6. Rasa : Sosis"
                                                     + "\n 7. Rasa : keju mozarela"
                                                     + "\n 8. Rasa : Sosis + keju mozarela"
                                                     + "\n 9. Rasa : Keju biasa"
                                                     + "\n10. Rasa : spesial");
        System.out.println("pilih rasa martabak telur ? ");
        int user = 0;
          user = Integer.parseInt(br.readLine());  
            switch (user){
                case 1:
                    System.out.println("Martabak Telur Rasa : Daging jamur - Harga 25.000");
                     boolean martabaktelur1 = true;
        int pesanan1 = 0;
        String pesan1;
        
        //Input
        while( martabaktelur1 ){
            System.out.println("apakah anda inggin memesan Martabak Telur Rasa : Daging jamur lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan1 = scan.nextLine();
            
            if( pesan1.equalsIgnoreCase("Tidak") ){
                martabaktelur1 = false;
            }
        //Output
            pesanan1++;
        }
        System.out.println("Anda telah memesan "+ pesanan1 +"  Martabak Telur Rasa : Daging jamur");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
    
                    break;
                case 2:
                    System.out.println("Martabak Telur Rasa : Daging ayam - Harga 30.000");
                     boolean martabaktelur2 = true;
        int pesanan2 = 0;
        String pesan2;
        
        //Input
        while( martabaktelur2 ){
            System.out.println("apakah anda inggin memesan Martabak Telur Rasa : Daging ayam lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan2 = scan.nextLine();
            
            if( pesan2.equalsIgnoreCase("Tidak") ){
                martabaktelur2 = false;
            }
        //Output
            pesanan2++;
        }
        System.out.println("Anda telah memesan "+ pesanan2 +"  Martabak Telur Rasa : Daging ayam");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
    
                    
                    break;
                case 3:
                    System.out.println("Martabak Telur Rasa : Daging sapi - Harga 33.000");
                     boolean martabaktelur3 = true;
        int pesanan3 = 0;
        String pesan3;
        
        //Input
        while( martabaktelur3 ){
            System.out.println("apakah anda inggin memesan Martabak Telur Rasa : Daging sapi lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan2 = scan.nextLine();
            
            if( pesan2.equalsIgnoreCase("Tidak") ){
                martabaktelur3 = false;
            }
        //Output
            pesanan3++;
        }
        System.out.println("Anda telah memesan "+ pesanan3 +"  Martabak Telur Rasa : Daging sapi");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
    
                    
                    
                    break;
                case 4:
                    System.out.println("Martabak Telur Rasa : Daging ayam + keju mozarela - Harga 35.000");
                     boolean martabaktelur4 = true;
        int pesanan4 = 0;
        String pesan4;
        
        //Input
        while( martabaktelur4 ){
            System.out.println("apakah anda inggin memesan Martabak Telur Rasa : Daging ayam + Keju mozarela lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan2 = scan.nextLine();
            
            if( pesan2.equalsIgnoreCase("Tidak") ){
                martabaktelur4 = false;
            }
        //Output
            pesanan4++;
        }
        System.out.println("Anda telah memesan "+ pesanan4 +"  Martabak Telur Rasa : Daging ayam + Keju mozarela");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
    
                    
                    
                    break;
                case 5:
                    System.out.println("Martabak Telur Rasa : Daging sapi + keju mozarela - Harga 38.000");
                     boolean martabaktelur5 = true;
        int pesanan5 = 0;
        String pesan5;
        
        //Input
        while( martabaktelur5 ){
            System.out.println("apakah anda inggin memesan Martabak Telur Rasa : Daging Sapi + Keju mozarela lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan2 = scan.nextLine();
            
            if( pesan2.equalsIgnoreCase("Tidak") ){
                martabaktelur5 = false;
            }
        //Output
            pesanan5++;
        }
        System.out.println("Anda telah memesan "+ pesanan5 +"  Martabak Telur Rasa : Daging Sapi + Keju mozarela ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
    
                    
                    
                    break;
                case 6:
                    System.out.println("Martabak Telur Rasa : Sosis - Harga 25.000");
                     boolean martabaktelur6 = true;
        int pesanan6 = 0;
        String pesan6;
        
        //Input
        while( martabaktelur6 ){
            System.out.println("apakah anda inggin memesan Martabak Telur Rasa : Sosis lagi ?");
            System.out.println(" Ya/Tidak ");
            
            pesan2 = scan.nextLine();
            
            if( pesan2.equalsIgnoreCase("Tidak") ){
                martabaktelur6 = false;
            }
        //Output
            pesanan6++;
        }
        System.out.println("Anda telah memesan "+ pesanan6 +"  Martabak Telur Rasa : Sosis ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
    
                    
                    
                    break;
                case 7:
                    System.out.println("Martabak Telur Rasa : keju mozarela - Harga 28.000");
                     boolean martabaktelur7 = true;
        int pesanan7 = 0;
        String pesan7;
        
        //Input
        while( martabaktelur7 ){
            System.out.println("apakah anda inggin memesan Martabak Telur Rasa : Keju mozarela lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan2 = scan.nextLine();
            
            if( pesan2.equalsIgnoreCase("Tidak") ){
                martabaktelur7 = false;
            }
        //Output
            pesanan7++;
        }
        System.out.println("Anda telah memesan "+ pesanan7 +"  Martabak Telur Rasa : Keju mozarela");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
    
                    
                    
                    break;
                case 8:
                    System.out.println("Martabak Telur Rasa : Sosis + Keju mozarela - Harga 30.000");
                    boolean martabaktelur8 = true;
        int pesanan8 = 0;
        String pesan8;
        
        //Input
        while( martabaktelur8 ){
            System.out.println("apakah anda inggin memesan Martabak Telur Rasa : Sosis + Keju mozarela lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan2 = scan.nextLine();
            
            if( pesan2.equalsIgnoreCase("Tidak") ){
                martabaktelur8 = false;
            }
        //Output
            pesanan8++;
        }
        System.out.println("Anda telah memesan "+ pesanan8 +"  Martabak Telur Rasa : Sosis + Keju mozarela");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
    
                    
                    
                    break;
                case 9:
                    System.out.println("Martabak Telur Rasa : Keju biasa - Harga 23.000 ");
                     boolean martabaktelur9 = true;
        int pesanan9 = 0;
        String pesan9;
        
        //Input
        while( martabaktelur9 ){
            System.out.println("apakah anda inggin memesan Martabak Telur Rasa : Keju biasa lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan9 = scan.nextLine();
            
            if( pesan9.equalsIgnoreCase("Tidak") ){
                martabaktelur9 = false;
            }
        //Output
            pesanan9++;
        }
        System.out.println("Anda telah memesan "+ pesanan9 +"  Martabak Telur Rasa : Keju biasa");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
    
                    
                    
                    break;
                case 10:
                System.out.println("Martabak Telur Rasa : Spesial - Harga 40.000 ");
                 boolean martabaktelur10 = true;
        int pesanan10 = 0;
        String pesan10;
        
        //Input
        while( martabaktelur10 ){
            System.out.println("apakah anda inggin memesan Martabak Telur Rasa : Spesial lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan2 = scan.nextLine();
            
            if( pesan2.equalsIgnoreCase("Tidak") ){
                martabaktelur10 = false;
            }
        //Output
            pesanan10++;
        }
        System.out.println("Anda telah memesan "+ pesanan10 +"  Martabak Telur Rasa : Spesial");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~"); 
                    break;
                    
                    default :
                    System.out.println("Anda salah pilih varian rasa atau varian rasa yang anda pilih tidak ada"
                                   + "\nNB:Cara memilih varian rasa hanya memasukkan No.varian rasa saja");
                         
        }
        
        } else if ("martabak manis".equals(menu)){
            
        System.out.println("varian rasa Martabak Manis  \n ORIGINAL                  PREMIUM"
                                                     + "\n 1. Rasa : Strowberry      11. Rasa : Pandan"
                                                     + "\n 2. Rasa : Blueberry       12. Rasa : Matcha"
                                                     + "\n 3. Rasa : Nanas           13. Rasa : Black sweet"
                                                     + "\n 4. Rasa : Durian          14. Rasa : Red velvet"
                                                     + "\n 5. Rasa : Melon           15. Rasa : Tiramisu"
                                                     + "\n 6. Rasa : Vanila          16. Rasa : Coffe"
                                                     + "\n 7. Rasa : Anggur          17. Rasa : Green tea"
                                                     + "\n 8. Rasa : Kacang          18. Rasa : Nutella"
                                                     + "\n 9. Rasa : Cokelat         19. Rasa : Oreo"
                                                     + "\n10. Rasa : Misis           20. Rasa : kismis");
        System.out.println("pilih rasa martabak Manis ? ");
        int user = 0;
          user = Integer.parseInt(br.readLine());  
            switch (user){
                case 1:
                    System.out.println("Martabak Manis Rasa : Strowberry - Harga 10.000 ");
                     boolean martabakmanis1 = true;
        int pesanan1 = 0;
        String pesan1;
        
        //Input
        while( martabakmanis1 ){
            System.out.println("apakah anda inggin memesan Martabak Manis Rasa : Strowberry lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan1 = scan.nextLine();
            
            if( pesan1.equalsIgnoreCase("Tidak") ){
                martabakmanis1 = false;
            }
        //Output
            pesanan1++;
        }
        System.out.println("Anda telah memesan "+ pesanan1 +"  Martabak Manis Rasa : Strowberry ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 2:
                    System.out.println("Martabak Manis Rasa : Blueberry - Harga 10.000 ");
                     boolean martabakmanis2 = true;
        int pesanan2 = 0;
        String pesan2;
        
        //Input
        while( martabakmanis2 ){
            System.out.println("apakah anda inggin memesan Martabak Manis Rasa : Blueberry lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan2 = scan.nextLine();
            
            if( pesan2.equalsIgnoreCase("Tidak") ){
                martabakmanis2 = false;
            }
        //Output
            pesanan2++;
        }
        System.out.println("Anda telah memesan "+ pesanan2 +"  Martabak Manis Rasa : Blueberry ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 3:
                    System.out.println("Martabak Manis Rasa : Nanas - Harga 10.000 ");
                     boolean martabakmanis3 = true;
        int pesanan3 = 0;
        String pesan3;
        
        //Input
        while( martabakmanis3 ){
            System.out.println("apakah anda inggin memesan Martabak Manis Rasa : Nanas lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan3 = scan.nextLine();
            
            if( pesan3.equalsIgnoreCase("Tidak") ){
                martabakmanis3 = false;
            }
        //Output
            pesanan3++;
        }
        System.out.println("Anda telah memesan "+ pesanan3 +"  Martabak Manis Rasa : Nanas ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 4:
                    System.out.println("Martabak Manis Rasa : Durian - Harga 10.000 ");
                     boolean martabakmanis4 = true;
        int pesanan4 = 0;
        String pesan4;
        
        //Input
        while( martabakmanis4 ){
            System.out.println("apakah anda inggin memesan Martabak Manis Rasa : Durian lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan4 = scan.nextLine();
            
            if( pesan4.equalsIgnoreCase("Tidak") ){
                martabakmanis4 = false;
            }
        //Output
            pesanan4++;
        }
        System.out.println("Anda telah memesan "+ pesanan4 +"  Martabak Manis Rasa : Durian ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 5:
                    System.out.println("Martabak Manis Rasa : Melon - Harga 10.000 ");
                     boolean martabakmanis5 = true;
        int pesanan5 = 0;
        String pesan5;
        
        //Input
        while( martabakmanis5 ){
            System.out.println("apakah anda inggin memesan Martabak Manis Rasa : Melon lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan5 = scan.nextLine();
            
            if( pesan5.equalsIgnoreCase("Tidak") ){
                martabakmanis5 = false;
            }
        //Output
            pesanan5++;
        }
        System.out.println("Anda telah memesan "+ pesanan5 +"  Martabak Manis Rasa : Melon ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 6:
                    System.out.println("Martabak Manis Rasa : Vanila - Harga 15.000 ");
                     boolean martabakmanis6 = true;
        int pesanan6 = 0;
        String pesan6;
        
        //Input
        while( martabakmanis6 ){
            System.out.println("apakah anda inggin memesan Martabak Manis Rasa : Vanila lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan6 = scan.nextLine();
            
            if( pesan6.equalsIgnoreCase("Tidak") ){
                martabakmanis6 = false;
            }
        //Output
            pesanan6++;
        }
        System.out.println("Anda telah memesan "+ pesanan6 +"  Martabak Manis Rasa : Vanila ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 7:
                    System.out.println("Martabak Manis Rasa : Anggur - Harga 10.000 ");
                     boolean martabakmanis7 = true;
        int pesanan7 = 0;
        String pesan7;
        
        //Input
        while( martabakmanis7 ){
            System.out.println("apakah anda inggin memesan Martabak Manis Rasa : Anggur lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan7 = scan.nextLine();
            
            if( pesan7.equalsIgnoreCase("Tidak") ){
                martabakmanis7 = false;
            }
        //Output
            pesanan7++;
        }
        System.out.println("Anda telah memesan "+ pesanan7 +"  Martabak Manis Rasa : Anggur ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 8:
                    System.out.println("Martabak Manis Rasa : Kacang - Harga 10.000 ");
                     boolean martabakmanis8 = true;
        int pesanan8 = 0;
        String pesan8;
        
        //Input
        while( martabakmanis8 ){
            System.out.println("apakah anda inggin memesan Martabak Manis Rasa : Kacang lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan8 = scan.nextLine();
            
            if( pesan8.equalsIgnoreCase("Tidak") ){
                martabakmanis8 = false;
            }
        //Output
            pesanan8++;
        }
        System.out.println("Anda telah memesan "+ pesanan8 +"  Martabak Manis Rasa : Kacang ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 9:
                    System.out.println("Martabak Manis Rasa : Cokelat - Harga 15.000 ");
                     boolean martabakmanis9 = true;
        int pesanan9 = 0;
        String pesan9;
        
        //Input
        while( martabakmanis9 ){
            System.out.println("apakah anda inggin memesan Martabak Manis Rasa : Cokelat lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan9 = scan.nextLine();
            
            if( pesan9.equalsIgnoreCase("Tidak") ){
                martabakmanis9 = false;
            }
        //Output
            pesanan9++;
        }
        System.out.println("Anda telah memesan "+ pesanan9 +"  Martabak Manis Rasa : Cokelat ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 10:
                    System.out.println("Martabak Manis Rasa : Misis - Harga 10.000 ");
                     boolean martabakmanis10 = true;
        int pesanan10 = 0;
        String pesan10;
        
        //Input
        while( martabakmanis10 ){
            System.out.println("apakah anda inggin memesan Martabak Manis Rasa : Misis lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan10 = scan.nextLine();
            
            if( pesan10.equalsIgnoreCase("Tidak") ){
                martabakmanis10 = false;
            }
        //Output
            pesanan10++;
        }
        System.out.println("Anda telah memesan "+ pesanan10 +"  Martabak Manis Rasa : Misis ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                 case 11:
                    System.out.println("Martabak Manis Rasa : Pandan - Harga 20.000 ");
                     boolean martabakmanis11 = true;
        int pesanan11 = 0;
        String pesan11;
        
        //Input
        while( martabakmanis11 ){
            System.out.println("apakah anda inggin memesan Martabak Manis Rasa : Pandan lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan11 = scan.nextLine();
            
            if( pesan11.equalsIgnoreCase("Tidak") ){
                martabakmanis11 = false;
            }
        //Output
            pesanan11++;
        }
        System.out.println("Anda telah memesan "+ pesanan11 +"  Martabak Manis Rasa : Pandan ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 12:
                    System.out.println("Martabak Manis Rasa : Matcha - Harga 30.000 ");
                     boolean martabakmanis12 = true;
        int pesanan12 = 0;
        String pesan12;
        
        //Input
        while( martabakmanis12 ){
            System.out.println("apakah anda inggin memesan Martabak Manis Rasa : Matcha lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan12 = scan.nextLine();
            
            if( pesan12.equalsIgnoreCase("Tidak") ){
                martabakmanis12 = false;
            }
        //Output
            pesanan12++;
        }
        System.out.println("Anda telah memesan "+ pesanan12 +"  Martabak Manis Rasa : Matcha ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 13:
                    System.out.println("Martabak Manis Rasa : Black sweet - Harga 45.000 ");
                     boolean martabakmanis13 = true;
        int pesanan13 = 0;
        String pesan13;
        
        //Input
        while( martabakmanis13 ){
            System.out.println("apakah anda inggin memesan Martabak Manis Rasa : Black sweet lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan13 = scan.nextLine();
            
            if( pesan13.equalsIgnoreCase("Tidak") ){
                martabakmanis13 = false;
            }
        //Output
            pesanan13++;
        }
        System.out.println("Anda telah memesan "+ pesanan13 +"  Martabak Manis Rasa : Black sweet ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 14:
                    System.out.println("Martabak Manis Rasa : Red velvet - Harga 50.000 ");
                     boolean martabakmanis14 = true;
        int pesanan14 = 0;
        String pesan14;
        
        //Input
        while( martabakmanis14 ){
            System.out.println("apakah anda inggin memesan Martabak Manis Rasa : Red velvet lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan14 = scan.nextLine();
            
            if( pesan14.equalsIgnoreCase("Tidak") ){
                martabakmanis14 = false;
            }
        //Output
            pesanan14++;
        }
        System.out.println("Anda telah memesan "+ pesanan14 +"  Martabak Manis Rasa : Red velvet ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 15:
                    System.out.println("Martabak Manis Rasa : Tiramisu - Harga 40.000 ");
                     boolean martabakmanis15 = true;
        int pesanan15 = 0;
        String pesan15;
        
        //Input
        while( martabakmanis15 ){
            System.out.println("apakah anda inggin memesan Martabak Manis Rasa : Tiramisu lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan15 = scan.nextLine();
            
            if( pesan15.equalsIgnoreCase("Tidak") ){
                martabakmanis15 = false;
            }
        //Output
            pesanan15++;
        }
        System.out.println("Anda telah memesan "+ pesanan15 +"  Martabak Manis Rasa : Tiramisu ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 16:
                    System.out.println("Martabak Manis Rasa : Coffe - Harga 25.000 ");
                     boolean martabakmanis16 = true;
        int pesanan16 = 0;
        String pesan16;
        
        //Input
        while( martabakmanis16 ){
            System.out.println("apakah anda inggin memesan Martabak Manis Rasa : Coffe lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan16 = scan.nextLine();
            
            if( pesan16.equalsIgnoreCase("Tidak") ){
                martabakmanis16 = false;
            }
        //Output
            pesanan16++;
        }
        System.out.println("Anda telah memesan "+ pesanan16 +"  Martabak Manis Rasa : Coffe ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 17:
                    System.out.println("Martabak Manis Rasa : Green tea - Harga 30.000 ");
                     boolean martabakmanis17 = true;
        int pesanan17 = 0;
        String pesan17;
        
        //Input
        while( martabakmanis17 ){
            System.out.println("apakah anda inggin memesan Martabak Manis Rasa : Green tea lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan17 = scan.nextLine();
            
            if( pesan17.equalsIgnoreCase("Tidak") ){
                martabakmanis17 = false;
            }
        //Output
            pesanan17++;
        }
        System.out.println("Anda telah memesan "+ pesanan17 +"  Martabak Manis Rasa : Green tea ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 18:
                    System.out.println("Martabak Manis Rasa : Nutella - Harga 35.000 ");
                     boolean martabakmanis18 = true;
        int pesanan18 = 0;
        String pesan18;
        
        //Input
        while( martabakmanis18 ){
            System.out.println("apakah anda inggin memesan Martabak Manis Rasa : Nutella lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan18 = scan.nextLine();
            
            if( pesan18.equalsIgnoreCase("Tidak") ){
                martabakmanis18 = false;
            }
        //Output
            pesanan18++;
        }
        System.out.println("Anda telah memesan "+ pesanan18 +"  Martabak Manis Rasa : Nutella ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 19:
                    System.out.println("Martabak Manis Rasa : Oreo - Harga 30.000 ");
                     boolean martabakmanis19 = true;
        int pesanan19 = 0;
        String pesan19;
        
        //Input
        while( martabakmanis19 ){
            System.out.println("apakah anda inggin memesan Martabak Manis Rasa : Oreo lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan19 = scan.nextLine();
            
            if( pesan19.equalsIgnoreCase("Tidak") ){
                martabakmanis19 = false;
            }
        //Output
            pesanan19++;
        }
        System.out.println("Anda telah memesan "+ pesanan19 +"  Martabak Manis Rasa : Oreo ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 20:
                    System.out.println("Martabak Manis Rasa : kismis - Harga 20.000 ");
                     boolean martabakmanis20 = true;
        int pesanan20 = 0;
        String pesan20;
        
        //Input
        while( martabakmanis20 ){
            System.out.println("apakah anda inggin memesan Martabak Manis Rasa : kismis lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan20 = scan.nextLine();
            
            if( pesan20.equalsIgnoreCase("Tidak") ){
                martabakmanis20 = false;
            }
        //Output
            pesanan20++;
        }
        System.out.println("Anda telah memesan "+ pesanan20 +"  Martabak Manis Rasa : kismis ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                    default :
                    System.out.println("Anda salah pilih varian rasa atau varian rasa yang anda pilih tidak ada"
                                   + "\nNB:Cara memilih varian rasa hanya memasukkan No.varian rasa saja");
          
        } 
           
        }else if ("roti bakar".equals(menu)){
            
         System.out.println("varian rasa Roti Bakar     \n 1. Rasa : Keju"
                                                     + "\n 2. Rasa : Oreo"
                                                     + "\n 3. Rasa : Oreo Milk"
                                                     + "\n 4. Rasa : Oreo + vanila"
                                                     + "\n 5. Rasa : Misis"
                                                     + "\n 6. Rasa : Kacang"
                                                     + "\n 7. Rasa : Vanila"
                                                     + "\n 8. Rasa : Kacang + Misis"
                                                     + "\n 9. Rasa : Vanila + kacang"
                                                     + "\n10. Rasa : Vanila + Misis");
        System.out.println("pilih rasa Roti bakar ? ");
        int user = 0;
          user = Integer.parseInt(br.readLine());  
            switch (user){
                    case 1:
                    System.out.println("Roti bakar Rasa : Keju - Harga 11.000 ");
                     boolean rotibakar1 = true;
        int pesanan1 = 0;
        String pesan1;
        
        //Input
        while( rotibakar1 ){
            System.out.println("apakah anda inggin memesan Roti Bakar Rasa : Keju lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan1 = scan.nextLine();
            
            if( pesan1.equalsIgnoreCase("Tidak") ){
                rotibakar1 = false;
            }
        //Output
            pesanan1++;
        }
        System.out.println("Anda telah memesan "+ pesanan1 +"  Roti Bakar Rasa : Keju ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 2:
                    System.out.println("Roti bakar Rasa : Oreo - Harga 11.000 ");
                     boolean rotibakar2 = true;
        int pesanan2 = 0;
        String pesan2;
        
        //Input
        while( rotibakar2 ){
            System.out.println("apakah anda inggin memesan Roti Bakar Rasa : Oreo lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan2 = scan.nextLine();
            
            if( pesan2.equalsIgnoreCase("Tidak") ){
                rotibakar2 = false;
            }
        //Output
            pesanan2++;
        }
        System.out.println("Anda telah memesan "+ pesanan2 +"  Roti Bakar Rasa : Oreo ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 3:
                    System.out.println("Roti bakar Rasa : Oreo Milk - Harga 14.000 ");
                     boolean rotibakar3 = true;
        int pesanan3 = 0;
        String pesan3;
        
        //Input
        while( rotibakar3 ){
            System.out.println("apakah anda inggin memesan Roti Bakar Rasa : Oreo Milk lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan3 = scan.nextLine();
            
            if( pesan3.equalsIgnoreCase("Tidak") ){
                rotibakar3 = false;
            }
        //Output
            pesanan3++;
        }
        System.out.println("Anda telah memesan "+ pesanan3 +"  Roti Bakar Rasa : Oreo Milk ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 4:
                    System.out.println("Roti bakar Rasa : Oreo + vanila - Harga 14.000 ");
                     boolean rotibakar4 = true;
        int pesanan4 = 0;
        String pesan4;
        
        //Input
        while( rotibakar4 ){
            System.out.println("apakah anda inggin memesan Roti Bakar Rasa : Oreo + vanila lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan4 = scan.nextLine();
            
            if( pesan4.equalsIgnoreCase("Tidak") ){
                rotibakar4 = false;
            }
        //Output
            pesanan4++;
        }
        System.out.println("Anda telah memesan "+ pesanan4 +"  Roti Bakar Rasa : Oreo + vanila ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 5:
                    System.out.println("Roti bakar Rasa : Misis - Harga 10.000 ");
                     boolean rotibakar5 = true;
        int pesanan5 = 0;
        String pesan5;
        
        //Input
        while( rotibakar5 ){
            System.out.println("apakah anda inggin memesan Roti Bakar Rasa : Misis lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan5 = scan.nextLine();
            
            if( pesan5.equalsIgnoreCase("Tidak") ){
                rotibakar5 = false;
            }
        //Output
            pesanan5++;
        }
        System.out.println("Anda telah memesan "+ pesanan5 +"  Roti Bakar Rasa : Misis ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 6:
                    System.out.println("Roti bakar Rasa : Kacang - Harga 10.000 ");
                     boolean rotibakar6 = true;
        int pesanan6 = 0;
        String pesan6;
        
        //Input
        while( rotibakar6 ){
            System.out.println("apakah anda inggin memesan Roti Bakar Rasa : Kacang lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan6 = scan.nextLine();
            
            if( pesan6.equalsIgnoreCase("Tidak") ){
                rotibakar6 = false;
            }
        //Output
            pesanan6++;
        }
        System.out.println("Anda telah memesan "+ pesanan6 +"  Roti Bakar Rasa : Kacang ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 7:
                    System.out.println("Roti bakar Rasa : Vanila - Harga 12.000 ");
                     boolean rotibakar7 = true;
        int pesanan7 = 0;
        String pesan7;
        
        //Input
        while( rotibakar7 ){
            System.out.println("apakah anda inggin memesan Roti Bakar Rasa : Vanila lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan7 = scan.nextLine();
            
            if( pesan7.equalsIgnoreCase("Tidak") ){
                rotibakar1 = false;
            }
        //Output
            pesanan7++;
        }
        System.out.println("Anda telah memesan "+ pesanan7 +"  Roti Bakar Rasa : Vanila ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 8:
                    System.out.println("Roti bakar Rasa : Kacang + Misis - Harga 12.000 ");
                     boolean rotibakar8 = true;
        int pesanan8 = 0;
        String pesan8;
        
        //Input
        while( rotibakar8 ){
            System.out.println("apakah anda inggin memesan Roti Bakar Rasa : Kacang + Misis lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan8 = scan.nextLine();
            
            if( pesan8.equalsIgnoreCase("Tidak") ){
                rotibakar8 = false;
            }
        //Output
            pesanan8++;
        }
        System.out.println("Anda telah memesan "+ pesanan8 +"  Roti Bakar Rasa : Kacang + Misis ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 9:
                    System.out.println("Roti bakar Rasa : Vanila + kacang - Harga 13.000 ");
                     boolean rotibakar9 = true;
        int pesanan9 = 0;
        String pesan9;
        
        //Input
        while( rotibakar9 ){
            System.out.println("apakah anda inggin memesan Roti Bakar Rasa : Vanila + kacang lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan9 = scan.nextLine();
            
            if( pesan9.equalsIgnoreCase("Tidak") ){
                rotibakar9 = false;
            }
        //Output
            pesanan9++;
        }
        System.out.println("Anda telah memesan "+ pesanan9 +"  Roti Bakar Rasa : Vanila + kacang ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 10:
                    System.out.println("Roti bakar Rasa : Vanila + Misis - Harga 13.000 ");
                     boolean rotibakar10 = true;
        int pesanan10 = 0;
        String pesan10;
        
        //Input
        while( rotibakar10 ){
            System.out.println("apakah anda inggin memesan Roti Bakar Rasa : Vanila + Misis lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan10 = scan.nextLine();
            
            if( pesan10.equalsIgnoreCase("Tidak") ){
                rotibakar10 = false;
            }
        //Output
            pesanan10++;
        }
        System.out.println("Anda telah memesan "+ pesanan10 +"  Roti Bakar Rasa : Vanila + Misis ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                    default :
                    System.out.println("Anda salah pilih varian rasa atau varian rasa yang anda pilih tidak ada"
                                   + "\nNB:Cara memilih varian rasa hanya memasukkan No.varian rasa saja");
                   
        }
            
            
        }else if("pisang nugget".equals(menu)){
            
         System.out.println("varian rasa pisang Nugget  \n ORIGINAL                    PREMIUM"
                                                     + "\n 1. Rasa : Keju              11. Rasa : Cokelat"
                                                     + "\n 2. Rasa : susu cokelat      12. Rasa : Karamel"
                                                     + "\n 3. Rasa : susu kental manis 13. Rasa : Nutella"
                                                     + "\n 4. Rasa : susu + keju       14. Rasa : Red velvet"
                                                     + "\n 5. Rasa : Misis             15. Rasa : Koko krunch"
                                                     + "\n 6. Rasa : Kacang            16. Rasa : Chocomaltine"
                                                     + "\n 7. Rasa : Vanila            17. Rasa : Vanila cornflakes"
                                                     + "\n 8. Rasa : Kacang + Misis    18. Rasa : Cookis and cream"
                                                     + "\n 9. Rasa : Vanila + kacang   19. Rasa : Mactha-Oreo"
                                                     + "\n10. Rasa : Vanila + Misis    20. Rasa : biskuit marie");
        System.out.println("pilih rasa Pisang Nugget ? ");
        int user = 0;
          user = Integer.parseInt(br.readLine());  
            switch (user){
                case 1:
                    System.out.println("Pisang Nugget Rasa : Keju - Harga 15.000 ");
                     boolean pisangnugget1 = true;
        int pesanan1 = 0;
        String pesan1;
        
        //Input
        while( pisangnugget1 ){
            System.out.println("apakah anda inggin memesan Pisang Nugget Rasa : Keju lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan1 = scan.nextLine();
            
            if( pesan1.equalsIgnoreCase("Tidak") ){
                pisangnugget1 = false;
            }
        //Output
            pesanan1++;
        }
        System.out.println("Anda telah memesan "+ pesanan1 +"  Pisang Nugget Rasa : Keju ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                case 2:
                    System.out.println("Pisang Nugget Rasa : susu cokelat - Harga 16.000 ");
                     boolean pisangnugget2 = true;
        int pesanan2 = 0;
        String pesan2;
        
        //Input
        while( pisangnugget2 ){
            System.out.println("apakah anda inggin memesan Pisang Nugget Rasa : susu cokelat lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan2 = scan.nextLine();
            
            if( pesan2.equalsIgnoreCase("Tidak") ){
                pisangnugget2 = false;
            }
        //Output
            pesanan2++;
        }
        System.out.println("Anda telah memesan "+ pesanan2 +"  Pisang Nugget Rasa : susu cokelat ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 3:
                    System.out.println("Pisang Nugget Rasa : susu kental manis - Harga 15.000 ");
                     boolean pisangnugget3 = true;
        int pesanan3 = 0;
        String pesan3;
        
        //Input
        while( pisangnugget3 ){
            System.out.println("apakah anda inggin memesan Pisang Nugget Rasa : susu kental manis lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan3 = scan.nextLine();
            
            if( pesan3.equalsIgnoreCase("Tidak") ){
                pisangnugget3 = false;
            }
        //Output
            pesanan3++;
        }
        System.out.println("Anda telah memesan "+ pesanan3 +"  Pisang Nugget Rasa : susu kental manis ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 4:
                    System.out.println("Pisang Nugget Rasa : susu + keju - Harga 18.000 ");
                     boolean pisangnugget4 = true;
        int pesanan4 = 0;
        String pesan4;
        
        //Input
        while( pisangnugget4 ){
            System.out.println("apakah anda inggin memesan Pisang Nugget Rasa : susu + keju lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan4 = scan.nextLine();
            
            if( pesan4.equalsIgnoreCase("Tidak") ){
                pisangnugget4 = false;
            }
        //Output
            pesanan4++;
        }
        System.out.println("Anda telah memesan "+ pesanan4 +"  Pisang Nugget Rasa : susu + keju ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 5:
                    System.out.println("Pisang Nugget Rasa : Misis - Harga 15.000 ");
                     boolean pisangnugget5 = true;
        int pesanan5 = 0;
        String pesan5;
        
        //Input
        while( pisangnugget5 ){
            System.out.println("apakah anda inggin memesan Pisang Nugget Rasa : Misis lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan5 = scan.nextLine();
            
            if( pesan5.equalsIgnoreCase("Tidak") ){
                pisangnugget5 = false;
            }
        //Output
            pesanan5++;
        }
        System.out.println("Anda telah memesan "+ pesanan5 +"  Pisang Nugget Rasa : Misis ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 6:
                    System.out.println("Pisang Nugget Rasa : Kacang - Harga 15.000 ");
                     boolean pisangnugget6 = true;
        int pesanan6 = 0;
        String pesan6;
        
        //Input
        while( pisangnugget6 ){
            System.out.println("apakah anda inggin memesan Pisang Nugget Rasa : Kacang lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan6 = scan.nextLine();
            
            if( pesan6.equalsIgnoreCase("Tidak") ){
                pisangnugget6 = false;
            }
        //Output
            pesanan6++;
        }
        System.out.println("Anda telah memesan "+ pesanan6 +"  Pisang Nugget Rasa : Kacang ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 7:
                    System.out.println("Pisang Nugget Rasa : Vanila - Harga 15.000 ");
                     boolean pisangnugget7 = true;
        int pesanan7 = 0;
        String pesan7;
        
        //Input
        while( pisangnugget7 ){
            System.out.println("apakah anda inggin memesan Pisang Nugget Rasa : Vanila lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan7 = scan.nextLine();
            
            if( pesan7.equalsIgnoreCase("Tidak") ){
                pisangnugget7 = false;
            }
        //Output
            pesanan7++;
        }
        System.out.println("Anda telah memesan "+ pesanan7 +"  Pisang Nugget Rasa : Vanila ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 8:
                    System.out.println("Pisang Nugget Rasa : Kacang + Misis - Harga 18.000 ");
                     boolean pisangnugget8 = true;
        int pesanan8 = 0;
        String pesan8;
        
        //Input
        while( pisangnugget8 ){
            System.out.println("apakah anda inggin memesan Pisang Nugget Rasa : Kacang + Misis lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan8 = scan.nextLine();
            
            if( pesan8.equalsIgnoreCase("Tidak") ){
                pisangnugget8 = false;
            }
        //Output
            pesanan8++;
        }
        System.out.println("Anda telah memesan "+ pesanan8 +"  Pisang Nugget Rasa : Kacang + Misis ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 9:
                    System.out.println("Pisang Nugget Rasa : Vanila + kacang - Harga 18.000 ");
                     boolean pisangnugget9 = true;
        int pesanan9 = 0;
        String pesan9;
        
        //Input
        while( pisangnugget9 ){
            System.out.println("apakah anda inggin memesan Pisang Nugget Rasa : Vanila + kacang lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan9 = scan.nextLine();
            
            if( pesan9.equalsIgnoreCase("Tidak") ){
                pisangnugget9 = false;
            }
        //Output
            pesanan9++;
        }
        System.out.println("Anda telah memesan "+ pesanan9 +"  Pisang Nugget Rasa : Vanila + kacang ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 10:
                    System.out.println("Pisang Nugget Rasa : Vanila + Misis - Harga 18.000 ");
                     boolean pisangnugget10 = true;
        int pesanan10 = 0;
        String pesan10;
        
        //Input
        while( pisangnugget10 ){
            System.out.println("apakah anda inggin memesan Pisang Nugget Rasa : Vanila + Misis lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan10 = scan.nextLine();
            
            if( pesan10.equalsIgnoreCase("Tidak") ){
                pisangnugget10 = false;
            }
        //Output
            pesanan10++;
        }
        System.out.println("Anda telah memesan "+ pesanan10 +"  Pisang Nugget Rasa : Vanila + Misis ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 11:
                    System.out.println("Pisang Nugget Rasa : Cokelat - Harga 20.000 ");
                     boolean pisangnugget11 = true;
        int pesanan11 = 0;
        String pesan11;
        
        //Input
        while( pisangnugget11 ){
            System.out.println("apakah anda inggin memesan Pisang Nugget Rasa : Cokelat lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan11 = scan.nextLine();
            
            if( pesan11.equalsIgnoreCase("Tidak") ){
                pisangnugget11 = false;
            }
        //Output
            pesanan11++;
        }
        System.out.println("Anda telah memesan "+ pesanan11 +"  Pisang Nugget Rasa : Cokelat ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 12:
                    System.out.println("Pisang Nugget Rasa : Karamel - Harga 22.000 ");
                     boolean pisangnugget12 = true;
        int pesanan12 = 0;
        String pesan12;
        
        //Input
        while( pisangnugget12 ){
            System.out.println("apakah anda inggin memesan Pisang Nugget Rasa : Karamel lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan12 = scan.nextLine();
            
            if( pesan12.equalsIgnoreCase("Tidak") ){
                pisangnugget12 = false;
            }
        //Output
            pesanan12++;
        }
        System.out.println("Anda telah memesan "+ pesanan12 +"  Pisang Nugget Rasa : Karamel ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 13:
                    System.out.println("Pisang Nugget Rasa : Nutella - Harga 23.000 ");
                     boolean pisangnugget13 = true;
        int pesanan13 = 0;
        String pesan13;
        
        //Input
        while( pisangnugget13 ){
            System.out.println("apakah anda inggin memesan Pisang Nugget Rasa : Nutella lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan13 = scan.nextLine();
            
            if( pesan13.equalsIgnoreCase("Tidak") ){
                pisangnugget13 = false;
            }
        //Output
            pesanan13++;
        }
        System.out.println("Anda telah memesan "+ pesanan13 +"  Pisang Nugget Rasa : Nutella ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 14:
                    System.out.println("Pisang Nugget Rasa : Red velvet - Harga 24.000 ");
                     boolean pisangnugget14 = true;
        int pesanan14 = 0;
        String pesan14;
        
        //Input
        while( pisangnugget14 ){
            System.out.println("apakah anda inggin memesan Pisang Nugget Rasa : Red velvet lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan14 = scan.nextLine();
            
            if( pesan14.equalsIgnoreCase("Tidak") ){
                pisangnugget14 = false;
            }
        //Output
            pesanan14++;
        }
        System.out.println("Anda telah memesan "+ pesanan14 +"  Pisang Nugget Rasa : Red velvet ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 15:
                    System.out.println("Pisang Nugget Rasa : Koko krunch - Harga 23.000 ");
                     boolean pisangnugget15 = true;
        int pesanan15 = 0;
        String pesan15;
        
        //Input
        while( pisangnugget15 ){
            System.out.println("apakah anda inggin memesan Pisang Nugget Rasa : Koko krunch lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan15 = scan.nextLine();
            
            if( pesan15.equalsIgnoreCase("Tidak") ){
                pisangnugget15 = false;
            }
        //Output
            pesanan15++;
        }
        System.out.println("Anda telah memesan "+ pesanan15 +"  Pisang Nugget Rasa : Koko krunch ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 16:
                    System.out.println("Pisang Nugget Rasa : Chocomaltine - Harga 25.000 ");
                     boolean pisangnugget16 = true;
        int pesanan16 = 0;
        String pesan16;
        
        //Input
        while( pisangnugget16 ){
            System.out.println("apakah anda inggin memesan Pisang Nugget Rasa : Chocomaltine lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan16 = scan.nextLine();
            
            if( pesan16.equalsIgnoreCase("Tidak") ){
                pisangnugget16 = false;
            }
        //Output
            pesanan16++;
        }
        System.out.println("Anda telah memesan "+ pesanan16 +"  Pisang Nugget Rasa : Chocomaltine ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 17:
                    System.out.println("Pisang Nugget Rasa : Vanila cornflakes - Harga 25.000 ");
                     boolean pisangnugget17 = true;
        int pesanan17 = 0;
        String pesan17;
        
        //Input
        while( pisangnugget17 ){
            System.out.println("apakah anda inggin memesan Pisang Nugget Rasa : Vanila cornflakes lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan17 = scan.nextLine();
            
            if( pesan17.equalsIgnoreCase("Tidak") ){
                pisangnugget17 = false;
            }
        //Output
            pesanan17++;
        }
        System.out.println("Anda telah memesan "+ pesanan17 +"  Pisang Nugget Rasa : Vanila cornflakes ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 18:
                    System.out.println("Pisang Nugget Rasa : Cookis and cream - Harga 25.000 ");
                     boolean pisangnugget18 = true;
        int pesanan18 = 0;
        String pesan18;
        
        //Input
        while( pisangnugget18 ){
            System.out.println("apakah anda inggin memesan Pisang Nugget Rasa : Cookis and cream lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan18 = scan.nextLine();
            
            if( pesan18.equalsIgnoreCase("Tidak") ){
                pisangnugget18 = false;
            }
        //Output
            pesanan18++;
        }
        System.out.println("Anda telah memesan "+ pesanan18 +"  Pisang Nugget Rasa : Cookis and cream ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 19:
                    System.out.println("Pisang Nugget Rasa : Mactha-Oreo - Harga 24.000 ");
                    boolean pisangnugget19 = true;
        int pesanan19 = 0;
        String pesan19;
        
        //Input
        while( pisangnugget19 ){
            System.out.println("apakah anda inggin memesan Pisang Nugget Rasa : Mactha-Oreo lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan19 = scan.nextLine();
            
            if( pesan19.equalsIgnoreCase("Tidak") ){
                pisangnugget19 = false;
            }
        //Output
            pesanan19++;
        }
        System.out.println("Anda telah memesan "+ pesanan19 +"  Pisang Nugget Rasa : Mactha-Oreo ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                case 20:
                    System.out.println("Pisang Nugget Rasa : biskuit marie - Harga 24.000 ");
                     boolean pisangnugget20 = true;
        int pesanan20 = 0;
        String pesan20;
        
        //Input
        while( pisangnugget20 ){
            System.out.println("apakah anda inggin memesan Pisang Nugget Rasa : biskuit marie lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan20 = scan.nextLine();
            
            if( pesan20.equalsIgnoreCase("Tidak") ){
                pisangnugget20 = false;
            }
        //Output
            pesanan20++;
        }
        System.out.println("Anda telah memesan "+ pesanan20 +"  Pisang Nugget Rasa : biskuit marie ");
                    System.out.println("Selamat Menikmati"+"\n~Terima Kasih~");
                    break;
                    
                default :
                    System.out.println("Anda salah pilih varian rasa atau varian rasa yang anda pilih tidak ada"
                                   + "\nNB:Cara memilih varian rasa hanya memasukkan No.varian rasa saja");
            } 
        } else {
            System.out.println("Maaf jajanan yang anda pesan tidak ada"
                           + "\nSilahkan pesan Aneka jajanan khas lagi...");
        }
        System.out.println("Anda telah berkunjung ke aneka jajanan khas kami");
     }  
}