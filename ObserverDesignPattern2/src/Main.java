import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.aboneEkle(new AnneObserver());
        ogrenci.aboneEkle(new BabaObserver());
        ogrenci.aboneEkle(new OgretmenObserver());

        ogrenci.ad = "Safa";
        ogrenci.soyad = "Yılmaz";
        ogrenci.memleket = "Siirt";
        ogrenci.sinif = 3;
        ogrenci.setDersiAstiMi(true);
        ogrenci.bilgilendir();

    }
}