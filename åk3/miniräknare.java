import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class miniräknare extends Application implements EventHandler<ActionEvent> {
	GridPane gridPane = new GridPane();
	Button likamed = new Button("=");
	Button delete = new Button("C");
	int num1;
	int num2;
	Pig myPig; 
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
	    myPig = new Pig(); // Create a Pig object
	    myPig.knappar();
		knapparPlats();

		gridPane.setTranslateY(30);
		gridPane.setTranslateX(-150);
		likamed.setTranslateX(-145);
		likamed.setTranslateY(130);
		delete.setTranslateY(29);
		delete.setTranslateX(-170);
		myPig.field.setEditable(false);

		likamed.setOnAction(this);
		delete.setOnAction(this);
		
		// gör så att det bara kan skrivas nummer i den
		/*
		 * field.textProperty().addListener(new ChangeListener<String>() { public void
		 * changed(ObservableValue<? extends String> observable, String oldValue, String
		 * newValue) { if (!newValue.matches("\\d*")) {
		 * field.setText(newValue.replaceAll("[^\\d]", "")); } } });
		 */
		
		primaryStage.setTitle("calculator");
		HBox box = new HBox(myPig.field, gridPane, likamed, delete);
		Scene scene = new Scene(box, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void knapparPlats() {
		int buttonPlats = 0;
		for (int rad = 0; rad < 5; rad++) {
			for (int column = 0; column < 3; column++) {
				gridPane.add(myPig.knapparna.get(buttonPlats), column, rad);
				buttonPlats++;
				if (buttonPlats == myPig.knapparna.size())
					break;
			}
		}
	}

	public double cal() {
		String express = myPig.field.textProperty().get();
		double summa = 0;
		if (express.contains("+")) {
			String[] talen = express.split("\\+");
			double tal1 = Double.parseDouble(talen[0]);
			double tal2 = Double.parseDouble(talen[1]);
			 summa = tal1 + tal2;
		} 
		else if (express.contains("-")) {

			String[] talen = express.split("\\-");
			double tal1 = Double.parseDouble(talen[0]);
			double tal2 = Double.parseDouble(talen[1]);
			 summa = tal1 - tal2;
		}
		else if (express.contains("*")) {

			String[] talen = express.split("\\*");
			double tal1 = Double.parseDouble(talen[0]);
			double tal2 = Double.parseDouble(talen[1]);
			 summa = tal1 * tal2;
		}
		else if (express.contains("/")) {

			String[] talen = express.split("\\/");
			double tal1 = Double.parseDouble(talen[0]);
			double tal2 = Double.parseDouble(talen[1]);
			 summa = tal1 / tal2;
		} 
		
		 return summa;
	}

	@Override
	public void handle(ActionEvent event) {
		if(event.getSource() == likamed)
		{
			myPig.field.textProperty().set(cal()+"");
		}
		if(event.getSource() == delete) {
			myPig.field.textProperty().set("");
		}
	}
}