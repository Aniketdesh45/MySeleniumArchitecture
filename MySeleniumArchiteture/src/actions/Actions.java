package actions;

import element.WebElement;

public class Actions {

    public Actions moveToElement(WebElement element) {
        System.out.println("Mouse hover on element");
        return this;
    }

    public Actions contextClick() {
        System.out.println("Right click");
        return this;
    }

    public Actions doubleClick() {
        System.out.println("Double click");
        return this;
    }

    public void perform() {
        System.out.println("Performing actions");
    }
}