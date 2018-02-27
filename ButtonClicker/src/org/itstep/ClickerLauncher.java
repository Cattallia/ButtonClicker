package org.itstep;

import org.itstep.model.*;
import org.itstep.service.*;
import org.openqa.selenium.*;

public class ClickerLauncher {

	public static void main(String[] args) {

		Account acc = new Account("Katya", "Topol", "cattallina017@gmail.com", "cocacola321");

		ClientImitator imitator = new ClientImitator();
		imitator.registerAmazonAccount(acc);
		WebDriver driver = imitator.loginAmazonAccount(acc);
		

	}

}
