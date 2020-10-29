package StepDefinations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class DealStepDefination {

	
//	
//	WebDriver driver;
//	@Given("^User already login to the page$")
//	
//	public void Ueser_already_login_to_the_page() {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Khaled\\Documents\\New selenium jar\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://ui.freecrm.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	}
//	@When("^title of login page is Free Crm$")
//	public void title_of_login_page_is_Free_Crm() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		//Assert.assertEquals("#1 Free CRM customer relationship management software cloud", title);
//		Assert.assertEquals(title,"Cogmento CRM");
//	}
//	@Then ("^User enter username and password$")
//	public void User_enter_username_and_password(DataTable credetials) {
//		     List<List<String>> data = credetials.raw();
//		driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//	}
//	@Then("^user clicks on login Button$")
//	public void user_clicks_on_login_Button() {
//		driver.findElement(By.xpath("//div[text ()= 'Login']")).click();
//	}
//	@Then("^User clicks on deals$")
//	public void user_clicks_on_deals()  {
//	  driver.findElement(By.xpath("//span[text() ='Deals' ]")).click();
//	}
//	@Then("^User clicks on  new button$")
//	public void user_clicks_on_new_button()  {
//	   driver.findElement(By.xpath("//button[text() = 'New']")).click();
//	   
//	}
//	@Then("^User  enters deals details$")
//	public void user_enters_deals_details(DataTable dealdata)  {
//		
//		           List<List<String >> dealvalus =  dealdata.raw();
//		driver.findElement(By.name("title")).sendKeys(dealvalus.get(0).get(0));
//		driver.findElement(By.name("commission")).sendKeys(dealvalus.get(0).get(1));
//	}
//	
//	@Then("^User clicks on save button$")
//	public void user_clicks_on_save_button()  {
//	    driver.findElement(By.xpath("//button[text() = 'Save']")).click();
//	}
//	
//	@Then("^User close the browser$")
//	public void user_close_the_browser()  {
//	    driver.quit();
//	}
//
//}
