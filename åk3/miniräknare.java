import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView.EditEvent;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.util.ArrayList; 

public class minir�knare extends Application implements EventHandler<ActionEvent>{
	ArrayList<Button> knapparna = new ArrayList<Button>();
	TextField field = new TextField();	
	GridPane gridPane = new GridPane();  
	Button likamed = new Button("=");
	
	
	
	
	public static void main(String[] args) {
	
		launch(args);
	}

	@Override
	public void start(Stage primaryStage){
		
		knappar();
		knapparPlats();
		
		
		
		gridPane.setTranslateY(30);
		gridPane.setTranslateX(-150);
		likamed.setTranslateX(-130);
		likamed.setTranslateY(140);
		
		
		primaryStage.setTitle("calculator");
		HBox box = new HBox(field,gridPane,likamed);
		  
		Scene scene = new Scene(box, 300, 300);
        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
            	baraNummerIText(event);
            }
        });		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	public void knapparPlats() {
		int buttonPlats = 0;
		for(int rad = 0; rad <5; rad++) {
			for(int column = 0; column < 3; column++) {
				gridPane.add(knapparna.get(buttonPlats), column, rad);
				buttonPlats++;
				if(buttonPlats == knapparna.size())
					break;
			}
		}
	}
	public void grid() {
		
	}
	public void knappar(){
		char[] karakt�rer = new char[] {
			'0', '1','2','3','4','5','6','7','8','9','+','-','X','/',','
		};
		
		for(char key : karakt�rer) {
			String keyText = key + "";
			Button tempButton = new Button(keyText);
			tempButton.setId(keyText);
			tempButton.setOnAction(event ->{
				field.textProperty().set(field.textProperty().get()+keyText);
			});
			knapparna.add(tempButton);
		}
}
	public void baraNummerIText(KeyEvent event){
		String c = event.getCharacter();
		if(!(c.matches("[0-9]"))) {
		event.consume();
		}
		
		}

	@Override
	public void handle(ActionEvent arg0) {

	}
	}