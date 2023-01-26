package demo;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$x;


public class Web {

   public static void runUI(String url){
       /*
       DesiredCapabilities capabilities = new DesiredCapabilities();
       Configuration.remote = "http://172.17.37.150:4444/wd/hub";
       capabilities.setCapability("selenoid:options", Map.<String, Object>of(
               "enableVNC", true,
               "enableVideo", false,
               "enableLog", true
       ));
       Configuration.browserCapabilities = capabilities;

        */
       Selenide.open(url);
       $x(".//h2[text() = 'Розклад рейсів']").click();
       $x(".//h2[text() = 'Розклад рейсів']/parent::a").click();
       Selenide.sleep(20000);
       Selenide.closeWebDriver();
   }

}
