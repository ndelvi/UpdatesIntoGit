import javax.xml.parsers.FactoryConfigurationError;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jExample {

	public static void main(String[] args) {
		{
			// Here we need to create logger instance so we need to pass Class name
			//Logger logger = Logger.getLogger("Log4jExample");
			Logger logger = Logger.getLogger(Log4jExample.class);

			//Use only 1 of the below 2 commands and comment the other
			
			//For xml use DOMConfigurator
			//DOMConfigurator.configure("Log4j.xml");
			
			//For Properties File use PropertyConfigurator
			PropertyConfigurator.configure("Log4j.properties");
			String path = "C:\\Users\\Nasser\\eclipse-workspace\\Drivers\\chromedriver.exe";

			System.setProperty("webdriver.chrome.driver", path );
			logger.info("browser opened");

			WebDriver myDriver;
			myDriver = new ChromeDriver();
			myDriver.navigate().to("https://www.mortgagecalculator.org/");
			myDriver.manage().window().maximize();

			myDriver.findElement(By.id("homeval")).sendKeys("425000");
			logger.info("Home Value Entered");
			
			myDriver.findElement(By.id("downpayment")).sendKeys("310000");
			logger.info("Down Payment Entered");

			myDriver.findElement(By.name("cal")).click();
			logger.info("Calculate Clicked");

			myDriver.quit();
			logger.info("Exit Test");
		} 
	}
}



