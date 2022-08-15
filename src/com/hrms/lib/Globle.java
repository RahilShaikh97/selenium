package com.hrms.lib;
import org.openqa.selenium.WebDriver;
public class Globle {
//to provoid testdata and object related to whole application
	
	public WebDriver driver;
	
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String username ="nareshit";
	public String pass="nareshit";
	public String FN="Rahil";
	public String LN="Shaikh";
	
	
	//**********************Objects
	public String txt_loginname="txtUserName";
	public String txt_password="txtPassword";
	public String btn_login="Submit";
	public String btn_logout="Logout";
	public String frame_empinfo ="rightMenu";
	public String add_btn="/html/body/div/div[2]/form/div[3]/div[1]/input[1]";
	public String txt_Efn="txtEmpFirstName";
	public String txt_Eln="txtEmpLastName";
	public String btn_save="btnEdit";
	
	
	}


