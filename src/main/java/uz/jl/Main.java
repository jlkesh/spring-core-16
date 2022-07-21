package uz.jl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import uz.jl.domains.Book;
import uz.jl.domains.Student;
import uz.jl.domains.User;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        Resource resource = new ClassPathResource("applicationContextConfig.xml");
//        XmlBeanFactory beanFactory = new XmlBeanFactory(resource);
//        Book book = beanFactory.getBean(Book.class);
//        System.out.println("book = " + book);
//
//        beanFactory.destroyBean("book");
//
//        Book book2 = (Book) beanFactory.getBean("book");
//        System.out.println("book2 = " + book2);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextConfig.xml");
//        System.out.println("Hello");
//        Book book = context.getBean(Book.class);
//        Book book2 = context.getBean(Book.class);
//        Book book3 = context.getBean(Book.class);
//
//        BookController bookController = context.getBean(BookController.class);
//        System.out.println("bookController = " + bookController);
//        BookService bookService = bookController.bookService;
//        System.out.println("bookService = " + bookService);
//
        Student student = context.getBean(Student.class);
        System.out.println(student);
//
        User bean = context.getBean(User.class);
        System.out.println(bean);
        DbConfiguration bean1 = context.getBean(DbConfiguration.class);
        System.out.println("bean1 = " + bean1);

    }

}