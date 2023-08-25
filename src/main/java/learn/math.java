package learn;

import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        //w3scholl denemsi
        String s= "Java is easy";
        System.out.println("w3="+s.indexOf("j"));//-1
        System.out.println("w3="+s.indexOf("e"));//8

        System.out.println("max="+Math.max(68,930));//Match.max= o değer içineki en büyüğünü gösterir
        System.out.println("min="+Math.min(63,54));//Match.min= o değer içineki en küçüğünü gösterir
        System.out.println("sqrt="+Math.sqrt(12));//Match.sqrt(x) x in karekökünü alır
        System.out.println("mutlak="+Math.abs(-56.48));//Math.abs(x) xin mutlak değerini alır
        System.out.println(Math.random());//Math.random () boş kalır.0.0 ile 0.1 arsında rastgele bir sayıya dönüştür.
/*
Rastgele sayı üzerinde daha fazla kontrol sahibi olmak için, örneğin,
 yalnızca 0 ile 100 arasında bir rasgele sayı istiyorsanız,
  aşağıdaki formülü kullanabilirsiniz:
 */
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println("Randomınt= "+randomNum);//48.67, gibi rastgele sayılar verir.
        double randomNum2=(double)(Math.random()*200);
        System.out.println("Randomdouble="+randomNum2);//128.25636

        Scanner x =new Scanner(System.in);
        System.out.println("mutlak değerin bulunmasını istediğiniz sayıyı girin");

        double wMutlak= x.nextDouble();
        System.out.println("d.mut="+Math.abs(wMutlak));

        int xmutlak =x.nextInt();
        System.out.println("xmutlak = " + Math.abs(xmutlak));


    }
}
