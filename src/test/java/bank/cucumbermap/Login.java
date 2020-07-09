package bank.cucumbermap;

import java.util.Hashtable;

import bank.methods.HTMLReportGenerator;
import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	@When("^user opens the \"([^\"]*)\" browser and exe \"([^\"]*)\"$")
	public void user_opens_the_browser_and_exe(String bname, String exe) 
	{
		Object[] input =new Object[2];
		input[0]=bname;
		input[1]=exe;
		SeleniumOperations.browserLaunch(input);
		
	    
	}

	@When("^user enters the url \"([^\"]*)\"$")
	public void user_enters_the_url(String url) 
	{
		Object[] input1=new Object[1];
		input1[0]=url;
		SeleniumOperations.applicationLaunch(input1);
	}
	    

	@When("^user enters \"([^\"]*)\" as username$")
	public void user_enters_as_username(String uname) 
	{
		Object[] input2 =new Object[2];
		input2[0]="//*[@id='txtuId']";
		input2[1]=uname;
		
	Hashtable<String,Object>input2op=SeleniumOperations.sendkey(input2);
 HTMLReportGenerator.StepDetails(input2op.get("STATUS").toString(),"user enters \"([^\"]*)\" as username" ,input2op.get("MESSAGE").toString());
	}
	    
	   

	@When("^user enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String pass) 
    {
		Object[] input3 =new Object[2];
		input3[0]="//*[@id='txtPword']";
		input3[1]=pass;
		Hashtable<String,Object>input3op=SeleniumOperations.sendkey(input3);
		 HTMLReportGenerator.StepDetails(input3op.get("STATUS").toString(),"user enters \"([^\"]*)\" as password" ,input3op.get("MESSAGE").toString());
			
		}

	@When("^user click on login button$")
	public void user_click_on_logic_button() 
	{
		Object[] input4=new Object[1];
		input4[0]="//*[@id='login']";
		Hashtable<String,Object>input4op=SeleniumOperations.click(input4);
		 HTMLReportGenerator.StepDetails(input4op.get("STATUS").toString(),"user click on login button" ,input4op.get("MESSAGE").toString());
			 
	}

	@Then("^useris on the \"([^\"]*)\" main page and get message as Welcome to Admin$")
	public void useris_on_the_main_page_and_get_message_as_Welcome_to_Admin(String msg) 
	{
		Object[] Login =new Object[2];
		Login[0]="//*[text()='Admin']";
		Login[1]=msg;
		Hashtable<String,Object>loginop=SeleniumOperations.Validation(Login);
		 HTMLReportGenerator.StepDetails(loginop.get("STATUS").toString(),"useris on the \"([^\"]*)\" main page and get message as Welcome to Admin" ,loginop.get("MESSAGE").toString());
	    
	}


}
