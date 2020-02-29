 package StepDefinition;		

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steps {				
	Thread t;
    WebDriver driver;			
    		
    @Given("^Open the Firefox and launch the application$")					
    public void Abrindo_o_firefox() throws Throwable							
    {		
       System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");					
       driver= new FirefoxDriver();					
       driver.manage().window().maximize();			
       driver.get("http://phptravels.net/admin/");					
    }		

    @When("^Enter the Username and Password$")					
    public void colocando_usuario_e_senha() throws Throwable 							
    {		
       driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");							
       driver.findElement(By.name("password")).sendKeys("demoadmin");							
    }		
    

    @Then("^Reset the credential$")					
    public void Acessar_menu() throws Throwable 							
    {	
    	
       driver.findElement(By.tagName("button")).click();				
       
    }	   
    
    
    @Then("^Acessando accounts$")
    public void Acessar_accounts() throws Throwable 
    {   
    	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	 driver.findElement(By.xpath("//li/a[@href=\"#ACCOUNTS\"]")).click();
    
    }
    
    @Then("^Acessando GuestCustomers$")
    public void Acessar_GuestCustomers() throws Throwable 
    {   
   	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    	 driver.findElement(By.xpath("//li/a[@href=\"https://phptravels.net/admin/accounts/guest/\"]")).click();
    }
    
    @Then("^Adicionando novo usuario$")
    public void Acessar_novo_usuario() throws Throwable 
    {   
    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    	 driver.findElement(By.xpath("//div/form/button")).click();
    }
    
    @When("^Preenchendo campos$")
    public void Preencher_campos() throws Throwable 
    {   
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	driver.findElement(By.name("fname")).sendKeys("João");							
        driver.findElement(By.name("lname")).sendKeys("Gabriel");	
        driver.findElement(By.name("email")).sendKeys("teste.teste@gmail.com.br");	
        driver.findElement(By.name("password")).sendKeys("123456");	
        driver.findElement(By.name("mobile")).sendKeys("11986587887");
        driver.findElement(By.xpath("//div/a/span[@class=\"select2-arrow\"]")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div/input[@class=\"select2-input select2-focused\"]")).sendKeys("Brazil");
        driver.findElement(By.xpath("//div/ul/li[@class=\"select2-results-dept-0 select2-result select2-result-selectable select2-highlighted\"]")).click();
        driver.findElement(By.name("address1")).sendKeys("Rua das Flores");	
        driver.findElement(By.name("address2")).sendKeys("Casa 3");	          
        
      
    }
   
    @Then("^concluindo cadastro$")
    public void concluir_cadastro() throws Throwable 
    {   
    	 
    	 driver.findElement(By.xpath("//div/button[@class=\"btn btn-primary btn-block btn-lg\"]")).click();
    }

   	    	
}	