package bank.cucumbermap;

import java.util.Hashtable;

import bank.methods.HTMLReportGenerator;
import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search {

	
	@When("^user click on branches$")
	public void user_click_on_branches() 
	{
		Object[] input5=new Object[1];
		input5[0]="//*[@src='images/Branches_but.jpg']";
		Hashtable<String,Object>input5op=SeleniumOperations.click(input5);
		 HTMLReportGenerator.StepDetails(input5op.get("STATUS").toString(),"user click on branches" ,input5op.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as country$")
	public void user_select_as_country(String country) 
	{
		Object[] input6 =new Object[2];
		input6[0]="//*[@id='lst_countryS']";
		input6[1]=country;
		Hashtable<String,Object>input6op=SeleniumOperations.dropDown(input6);
		 HTMLReportGenerator.StepDetails(input6op.get("STATUS").toString(),"user select \"([^\"]*)\" as country" ,input6op.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as state$")
	public void user_select_as_state(String state) 
	{
	   
		Object[] input7 =new Object[2];
		input7[0]="//*[@id='lst_stateS']";
		input7[1]=state;
		Hashtable<String,Object>input7op=SeleniumOperations.dropDown(input7);
		 HTMLReportGenerator.StepDetails(input7op.get("STATUS").toString(),"user select \"([^\"]*)\" as state" ,input7op.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as city$")
	public void user_select_as_city(String city) 
	{
		Object[] input8 =new Object[2];
		input8[0]="//*[@id='lst_cityS']";
		input8[1]="MUMBAI";
		Hashtable<String,Object>input8op=SeleniumOperations.dropDown(input8);
		 HTMLReportGenerator.StepDetails(input8op.get("STATUS").toString(),"user select \"([^\"]*)\" as city" ,input8op.get("MESSAGE").toString());
	}

	@When("^user click on Search button$")
	public void user_click_on_Search_button() 
	{
		 Object[] input9=new Object[1];
		 input9[0]="//*[@id='btn_search']";
		 Hashtable<String,Object>input9op=SeleniumOperations.click(input9);
		 HTMLReportGenerator.StepDetails(input9op.get("STATUS").toString(),"user click on Search button" ,input9op.get("MESSAGE").toString());
			
	}

	@Then("^Application shows search result for \"([^\"]*)\" city$")
	public void application_shows_search_result_for_city(String validation) 
	{
		Object[] Search =new Object[2];
		Search[0]="(//*[text()='MUMBAI'])[1]";
		Search[1]=validation;
		Hashtable<String,Object>searchop=SeleniumOperations.Validation(Search);
		 HTMLReportGenerator.StepDetails(searchop.get("STATUS").toString(),"Application shows search result for \"([^\"]*)\" city" ,searchop.get("MESSAGE").toString());
	    
	}

}
