package stepDefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginStepDef {
WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.get("https://the-internet.herokuapp.com/login");
		
	}
	//Parameterization and scenario outline 
//	@When("User enters {string} and {string}")
//	public void user_enters_and(String strUser, String strPwd) {
//		driver.findElement(By.id ("username")).sendKeys(strUser);
//		  driver.findElement(By.name ("password")).sendKeys(strPwd);
//		  driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
//	}
//	DataTable using Lists
//	@When("User enters credentials")
//	public void user_enters_and(DataTable userData) {
//		List<List<String>> data = userData.asLists();
//		String strUser =data.get(0).get(0);
//		String strPwd =data.get(0).get(1);
//		driver.findElement(By.id ("username")).sendKeys(strUser);
//		  driver.findElement(By.name ("password")).sendKeys(strPwd);
//		  driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
//	}
//	
//	DataTable using Maps
	@When("User enters credentials")
	public void user_enters_and(DataTable userData) {
		List<Map<String, String>> data = userData.asMaps();
		String strUser =data.get(0).get("username");
		String strPwd =data.get(0).get("password");
		driver.findElement(By.id ("username")).sendKeys(strUser);
		  driver.findElement(By.name ("password")).sendKeys(strPwd);
		  driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
	}
	
	@Then("Should display success message")
	public void should_display_success_message(DataTable userData) {
		List<String> msgList = userData.asList();
		String strMsg = msgList.get(0);
	 WebElement successMsg = driver.findElement(By.xpath("(//div[contains(text(),'" + strMsg + "')])"));
		boolean successMsgCheck = successMsg.isDisplayed();
		Assert.assertTrue(successMsgCheck);
	}
	
}
