import com.codeborne.selenide.Condition;
import com.codeborne.selenide.conditions.ExactText;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.CompareGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPathExpression;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class sometests {

    public static void main(String[] args) {
        open("https://market.yandex.ru/");

        $("#header-search").val("холодильник").pressEnter();
        $$(".link.n-link_theme_blue.link_type_cpc").get(1).click();
        $("body").shouldHave(text("холодильник"));
