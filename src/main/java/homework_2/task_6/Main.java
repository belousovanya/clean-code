package homework_2.task_6;

public class Main {
    public static void main(String[] args) {
        GUIFactory guiFactory;

        String platform = "Mac";

        if ("Mac".equals(platform)) {
            guiFactory = new MacFactory();
        } else {
            guiFactory = new WindowsFactory();
        }

        guiFactory.createButton().click();
        guiFactory.createMenu().launch();
        guiFactory.createWindow().draw();
    }
}
