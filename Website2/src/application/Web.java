package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class Web extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@SuppressWarnings("unused")
	public void start(Stage primaryStage) throws Exception{
		
		WebView webView = new WebView();
		WebEngine webEngine = webView.getEngine();
		
		BorderPane pane = new BorderPane();
		MenuBar menu = new MenuBar();
		Separator separator = new Separator();
		VBox cent = new VBox();
		
		
		//Menu Items
		final Menu about = new Menu("About Us");
		RadioMenuItem history = new RadioMenuItem("History");
		RadioMenuItem faq = new RadioMenuItem("FAQs");
		about.getItems().addAll(history, faq);
		
		final Menu products = new Menu("Products");
		//Make label for torque products to put into Prodcuts Menu
		Label tp = new Label("Torque Products");
		// RadioMenuItem torque = new RadioMenuItem("Torque Products");
		RadioMenuItem tam = new RadioMenuItem("Torque and Angle Meters");
		RadioMenuItem taw = new RadioMenuItem("Torque and Angle Wrenches");
		RadioMenuItem ta = new RadioMenuItem("Torque Meters");
		RadioMenuItem tmp = new RadioMenuItem("Torque Multipliers");
		RadioMenuItem tt = new RadioMenuItem("Torque Testers");
		RadioMenuItem tw = new RadioMenuItem("Torque Wrenches");
		products.getItems().addAll(tam, taw, ta, tmp, tt, tw);
		
		menu.getMenus().addAll(about, products);
		
		
		//Working on view of website
		cent.setAlignment(Pos.TOP_CENTER);
		ScrollPane scroll = new ScrollPane();
		
		
		
		
		
		//Import logo
		
		//setting stage/scene
		Scene scene = new Scene(menu);
		primaryStage.setTitle("DigitoolSolutions");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		
	}

}
