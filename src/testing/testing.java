package testing;




import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javafx.util.Duration;
import sun.util.resources.cldr.aa.CalendarData_aa_ER;

public class testing 

{
	/*public  String getFullName(String fname, String lname) 
	{
		
		String fullName = fname + " " + lname;
		return fullName;
	}*/
	
//}
	public static WebDriver driver;

	  public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		 	driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			
			/*WebElement loginbutton = driver.findElement(By.id("btnsubmit"));
			
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.elementToBeClickable(loginbutton));
			
			driver.findElement(By.className("close")).click();
			
			Actions ac = new Actions(driver);
			ac.moveToElement(driver.findElement(By.className("caret")));
			ac.build().perform();
			
			WebElement helpdetails = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/ul[1]/li[1]/ul/li[1]/a"));
			
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.elementToBeClickable(helpdetails));
		
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/ul[1]/li[1]/ul/li[1]/a")).click();
			
			
			driver.findElement(By.linkText("Site Map")).click();
			
			List<WebElement> links =driver.findElements(By.tagName("a"));
			
			for(int i=0; i<links.size(); i++)
			{
				String linkname=links.get(i).getText();
				links.get(i).click();
				String linkurl = driver.getCurrentUrl();
				System.out.println(linkname+"     "+linkurl);
				driver.navigate().back();
				
				links =driver.findElements(By.tagName("a"));
			}
			driver.quit();
			
	}*/
	 
		  
		  	//for ERP logout 
		  
		  	/*System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			
		 	driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://webapp.qedgetech.com");
			
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys("master");
			
			driver.findElement(By.id("btnsubmit")).click();
			
			driver.findElement(By.partialLinkText("Logout")).click();
			
			Thread.sleep(2000);
			
			//driver.findElement(By.linkText("OK!")).click();
			
			//WebElement Alert =driver.findElement(By.className("ajs-dialog"));
			//driver.switchTo().frame(Alert);
			//driver.findElement(By.xpath("/html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
			
			driver.findElement(By.xpath("/html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
		}
	  
	  
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://webapp.qedgetech.com");
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("master");
		
		driver.findElement(By.linkText("Options")).click();
		
		driver.findElement(By.id("type2")).click();
	}
}
		
		  testing test=new testing();
		  String fname=test.getFullName("sertbgffvg", "batikiri");
		   System.out.println(fname);

	}
			WebElement Loginbutton=driver.findElement(By.linkText("Login"));
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.elementToBeClickable(Loginbutton));
			
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys("master");
			
			driver.findElement(By.id("btnsubmit")).click();
			
			Actions ac =  new Actions(driver);
			ac.moveToElement(driver.findElement(By.linkText("Stock Items")));
			ac.build().perform();
			
			driver.findElement(By.linkText("Stock Categories")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[3]/div[1]/div[1]/div[1]/div/a")).click();
			driver.findElement(By.id("x_Category_Name")).sendKeys("Samsung");
			driver.findElement(By.xpath("//button[@id='btnAction']")).click();
			driver.findElement(By.xpath("/html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
			driver.findElement(By.xpath("/html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
			
			WebElement categorytable=driver.findElement(By.id("tbl_a_stock_categorieslist"));
			
			List<WebElement>rows,cols;
			
			Thread.sleep(3000);
			rows=categorytable.findElements(By.tagName("tr"));
			
			String result= "Samsung";
			
			Thread.sleep(3000);
			for(int i=2; i<rows.size();i++)
			{
			cols=rows.get(i).findElements(By.tagName("td"));
			String created=cols.get(3).getText();
			System.out.println(created);
			if(created.equals(result))
			{
				System.out.println("category successfully created");
				break;
			}
				
			}
			
			/*driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys("master");
			
			driver.findElement(By.id("btnsubmit")).click();
			
			Actions ac =  new Actions(driver);
			ac.moveToElement(driver.findElement(By.linkText("Stock Items")));
			ac.build().perform();
			
			driver.findElement(By.linkText("Unit of Measurement")).click();
			
			if(driver.findElement(By.id("ewPageCaption")).isDisplayed())
			{
				System.out.println("Accessed to Unit of Measurement Page");
			}else 
			{
				System.out.println("Not Accessed to the Unit of Measurement Page");
			}
			
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("password")).clear();
			
			driver.findElement(By.id("username")).sendKeys("admin1");
			driver.findElement(By.id("password")).sendKeys("master1");
			
			driver.findElement(By.id("btnsubmit")).click();
			
			Thread.sleep(3000);
			
			String Errormsg =driver.findElement(By.xpath("//div[@class='alert alert-danger ewError']")).getText();
			System.out.println(Errormsg);
			
			if(Errormsg.contains("Incorrect"))
			{
				System.out.println("unable to login Error msg is "+Errormsg+"test pass");
			}else
			{
				System.out.println("login Suceessfull with invalid data test fail"); 
				
			}
			
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys("master");
			
			driver.findElement(By.id("btnsubmit")).click();
			driver.findElement(By.linkText("Stock Items")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
			
			Select cat = new Select(driver.findElement(By.id("x_Category")));
			cat.selectByVisibleText("IQOO");
			
			Select supplynum = new Select(driver.findElement(By.id("x_Supplier_Number")));
			supplynum.selectByVisibleText("pinky");
			
			String stocknumber=driver.findElement(By.id("x_Stock_Number")).getAttribute("value");
			System.out.println(stocknumber);
			
			driver.findElement(By.id("x_Stock_Name")).sendKeys("Rummy");
			
			Select uom = new Select(driver.findElement(By.id("x_Unit_Of_Measurement")));
			uom.selectByVisibleText("KG");
			
			driver.findElement(By.id("x_Notes")).sendKeys("this  is rummy");
			
			driver.findElement(By.xpath("//button[@id='btnAction']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
			
			driver.findElement(By.xpath("//span[@data-phrase='SearchBtn']")).click();
			
			driver.findElement(By.id("psearch")).sendKeys(stocknumber);
			driver.findElement(By.id("btnsubmit")).click();
			
			WebElement resulttable = driver.findElement(By.xpath("//div[@class='ewScrollableTableBody']"));
			
			List<WebElement>row,col;
			row =resulttable.findElements(By.tagName("tr"));
			String created1;
			boolean done = false;
			for(int i=1; i<=row.size(); i++)
			{
				col=row.get(i).findElements(By.tagName("td"));
				String createdid =col.get(7).getText();
				System.out.println(createdid);
				
				if(createdid.equals(stocknumber))
				{
					done = true;
					System.out.println("created");
					break;
				}else
				{
					System.out.println("not created");
					
					
				}
			}
			if(done)
			{
				System.out.println("success");
				
				
			}else
			{
				System.out.println("not success");
			}
			
			
			
			driver.findElement(By.linkText("MOBILE")).click();
			//driver.findElement(By.xpath("//a[@title='Sony Xperia']")).click();
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/button")).click();
			driver.findElement(By.xpath("//input[@title='Qty']")).clear();
			driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("1000");
			driver.findElement(By.xpath("//button[@title='Update']")).click();
			String actualmsg=driver.findElement(By.xpath("//p[@class='item-msg error']")).getText();
			System.out.println(actualmsg);
			if(actualmsg.contains("maximum quantity"))
			{
				System.out.println("System displaying appropriate error msg--"+actualmsg+"--test pass");
			}else
			{
				System.out.println("test fail");
			}
			driver.findElement(By.id("empty_cart_button")).click();
			
			String emtymsg =driver.findElement(By.xpath("//div[@class='page-title']")).getText();
			System.out.println(emtymsg);
			
			if(emtymsg.contains("CART IS EMPTY"))
			{
				System.out.println("item Removed from cart test pass");
			}else
			{
				System.out.println("item is not removed from cart test fail");
			}
			
			driver.findElement(By.id("date-box")).click();
			
		List<WebElement> caltable = driver.findElements(By.xpath("//div[@class='DayTilesWrapper__DayWrapper-moo2xh-1 loqlv']"));
	
			Select st = new Select(driver.findElement(By.xpath("//span[@class='DayTilesWrapper__DayWrapper-moo2xh-1 loqlv']")));
			
			st.selectByVisibleText("8");*/
			
			
			
			
//			driver.findElement(By.id("onward_cal")).click();
//			
//			WebElement table  = driver.findElement(By.id("rb-calendar_onward_cal"));
//			
//			
//			List<WebElement> cols = table.findElements(By.tagName("td"));
//			String exp = "Oct 2022";
//			while(!cols.equals(exp))
//			{
//				driver.findElement(By.xpath("//td[@class='next']")).click();
//				break;
//			}
//			
	
	


			
			/*driver.get("http:redbus.in");
			driver.findElement(By.id("onward_cal")).click();
		//	driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//td[text()='15']")).click();
			Thread.sleep(2000);
			String monthyear=driver.findElement(By.className("monthTitle")).getText();
			System.out.println(monthyear);
			String[] my = monthyear.split(" ");
			String month=my[0];
			String year=my[1];
			
			
			String tergetmonth= "Sept";
			String targetyear = "2022";
			String targetday = "7";
			
			while(!(month.equals(tergetmonth) && year.equals(targetyear)))
			{
				driver.findElement(By.className("next")).click();
				 monthyear=driver.findElement(By.className("monthTitle")).getText();
				  my = monthyear.split(" ");
					 month=my[0];
					year=my[1];
			}
			driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//td[text()="+targetday+"]")).click();
			*/
			
			
			/*driver.get("https://google.com");
			Thread.sleep(2000);
			Set<String>windows=driver.getWindowHandles();
			System.out.println(windows);
			Object[] mainwindow=windows.toArray();
			String mwindow=mainwindow[0].toString();
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='callout']")));
			
			
			driver.findElement(By.xpath("//button[@class='M6CB1c rr4y5c']")).click();
			
			driver.switchTo().window(mwindow);
			driver.findElement(By.xpath("//div[@aria-label='Search by voice']")).click();
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("ram");
			*/
			
			
			String name = "ram";
			
			
			
				
}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			


