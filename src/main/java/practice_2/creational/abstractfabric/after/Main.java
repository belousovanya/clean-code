package practice_2.creational.abstractfabric.after;

public class Main {
    public static void main(String[] args) {
        GUIFactory guiFactory;

        String osType = "MacOS";

        if ("Windows".equals(osType)) {
            guiFactory = new WindowsFactory();
        } else {
            guiFactory = new MacOsFactory();
        }

        guiFactory.createButton().paint();
        guiFactory.createCheckbox().paint();
    }
}
