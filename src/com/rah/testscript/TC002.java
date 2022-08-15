package com.rah.testscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.rah.lib.General;

public class TC002 {
	@Test
	public void tc002() throws Exception{
		//Test Steps
		  DOMConfigurator.configure("log4j.xml");
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.enterFrame();
	obj.addempinfo();
	obj.backtopage();
	obj.logout();
	obj.closeApplication();
	}

}
