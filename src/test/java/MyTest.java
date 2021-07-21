import com.qi.pojo.Books;
import com.qi.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService books = context.getBean("BookServiceImpl", BookService.class);
        for (Books book : books.queryAllBook()) {
            System.out.println(book);
        }
    }

    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService books = context.getBean("BookServiceImpl", BookService.class);
        Books book = books.queryBookByName("Java");
        System.out.println(book);
    }
}
