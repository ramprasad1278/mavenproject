package demomavem;


	
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	
	public class ScrollingUpandDown {

		
	

	public static void main(String[] args) throws InterruptedException
	{
//		System.setProperty("webdriver.chrome.driver",
//		"S:\\Testing Softwares\\chromedriver(1).exe");
		ChromeDriver driver = new ChromeDriver();
		//for launching the browser
		driver.get("https://www.amazon.in/");
		//for maximizing the window
		driver.manage().window().maximize();
		//for scroll down
		Actions actions = new Actions(driver);
		for(int i=0;i<5;i++) {
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		}
		//for scroll up
		Thread.sleep(4000);
		actions.sendKeys(Keys.PAGE_UP).build().perform();
		//another way to scrolling bar using JavaScriptExecutor without Actions class
		((JavascriptExecutor)driver).executeScript("scroll(0,4000)");
		Thread.sleep(4000);
		((JavascriptExecutor)driver).executeScript("scroll(4000,0)");

//		Element view true
		JavascriptExecutor je = (JavascriptExecutor) driver;



		WebElement element1 = driver.findElement(By.xpath("//*[@id='navBackToTop']/div/span"));

		je.executeScript("arguments[0].scrollIntoView(true);",element1);



		}

		}


