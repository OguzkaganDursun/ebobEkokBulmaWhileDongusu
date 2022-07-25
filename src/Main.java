import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degiskenler tanimlandi.
        int sayi1, sayi2, kucukSayi, ebob = 1, ekok = 1, geciciSayi, x;


        //Kullanicidan veri girisi alinarak, alinan verinin hesaplanmasi yapildi ve ekrana yazdirildi.
        Scanner scan = new Scanner(System.in);

            System.out.print("Birinci Sayiyi Giriniz : ");
            sayi1 = scan.nextInt();

            System.out.print("Ikinci Sayiyi Giriniz : ");
            sayi2 = scan.nextInt();

            if (sayi1 > sayi2)
            {
                kucukSayi = sayi1;
            }
            else
            {
                kucukSayi = sayi2;
            }
            geciciSayi = kucukSayi;
            while (geciciSayi >= 1)
            {
                if ((sayi1 % geciciSayi == 0) && (sayi2 % geciciSayi == 0))
                {
                    ebob = geciciSayi;
                    System.out.println("EBOB : " + geciciSayi);
                    break;
                }
                else
                {
                    geciciSayi--;
                }
            }
            while (geciciSayi <= (sayi1 * sayi2))
            {
                if ((geciciSayi % sayi1 == 0) && (geciciSayi % sayi2 == 0))
                {
                    ekok = geciciSayi;
                    System.out.println("EKOK : " + geciciSayi);
                    break;
                }
                else
                {
                    geciciSayi++;
                }
            }
    }
}
