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

import javax.swing.*;
import javax.xml.xpath.XPathExpression;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class st2 {

    @Test
    @DisplayName("Positive test")
    void positiveTest() {
       Configuration.browser = Browsers.FIREFOX;
        open("https://www.google.com/");
        element(byName("q")).setValue("ситилинк купить HDD").pressEnter();
        elements("#search .g").shouldHave(CollectionCondition.sizeGreaterThan(3))
        .first().shouldHave(text("ситилинк"))
                .find(".r>a").click() ;
        sleep(1200);
        System.out.println("Testing...");
        open("https://passport.yandex.ru/auth");
        element(byName("login")).setValue("aristarkhignatov").pressEnter();
        element(byName("passwd")).setValue("23df12ghirud^&j*").pressEnter();
//        element(byCssSelector("#root > div > div > div.passp-flex-wrapper > div > div.passp-auth > div.passp-auth-content > div.passp-route-forward > div > form > div:nth-child(3) > button")).click();
        element(byCssSelector("#root > div > div.dheader > div.dheader-user > div > div > a.user-account.user-account_has-accent-letter_yes.user2__current-account")).click();
        element(byText("Почта")).click();
        element(byText("Написать")).click();
        element(byName("to")).should(exist).setValue("kazankarpov@gmail.com");
        element(byName("subj-58989be1cba05970b9f5a3c21fc733ec08f0e60e")).setValue("Мясному мешку-от робота ж'авы");
        element(byCssSelector("#cke_1_contents > textarea"))
                .val("Мешок, это я,твой кибаркх, я съем твою оперативку и проц. И выключу холодильник. хахахахаха. ");
        element(byText("Отправить")).click();
        sleep(120000);
    }}