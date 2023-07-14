import java.util.Scanner;
public class Yeniiiiii {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int b;
        double toplam=0,a;
        System.out.print("Sayı Giriniz : ");
        int sayi=inp.nextInt();
        for(int i=1; i<=sayi; i++){
            toplam+=1.0/i;
        }
        System.out.println(toplam);
    }

}
