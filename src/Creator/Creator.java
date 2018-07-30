package Creator;

import Product.Product;

public abstract class Creator {
    //创建产品对象
    public abstract <T extends Product> T createProduct(Class<T> c);

}
