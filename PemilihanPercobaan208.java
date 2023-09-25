import java.util.Scanner;
public class PemilihanPercobaan208 {
 public static void main(String[] args) {
    Scanner input08 = new Scanner(System.in);
    System.out.print("Nilai uas     : ");
    float uas = input08.nextFloat();
    System.out.print("Nilai uts     : ");
    float uts = input08.nextFloat();
    System.out.print("Nilai kuis    : ");
    float kuis = input08.nextFloat();
    System.out.print("Nilai tugas   : ");
    float tugas = input08.nextFloat();

    float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
    String message = total < 65 ? "Remidi" : "Tidak remidi";
    System.out.println("Nilai akhir = " + total + "sehingga" + message);
    
 }   
}
