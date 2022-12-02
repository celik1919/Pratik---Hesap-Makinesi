import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner mec = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        n1 = mec.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        n2 = mec.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz: ");
        select = mec.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplamları: " + (n1 + n2));
            case 2:
                System.out.println("Farkları: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpımları: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bölümü: " + (n1 / n2));
                } else {
                    System.out.println("Bir sayı 0'a bölünemez ");
                }
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");
        }
    }
}