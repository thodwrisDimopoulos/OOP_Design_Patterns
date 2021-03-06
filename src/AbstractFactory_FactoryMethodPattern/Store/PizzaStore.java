package AbstractFactory_FactoryMethodPattern.Store;

import AbstractFactory_FactoryMethodPattern.Pizza.Pizza;

/**
 * Created by theo on 6/22/16.
 */
public abstract class PizzaStore {


    public Pizza orderPizza(String type){
        //Through polymorphism this invokes createPizza() in NewYorkPizzaStore or ChicagoPizzaStore
        Pizza pizza = createPizza(type);

        /* Now that we have created the correct pizza
        is time to finish it*/
        /**/
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();


        return pizza;
    }
    /*This is a "factory" method
    * Provides an abstract interface to create one
    * product*/
    abstract Pizza createPizza(String type);

}
