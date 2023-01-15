import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorld.getMessage());

        HelloWorld helloWorld2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorld2.getMessage());

        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getName());

        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getName());

        System.out.println(helloWorld == helloWorld2);

        System.out.println(cat == cat2);

    }
}