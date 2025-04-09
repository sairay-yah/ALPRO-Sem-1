import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        while (true) {
            Scanner varjava = new Scanner(System.in);
            System.out.println("Selamat Datang di Program Kalkulator Sederhana...");
            System.out.print("Masukkan Angka Pertama : ");
            int num1 = varjava.nextInt(); 
            System.out.print("Masukkan Angka Kedua : ");
            int num2 = varjava.nextInt(); 

            System.out.print("Pilih Jenis Operasi (+/-/*/:) : ");
            varjava.nextLine();
            String operasi = varjava.nextLine();
            if (operasi.equals("+")){
                int hasil = num1+num2;
                System.out.println("hasil penjumlahan : " + hasil);
            }
            else if (operasi.equals("-")){
                int hasil = num1-num2;
                System.out.println("hasil pengurangan : " + hasil);
            }
            else if (operasi.equals("*")){
                int hasil = num1*num2;
                System.out.println("hasil perkalian : " + hasil);
            }
            else if (operasi.equals(":")){
                int hasil = num1-num2;
                System.out.println("hasil pembagian : " + hasil);
            }
            else {
                System.out.println("Maaf, Operasi Invalid");
            }
            System.out.print("Ingin mengulangi Program? (y/n) : ");
            String ulang = varjava.nextLine();
            if (ulang.equals("y") || ulang.equals("n") ){
                if (ulang.equals("n")){
                    System.out.println("Terimakasih...");
                    return;
                }
            }
            else {
                System.out.println("Maaf, Operasi Invalid, Program Dihentikan");
                return;
            }
            System.out.println();
        }
        
    }
}
