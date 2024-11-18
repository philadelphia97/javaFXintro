package javafxv1;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
/*
 * author: phil hess
 */
public class javaFXv1 extends Application {
	//neccesary text boxes
	private TextField aText,bText ;
	private Label resultLabel;

	public static void main(String[] args) {
		Launch(args);

	}//end main		
	
	public void start(Stage stage) {
		//setting up two input box3s
		
		aText = new TextField("0.00");
		bText = new TextField("0.00");
		//laying down botht eh text fields and both there labels
		HBox aPane = new HBox(new Label("a : "), aText);
		HBox bPane = new HBox(new Label("b : "), bText);
		//lets add a button and code the related events
		Button add = new Button("Add");
		//lets format and position the element
		add.setOnAction(e -> performAddition('+'));
		HBox buttonPane = new HBox(add);
		//lets format this button within it's HBox
		HBox.setHgrow(add, Priority.ALWAYS);
		add.setMaxWidth(Double.POSITIVE_INFINITY );
		resultLabel = new Label("a + b = 0.0");
		resultLabel.setTextFill(Color.PURPLE);
		resultLabel.setStyle("-fx-font-weight:bold");
		resultLabel.setAlignment(Pos.CENTER);
		resultLabel.setMaxWidth(Double.POSITIVE_INFINITY);
		VBox coreBox = new VBox(20, aPane, bPane, buttonPane, resultLabel);
		coreBox.setPadding(new Insets(15,8,15,8));
		coreBox.setStyle("-fx-border-color: black); -fx-border-width:4px");
		Scene scene = new Scene(coreBox);//creat4  core box and put everything in it
		stage.setScene(Addscene);
		stage.setTitle("ADDITION");
		stage.setResizable(false);
		
}//end start
	
	private void performAddition(char opChar)
	{
		double a = 0.0;
		double b = 0.0;
		
		try {
			String aStr = aText.getText();
			//this is your own validation not the current exception handling
			a = Double.parseDouble(aStr);
		}// end try
		catch(NumberFormatException e)
		resultLabel.setText("invalid data enteredc for a!"){
			
		}
		
	}
	

}//end class addition GUI	
