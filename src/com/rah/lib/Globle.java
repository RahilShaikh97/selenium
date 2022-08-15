package com.rah.lib;

import org.openqa.selenium.WebDriver;

public class Globle {
	//to provoid testdata and object related to whole application

public WebDriver dr;
public String url ="http://183.82.103.245/nareshit/login.php";
public String user="nareshit";
public String pass="nareshit";
public String Fn="Titu";
public String Ln="Shaikh";

//***************************************Objects

public String txt_username="txtUserName";
public String txt_password="txtPassword";
public String btn_login="Submit";
public String btn_logout="Logout";
public String Frame_empinfo="rightMenu";
public String btn_add="/html/body/div/div[2]/form/div[3]/div[1]/input[1]";
public String emp_fn="txtEmpFirstName";
public String emp_ln="txtEmpLastName";
public String btn_save="btnEdit";

}
