package mypackage;
import org.springframework.context.annotation.*;

@Configuration
public class Javaconfig {
   @Bean 
   public pallindrome palBean()
   {
	   return new pallindrome();
   }


}