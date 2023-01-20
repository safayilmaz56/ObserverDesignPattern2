public class AnneObserver extends Observer{//concreteObserver takipçi nesnesi
    @Override
    public void update() {
        System.out.println("Ogrencinin kactigindan annesinin haberi oldu");
    }

}
