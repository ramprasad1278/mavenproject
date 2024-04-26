package demomavem;


	
	import java.util.*;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class GoogleSearch {

	

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			// driver.get("https://www.amazon.com");

			driver.manage().window().maximize();

			Thread.sleep(5000);

			driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("selenium");
			Thread.sleep(5000);

			List<WebElement> lst = driver.findElements(By.xpath("//ul[@role = 'listbox']/li"));

			System.out.println("searched Element");
			
			/*
			 * for(WebElement element : lst)
			 * 
			 * if(element.getText().trim().equals("selenium tutorial")) {
			 * lst.get(element).click(); 
			 * break ; }
			 */
		/*}
	}*/
			  
			 
		for (int i = 0; i < lst.size(); i++) {
				String listitem = lst.get(i).getText();
				System.out.println(listitem);

				if (listitem.contains("selenium"))

				{
					lst.get(i).click();

					break;

				}
		}
		}
		}


