package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Objects;

public class ProductsPage extends BasePage {

    // Constructor
    public ProductsPage(WebDriver driver, WebDriverWait wait) {
        super(driver,wait);
    }


    /*----- SELECTORS -----*/
    public static final By H1 = By.cssSelector(".h1");
    public static final By FILTER_BLOCK = By.cssSelector("#js-active-search-filters .filter-block:first-of-type");
    public static final By WOMEN_LINK = By.cssSelector("[href=\"http://3.11.77.136/index.php?id_category=3&controller=category\"]");
    public static final By TOPS_LINK = By.xpath("//a[contains(text(),\"Tops\")][not(@rel=\"nofollow\")]");
    public static final By TSHIRTS_LINK = By.cssSelector("[href=\"http://3.11.77.136/index.php?id_category=5&controller=category\"]:not([class=dropdown-item])");
    public static final By BLOUSES_LINK = By.cssSelector("[href=\"http://3.11.77.136/index.php?id_category=7&controller=category\"]:not([class=dropdown-item])");
    public static final By DRESSES_LINK = By.xpath("//a[starts-with(text(),\"Dresses\")]");
    public static final By CASUAL_DRESSES_LINK = By.cssSelector("[href=\"http://3.11.77.136/index.php?id_category=9&controller=category\"]:not([class=dropdown-item])");
    public static final By EVENING_DRESSES_LINK = By.cssSelector("[href=\"http://3.11.77.136/index.php?id_category=10&controller=category\"]:not([class=dropdown-item])");
    public static final By SUMMER_DRESSES_LINK = By.cssSelector("[href=\"http://3.11.77.136/index.php?id_category=11&controller=category\"]:not([class=dropdown-item])");
    public static final By S_LINK = By.cssSelector("[href=\"http://3.11.77.136/index.php?controller=category&id_category=2&q=Size-S\"]");
    public static final By M_LINK = By.cssSelector("[href=\"http://3.11.77.136/index.php?controller=category&id_category=2&q=Size-M\"]");
    public static final By L_LINK = By.cssSelector("[href=\"http://3.11.77.136/index.php?controller=category&id_category=2&q=Size-L\"]");
    public static final By BEIGE_LINK = By.cssSelector("a[href*='Color-Beige']");
    public static final By WHITE_LINK = By.cssSelector("a[href*='Color-White']");
    public static final By BLACK_LINK = By.cssSelector("a[href*='Color-Black']");
    public static final By ORANGE_LINK = By.cssSelector("a[href*='Color-Orange']");
    public static final By BLUE_LINK = By.cssSelector("a[href*='Color-Blue']");
    public static final By GREEN_LINK = By.cssSelector("a[href*='Color-Green']");
    public static final By YELLOW_LINK = By.cssSelector("a[href*='Color-Yellow']");
    public static final By PINK_LINK = By.cssSelector("a[href*='Color-Pink']");
    public static final By COTTON_LINK = By.cssSelector("a[href*='Compositions-Cotton']");
    public static final By POLYESTER_LINK = By.cssSelector("a[href*='Compositions-Polyester']");
    public static final By VISCOSE_LINK = By.cssSelector("a[href*='Compositions-Viscose']");
    public static final By CASUAL_LINK = By.cssSelector("a[href*='Styles-Casual']");
    public static final By DRESSY_LINK = By.cssSelector("a[href*='Styles-Dressy']");
    public static final By GIRLY_LINK = By.cssSelector("a[href*='Styles-Girly']");
    private static final By COLORFUL_DRESS_LINK = By.cssSelector("a[href*='Properties-Colorful+Dress']");
    private static final By MAXI_DRESS_LINK = By.cssSelector("a[href*='Properties-Maxi+Dress']");
    private static final By MIDI_DRESS_LINK = By.cssSelector("a[href*='Properties-Midi+Dress']");
    private static final By SHORT_DRESS_LINK = By.cssSelector("a[href*='Properties-Short+Dress']");
    private static final By SHORT_SLEEVE_LINK = By.cssSelector("a[href*='Properties-Short+Sleeve']");
    private static final By PRICE_1_LINK = By.cssSelector("a[href*='Price-%24-16-17']");
    private static final By PRICE_2_LINK = By.cssSelector("a[href*='Price-%24-25-32']");
    private static final By PRICE_3_LINK = By.cssSelector("a[href*='Price-%24-50-53']");


    /*----- METHODS -----*/

    // Method to get the text of the H1 element.
    public String getH1() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(H1)).getText();
    }

    // Method to click an element specified by a selector.
    public void click(By selector) {
        waitAndClick(selector);
    }

    // Method to toggle a filter based on its name.
    public void toggleFilter(String filter) {
        if (Objects.equals(filter, "S")) {
            waitAndClick(S_LINK);
        } else if (Objects.equals(filter, "M")) {
            waitAndClick(M_LINK);
        } else if (Objects.equals(filter, "L")) {
            waitAndClick(L_LINK);
        } else if (Objects.equals(filter, "Beige")) {
            waitAndClick(BEIGE_LINK);
        } else if (Objects.equals(filter, "White")) {
            waitAndClick(WHITE_LINK);
        } else if (Objects.equals(filter, "Black")) {
            waitAndClick(BLACK_LINK);
        } else if (Objects.equals(filter, "Orange")) {
            waitAndClick(ORANGE_LINK);
        } else if (Objects.equals(filter, "Blue")) {
            waitAndClick(BLUE_LINK);
        } else if (Objects.equals(filter, "Green")) {
            waitAndClick(GREEN_LINK);
        } else if (Objects.equals(filter, "Yellow")) {
            waitAndClick(YELLOW_LINK);
        } else if (Objects.equals(filter, "Pink")) {
            waitAndClick(PINK_LINK);
        } else if (Objects.equals(filter, "Cotton")) {
            waitAndClick(COTTON_LINK);
        } else if (Objects.equals(filter, "Polyester")) {
            waitAndClick(POLYESTER_LINK);
        } else if (Objects.equals(filter, "Viscose")) {
            waitAndClick(VISCOSE_LINK);
        } else if (Objects.equals(filter, "Casual")) {
            waitAndClick(CASUAL_LINK);
        } else if (Objects.equals(filter, "Dressy")) {
            waitAndClick(DRESSY_LINK);
        } else if (Objects.equals(filter, "Girly")) {
            waitAndClick(GIRLY_LINK);
        } else if (Objects.equals(filter, "Colorful Dress")) {
            waitAndClick(COLORFUL_DRESS_LINK);
        } else if (Objects.equals(filter, "Maxi Dress")) {
            waitAndClick(MAXI_DRESS_LINK);
        } else if (Objects.equals(filter, "Midi Dress")) {
            waitAndClick(MIDI_DRESS_LINK);
        } else if (Objects.equals(filter, "Short Dress")) {
            waitAndClick(SHORT_DRESS_LINK);
        } else if (Objects.equals(filter, "Short Sleeve")) {
            waitAndClick(SHORT_SLEEVE_LINK);
        } else if (Objects.equals(filter, "$16.00 - $17.00")) {
            waitAndClick(PRICE_1_LINK);
        } else if (Objects.equals(filter, "$25.00 - $32.00")) {
            waitAndClick(PRICE_2_LINK);
        } else if (Objects.equals(filter, "$50.00 - $53.00")) {
            waitAndClick(PRICE_3_LINK);
        }
    }

    // Method to get the displayed text of a filter block.
    public String getDisplayedFilter(By block) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(block)).getText();
    }

    // Method to check for the presence of a filter based on its name.
    public void checkForFilter(String filter) {
        // asserting size filters
        if (Objects.equals(filter, "S") || Objects.equals(filter, "M") || Objects.equals(filter, "L")) {
            Assert.assertEquals(("Size: " + filter + "\n\uE5CD"), getDisplayedFilter(FILTER_BLOCK));

            // asserting color filters
        } else if (Objects.equals(filter, "Beige") || Objects.equals(filter, "White") || Objects.equals(filter, "Black") || Objects.equals(filter, "Orange") || Objects.equals(filter, "Blue") || Objects.equals(filter, "Green") || Objects.equals(filter, "Yellow") || Objects.equals(filter, "Pink")) {
            Assert.assertEquals(("Color: " + filter + "\n\uE5CD"), getDisplayedFilter(FILTER_BLOCK));

            // asserting compositions filters
        } else if (Objects.equals(filter, "Cotton") || Objects.equals(filter, "Polyester") || Objects.equals(filter, "Viscose")) {
            Assert.assertEquals(("Compositions: " + filter + "\n\uE5CD"), getDisplayedFilter(FILTER_BLOCK));

            // asserting styles filters
        } else if (Objects.equals(filter, "Casual") || Objects.equals(filter, "Dressy") || Objects.equals(filter, "Girly")) {
            Assert.assertEquals(("Styles: " + filter + "\n\uE5CD"), getDisplayedFilter(FILTER_BLOCK));
        } else if (Objects.equals(filter, "Colorful Dress") || Objects.equals(filter, "Maxi Dress") || Objects.equals(filter, "Midi Dress") || Objects.equals(filter, "Short Dress") || Objects.equals(filter, "Short Sleeve")) {
            Assert.assertEquals(("Properties: " + filter + "\n\uE5CD"), getDisplayedFilter(FILTER_BLOCK));
        } else {
            Assert.assertEquals(("Price: " + filter + "\n\uE5CD"), getDisplayedFilter(FILTER_BLOCK));
        }
    }
}

