package locator;

public class By {

    private String locator;

    private By(String locator) {
        this.locator = locator;
    }

    public static By id(String id) {
        return new By("ID: " + id);
    }

    public static By name(String name) {
        return new By("NAME: " + name);
    }

    public static By xpath(String xpath) {
        return new By("XPATH: " + xpath);
    }

    public String getLocator() {
        return locator;
    }
}