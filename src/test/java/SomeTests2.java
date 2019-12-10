import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.commands.Find;
import com.codeborne.selenide.commands.FindByXpath;
import org.junit.jupiter.api.*;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.conditions.ExactText;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.CompareGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import sun.awt.X11.XQueryTree;
import io.github.cdimascio.dotenv.Dotenv;

import javax.swing.*;
import javax.xml.xpath.XPathExpression;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SomeTests2 {
    Dotenv dotenv = Dotenv.load();

    @Test
    @DisplayName("Positive test")
    void positiveTest1() {

        Configuration.browser = Browsers.FIREFOX;
        open("https://www.google.com/");
        $(byName("q")).setValue("ситилинк купить HDD").pressEnter();
        $$("#search .g").shouldHave(CollectionCondition.sizeGreaterThan(3))
                .first().shouldHave(text("ситилинк"))
                .find(".r>a").click();
        System.out.println("Testing...");
        sleep(12000);
    }
     @Test
     @DisplayName("Positive test")
     void positiveTest2() {
//         Configuration.browser = Browsers.FIREFOX;
        open("https://passport.yandex.ru/auth");
        $("#passp-field-login").setValue(dotenv.get("USER_NAME")).pressEnter();
        $(byName("passwd")).setValue(dotenv.get("PASSWORD_YA")).pressEnter();
//        $(byCssSelector("#root > div > div > div.passp-flex-wrapper > div > div.passp-auth > div.passp-auth-content > div.passp-route-forward > div > form > div:nth-child(3) > button")).click();
//        $(byCssSelector("#root > div > div.dheader > div.dheader-user > div > div > a.user-account.user-account_has-accent-letter_yes.user2__current-account")).click();
         $("a.user2__current-account").click();
         $(byText("Почта")).should(be(visible)).click();
//        $(byText("Написать")).click();
         $(".mail-ComposeButton").click();
         $(byName("to")).should(exist).setValue("kazankarpov@gmail.com");
        $(byName("subj-58989be1cba05970b9f5a3c21fc733ec08f0e60e")).setValue("Мясному мешку-от робота ж'авы");
//         $("[data-key='view=compose-field-subject'] input").setValue("Мясному мешку-от робота ж'авы");
        $(byCssSelector("#cke_1_contents > textarea"))
                .val("Мешок, это я,твой кибаркх, я съем твою оперативку и проц. И выключу холодильник. хахахахаха. ");
        $(byText("Отправить")).click();
//         $("[data-key='view=compose-send-button-complex']").click();
         $("html").shouldHave(text("Письмо отправлено"));
    }}