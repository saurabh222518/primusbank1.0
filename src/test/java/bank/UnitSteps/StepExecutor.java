package bank.UnitSteps;

import bank.methods.SeleniumOperations;

public class StepExecutor {
	public static void main(String[] args)
	{
		//Browser Launch
		Object[] input =new Object[2];
		input[0]="Chrome";
		input[1]="D:\\bankmaven\\src\\test\\resources\\DRIVERS\\chromedriver.exe";
		SeleniumOperations.browserLaunch(input);
		
		// Application Launch
		
		Object[] input1=new Object[1];
		input1[0]="http://primusbank.qedgetech.com/";
		SeleniumOperations.applicationLaunch(input1);
		
		//Username
		Object[] input2 =new Object[2];
		input2[0]="//*[@id='txtuId']";
		input2[1]="Admin";
		SeleniumOperations.sendkey(input2);

	//Password	
		Object[] input3 =new Object[2];
		input3[0]="//*[@id='txtPword']";
		input3[1]="Admin";
		SeleniumOperations.sendkey(input3);
		
		//Login Button
		Object[] input4=new Object[1];
		input4[0]="//*[@id='login']";
		SeleniumOperations.click(input4);
		// Validation of login page
		Object[] Login =new Object[2];
		Login[0]="//*[text()='Admin']";
		Login[1]="Admin";
		SeleniumOperations.Validation(Login);
		
		//Click on branches
		Object[] input5=new Object[1];
		input5[0]="//*[@src='images/Branches_but.jpg']";
		SeleniumOperations.click(input5);
		
		//Select Country
		Object[] input6 =new Object[2];
		input6[0]="//*[@id='lst_countryS']";
		input6[1]="INDIA";
		SeleniumOperations.dropDown(input6);
		//sELECT  State
		Object[] input7 =new Object[2];
		input7[0]="//*[@id='lst_stateS']";
		input7[1]="MAHARASTRA";
		SeleniumOperations.dropDown(input7);
		// sELECT cITY
		Object[] input8 =new Object[2];
		input8[0]="//*[@id='lst_cityS']";
		input8[1]="MUMBAI";
	    SeleniumOperations.dropDown(input8);
	    //cLCIK search button
	    Object[] input9=new Object[1];
		input9[0]="//*[@id='btn_search']";
		SeleniumOperations.click(input9);
		
		// validation For Search
		Object[] Search =new Object[2];
		Search[0]="(//*[text()='MUMBAI'])[1]";
		Search[1]="MUMBAI";
		SeleniumOperations.Validation(Search);
		
		
	}
	}




