package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.baseclass;

public class HomePages extends baseclass
{
	public static WebElement FromInputField=driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input"));
	public static WebElement ToInputField=driver.findElement(By.xpath(""));

}
