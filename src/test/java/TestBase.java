import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {
    @BeforeEach
    void setUp() {
        Selenide.open("https://code-wizards.team/");
    }
    @AfterEach
    void closeWindow() {
        WebDriverRunner.closeWindow();
    }
}
