package flipkartWebPageTestcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import flipkartWebPages.LoginPage;
//import flipkartWebPages.LoginPage;
public class flipkartLoginPageTestCAses {
@Test
public void  flipkartLoginPageCredentials()
{
	LoginPage openBrowser=new LoginPage();
	openBrowser.flipkartloginpagedisplay();
}
}
