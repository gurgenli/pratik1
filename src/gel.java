import java.sql.SQLOutput;
import java.util.Scanner;


public class gel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a,b,c,d,e,f;

        System.out.print("Matematik Notunuzu Giriniz: ");
        a = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        b = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        c = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        d = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        e = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        f = input.nextInt();


        int toplam = (a+b+c+d+e+f);
        double ort = toplam/6.0;
        System.out.println("Not ortalamanız: " + ort);

        boolean sonuc = ort>=60;
        String durum = sonuc ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);


    }
}
