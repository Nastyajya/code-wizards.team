import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    @BeforeEach
    void setUp() {
        open("https://code-wizards.team/");
    }
    @AfterEach
    void closeWindow() {
        WebDriverRunner.closeWindow();
    }
}
