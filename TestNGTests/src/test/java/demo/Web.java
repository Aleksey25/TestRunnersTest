package demo;
import com.codeborne.selenide.Selenide;


public class Web {

   public static void runUI(String url){
       Selenide.open(url);
       Selenide.sleep(30000);
       Selenide.closeWebDriver();
   }

}
