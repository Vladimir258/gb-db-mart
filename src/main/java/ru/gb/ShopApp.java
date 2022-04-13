package ru.gb;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.gb.config.HibernateConfig;
import ru.gb.dao.ProductDao;
import ru.gb.entity.Product;

public class ShopApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
     //   ProductDao productDao = new OldJdbcProductDao();
       ProductDao productDao = context.getBean(ProductDao.class);
   //     System.out.println(productDao.findTitleById(3L));
        for (Product product : productDao.findAll()) {
            System.out.println(product);
       }

////        ManufacturerDao manufacturerDao = new OldJdbcManufacturerDao();
//        ManufacturerDao manufacturerDao = context.getBean(ManufacturerDao.class);
////        System.out.println(manufacturerDao.findNameById(3L));
//        for (Manufacturer manufacturer : manufacturerDao.findAll()) {
//            System.out.println(manufacturer);
      //  }
    }
}
