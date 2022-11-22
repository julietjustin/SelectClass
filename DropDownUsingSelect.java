package com.obsqura.TestNGAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownUsingSelect extends BaseCheckBox{
	@Test(description="Select continent")
	public void dropDownSelect() {
		String inputText="Australia";
		Select objselect= new Select(driver.findElement(By.xpath("//select[@name='continents']")));
		objselect.selectByVisibleText(inputText);
		System.out.println("The Displayed Continent Is :"+inputText);
	}
	@Test(description="Find Number Of Elements In That DropDown")
	public void findElements() {
		Select objSelect=new Select(driver.findElement(By.xpath("//select[@name='continents']")));
		List <WebElement>elementCount=objSelect.getOptions();
		int listCount=elementCount.size();
		System.out.println("Number Of Elements Are :"+listCount);
		for (WebElement elements : elementCount) {
            String elementList = elements.getText();
            System.out.println(elementList);
        }
		
	}

}
