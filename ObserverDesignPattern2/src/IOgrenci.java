import java.util.ArrayList;
import java.util.List;

public abstract class IOgrenci {
    public String ad;
    public String soyad;
    public String memleket;
    public int sinif;
    private boolean dersiAstiMi;

    private List<Observer> gozlemciler;
    private Observer observer[];

    public List<Observer> getGozlemciler() {
        return gozlemciler;
    }

    public void setGozlemciler(List<Observer> gozlemciler) {
        this.gozlemciler = gozlemciler;
    }

    public Observer[] getObserver() {
        return observer;
    }

    public void setObserver(Observer[] observer) {
        this.observer = observer;
    }

    public IOgrenci() {
        gozlemciler = new ArrayList<>();
        observer = new Observer[]{new BabaObserver(),new AnneObserver(),new OgretmenObserver()};

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getMemleket() {
        return memleket;
    }

    public void setMemleket(String memleket) {
        this.memleket = memleket;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    public boolean getDersiAstiMi() {
        return dersiAstiMi;
    }

    public  void setDersiAstiMi(boolean dersiAstiMi){
        this.dersiAstiMi = dersiAstiMi;
    }

    public void aboneEkle(Observer observer){
        gozlemciler.add(observer);
    }
    public void aboneSil(Observer observer){
        gozlemciler.remove(observer);
    }
    public void Notify(){
        for (Observer observer1 : gozlemciler){
            observer1.update();
        }
    }
}
