import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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

public class miniräknare extends Application implements EventHandler<ActionEvent> {
	ArrayList<Button> knapparna = new ArrayList<Button>();
	TextField field = new TextField();
	GridPane gridPane = new GridPane();
	Button likamed = new Button("=");
	Button delete = new Button("C");
	int num1;
	int num2;
	

	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		
		knappar();
		knapparPlats();

		gridPane.setTranslateY(30);
		gridPane.setTranslateX(-150);
		likamed.setTranslateX(-145);
		likamed.setTranslateY(130);
		delete.setTranslateY(29);
		delete.setTranslateX(-170);
		field.setEditable(false);

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
		HBox box = new HBox(field, gridPane, likamed, delete);
		Scene scene = new Scene(box, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void knapparPlats() {
		int buttonPlats = 0;
		for (int rad = 0; rad < 5; rad++) {
			for (int column = 0; column < 3; column++) {
				gridPane.add(knapparna.get(buttonPlats), column, rad);
				buttonPlats++;
				if (buttonPlats == knapparna.size())
					break;
			}
		}
	}

	public void grid() {

	}

	public void knappar() {
		char[] karaktärer = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '-', '*', '/', '.'};

		for (char key : karaktärer) {
			String keyText = key + "";
			Button tempButton = new Button(keyText);
			tempButton.setId(keyText);
			tempButton.setOnAction(event -> {
				field.textProperty().set(field.textProperty().get() + keyText);
			});
			knapparna.add(tempButton);
		}
	}

	public double cal() {
		String express = field.textProperty().get();
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
			field.textProperty().set(cal()+"");
		}
		if(event.getSource() == delete) {
			field.textProperty().set("");
		}
	}
}