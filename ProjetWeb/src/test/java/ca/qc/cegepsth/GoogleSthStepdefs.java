package ca.qc.cegepsth;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static org.assertj.core.api.Assertions.assertThat;

public class GoogleSthStepdefs {

    WebDriver driver;

    @Given("La page de {string} est ouverte")
    public void laPageDeEstOuverte(String site) {
        // Vous pouvez aussi prendre Chrome ou Edge
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        driver = new FirefoxDriver(firefoxOptions);
        driver.get(site);
    }

    @When("Je lance une recherche avec {string}")
    public void jeLanceUneRechercheAvec(String sujet) throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(sujet);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='btnK']")).click();
        Thread.sleep(1000);
    }

    @Then("Je trouve le site {string}")
    public void jeTrouveLeSite(String resultat) {
        assertThat(driver.findElement(By.id("search")).getText()).contains(resultat);
        driver.quit();
    }
}
