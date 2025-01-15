package testcases;

import drivers.DriverFactory;
import org.testng.annotations.*;

import java.time.Duration;

import static drivers.DriverHolder.getDriver;
import static drivers.DriverHolder.setDriver;

public class TestBase {


    @Parameters("browsername")
    @BeforeTest
    public void setupDriver(String browsername) {

        setDriver(DriverFactory.getNewInstance(browsername));
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        getDriver().get("https://tutorialsninja.com/demo/index.php?route=common/home");


    }

    @AfterTest
    public void Teardown() {
        getDriver().quit();


    }


}
