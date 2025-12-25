package element;

public class WebElement {

    public void click() {
        System.out.println("Clicking element");
    }

    public void sendKeys(String value) {
        System.out.println("Entering text: " + value);
    }

    public void clear() {
        System.out.println("Clearing text");
    }

    public String getText() {
        return "Dummy Text";
    }

    public boolean isDisplayed() {
        return true;
    }

    public boolean isEnabled() {
        return true;
    }

    public boolean isSelected() {
        return false;
    }
}