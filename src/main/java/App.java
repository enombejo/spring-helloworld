import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        bean1.setMessage("Привет!");
        System.out.println(bean1.getMessage());

        Cat oneCat = applicationContext.getBean(Cat.class);
        oneCat.setName("Barsik");

        Cat twoCat = applicationContext.getBean(Cat.class);
        twoCat.setName("Kot");

        System.out.println(oneCat.getName());
        System.out.println(twoCat.getName());

        System.out.printf("beanHelloWorld == beanHelloWorld1 = %s\n", (bean == bean1));
        System.out.printf("oneCat == twoCat = %s\n", (oneCat == twoCat));
    }
}