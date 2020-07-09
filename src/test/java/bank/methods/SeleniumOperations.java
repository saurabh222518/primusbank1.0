package bank.methods;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations {
public static WebDriver driver=null;
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	//Browser Launch
	
	public static Hashtable<String, Object> browserLaunch(Object[] inputParameters)
	{
		try {
		String strBrowserName=(String) inputParameters[0];
		String webDriverExePath=(String) inputParameters[1];
		
		if(strBrowserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", webDriverExePath);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		else if (strBrowserName.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.gecko.driver", webDriverExePath);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Actions: Browser Launch,Inpuut Given:"+inputParameters[0].toString());
		
		}catch(Exception e)
		{
			
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Actions: Browser Launch,Inpuut Given:"+inputParameters[0].toString());
				
		}
		return outputParameters;
		}
		
	// Application Launch
	public static Hashtable<String,Object> applicationLaunch(Object[] inputParametrs)
	{
	try{
		
		String strgURL=(String) inputParametrs[0];
		driver.get(strgURL);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Actions: Application Launch,Inpuut Given:"+inputParametrs[0].toString());
			
	
	}catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "Actions: Application Launch,Inpuut Given:"+inputParametrs[0].toString());
				
	}
	return outputParameters;
	}
	
	
// Send Keys
	public static Hashtable<String,Object> sendkey(Object[] inputParameters)
	{
		try {
		String xpath=(String) inputParameters[0];
		String value=(String) inputParameters[1];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement obj=driver.findElement(By.xpath(xpath));
		obj.clear();
		obj.sendKeys(value);
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Actions:sendkey,Inpuut Given:"+inputParameters[1].toString());
			
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Actions:sendkey,Inpuut Given:"+inputParameters[1].toString());
					
		}
		return outputParameters;
	}
	
	
	//Click
	public static Hashtable<String,Object> click(Object[] inputParameters)
	{
		try {
		String xpath=(String) inputParameters[0];
		WebElement obj=driver.findElement(By.xpath(xpath));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		obj.click();
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Actions:Click,Inpuut Given:"+inputParameters[0].toString());
			
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Actions:Click,Inpuut Given:"+inputParameters[0].toString());
					
		}
		return outputParameters;
	}
	
	//Validation
	
	public static Hashtable<String,Object> Validation(Object[] inputParameters) 
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String xpath=(String) inputParameters[0];
		String string1=(String) inputParameters[1];
	  WebElement web=driver.findElement(By.xpath(xpath));
	  String String2=web.getText();
	  try
	  {
		  if(string1.equalsIgnoreCase(String2))
		  {
			  System.out.println("Test Case passs");
		  }
	   else
	  {
		  System.out.println("Test case fail");
	  }
		  outputParameters.put("STATUS", "PASS");
		  outputParameters.put("MESSAGE", "Actions:Click,Inpuut Given:"+inputParameters[1].toString());
				  
	}
	catch(Exception e)
	{
		
	
	  outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "Actions:Click,Inpuut Given:"+inputParameters[1].toString());
	}
	  return outputParameters;
	}	
	
	// Dropdown
	public static Hashtable<String,Object> dropDown(Object[] inputParametrs)
	{
		try 
		{
		String xpath=(String) inputParametrs[0];
		String name=(String) inputParametrs[1];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Select  sel=new Select(driver.findElement(By.xpath(xpath)));
		sel.selectByVisibleText(name);
		outputParameters.put("STATUS", "PASS");
		  outputParameters.put("MESSAGE", "Actions:Click,Inpuut Given:"+inputParametrs[1].toString());
				  
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			  outputParameters.put("MESSAGE", "Actions:Click,Inpuut Given:"+inputParametrs[1].toString());
					  
		}
		return outputParameters;
	}
		
	
}
