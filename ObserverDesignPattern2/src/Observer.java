public abstract class Observer { //takipçi
    public abstract void update();
    public void mesaj(){
        update();
    }
}
