import base.TestBase;
import logback.BasicLogger;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Slf4j
public class TitleTest extends TestBase {

    @Test
    @Tag("Regression")
    public void titleTestWithSuccess() {
        String expectedTitle = System.getProperty("expectedTitle");
        String actualTitle = driver.getTitle();
        BasicLogger.logAssertedValues(log, expectedTitle, actualTitle);
        Assertions.assertThat(actualTitle).isEqualTo(expectedTitle);
    }
}
