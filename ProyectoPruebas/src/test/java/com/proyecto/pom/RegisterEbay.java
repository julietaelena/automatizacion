package com.proyecto.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterEbay extends Base{
	
	By cajatextobuscar = By.xpath("//*[@id='gh-btn']");
	By botonbuscar = By.xpath("//*[@id='gh-btn']");
	By cajatextomarca =By.className("x-searchable-list__textbox__aspect-Brand");

	public RegisterEbay(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	

}
