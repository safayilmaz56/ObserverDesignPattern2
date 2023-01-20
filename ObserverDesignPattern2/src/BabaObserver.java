public class BabaObserver extends Observer{ //concreteObserver takipçi nesnesi
    @Override
    public void update() {
        System.out.println("Ogrencinin kactigindan babasinin haberi oldu");
    }
}
