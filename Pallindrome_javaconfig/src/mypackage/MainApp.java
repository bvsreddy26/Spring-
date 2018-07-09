package mypackage;
import java.util.Scanner; 


import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.*;

public class MainApp {
   public static void main(String[] args) {
      //ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	  ApplicationContext context = new AnnotationConfigApplicationContext(Javaconfig.class);
	  //pallindrome obj = (pallindrome) context.getBean("Beans.xml");
      pallindrome obj = (pallindrome) context.getBean(pallindrome.class);
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter String: ");
      String s = scan.next();
      obj.setSample(s);
	  obj.getSample();
      obj.Lite();
      obj.testPallindrome();
      scan.close();
   }
}