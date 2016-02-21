
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;



public class TestInternal {
	
	
	
	public static void main(String[] args) {

		System.out.println("Start building the program");
		
				System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
				WebDriver driver=new  ChromeDriver();
				driver.get("https://www.google.com");
				//Selenium selenium = new DefaultSelenium("localhost"", 4444, ""*firefox"", "http://www.google.com");
				    	while((driver.getCurrentUrl()
				    	.contains("http://campus.mines-nantes.fr"))
				    	&& (1==2)
				    	){
				    			        driver.get("http://campus.mines-nantes.fr");
				    	}
				driver.quit();
		System.out.println("Finish building the program");
	}
	
	
}
