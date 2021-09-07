import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen dünyadaki ağırlığınızı kg cinsinden giriniz: ");
        double agirlik=input.nextDouble();      //Dünyadaki ağırlığını kullanıcı tarafından girilir


        System.out.println("Güneş sistemimzide bir gezegen seçin: \n 1.Venus \n 2.Merkür \n 3.Mars \n 4.Jupiter \n 5.Satürn \n 6.Uranüs \n 7.Neptün \n 8.Plüton" +
                " \n Lütfen aşağıdakilerden birini seçiniz (1-8):"); //aralarında seçim yapabileceğimz gezegenlerin çıktısını verir

        Scanner scanner=new Scanner(System.in);
        int gezegenNumarasi = scanner.nextInt();
        double ciktiSayisi; //programın hesaplayacağı çıktı sayısı

        switch (gezegenNumarasi){
            case 1:
                ciktiSayisi=agirlik * .90;  //bu case Venuste ki ağırlığı hesaplar
                System.out.println("Venüs üzerindeki ağırlığınız: " +ciktiSayisi);
                break;

            case 2:
                ciktiSayisi=agirlik * .38;  //bu case Merkürde ki ağırlığı hesaplar
                System.out.println("Merkür üzerindeki ağırlığınız: " +ciktiSayisi);
                break;

            case 3:
                ciktiSayisi=agirlik * .38;  //bu case Marsda ki ağırlığı hesaplar
                System.out.println("Mars üzerindeki ağırlığınız: " +ciktiSayisi);
                break;

            case 4:
                ciktiSayisi=agirlik * 2.36;  //bu case Jupiterde ki ağırlığı hesaplar
                System.out.println("Jupiter üzerindeki ağırlığınız: " +ciktiSayisi);
                break;

            case 5:
                ciktiSayisi=agirlik * .92;  //bu case Saturnde ki ağırlığı hesaplar
                System.out.println("Satürn üzerindeki ağırlığınız: " +ciktiSayisi);
                break;

            case 6:
                ciktiSayisi=agirlik * .89;  //bu case Uranüsde ki ağırlığı hesaplar
                System.out.println("Uranüs üzerindeki ağırlığınız: " +ciktiSayisi);
                break;

            case 7:
                ciktiSayisi=agirlik * 1.13;  //bu case Neptünde ki ağırlığı hesaplar
                System.out.println("Neptün üzerindeki ağırlığınız: " +ciktiSayisi);
                break;

            case 8:
                ciktiSayisi=agirlik * .07;  //bu case Plütonda ki, ağırlığı hesaplar
                System.out.println("Pluton üzerindeki ağırlığınız: " +ciktiSayisi);
                break;

            default:
                System.out.println("Yanlış numara seçtiniz!"); //yanlış bir numara seçilirse(1-8 dışında) bu bir hataya dönüşecektir.
                break;
        }

    }
}
