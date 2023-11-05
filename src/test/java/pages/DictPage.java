package pages;

import config.Project;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class DictPage extends BasePage {
    @Step("Открыть страницу входа в систему")
    public static DictPage openPage() {
        open(Project.config.baseUrl() + "dict/");
        return new DictPage();
    }
}

