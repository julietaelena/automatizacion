package com.proyecto.pruebas;

import java.beans.Expression;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ebaytest {
	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com");
		
		
	}
	@Test
	public void ebay() throws InterruptedException {
		
		
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 WebElement txtbuscar= driver.findElement(By.xpath("//*[@id='gh-ac']"));
		 txtbuscar.sendKeys("shoes");
		 
		
		 WebElement btnbuscar= driver.findElement(By.xpath("//*[@id='gh-btn']"));
		 btnbuscar.click();
		 
		 // scroll
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,700)");
		 
		 //WebElement txtmarca= driver.findElement(By.id("refineOverlay"));
		 WebElement txtmarca= driver.findElement(By.className("x-searchable-list__textbox__aspect-Brand"));
		 
		 
		 txtmarca.sendKeys("PUMA");
		 
		 Thread.sleep(600);
		 js.executeScript("window.scrollBy(0,40)");
		 
		
		 
		 
		WebElement rbtmarca= driver.findElement(By.xpath("//*[@id=\"w3-w13\"]/ul/li[7]/div/a/div/div/span[1]"));
		rbtmarca.click();
		 // WebElement rbtmarca1= driver.findElement(By.className("cbx x-refine__multi-select-checkbox"));
		 // rbtmarca1.click();
		Thread.sleep(800);
		js.executeScript("window.scrollBy(0,160)");
		
		 WebElement rbttalla= driver.findElement(By.xpath("//*[@id=\"x-refine__group_1__0\"]/ul/li[5]/div/a/div/div/span[1]"));
		 rbttalla.click();
		
		 Thread.sleep(600);
		 		 
		//---------ponder en modo lista la vista de productos  -------------------------------------------------------------------
		 Actions actions = new Actions(driver);
		 WebElement cbxlista= driver.findElement(By.id("w8"));
		 actions.moveToElement(cbxlista).build().perform();
		 
		 WebElement seleclista= driver.findElement(By.xpath("//*[@id=\"w8-w0\"]/a/div/span"));
		 seleclista.click();
		 
		
		//--------------------- Ordenar de manera ascendente por precio -------------------------------
		 
		 
		 Thread.sleep(9000);
		 
 		 
		 WebElement cbxordenar= driver.findElement(By.className("srp-controls--selected-value"));
		 
		 actions.moveToElement(cbxordenar).build().perform();
		
		 
		 
		 WebElement cbxordenarpreciobajo= driver.findElement(By.xpath("//*[@id=\"w7\"]/div/div/ul/li[4]/a/span"));
		 cbxordenarpreciobajo.click();
		 
		 
		 
		 Thread.sleep(9000);
		 //------------Numero de resultados ------------------------------------------------------------
		 
		 WebElement numeroresultados= driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div[1]/div[1]/h1/span[1]"));
		 String numeroresultados1 = numeroresultados.getText();
		
		 
		 //---------seleccionar los 5 primeros nombre de los productos
		 
		 WebElement nombreproducto1= driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing1\"]/div/div[2]/a"));
		 String producto1=nombreproducto1.getText();
		
		
				 
		 WebElement nombreproducto2= driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing2\"]/div/div[2]/a"));
		 String producto2=nombreproducto2.getText();
		 
		 WebElement nombreproducto3= driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing3\"]/div/div[2]/a"));
		 String producto3=nombreproducto3.getText();
		 
		 WebElement nombreproducto4= driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing4\"]/div/div[2]/a"));
		 String producto4=nombreproducto4.getText();
		 
		 WebElement nombreproducto5= driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing5\"]/div/div[2]/a"));
		 String producto5=nombreproducto5.getText();
		 
       //---------seleccionar los 5 primeros costos de productos
		 
		 WebElement precioproducto1= driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing1\"]/div/div[2]/div[3]/div[1]/span"));
		 String precio1=precioproducto1.getText();
		 	 
		 WebElement precioproducto2= driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing2\"]/div/div[2]/div[3]/div[1]/span"));
		 String precio2=precioproducto2.getText();
		 
		 WebElement precioproducto3= driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing3\"]/div/div[2]/div[3]/div[1]/span"));
		 String precio3=precioproducto3.getText();
		 
		 WebElement precioproducto4= driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing4\"]/div/div[2]/div[3]/div[1]/span"));
		 String precio4=precioproducto4.getText();
		 
		 WebElement precioproducto5= driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing5\"]/div/div[2]/div[3]/div[1]/span"));
		 String precio5=precioproducto5.getText();
		 
		 //===============Ingresar los productos con sus precios a un array
		 
		 String[] array =new String[10];
		 array[0]=producto1;
		 array[1]=precio1;
		 
		 array[2]=producto2;
		 array[3]=precio2;
		 
		 array[4]=producto3;
		 array[5]=precio3;
		 
		 array[6]=producto4;
		 array[7]=precio4;
		 
		 array[8]=producto5;
		 array[9]=precio5;
		 
		 System.out.println("********                 RESULTADOS                          ********"); 
		 System.out.println("====================================================================="); 
		 System.out.println("(1) Print the number of results"); 	 
		 System.out.println("==>Numero de resultados para Shoes:   "+ numeroresultados1);
		 
		 
		 
		 System.out.println("========================================================================="); 
		 System.out.println("(2) Take the first 5 products with their prices and print them in console"); 
		 System.out.println("========================================================================="); 
		 
		 for(int i=0; i<10; i++){
			 //System.out.println("==>");
			 //System.out.println(array[i]);
			 System.out.println("==> "+ " PRECIO:  " + array[i+1]+ "   " + array[i] );
			 i++;
		 } 
		 
		 
		
		 System.out.println("====================================================================="); 
		 System.out.println("(3) Order and print the products by price in descendant mode) "); 
		 System.out.println("====================================================================="); 
		 
		 for(int i=9; i>=0; i--){
			 //System.out.println("==>");
			 //System.out.println(array[i]);
			 System.out.println("==> "+array[i]+ " - " +array[i-1]);
			 i--;
			 
			 }
		 
		 System.out.println("====================================================================="); 
		 System.out.println("(4) Order and print the products by name (ascendant) "); 
		 System.out.println("====================================================================="); 
		 //=array con solo nombres de producto
		 String[] array2 =new String[5];
		 int j=0;
		 for(int i=0; i<=array.length-1; i++){
			 
			 array2[j]= array[i] + "        PRECIO:" +array[i+1];
			 i=i+1;
			 j=j+1;
		 }
		 
		 
		 
		  
		 
		 String[] nombres =new String[5];
		 
		 nombres = array2;
		 
		 
		//Ordenamos 
		 
		 
		 Arrays.sort(nombres);
		 
		//Imprimimos
		 //System.out.println(Arrays.toString(nombres));
		 for(int i=0; i<=nombres.length-1; i++){
			 
			 System.out.println("==> "+ nombres[i]);
			 
		 }
		 
	    
		 
	}
	@After
	public void tearDown () {
		driver.quit();
	}
	

}
	
	
	

