package Client;

import Creator.*;
import Product.ConcreteProduct1;

/**
 * 场景类
 */
public class Client {
    public static void main(String args[]){
        Creator creator=new ConcreteCreator();
        ConcreteProduct1 product = creator.createProduct(ConcreteProduct1.class);
        product.method2();
        System.out.println("end");
    }
}
