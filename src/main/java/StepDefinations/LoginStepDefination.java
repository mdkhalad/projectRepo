//package StepDefinations;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//
//public class LoginStepDefination {
//
//	WebDriver driver;
//	@Given("^User already login to the page$")
//	
//	public void Ueser_already_login_to_the_page() {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Khaled\\Documents\\New selenium jar\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://ui.freecrm.com/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	}
//	
//	@When("^title of login page is Free Crm$")
//	public void title_of_login_page_is_Free_Crm() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		//Assert.assertEquals("#1 Free CRM customer relationship management software cloud", title);
//		Assert.assertEquals(title,"Cogmento CRM");
//	}
//	@Then ("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void User_enter_username_and_password(String username, String password) {
//		driver.findElement(By.name("email")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//	}
//	@Then("^user clicks on login Button$")
//	public void user_clicks_on_login_Button() {
//		driver.findElement(By.xpath("//div[text ()= 'Login']")).click();
//	}
//
//@Then("^User clicks on contact$")
//public void user_clicks_on_contact()  {
//    driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[3]/span")).click();
//}
//
//@Then("^User clicks on  new button$")
//public void user_clicks_on_new_button()  {
//   driver.findElement(By.xpath("//button[text() = 'New']")).click();
//   
//}
//
//@Then("^User  enters \"([^\"]*)\" and \"([^\"]*)\"$")
//public void user_enters_and(String firstname, String lastname)  {
// driver.findElement(By.name("first_name")).sendKeys(firstname);
// driver.findElement(By.name("last_name")).sendKeys(lastname);
//}
//
//@Then("^User clicks on save button$")
//public void user_clicks_on_save_button()  {
//    driver.findElement(By.xpath("//button[text() = 'Save']")).click();
//}
//
//@Then("^User close the browser$")
//public void user_close_the_browser()  {
//    driver.quit();
//}
//
//
//}