package alert;

public interface Alert {

    void accept();
    void dismiss();
    String getText();
}