import java.util.Scanner;
public class recursive {
    public static int  Recursive(int n,int original) {
        System.out.println(n);
        if (n > 0) {  // Sayı n'den büyük ise 5 eksilterek fonksiyonu tekrar çağırır.
            return Recursive(n - 5,original);
        }
        if(n<=0)   //Sayı 0'dan küçükse ve 0'a eşit ise sayı 2.fonksiyonu çağırır.
            return Recursive2(n+5,original);

        return 0;
    }
    public static int Recursive2(int n,int original){
        System.out.println(n);
            if(n!=original){ //Sayı orijinal sayıya eşit olamdığı sürece sayıya 5 eklenir.
           return Recursive2(n+5,original);}

        return 0;
    }
    public static void main(String[] args) {
        Scanner inpi =new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int n=inpi.nextInt();
        Recursive(n,n);


    }
}
