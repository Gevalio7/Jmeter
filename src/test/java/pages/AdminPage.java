package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AdminPage extends BasePage {
    public SelenideElement userProfileName() {
        return $(".ant-avatar-string");
    }
}
