package application;

import java.awt.TextField;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.plaf.ButtonUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
	import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

	public class Controlador {
		
		Process p = null;
		Runtime r = Runtime.getRuntime();

	    @FXML
	    private Button btnNavegar;

	    @FXML
	    private Button btnExcel;

	    @FXML
	    private Button btnWord;

	    @FXML
	    private Button btnExit;

	    @FXML
	    private Button btnPower;
	    
	    @FXML
	    private TextField btnDire;

	    
	    @FXML
	    void navegacion(ActionEvent event) {
//	    	String direccion = btnDire.getText().toString();
//	    	try {
//	    		Process navega = null;
//	    		
//				navega = r.exec("rundll32 url.dll,FileProtocolHandler" + direccion);
////	    		Runtime r = Runtime.getRuntime();
////	    		r.getRuntime().exec("rundll32 url.dll,FileProtocolHandler" + direccion.getText());
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				System.out.println("Error");
//			}
	    	
	    }

	    
		@FXML
		void power(ActionEvent event) {
			try {
				p = r.exec("C:\\Program Files (x86)\\Microsoft Office\\Office12\\powerpnt.exe");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		@FXML
		void excel(ActionEvent event) {
			try {
				p = r.exec("C:\\Program Files (x86)\\Microsoft Office\\Office12\\excel.exe");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		@FXML
		void word(ActionEvent event) {
			try {
				p = r.exec("C:\\Program Files (x86)\\Microsoft Office\\Office12\\winword.exe");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		@FXML
		void cerrar(ActionEvent event) {
			Stage stage = (Stage) btnExit.getScene().getWindow();
			stage.close();
		}
		
	
	    
	   
	}


