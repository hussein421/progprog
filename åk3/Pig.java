import java.util.ArrayList;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

// Subclass (inherit from Animal)
class Pig extends Animal {
	public ArrayList<Button> knapparna;
	public TextField field;
	
	public Pig(){
		field = new TextField();
		knapparna = new ArrayList<Button>();
	}
	
	@Override
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
    

}