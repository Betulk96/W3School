package learn;

public class Stringmanipulation {
    public static void main(String[] args) {



String x="Java is easy";

//lenght=KAÇ KARAKTER OLDUĞUNU GÖSTERİR.SPACE DAHİL
        int a1lenght=x.length();
//charAt()=bir index sayısı girilir.o indexte hangi harf varsa onu gösterir.
  // index her zaman 0 dan baslar bu nedenle  s.charAt(0) herzaman ilk indexi verir.
        char firstChar=x.charAt(0);
        System.out.println(firstChar);//J
//lenght sayısı -1 son index sayısını verir.
  //index no olarak s.length()-1 girersek bu bize dynamic olarak her zaman son indexi verir.
        char lastChar=x.charAt(x.length()-1);
//substring(8, 12) ==> "8" yani ilk index dahil, "12" yani ikinci index haric dir. [3,7)
        String sub=x.substring(8,12);//8,9,10,11 indexleri alır ==> 'easy'
//bir indexten sonuna kadar yazdırma.
        String sub1=x.substring(8);//'easy
//cantains=içermek-()içinde girilen ifade var mı yok mu konrol eder.
        boolean isExist=x.contains("is");//true
//isStart= "" girilen ifade ile başlayıp başlamadığını kontol eder.
        boolean isStart=x.startsWith("Java");
//endswith= ""girilen ifade ile bitip bitmediğini kontol eder.
        boolean isEnd=x.endsWith("easy");
//x.replace(a,b) = a yerine b yazar.
        String replace=x.replace("easy","important");//Java is important
//replecaAll("[x]","y") x bir dizi değer ,y bir dizi değer xin hepsini y ile değiştir.
  //"" = hiçlik= silmek istenen ifade yerine 'replacement' yerine "" konulur.
        String nothing= x.replace("is","");//Java easy
//x.contains ("") içinde belirtilen character in olup olmadığını kontol ediyor.
       boolean spaceContol=x.contains(" ");//true
//Double.valueOf(a); String bir ifade içinde ki double değeri doubleolarak işlem yapabilemk için
    String tvPrice="$1023.9 ";
    String nemTvPrice= tvPrice.replace("$","");//sadece sayı değerinin kalmasını sağladık.
    Double ntv=Double.valueOf(nemTvPrice);//1023.9
//trim:kırpma baştaki ve sondaki space'leri kırpar.
        String name =   "  ALİ CAN   ";
        String first=name.trim();//"ALİ CAN"
// split "" içine hangi karakteri girersen oradan parçalar.
    //split ile " " boşluk kısmından kestik .2 parçaya ayrıldı.indexte 0 ve 1 parçaları oluştu.
    // can 1. parcade [1] yazdık.Canın ilk char charat(0)
        String name1="ALİ CAN";
        char harfC=name1.split(" ")[1].charAt(0);//C
//toUpperCase():hepsini büyük yapr ,toLowerCase()hepsini küçük yapar.
// equalsIgnoreCase()= büyük küçük görmezden gel. equals()=içinde o varmı kontol et T/F-boolean
//x.indexOf("v") == () içine yazdılan karakterin kaçıncı index olduğunu gösterir.
   // o karakterin ilk index sayısı verir.first
        int charV=x.indexOf("v");// 2
// lastIndexOf() parantez içine yazılan karakterin strindeki son görünümünün indexini verir.
      String xLast= String.valueOf(x.lastIndexOf("a"));//9
      String xx= String.valueOf(x.lastIndexOf("y"));//11
//concat= bir stringi diğer stringin yanına yazdırır.
        String conc=x.concat(name);//Java is easy  ALİ CAN
//.isEmpty () bir String tamamen boş ise,yani hiç karakter yoksa true verir
        //aksi halde false verir.
        String empty="";
        boolean contEmpty=empty.isEmpty();//true
//isBlank() methodu sadece space içeren stringler için true veriri.
    //space dışında bir chacter içerirse false veriri.
        String blank="  ";
        boolean contblank= blank.isBlank();//true
//startsWith() belli bir char ile başlayıp başlamadığına bakar.boolean
//endWith() belli bir char ile bitip bitmediğine bakar.boolean




/*repleceAll
    Meshur Regex'ler
        1) Tum rakamlar ==> [0-9]
        2) Tum kucuk harfler ==> [a-z]
        3) Tum buyuk harfler ==> [A-Z],büyük harf dışındakinler [^A-z]
        4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
        5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
        6) Tum noktalama isaretleri ==> \\p{Punct}
        7) Tum sesli harfler ==> [aeiouAEIOU]
           x, q, w harfleri ==> [xqw]
        8) Kucuk harflerden farkli tum character'ler ==> [^a-z]
        9) Tum harflerden farkli tum character'ler ==> [^a-zA-Z]

    Bu kisim da [] kullanilmaz. Buyuk harfler olumsuz anlama gelir
        Sadece space karakteri : \\s
        Space karakteri haric  : \\S
        Sadece rakamlar        : \\d  (digit ten geliyor)
        Rakamlar haric         : \\D
    */











    }
}
