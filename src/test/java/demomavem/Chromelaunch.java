package demomavem;



	
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;

	public class Chromelaunch {

		public static void main(String[] args) throws InterruptedException  {
			// TODO Auto-generated method stub
			
			//System.setProperty("webdriver.chrome.driver", "\"C:\\Users\\rajes\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
			
			WebDriver driver = new ChromeDriver();
//			driver.get("https://www.facebook.com/");
			driver.get("https://www.amazon.com");
			
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
			
			JavascriptExecutor jse =  (JavascriptExecutor)driver;
			
			WebElement e1 = driver .findElement(By.xpath("//*[@id=\"navBackToTop\"]/div/span"));
			
			jse.executeScript("arguments[0].scrollIntoView(true);", e1);
			
				

		}

	}


