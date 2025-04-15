package stepDefs;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDef {
	
//WebDriver driver;

//feature -> scenario -> steps

//	@BeforeAll
//	public static void setupBrowser() {
//		System.out.println("Before All the scnarios");
//	}
//	
//	@AfterAll
//	public static void closeBrowser() {
//		System.out.println("After All the scnarios");
//	}
	
	@Before
public void setupData() {
		System.out.println("Before each  scnarios");
	}
	
	@After
	public void closeDB() {
			System.out.println("After each  scnarios");
		}
	
@Given("User is logged in")
public void user_is_logged_in() {
    System.out.println("User is logged in");
	
}
@When("User create a new Contact")
public void user_create_a_new_contact() {
    System.out.println("User create a new Contact");
 }

@When("User view Contact details")
public void user_view_contact_details() {
    System.out.println("User view Contact details");
 }

@When("User delete a Contact")
public void user_delete_a_contact() {
    System.out.println("User delete a Contact");
}

@When("User create a new Deals")
public void user_create_a_new_deals() {
    System.out.println("User create a new Deals");
    }

@When("User view Deals details")
public void user_view_deals_details() {
    System.out.println("User view Deals details");

}

@When("User delete a Deals")
public void user_delete_a_deals() {
    System.out.println("User delete a Deals");
}


@When("User create a new Tasks")
public void user_create_a_new_tasks() {
	System.out.println("User create a new Tasks");
}

@When("User view Tasks details")
public void user_view_tasks_details() {
	System.out.println("User view Tasks details");

}

@When("User delete a Tasks")
public void user_delete_a_tasks() {
	System.out.println("User delete a Tasks");
}

}
