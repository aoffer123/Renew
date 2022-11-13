package com.example.renew;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        BorderPane BPane = new BorderPane();

        BPane.setCenter(addGridPane());
        HBox hbox = addHBox();
        BPane.setTop(hbox);
        addStackPane(hbox);

        Scene scene = new Scene(BPane, 490, 600);
        
        stage.setScene(scene);
        stage.setTitle("Renew");
        stage.show();

    }
     


    public HBox addHBox() {
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(5, 5, 5, 5));
        hbox.setSpacing(10);
        hbox.setStyle("-fx-background-color: #c9df8a;");


        Text title = new Text("Renew");
        title.setFont((Font.font("Times New Roman", FontWeight.BOLD, 24)));
        
        

        hbox.getChildren().add(title);

        return hbox;

        
    }

    private void addStackPane(HBox hb) {
 
        StackPane stack = new StackPane();
        Rectangle helpIcon = new Rectangle(30.0, 25.0);
        helpIcon.setFill(new LinearGradient(0,0,0,1, true, CycleMethod.NO_CYCLE,
            new Stop[]{
            new Stop(0,Color.web("#999999")),
            new Stop(0.5, Color.web("#bcbcbc")),
            new Stop(1,Color.web("#eeeeee")),}));
        helpIcon.setStroke(Color.web("#f3f6f4"));
        helpIcon.setArcHeight(3.5);
        helpIcon.setArcWidth(3.5);
        
        Text helpText = new Text("?");
        helpText.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        helpText.setFill(Color.WHITE);
        
        
        stack.getChildren().addAll(helpIcon, helpText);
        stack.setAlignment(Pos.CENTER_RIGHT);
        
        StackPane.setMargin(helpText, new Insets(0, 10, 0, 0));
        
        hb.getChildren().add(stack);
        HBox.setHgrow(stack, Priority.ALWAYS);
                
    }

    public GridPane addGridPane() {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setStyle("-fx-background-color: #f0f7da;");
        
        Text yours = new Text();
        yours.setFont((Font.font("Times New Roman", FontWeight.BOLD, 11)));

        Text monday = new Text("M");
        monday.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        grid.add(monday, 1, 0);

        Text tuesday = new Text("T");
        tuesday.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        grid.add(tuesday, 2, 0);


        Text wednesday = new Text("W");
        wednesday.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        grid.add(wednesday, 3, 0);


        Text thurday = new Text("T");
        thurday.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        grid.add(thurday, 4, 0);

        Text friday = new Text("F");
        friday.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        grid.add(friday, 5, 0);

        Text saturday = new Text("S");
        saturday.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        grid.add(saturday, 6, 0);

        Text sunday = new Text("S");
        sunday.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        grid.add(sunday, 7, 0);


        
        

        Button button2 = new Button("Add a Habit...");
        button2.setPrefSize(100, 20);
        button2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        grid.add(button2, 0, 2);

        Button button3 = new Button("Add a Habit...");
        button3.setPrefSize(100, 20);
        button3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        grid.add(button3, 0, 3);

        Button button4 = new Button("Add a Habit...");
        button4.setPrefSize(100, 20);
        button4.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        grid.add(button4, 0, 4);

        Button button5 = new Button("Add a Habit...");
        button5.setPrefSize(100, 20);
        button5.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        grid.add(button5, 0, 5);

        Button button6 = new Button("Add a Habit...");
        button6.setPrefSize(100, 20);
        button6.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        
        grid.add(button6, 0, 6);

        Button button7 = new Button("Add a Habit...");
        button7.setPrefSize(100, 20);
        button7.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        grid.add(button7, 0, 7);

        Button button8 = new Button("Add a Habit...");
        button8.setPrefSize(100, 20);
        button8.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        grid.add(button8, 0, 8);

        Button button9 = new Button("Add a Habit...");
        button9.setPrefSize(100, 20);
        button9.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        grid.add(button9, 0, 9);

        Button button10 = new Button("Add a Habit...");
        button10.setPrefSize(100, 20);
        button10.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        grid.add(button10, 0, 10);

        Button button11 = new Button("Add a Habit...");
        button11.setPrefSize(100, 20);
        button11.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        grid.add(button11, 0, 11);

        Button button12 = new Button("Add a Habit...");
        button12.setPrefSize(100, 20);
        button12.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        grid.add(button12, 0, 12);

        Button button13 = new Button("Add a Habit...");
        button13.setPrefSize(100, 20);
        button13.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        grid.add(button13, 0, 13);

        CheckBox cb11 = new CheckBox();
        grid.add(cb11, 1, 2);

        CheckBox cb12 = new CheckBox();
        grid.add(cb12, 2, 2);

        CheckBox cb13 = new CheckBox();
        grid.add(cb13, 3, 2);

        CheckBox cb14 = new CheckBox();
        grid.add(cb14, 4, 2);

        CheckBox cb15 = new CheckBox();
        grid.add(cb15, 5, 2);

        CheckBox cb16 = new CheckBox();
        grid.add(cb16, 6, 2);

        CheckBox cb17 = new CheckBox();
        grid.add(cb17, 7, 2);

        CheckBox cb21 = new CheckBox();
        grid.add(cb21, 1, 3);

        CheckBox cb22 = new CheckBox();
        grid.add(cb22, 2, 3);

        CheckBox cb23 = new CheckBox();
        grid.add(cb23, 3, 3);

        CheckBox cb24 = new CheckBox();
        grid.add(cb24, 4, 3);

        CheckBox cb25 = new CheckBox();
        grid.add(cb25, 5, 3);

        CheckBox cb26 = new CheckBox();
        grid.add(cb26, 6, 3);

        CheckBox cb27 = new CheckBox();
        grid.add(cb27, 7, 3);

        CheckBox cb31 = new CheckBox();
        grid.add(cb31, 1, 4);

        CheckBox cb32 = new CheckBox();
        grid.add(cb32, 2, 4);

        CheckBox cb33 = new CheckBox();
        grid.add(cb33, 3, 4);

        CheckBox cb34 = new CheckBox();
        grid.add(cb34, 4, 4);

        CheckBox cb35 = new CheckBox();
        grid.add(cb35, 5, 4);

        CheckBox cb36 = new CheckBox();
        grid.add(cb36, 6, 4);

        CheckBox cb37 = new CheckBox();
        grid.add(cb37, 7, 4);

        CheckBox cb41 = new CheckBox();
        grid.add(cb41, 1, 5);

        CheckBox cb42 = new CheckBox();
        grid.add(cb42, 2, 5);

        CheckBox cb43 = new CheckBox();
        grid.add(cb43, 3, 5);

        CheckBox cb44 = new CheckBox();
        grid.add(cb44, 4, 5);

        CheckBox cb45 = new CheckBox();
        grid.add(cb45, 5, 5);

        CheckBox cb46 = new CheckBox();
        grid.add(cb46, 6, 5);

        CheckBox cb47 = new CheckBox();
        grid.add(cb47, 7, 5);

        CheckBox cb51 = new CheckBox();
        grid.add(cb51, 1, 6);

        CheckBox cb52 = new CheckBox();
        grid.add(cb52, 2, 6);

        CheckBox cb53 = new CheckBox();
        grid.add(cb53, 3, 6);

        CheckBox cb54 = new CheckBox();
        grid.add(cb54, 4, 6);

        CheckBox cb55 = new CheckBox();
        grid.add(cb55, 5, 6);

        CheckBox cb56 = new CheckBox();
        grid.add(cb56, 6, 6);

        CheckBox cb57 = new CheckBox();
        grid.add(cb57, 7, 6);

        CheckBox cb61 = new CheckBox();
        grid.add(cb61, 1, 7);

        CheckBox cb62 = new CheckBox();
        grid.add(cb62, 2, 7);

        CheckBox cb63 = new CheckBox();
        grid.add(cb63, 3, 7);

        CheckBox cb64 = new CheckBox();
        grid.add(cb64, 4, 7);

        CheckBox cb65 = new CheckBox();
        grid.add(cb65, 5, 7);

        CheckBox cb66 = new CheckBox();
        grid.add(cb66, 6, 7);

        CheckBox cb67 = new CheckBox();
        grid.add(cb67, 7, 7);

        CheckBox cb71 = new CheckBox();
        grid.add(cb71, 1, 8);

        CheckBox cb72 = new CheckBox();
        grid.add(cb72, 2, 8);

        CheckBox cb73 = new CheckBox();
        grid.add(cb73, 3, 8);

        CheckBox cb74 = new CheckBox();
        grid.add(cb74, 4, 8);

        CheckBox cb75 = new CheckBox();
        grid.add(cb75, 5, 8);

        CheckBox cb76 = new CheckBox();
        grid.add(cb76, 6, 8);

        CheckBox cb77 = new CheckBox();
        grid.add(cb77, 7, 8);

        CheckBox cb81 = new CheckBox();
        grid.add(cb81, 1, 9);

        CheckBox cb82 = new CheckBox();
        grid.add(cb82, 2, 9);

        CheckBox cb83 = new CheckBox();
        grid.add(cb83, 3, 9);

        CheckBox cb84 = new CheckBox();
        grid.add(cb84, 4, 9);

        CheckBox cb85 = new CheckBox();
        grid.add(cb85, 5, 9);

        CheckBox cb86 = new CheckBox();
        grid.add(cb86, 6, 9);

        CheckBox cb87 = new CheckBox();
        grid.add(cb87, 7, 9);

        CheckBox cb91 = new CheckBox();
        grid.add(cb91, 1, 10);

        CheckBox cb92 = new CheckBox();
        grid.add(cb92, 2, 10);

        CheckBox cb93 = new CheckBox();
        grid.add(cb93, 3, 10);

        CheckBox cb94 = new CheckBox();
        grid.add(cb94, 4, 10);

        CheckBox cb95 = new CheckBox();
        grid.add(cb95, 5, 10);

        CheckBox cb96 = new CheckBox();
        grid.add(cb96, 6, 10);

        CheckBox cb97 = new CheckBox();
        grid.add(cb97, 7, 10);

        CheckBox cb101 = new CheckBox();
        grid.add(cb101, 1, 11);

        CheckBox cb102 = new CheckBox();
        grid.add(cb102, 2, 11);

        CheckBox cb103 = new CheckBox();
        grid.add(cb103, 3, 11);

        CheckBox cb104 = new CheckBox();
        grid.add(cb104, 4, 11);

        CheckBox cb105 = new CheckBox();
        grid.add(cb105, 5, 11);

        CheckBox cb106 = new CheckBox();
        grid.add(cb106, 6, 11);

        CheckBox cb107 = new CheckBox();
        grid.add(cb107, 7, 11);

        CheckBox cb111 = new CheckBox();
        grid.add(cb111, 1, 12);

        CheckBox cb112 = new CheckBox();
        grid.add(cb112, 2, 12);

        CheckBox cb113 = new CheckBox();
        grid.add(cb113, 3, 12);

        CheckBox cb114 = new CheckBox();
        grid.add(cb114, 4, 12);

        CheckBox cb115 = new CheckBox();
        grid.add(cb115, 5, 12);

        CheckBox cb116 = new CheckBox();
        grid.add(cb116, 6, 12);

        CheckBox cb117 = new CheckBox();
        grid.add(cb117, 7, 12);

        CheckBox cb121 = new CheckBox();
        grid.add(cb121, 1, 13);

        CheckBox cb122 = new CheckBox();
        grid.add(cb122, 2, 13);

        CheckBox cb123 = new CheckBox();
        grid.add(cb123, 3, 13);

        CheckBox cb124 = new CheckBox();
        grid.add(cb124, 4, 13);

        CheckBox cb125 = new CheckBox();
        grid.add(cb125, 5, 13);

        CheckBox cb126 = new CheckBox();
        grid.add(cb126, 6, 13);

        CheckBox cb127 = new CheckBox();
        grid.add(cb127, 7, 13);

        button2.setStyle("-fx-background-color: #77ab59; -fx-text-fill: #111111");
        button3.setStyle("-fx-background-color: 		#77ab59");
        button4.setStyle("-fx-background-color: 		#77ab59");
        button5.setStyle("-fx-background-color: 		#77ab59");
        button6.setStyle("-fx-background-color: 		#77ab59");
        button7.setStyle("-fx-background-color: 		#77ab59");
        button8.setStyle("-fx-background-color: 		#77ab59");
        button9.setStyle("-fx-background-color: 		#77ab59");
        button10.setStyle("-fx-background-color: 		#77ab59");
        button11.setStyle("-fx-background-color: 		#77ab59");
        button12.setStyle("-fx-background-color: 		#77ab59");
        button13.setStyle("-fx-background-color: 		#77ab59");

        return grid;

    }

    

}


