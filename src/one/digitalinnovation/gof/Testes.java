package one.digitalinnovation.gof;

public class Testes {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        System.out.println(lazyHolder);
    }
}
