package dropdown;

import element.WebElement;

public class Select {

    WebElement element;

    public Select(WebElement element) {
        this.element = element;
    }

    public void selectByIndex(int index) {
        System.out.println("Selecting dropdown by index: " + index);
    }

    public void selectByValue(String value) {
        System.out.println("Selecting dropdown by value: " + value);
    }

    public void selectByVisibleText(String text) {
        System.out.println("Selecting dropdown by visible text: " + text);
    }
}