package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        // 3.获取IoC容器
        // ApplicationContext是个接口，接口不能创建对象，需要new一个实现类；
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");

        // 4.获取bean,得到的是对象，所以要定义变量
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();

    }
}
