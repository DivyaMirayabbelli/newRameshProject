package testing;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.Synthesizer;
import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetAlertText;
import org.openqa.selenium.remote.server.handler.interactions.MouseMoveToLocation;
import org.openqa.selenium.support.ui.Select;

import com.sun.nio.file.SensitivityWatchEventModifier;
import com.sun.org.apache.xpath.internal.operations.Equals;
import com.sun.rowset.WebRowSetImpl;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_COLOR_BURNPeer;
import com.sun.swing.internal.plaf.synth.resources.synth_pt_BR;

import net.bytebuddy.implementation.bytecode.Addition;
import sun.security.util.Length;

public class practice {

	public static void main(String[] args)
	{
		
	/*/*int n =5;
	for (int j=1; j<n; j++)
	{
		for(int i=j; i<=n; i++)
		{
			System.out.print("  ");
		}
		for(int i=1; i<j; i++)
		{
			System.out.print("* ");
		}o		for(int i=1; i<=j; i++)
		{
			System.out.print("* ");
		}
	System.out.println();
	}
	for (int j=1; j<=n; j++)
	{
		for(int i=1; i<=j; i++)
		{
			System.out.print("  ");
		}
		for(int i=j; i<n; i++)
		{
			System.out.print("* ");
		}
		for(int i=j; i<=n; i++)
		{
			System.out.print("* ");
		}
	System.out.println();
	}*/
	
		
		/*int n =5;
		for(int j = 1; j<=n; j++)
		{
			for(int i=j; i<=n; i++)
			{
				System.out.print("  ");
			}
			for(int i= 1; i<=j; i++)
			{
				System.out.print("* ");
			}
			
		System.out.println();
		}*/
		
		
		/*String input = "Iam Printing Daimond here";
		String output="";
		
		System.out.print("String ---- "+input);
		
		System.out.println();
		//int  lrn = input.length();
		//System.out.println(lrn);
		
		for(int i=input.length()-1; i>=0; i--)
		
			output=output+input.charAt(i);
			System.out.println("Reverse String ----- "+ output);
		
		String uname=input.toUpperCase();
		System.out.print("Uppercase ---- "+uname);
		System.out.println();
		String lname=input.toLowerCase();
		System.out.print("lowercaase ----  "+lname);
		
		
		char   let=input.charAt(3);
		System.out.println(let);*/
		
		/*int n = 5;
		for(int j=1; j<n; j++)
		{
		for(int i = j; i<=n; i++)
		{
			System.out.print("  ");
		}
		for(int i=1; i<=j; i++)
		{
			System.out.print("* ");
		}
		for( int i = 1; i<j; i++)
		{
			System.out.print("* ");
		}
		System.out.println();
		}
		for(int j=1; j<=n; j++)
		{
		for(int i = 1; i<=j; i++)
		{
			System.out.print("  ");
		}
		for(int i=j; i<=n; i++)
		{
			System.out.print("* ");
		}
		for( int i = j; i<n; i++)
		{
			System.out.print("* ");
		}
		System.out.println();
		}
		
		/*String a ="A";
		String b = "B";
		int cv=b.compareTo(a);
		System.out.println(cv);
		
		boolean emt= a.isEmpty();
		System.out.println(emt);
		
		char  ct=a.charAt(0);
		System.out.println(ct);
		
		boolean res =a.endsWith(b);
		System.out.println(res);
		
		boolean dus=a.contains("R");
		System.out.println(dus);
		
		int count = a.length();
		System.out.println(count);
		
		String replace=a.replace("A", "Z");
		System.out.println(replace);
		
		int index =a.lastIndexOf(a);
		System.out.println(index);
		
		boolean ignore =a.equalsIgnoreCase(a);
		System.out.println(ignore);
		
		boolean equla =a.equals("A");
		System.out.println(equla);
		
		
		String course = "z";
		if (course.equalsIgnoreCase("s") || course.equals("u")) 
		{
			System.out.println("selenium");
		}if(course.equalsIgnoreCase("Q") || course.equals("z"))
		{
			System.out.println("QTP");
		}else {
			System.out.println("invalid");
		}
		
		
		 int value = 3;
		 
		switch (value) {
		case 1:
			System.out.println("case 0");
			break;
		case 2:
			System.out.println("case 10");
			break;
		case 3:
			System.out.println("case 100");
			break;
		default:
			System.out.println("invalid");
			break;
		}
		
		String name = "srujana";
		switch (name) {
		case "ram":
			System.out.println("RRR");
			break;
		case "srujana":
			System.out.println("thinavara");
			break;
		case "sravani":
			System.out.println("my love");
		default:
			break;
		}
		
		
		String name2 = "ram";
		switch (name2) {
		case "ram":
			System.out.println("RRR");
			break;
		case "srujana":
			System.out.println("thinavara");
			break;
		case "sravani":
			System.out.println("my love");
			break;
		default:
			System.out.println("invalid");
			break;
		}
		
		int T = 100;
		int ty = 100;
		
		int add=T+ty;
		System.out.println(add);
		
		int mul = T*ty;
		System.out.println(mul);
		
		if(T<ty)
		{
			System.out.println("ty is big");
		}else if(T>ty)
		{
			System.out.println("T is big");
		}else if(T==ty)
		{
			System.out.println("both are same");
		}	
		
		
		int n = 5;
		
		for(int j=0; j<=n; j++)
		{
		for(int i=0; i<=j; i++)
		{
			System.out.print("  ");
		}
		for (int i=j; i<=n; i++)
		{
			System.out.print("* ");
		}
		for (int i=j; i<n; i++)
		{
			System.out.print("* ");
		}
		System.out.println();
		}
		for(int j=0; j<=n; j++)
		{
		for(int i=j; i<=n; i++)
		{
			System.out.print("  ");
		}
		for(int i=1; i<=j; i++)
		{
			System.out.print("* ");
		}
		for(int i=0; i<=j; i++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}
}
 
		public static void main(String[] arg){
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://snapdeal.com");
			Actions act =  new Actions(driver);
			act.moveToElement(driver.findElement(By.linkText("Men's Fashion")));
			act.build().perform();
			
			String curl=driver.getCurrentUrl();
			System.out.println(curl);
			String aurl = "snapdeal";
			
			if (curl.contains(aurl)) {
				System.out.println("test paass");
				
			}else {
				System.out.println("test fail");
			}
			
			Set<String>allwind=driver.getWindowHandles();
			//System.out.println(allwind);
			Object[] winds=allwind.toArray();
			String  wind1= winds[0].toString();
			System.out.println(wind1);
			
			
			driver.close();			
		}
		
		String st = "ramesh";
		
		//System.out.println(st);
		for(int  i=st.length()-1; i>=0; i--) 
		{
		for(int i1=st.length()-1; i1>=0; i1--)
		{
			char rr = st.charAt(i1);
			System.out.print(rr+" ");
		}
		System.out.println();
		}*/
		
		/*System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://gmail.com");
		
		driver.findElement(By.linkText("Help")).click();
		
		
		Set<String>allwindows=driver.getWindowHandles();
		System.out.println(allwindows);
		Object[] alwind=allwindows.toArray();
		String window1=alwind[0].toString();
		String window2=alwind[1].toString();
		System.out.println(window2);
		
		driver.switchTo().window(window2);
		
		driver.findElement(By.xpath("//input[@class='promoted-search__input']")).sendKeys("ram");

		driver.switchTo().window(window1);
		String purl=driver.getCurrentUrl();
		System.out.println(purl);*/
		
	//String var = "ABCDEF";
	//String rev = "";
	
	/*
	int len = var.length();
		
		System.out.println(len);
		
		for (int i= len-1 ; i>=0; i--)
		{
			rev = rev+var.charAt(i);
			
		}
		System.out.println(rev);
		char i = var.charAt(2);
		System.out.println(i);
		*/
		
		
		/*char a[ ] = var.toCharArray();
		
		int len =a.length;
		
		System.out.println(len);
		for (int i = len-1; i >=0; i--)
		{
			rev = rev+a[i];
		}
		System.out.println(rev);
		*/
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String value");
		
		String str = sc.nextLine();
		String org_str = str; 	
		
			String rev1 = "";
			int len =  str.length();
			System.out.println(len);
			for(int i = len-1; i>=0; i--)
			{
				rev1 = rev1+str.charAt(i);
			}
			System.out.println(rev1);
		
	if(org_str.equals(rev1))
	{
		System.out.println(org_str+"  is a pelindrome");
	}else
	{
		System.out.println(org_str+"  is not a pelindrome");
	}*/
	
	/*String name = "     sangh    amitra        ";
	System.out.println(name);
	System.out.println(name.trim());
	
		String vre = "   n'lekg[40u8-10349tkj-104t9iuq[pgh;eowvj         ";
		System.out.println(vre);
		System.out.println(vre.length());
		
		System.out.println(vre.trim());
	*/
	
	/*Scanner sc = new Scanner(System.in);
	System.out.println("Enter String Value");
	String str = sc.nextLine();
	String org_str=str;
	String rev = "";
	
	int len =str.length();
	for(int i = len-1; i>=0; i--)
	{
		rev = rev+str.charAt(i);
	}
	System.out.println(rev);
	
	if(org_str.equals(rev))
	{
		System.out.println(org_str+"   is pelindrome");
	}else
	{
		System.out.println(org_str+"   is not pelindrome");
	}
	
	
	
	String jen = "kalpana";
	StringBuffer nc = new StringBuffer(jen);
		StringBuffer reverse=nc.reverse();
		System.out.println(reverse);
		*/
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("even numbers");
		for(int i = 0; i<a.length; i++)
		{
			if( a[i]%2==0)
				System.out.println(a[i]);
		}
		System.out.println("odd numbers");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("for loop");
		int v[] = {1,2,3,45,6,7,9};
		
		for(int  value : v)
		{
			if ( value%2==0)
			{
				System.out.println(value);
			}
		}
		System.out.println("for lopps");
		for(int rrr:v)
		{
			if(rrr%2!=0)
			{
				System.out.println(rrr);
			}
		}
		
		int  nn = 70;
		if(nn%2==0)
		{
			System.out.println(nn);
		}
		
		
		
		
		
			
}
}
			


