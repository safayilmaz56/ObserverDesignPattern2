import java.util.Objects;
import java.util.function.Consumer;

public class Ogrenci extends IOgrenci{//subject takip edilecek nesne

    public void bilgilendir(){
        if (getDersiAstiMi() == true){
            super.Notify();
        }
        else {
            System.out.println("cocugunuz derste");
        }
    }

    @Override
    public void Notify() {
        bilgilendir();
    }

}
