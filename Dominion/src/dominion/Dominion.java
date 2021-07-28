package dominion;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Dominion extends Application {
    public void start(Stage stage) {
        Controller controller = new Controller();
        Scene scene = new Scene(controller.getContentPane());
        stage.setScene(scene);
        stage.setTitle("Dominion");
        stage.show();
    }

    /**
     * Spins for at least the given delay.
     * @param delay -delay in ms
     */
    private static void spin(int delay) {
        var time = System.currentTimeMillis();
        while(System.currentTimeMillis() < (time + delay))
            continue;
    }//delay

    /**
     * Launches the application.
     * @param args
     */
    public static void main(String [] args) {
        launch(args);
    }//main
}//Dominion
