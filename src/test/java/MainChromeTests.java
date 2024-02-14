import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class MainChromeTests extends TestBase {

    @Test
    void testClickWa() {
        open();
        $("a[href='https://api.whatsapp.com/send?phone=79504241338']").shouldBe(visible).click();
    }
    @Test
    void testClickViber() {
        open();
        $("a[href='viber://chat?number=%2B79504241338']").shouldBe(visible).click();
    }
    @Test
    void testClickTg() {
        open();
        $("a[href='https://t.me/govard9']").shouldBe(visible).click();
    }
     @Test
    void testColorPhone() {
         open();
         $(".style_navbar__tel__klR3m").hover();
         $(".style_navbar__tel__klR3m").shouldHave(cssValue("color", "rgba(135, 146, 252, 1)"));
    }
    @Test
    void testForm() {
        open();
        $("#promoName").setValue("Анастасия");
        $("#promoPhone").setValue("89990090090");
        $("#form-promo").submit();
        $(".style_popup__background__L1ZMj").shouldHave(visible);
    }
}


