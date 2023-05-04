import Data.DataReader;
import UI.LoginFrame;

public class Application {
    public static void main(String[] args) {
        DataReader.readAll();
        new LoginFrame();
    }
}
