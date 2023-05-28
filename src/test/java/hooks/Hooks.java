package hooks;
import io.cucumber.java.Before;
import static com.codeborne.selenide.Selenide.open;

public class Hooks {
    private static final String BASE_URL = "https://RomaKuznetsov.github.com";
    @Before
    public static void openBrowser() {
        open(BASE_URL);
    }
}
