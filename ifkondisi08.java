import java.util.Scanner;
public class ifkondisi08 {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);
        
        System.out.println("Masukkan Suhu : ");
        int suhu = sc08.nextInt();

        if (suhu < 16) {
            System.out.println("Silahkan menggunakan jaket");
        } if (suhu < 20) {
            System.out.println("Silahkan menggunakan baju tebal");
        } else {
            System.out.println("Silahkan pakai topi");
        }
        
    }
       
    }
