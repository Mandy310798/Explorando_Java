package DIO.Singleton;

//    Singleton "apressado"

public class SingletonLazyHolder {

    private static class Holder {
        public static SingletonLazyHolder instancia =  new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
    }

    public static SingletonLazyHolder getInstance() {
        return Holder.instancia;
    }
}
