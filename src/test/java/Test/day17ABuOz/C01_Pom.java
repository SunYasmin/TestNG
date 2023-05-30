package Test.day17ABuOz;

public class C01_Pom {

    /*
    Page object model;
    TestNG yi baglayan birsey degil
    Junit tede pom olabilirdi
    Pom son, en guncel ve en modern Frame work dizayn style i(stili);
    TestNG ile de olur JUnit ile de olur
    Cucumberda (JUnit e geri donecegiz ve pom den vazgecmeyecegiz)farkli ve orada degisiklikler gelecek

    Obje olustur heryerden kullan;
    TestBase de inheritance yolu ile yaptik
    İnheritance da 1tek class inherit edebiliyoruz

    Obje olusturarak parent a gerek kalmadan baska class taki vari. veya method u obje olusturup kullanabilirim
    icinde bulundugumuz class ta variable veya methodunu kullanmak istedigimiz classin objesini olustururuz
    servis class inin icindeyken okul class indan obje olusturup
    objeadi.okulclassindakimethodadi(); ile kullanirim
    Classadi.staticvariable i yazip static variable i kullanabilirim
    objeadi.instancevariable i yazip instance vari kullanabilirim

    Obje olusturmak icin parent child a gerek yok heryerden kullanabiliriz
    1-Obje olusturdugunda her class a ulasabilirsin
    2-Obje uzerinden degerler atadigimiz icin obje olusturdugum class ta degisiklik olmaz
    sadece objenin degeri degistirmis oluruz (asil class hic bozulmaz)
    asil class taki method ve variable lar rahatlikla kullanilir.

    Static variable lar biraz sıkıntılı;
    Bunu yapinca satic vari. a en son kim deger atadiysa o deger kalir
    bu yuzden stativ variable risklidir
    final degismsin diye koyarsak bu da sorun olur ogrensi sayisi degisebilir.

    Farkli farkli yerlerde kullanilacak yukardaki ornekler duruma gore
    Neden ihtiyac duyulmuş
    Ornegin amazon da calisan kisi farkli websitelerine gitmezki
    Farkli sitelere gitsek farkli arama kutularini farkli sekillerde locate etmeniz gerekir
    Buyuk firmalarda her sayfanin test edilmesi istenmez
    Ornegin amazonda cok dev team vardir
    Amazondaki page lerden birinden sorumlu olabilirsiniz onlara yani buyuk parcaya
    Epik: uygulamamizdaki buyuk bolumlerin her birine epik denir
    Feature 1 bir ozelliktir buyuk degildir.
    Uygulama kucukse zaten ayirmaya gerek yok ayirmaya gerek yok o kucuk uygulamada 1 tane epic olur
    Buyudu diyelimki uygulama buyudukce uygulamanin feature lari artti iste su su isleri sen yap
    gibi bir ayrim her parca epic

    Herseferinde login icin her testte login i locate edecek miyim hayir
    Login methodu olustururum ancak
    Bazen negatif test te yapariz girememesi uzerine de yapariz giremesin istiyorum yine
    bu durumda login methodum yine calismaz ben giremesin istiyorum ama o girme uzerine kurulu bir method

    Pom bir sayfadaki webelementleri ya da funcionality leri login gibi tekrar tekrar kullanacagimiz seyleri
    bir kere olusturmak uzerine tasarlanmistir
    arama kutusu 1 kere locate edilecek ve amazonla ilgili tum locate ler bir sayfada olacak
    Ornegin locate degisti iste bu durumda o sayfaya gidip locate i guncelliyoruz ve hepsi gunclleniyor
    CUCUMBER da amazon a gitmeyi sayfaya gitmeyi her bir islemi 1 kere yapacagiz
    daha sonra hangi sayfaya gitmek istersek bir kere yapacagiz

    Dolayısıyla kendi kutuphanemizi hatta kendi driver imizi olusturacagiz

    NASILL
    -Bir PAGE class olusturacagiz bu class sayesinde yapacagiz

    Neden POM
    -Cok populer
    -pom ve cucumber daki bdd Behaviour Driven Development (BDD) ozellikle sorulur

    Projelerimizde yani Test Suitlerimizde cok fazla test oldugunda neyi nerden bulacagim update edecegim
    nasil kontrol edecegim buyuzden POM kullanarak PAGE lerimizi cok basit halde olusturacagiz
    4 temel seyimiz olacak
    1-Page sayfasi
    2-Kendi driver imiz
    3-Test datalarimizi tutmak icin bir dosya acacagiz file
    (dogru password yanlis password kullanici adi hepsi bir yerde olacak, herseferinde sifre ne gibi aramayacagim)
    4-Test class larimiz

    Bu yuzden reusable maintainable faster understandable olmasi icin POM.

    TestNG POM da temel hedef WebDriver driver i testbase de olusturuyorduk iste bu noktada testbase kullanmadan
    yani extends olmayacak o halde 2 sey kaliyor geriye 1-obje    2-static
    Java altinda tests-pages-utilities packagelari olacak = testler ,ihtiyac duydugum alet edevat, pages
    Utilities altinda Driver class i olusturup oradan kullanacagiz
    Temel hedef  Utilities altinda class  olusturup driver a class ismi uzerinden ulasip kullanma ve kapatma islemlerini yapmak olacak





     */




}
