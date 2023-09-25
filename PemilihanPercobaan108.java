import java.util.Scanner;
public class PemilihanPercobaan108 {
    public static void main(String[] args) {
    Scanner input08 = new Scanner(System.in);
    System.out.print("Masukkan angka: ");
    int angka = input08.nextInt();
    
    // if (angka % 2 == 0) {
    //     System.out.println("Angka "+angka+" bilangan genap");
    // } else {
    //     System.out.println("Angka "+angka+"bilangan ganjil");
        

    // }
    String hasil = (angka % 2 == 0) ? "Angka " + angka + " bilangan genap" : "Angka " + angka + " bilangan ganjil";
    System.out.println(hasil);
}
}