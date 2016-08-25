package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementActions {

	public boolean isElementPresentByXpath(WebDriver driver, String xpath){
	
		try
		{
			driver.findElement(By.xpath(xpath));
			
		}
		
		catch (Throwable e){
		e.getMessage();
		return false;
		}
		return true;
	}
		
	public boolean isElementPresentByID(WebDriver driver, String ID){
		
	
			try {
				driver.findElement(By.id(ID));
			} 
			catch (Exception e) {
			e.printStackTrace();
			return false;
			}
			return true;
	}
			
	public boolean isElementPresentByName(WebDriver driver, String name){
		
		try {
			driver.findElement(By.name(name));
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}
		return true;
		}
	
public boolean isElementPresentByClassName(WebDriver driver, String Classname){
		
		try {
			driver.findElement(By.name(Classname));
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}
		return true;
		}

public void clickButtonByID(WebDriver driver, String ID) throws Exception{
	
       if(isElementPresentByID( driver, ID))
           {
    	   WebElement webbutton= driver.findElement(By.id(ID));
    	   webbutton.click();  
    	    }
       else{
    	   throw new Exception("clickButtonByID()----> Element not present");
       }
       }

public void clickLinkByxpath(WebDriver driver, String xpath) throws Exception{
	if(isElementPresentByXpath(driver,xpath)){
		
		WebElement webbutton = driver.findElement(By.xpath(xpath));
		webbutton.click();
	}
	
	 else{
  	   throw new Exception("clickLinkByXpath()----> Element not present");
     }
}		

public void inputTextByID( WebDriver driver, String ID,String sValue) throws Exception{
	
	if(isElementPresentByID(driver, ID)){
		WebElement button= driver.findElement(By.id(ID));
		button.sendKeys(sValue);
	}
	
	else {
		throw new Exception ("inputTextByID()----> Element not Present");
	}
}
		
public void inputTextByXpath(WebDriver driver, String xpath, String sValue) throws Exception{
	if(isElementPresentByXpath(driver, xpath))
	{
		WebElement button= driver.findElement(By.xpath(xpath));
		button.sendKeys(sValue);	
	}
	else {
		throw new Exception ("inputTextByXpath()----> Element not Present");
	}
} 

public void selectCheckBox(WebDriver driver, String xpath) throws Exception{
	if(isElementPresentByXpath(driver, xpath)){
		
		WebElement checkbox = driver.findElement(By.xpath(xpath));
		checkbox.click();
	}
	else {
		throw new Exception ("selectCheckBox()----> Element not Present");
	}
}
		
public void selectRadioButton(WebDriver driver, String xpath ) throws Exception{
	
if(isElementPresentByXpath(driver, xpath)){
		
		WebElement radiobutton = driver.findElement(By.xpath(xpath));
		radiobutton.click();
	}
	else {
		throw new Exception ("selectRadioButton()----> Element not Present");
	}
}
	
public String getInputTextValue(WebDriver driver, String xpath ) throws Exception{
	
	if(isElementPresentByXpath(driver, xpath)){ 
		
		WebElement textvalue= driver.findElement(By.xpath(xpath));
		return textvalue.getText();
		
	}
	
	else{
		throw new Exception("getInputTextValue()-----> Element not present");
	}	
}	
	
public void clearInputTextValue(WebDriver driver, String xpath) throws Exception{
	if(isElementPresentByXpath(driver, xpath)){
		WebElement cleartext= driver.findElement(By.xpath(xpath));
	       cleartext.clear();
	}
	
	else{
		
		throw new Exception ("clearInputTextValue--------Element not present");
	}
}

public void clearInputTextValueByID(WebDriver driver, String ID) throws Exception{
	if(isElementPresentByXpath(driver, ID)){
		WebElement cleartext= driver.findElement(By.id(ID));
	       cleartext.clear();
	}
	
	else{
		
		throw new Exception ("clearInputTextValueByID--------Element not present");
	}
}

public void clearAndInputTextValue(WebDriver driver,String xpath,String inputtext ) throws InterruptedException, Exception{
	
	if(isElementPresentByXpath(driver, xpath)){
		
		WebElement value= driver.findElement(By.xpath(xpath));
		Thread.sleep(2000);
		value.clear();
		Thread.sleep(2000);
		value.sendKeys(inputtext);	
	}
	else {
		throw new Exception ("clearAndInputTextValue()-----> Element noe Found");
	}
}

public void selectDropBoxByValueXpath(WebDriver driver,String xpath, String value) throws Exception{
	if(isElementPresentByXpath(driver, xpath)){
		WebElement dropbox = driver.findElement(By.xpath(xpath));
		Select dropdown = new Select(dropbox);
		dropdown.selectByValue(value);
	}
	else {
		throw new Exception ("selectDropBoxByValueXpath()----> Element not present");
	}
}

public void selectDropBoxByValueID(WebDriver driver,String ID, String value) throws Exception{
	if(isElementPresentByID(driver, ID)){
		WebElement dropbox = driver.findElement(By.id(ID));
		Select dropdown = new Select(dropbox);
		dropdown.selectByValue(value);
	}
	else {
		throw new Exception ("selectDropBoxByValueID()----> Element not present");
	}
}
public void selectDropBoxByValueName(WebDriver driver,String name, String value) throws Exception{
	if(isElementPresentByName(driver, name)){
		WebElement dropbox = driver.findElement(By.name(name));
		Select dropdown = new Select(dropbox);
		dropdown.selectByValue(value);
	}
	else {
		throw new Exception ("selectDropBoxByValueName()----> Element not present");
	}
}


public void selectDropBoxByIndexXpath(WebDriver driver, String xpath, int indexvalue) throws Exception{
	if(isElementPresentByXpath(driver, xpath)){
		WebElement dropbox = driver.findElement(By.xpath(xpath));
		Select select = new Select(dropbox);
		select.selectByIndex(indexvalue);
	}
	else{
		throw new Exception ("selectDropBoxByIndexXpath()----> Element not present");	
	}
}

public String getDropBoxDefaltValue(WebDriver driver, String xpath)throws Exception{
	if(isElementPresentByXpath(driver, xpath)){
		WebElement dropbox = driver.findElement(By.xpath(xpath));
		Select select = new Select(dropbox);
		return select.getFirstSelectedOption().getText();
	}
	else {
		throw new Exception("getDropBoxDefaltValue()------> Element not present");
	}
}

public String getSelectedDropBoxValue(WebDriver driver, String xpath, int indexvalue) throws Exception{
	if(isElementPresentByXpath(driver, xpath)){
		WebElement dropbox = driver.findElement(By.xpath(xpath));
		Select select = new Select(dropbox);
		return select.getOptions().get(indexvalue).getText();
	}
	else {
		throw new Exception("getDropBoxDefaltValue()------> Element not present");

	}
}
public int getDropBoxSize(WebDriver driver, String xpath) throws Exception{
	if(isElementPresentByXpath(driver, xpath)){
		WebElement dropbox = driver.findElement(By.xpath(xpath));
		Select select = new Select(dropbox);
		return select.getOptions().size();
	}
	else{
		throw new Exception("getDropBoxDefaltValue()------> Element not present");
	}
}

public String[] getAllDropBoxValue(WebDriver driver, String xpath) throws Exception{
	if(isElementPresentByXpath(driver, xpath)){
		WebElement dropbox = driver.findElement(By.xpath(xpath));
		Select select = new Select(dropbox);
		List<WebElement> dropdown =select.getOptions();
		String [] value = new String[dropdown.size()];
		for(int i=0;i<dropdown.size();i++)
			value[i] = dropdown.get(i).getText();
		return value;
	}
	else  {
		throw new Exception("getDropBoxDefaltValue()------> Element not present");	
	}
}


 






















}		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	

