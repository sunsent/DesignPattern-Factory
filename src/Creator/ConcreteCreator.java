package Creator;

import Product.Product;

public class ConcreteCreator extends Creator {

    Product product=null;
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        try {
            product=(Product)Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            System.out.println("创建产品对象错误");
            return null;
        }
        return (T)product;
    }

}
