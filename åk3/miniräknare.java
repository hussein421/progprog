import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.util.ArrayList; 

public class miniräknare extends Application implements EventHandler<ActionEvent>{
	ArrayList<Character> knapparna = new ArrayList<Character>();

	public static void main(String[] args) {
	
		launch(args);
	}

	@Override
	public void start(Stage primaryStage){
			

		
		
	}
	public void knappar(){
		knapparna.add('0');	knapparna.add('X');	knapparna.add('/');	knapparna.add('=');knapparna.add('-');knapparna.add('+');knapparna.add('9');
		knapparna.add('1');knapparna.add('8');knapparna.add('7');knapparna.add('6');knapparna.add('5');knapparna.add('4');knapparna.add('3');
		knapparna.add('2');
		
		
		
		
		
		
		
		
		
	
	
	
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	}