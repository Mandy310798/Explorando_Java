package DIO.Singleton;

import DIO.Facade.Facade;
import DIO.Strategy.Comportamento;
import DIO.Strategy.ComportamentoAgressivo;
import DIO.Strategy.ComportamentoDefensivo;
import DIO.Strategy.ComportamentoNormal;
import DIO.Strategy.Robo;

public class Teste {

    // Testes desing pattern Singleton
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        
        // Testes desing patter Strategy
        
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.SetStrategy(normal);
        robo.mover();
        robo.mover();
        robo.SetStrategy(agressivo);
        robo.mover();
        robo.SetStrategy(defensivo);
        robo.mover();
        robo.mover();
        robo.mover();
        
        // Testes desing facade
        
        Facade facade = new Facade();
        facade.migrarCliente("Amanda", "08156782");
    }
}
