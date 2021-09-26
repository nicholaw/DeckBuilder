package dominion;

import gameUtils.StartMenu;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class Controller {
    private BorderPane contentPane;

    public Controller() {
        contentPane = new BorderPane();
        contentPane.setCenter(new StartMenu(this));
    }//constructor

    public Pane getContentPane() {
        return contentPane;
    }
}//Controller
