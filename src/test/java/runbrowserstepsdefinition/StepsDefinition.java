package runbrowserstepsdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;


public class StepsDefinition {
	@Given("^I open browser chrome$")
	public void i_open_browser_chrome(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayee\\eclipse-workspace\\runbrowser\\chromedriver.exe");

	  WebDriver	driver= new ChromeDriver();
	  driver.get("https://www.demo.iscripts.com/multicart/demo/index.php");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
