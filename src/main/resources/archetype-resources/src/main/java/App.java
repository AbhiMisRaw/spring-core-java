package $org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{

    ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
