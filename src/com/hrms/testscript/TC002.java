package com.hrms.testscript;

import com.hrms.lib.General;

public class TC002 {

	public static void main(String[] args) throws InterruptedException {
    General obj = new General();
    obj.openApplication();
    obj.login();
    Thread.sleep(3000);
    obj.enterintoframe();
    Thread.sleep(3000);
    obj.addempinfo();
    obj.exitfromframe();
    obj.closeApplication();
    Thread.sleep(3000);
    obj.logout();
	}

}
