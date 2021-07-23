package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {
	@FXML private Button _btnOk; 
	@FXML private Button _btnCancel;
	
	@FXML private void initialize() {
		_btnOk.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				okClicked();
			}
		});
		
		_btnCancel.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				cancelClicked();
			}
		});
		
	}
	
	private void okClicked() {
		System.out.println("Ok button was clicked!");
	}
	
	private void cancelClicked() {
		System.out.println("Cancel button was clicked!");
	}
	
}
