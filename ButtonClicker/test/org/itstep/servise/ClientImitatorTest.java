package org.itstep.servise;

import static org.junit.Assert.*;

import org.itstep.model.Account;
import org.itstep.service.ClientImitator;
import org.itstep.service.Timer;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ClientImitatorTest {

	@Test
	public void testLoginAccount() {

		Account acc = new Account("Katya", "Topol", "cattallina017@gmail.com", "cocacola321");

		ClientImitator imitator = new ClientImitator();

		WebDriver driver = imitator.loginAmazonAccount(acc);

		Timer.waitSeconds(5);
		
		assertTrue(driver.getPageSource().contains("Hello, " + acc.getName()));

		driver = imitator.addItemToWL(driver, "B077N43PST");

		assertTrue(driver.getPageSource().contains("Hello, " + acc.getName()));
		
		driver.quit();
	}

}
