package com.example.renew;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;

import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javafx.scene.control.*;

public class MainOld extends Application {
    Stage primaryStage;
    Scene home, addAHabitScene, addAHabitScene2, addAHabitScene3, addAHabitScene4, addAHabitScene5, addAHabitScene6,
            addAHabitScene7, addAHabitScene8, addAHabitScene9, addAHabitScene10, addAHabitScene11, addAHabitScene12,
            statsScene1, statsScene2, statsScene3, statsScene4, statsScene5, statsScene6, statsScene7, statsScene8,
            statsScene9, statsScene10, statsScene11, statsScene12, statsScene13, timerScene;

    int countBoxes1;
    int countBoxes2;
    int countBoxes3;
    int countBoxes4;
    int countBoxes5;
    int countBoxes6;
    int countBoxes7;
    int countBoxes8;
    int countBoxes9;
    int countBoxes10;
    int countBoxes11;
    int countBoxes12;
    int countBoxes13;
    float statsPercent;
    float statsPercent2;
    float statsPercent3;
    float statsPercent4;
    float statsPercent5;
    float statsPercent6;
    float statsPercent7;
    float statsPercent8;
    float statsPercent9;
    float statsPercent10;
    float statsPercent11;
    float statsPercent12;
    float statsPercent13;

    public int cnt = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        StackPane stack = new StackPane();
        Text title = new Text("Renew");
        title.setFill(Color.web("#3A1F04"));
        title.setFont((Font.font("Cambria", FontWeight.BOLD, 28)));
        StackPane.setAlignment(title, Pos.CENTER_LEFT);
        Rectangle helpIcon = new Rectangle(30.0, 25.0);
        helpIcon.setFill(new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE,
                new Stop[] {
                        new Stop(0, Color.web("#999999")),
                        new Stop(0.5, Color.web("#bcbcbc")),
                        new Stop(1, Color.web("#eeeeee")), }));
        helpIcon.setStroke(Color.web("#f3f6f4"));
        helpIcon.setArcHeight(3.5);
        helpIcon.setArcWidth(3.5);

        Text helpText = new Text("?");
        helpText.setFont(Font.font("Cambria", FontWeight.BOLD, 16));
        helpText.setFill(Color.WHITE);

        stack.setStyle("-fx-background-color: #D2B48C;");

        stack.getChildren().addAll(title, helpIcon, helpText);
        stack.setAlignment(Pos.CENTER_RIGHT);

        StackPane.setMargin(helpText, new Insets(0, 10, 0, 0));
        StackPane.setMargin(title, new Insets(10, 10, 10, 10));

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setStyle("-fx-background-color: #EADDCA;");

        Text yours = new Text();
        yours.setFont((Font.font("Times New Roman", FontWeight.BOLD, 11)));
        grid.add(yours, 0, 0);

        Text monday = new Text("M");
        monday.setFill(Color.web("#3A1F04"));
        monday.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        grid.add(monday, 1, 0);

        Text tuesday = new Text("T");
        tuesday.setFill(Color.web("#3A1F04"));
        tuesday.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        grid.add(tuesday, 2, 0);

        Text wednesday = new Text("W");
        wednesday.setFill(Color.web("#3A1F04"));
        wednesday.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        grid.add(wednesday, 3, 0);

        Text thurday = new Text("T");
        thurday.setFill(Color.web("#3A1F04"));
        thurday.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        grid.add(thurday, 4, 0);

        Text friday = new Text("F");
        friday.setFill(Color.web("#3A1F04"));
        friday.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        grid.add(friday, 5, 0);

        Text saturday = new Text("S");
        saturday.setFill(Color.web("#3A1F04"));
        saturday.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        grid.add(saturday, 6, 0);

        Text sunday = new Text("S");
        sunday.setFill(Color.web("#3A1F04"));
        sunday.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        grid.add(sunday, 7, 0);

        Button button2 = new Button("Add A Habit...");
        button2.setFont(Font.font("Cambria", FontWeight.BOLD, 12));
        button2.setTextFill(Color.WHITE);
        grid.add(button2, 0, 2);
        button2.setOnAction(e -> primaryStage.setScene(addAHabitScene));

        Button button3 = new Button("Add A Habit...");
        button3.setFont(Font.font("Cambria", FontWeight.BOLD, 12));
        button3.setTextFill(Color.WHITE);
        grid.add(button3, 0, 3);
        button3.setOnAction(e -> primaryStage.setScene(addAHabitScene2));

        Button button4 = new Button("Add A Habit...");
        button4.setFont(Font.font("Cambria", FontWeight.BOLD, 12));
        button4.setTextFill(Color.WHITE);
        grid.add(button4, 0, 4);
        button4.setOnAction(e -> primaryStage.setScene(addAHabitScene3));

        Button button5 = new Button("Add A Habit...");
        button5.setFont(Font.font("Cambria", FontWeight.BOLD, 12));
        button5.setTextFill(Color.WHITE);
        grid.add(button5, 0, 5);
        button5.setOnAction(e -> primaryStage.setScene(addAHabitScene4));

        Button button6 = new Button("Add A Habit...");
        button6.setFont(Font.font("Cambria", FontWeight.BOLD, 12));
        button6.setTextFill(Color.WHITE);
        grid.add(button6, 0, 6);
        button6.setOnAction(e -> primaryStage.setScene(addAHabitScene5));

        Button button7 = new Button("Add A Habit...");
        button7.setFont(Font.font("Cambria", FontWeight.BOLD, 12));
        button7.setTextFill(Color.WHITE);
        grid.add(button7, 0, 7);
        button7.setOnAction(e -> primaryStage.setScene(addAHabitScene6));

        Button button8 = new Button("Add A Habit...");
        button8.setFont(Font.font("Cambria", FontWeight.BOLD, 12));
        button8.setTextFill(Color.WHITE);
        grid.add(button8, 0, 8);
        button8.setOnAction(e -> primaryStage.setScene(addAHabitScene7));

        Button button9 = new Button("Add A Habit...");
        button9.setFont(Font.font("Cambria", FontWeight.BOLD, 12));
        button9.setTextFill(Color.WHITE);
        grid.add(button9, 0, 9);
        button9.setOnAction(e -> primaryStage.setScene(addAHabitScene8));

        Button button10 = new Button("Add A Habit...");
        button10.setFont(Font.font("Cambria", FontWeight.BOLD, 12));
        button10.setTextFill(Color.WHITE);
        grid.add(button10, 0, 10);
        button10.setOnAction(e -> primaryStage.setScene(addAHabitScene9));

        Button button11 = new Button("Add A Habit...");
        button11.setFont(Font.font("Cambria", FontWeight.BOLD, 12));
        button11.setTextFill(Color.WHITE);
        grid.add(button11, 0, 11);
        button11.setOnAction(e -> primaryStage.setScene(addAHabitScene10));

        Button button12 = new Button("Add A Habit...");
        button12.setFont(Font.font("Cambria", FontWeight.BOLD, 12));
        button12.setTextFill(Color.WHITE);
        grid.add(button12, 0, 12);
        button12.setOnAction(e -> primaryStage.setScene(addAHabitScene11));

        Button button13 = new Button("Add A Habit...");
        button13.setFont(Font.font("Cambria", FontWeight.BOLD, 12));
        button13.setTextFill(Color.WHITE);
        grid.add(button13, 0, 13);
        button13.setOnAction(e -> primaryStage.setScene(addAHabitScene12));

        button2.setStyle("-fx-background-color: #B99976");
        button3.setStyle("-fx-background-color: #B99976");
        button4.setStyle("-fx-background-color: #B99976");
        button5.setStyle("-fx-background-color: #B99976");
        button6.setStyle("-fx-background-color: #B99976");
        button7.setStyle("-fx-background-color: #B99976");
        button8.setStyle("-fx-background-color: #B99976");
        button9.setStyle("-fx-background-color: #B99976");
        button10.setStyle("-fx-background-color: #B99976");
        button11.setStyle("-fx-background-color: #B99976");
        button12.setStyle("-fx-background-color: #B99976");
        button13.setStyle("-fx-background-color: #B99976");

        Button statsButton2 = new Button();
        statsButton2.setText("Statistics");
        statsButton2.setPrefSize(100, 15);
        statsButton2.setTextFill(Color.WHITE);
        statsButton2.setFont(Font.font("Cambria", FontWeight.BOLD, 13));
        grid.add(statsButton2, 10, 2);
        statsButton2.setOnAction(e -> primaryStage.setScene(statsScene1));

        Button statsButton3 = new Button();
        statsButton3.setText("Statistics");
        statsButton3.setPrefSize(100, 15);
        statsButton3.setTextFill(Color.WHITE);
        statsButton3.setFont(Font.font("Cambria", FontWeight.BOLD, 13));
        grid.add(statsButton3, 10, 3);
        statsButton3.setOnAction(e -> primaryStage.setScene(statsScene2));

        Button statsButton4 = new Button();
        statsButton4.setText("Statistics");
        statsButton4.setTextFill(Color.WHITE);
        statsButton4.setPrefSize(100, 15);
        statsButton4.setFont(Font.font("Cambria", FontWeight.BOLD, 12));
        grid.add(statsButton4, 10, 4);
        statsButton4.setOnAction(e -> primaryStage.setScene(statsScene3));

        Button statsButton5 = new Button();
        statsButton5.setText("Statistics");
        statsButton5.setPrefSize(100, 15);
        statsButton5.setTextFill(Color.WHITE);
        statsButton5.setFont(Font.font("Cambria", FontWeight.BOLD, 12));
        grid.add(statsButton5, 10, 5);
        statsButton5.setOnAction(e -> primaryStage.setScene(statsScene4));

        Button statsButton6 = new Button();
        statsButton6.setText("Statistics");
        statsButton6.setPrefSize(100, 15);
        statsButton6.setTextFill(Color.WHITE);
        statsButton6.setFont(Font.font("Cambria", FontWeight.BOLD, 12));
        grid.add(statsButton6, 10, 6);
        statsButton6.setOnAction(e -> primaryStage.setScene(statsScene5));

        Button statsButton7 = new Button();
        statsButton7.setText("Statistics");
        statsButton7.setTextFill(Color.WHITE);
        statsButton7.setPrefSize(100, 15);
        statsButton7.setFont(Font.font("Cambria", FontWeight.BOLD, 12));
        grid.add(statsButton7, 10, 7);
        statsButton7.setOnAction(e -> primaryStage.setScene(statsScene6));

        Button statsButton8 = new Button();
        statsButton8.setText("Statistics");
        statsButton8.setTextFill(Color.WHITE);
        statsButton8.setPrefSize(100, 15);
        statsButton8.setFont(Font.font("Cambria", FontWeight.BOLD, 12));
        grid.add(statsButton8, 10, 8);
        statsButton8.setOnAction(e -> primaryStage.setScene(statsScene7));

        Button statsButton9 = new Button();
        statsButton9.setText("Statistics");
        statsButton9.setPrefSize(100, 15);
        statsButton9.setTextFill(Color.WHITE);
        statsButton9.setFont(Font.font("Cambria", FontWeight.BOLD, 12));
        grid.add(statsButton9, 10, 9);
        statsButton9.setOnAction(e -> primaryStage.setScene(statsScene8));

        Button statsButton10 = new Button();
        statsButton10.setText("Statistics");
        statsButton10.setPrefSize(100, 15);
        statsButton10.setTextFill(Color.WHITE);
        statsButton10.setFont(Font.font("Cambria", FontWeight.BOLD, 12));
        grid.add(statsButton10, 10, 10);
        statsButton10.setOnAction(e -> primaryStage.setScene(statsScene9));

        Button statsButton11 = new Button();
        statsButton11.setText("Statistics");
        statsButton11.setPrefSize(100, 15);
        statsButton11.setTextFill(Color.WHITE);
        statsButton11.setFont(Font.font("Cambria", FontWeight.BOLD, 12));
        grid.add(statsButton11, 10, 11);
        statsButton11.setOnAction(e -> primaryStage.setScene(statsScene10));

        Button statsButton12 = new Button();
        statsButton12.setText("Statistics");
        statsButton12.setPrefSize(100, 15);
        statsButton12.setTextFill(Color.WHITE);
        statsButton12.setFont(Font.font("Cambria", FontWeight.BOLD, 12));
        grid.add(statsButton12, 10, 12);
        statsButton12.setOnAction(e -> primaryStage.setScene(statsScene11));

        Button statsButton13 = new Button();
        statsButton13.setText("Statistics");
        statsButton13.setPrefSize(100, 15);
        statsButton13.setTextFill(Color.WHITE);
        statsButton13.setFont(Font.font("Cambria", FontWeight.BOLD, 12));
        grid.add(statsButton13, 10, 13);
        statsButton13.setOnAction(e -> primaryStage.setScene(statsScene12));

        statsButton2.setStyle("-fx-background-color: #B99976");
        statsButton3.setStyle("-fx-background-color: #B99976");
        statsButton4.setStyle("-fx-background-color: #B99976");
        statsButton5.setStyle("-fx-background-color: #B99976");
        statsButton6.setStyle("-fx-background-color: #B99976");
        statsButton7.setStyle("-fx-background-color: #B99976");
        statsButton8.setStyle("-fx-background-color: #B99976");
        statsButton9.setStyle("-fx-background-color: #B99976");
        statsButton10.setStyle("-fx-background-color: #B99976");
        statsButton11.setStyle("-fx-background-color: #B99976");
        statsButton12.setStyle("-fx-background-color: #B99976");
        statsButton13.setStyle("-fx-background-color: #B99976");

        // Checkboxes for row 1
        CheckBox cb01 = new CheckBox();
        grid.add(cb01, 1, 2);

        CheckBox cb02 = new CheckBox();
        grid.add(cb02, 2, 2);

        CheckBox cb03 = new CheckBox();
        grid.add(cb03, 3, 2);

        CheckBox cb04 = new CheckBox();
        grid.add(cb04, 4, 2);

        CheckBox cb05 = new CheckBox();
        grid.add(cb05, 5, 2);

        CheckBox cb06 = new CheckBox();
        grid.add(cb06, 6, 2);

        CheckBox cb07 = new CheckBox();
        grid.add(cb07, 7, 2);

        // Checkboxes for row 2
        CheckBox cb1 = new CheckBox();
        grid.add(cb1, 1, 3);

        CheckBox cb2 = new CheckBox();
        grid.add(cb2, 2, 3);

        CheckBox cb3 = new CheckBox();
        grid.add(cb3, 3, 3);

        CheckBox cb4 = new CheckBox();
        grid.add(cb4, 4, 3);

        CheckBox cb5 = new CheckBox();
        grid.add(cb5, 5, 3);

        CheckBox cb6 = new CheckBox();
        grid.add(cb6, 6, 3);

        CheckBox cb7 = new CheckBox();
        grid.add(cb7, 7, 3);

        // Checkboxes for row 3
        CheckBox cb21 = new CheckBox();
        grid.add(cb21, 1, 4);

        CheckBox cb22 = new CheckBox();
        grid.add(cb22, 2, 4);

        CheckBox cb23 = new CheckBox();
        grid.add(cb23, 3, 4);

        CheckBox cb24 = new CheckBox();
        grid.add(cb24, 4, 4);

        CheckBox cb25 = new CheckBox();
        grid.add(cb25, 5, 4);

        CheckBox cb26 = new CheckBox();
        grid.add(cb26, 6, 4);

        CheckBox cb27 = new CheckBox();
        grid.add(cb27, 7, 4);

        // Checkboxes for row 4
        CheckBox cb31 = new CheckBox();
        grid.add(cb31, 1, 5);

        CheckBox cb32 = new CheckBox();
        grid.add(cb32, 2, 5);

        CheckBox cb33 = new CheckBox();
        grid.add(cb33, 3, 5);

        CheckBox cb34 = new CheckBox();
        grid.add(cb34, 4, 5);

        CheckBox cb35 = new CheckBox();
        grid.add(cb35, 5, 5);

        CheckBox cb36 = new CheckBox();
        grid.add(cb36, 6, 5);

        CheckBox cb37 = new CheckBox();
        grid.add(cb37, 7, 5);

        // CheckBoxes for row 5
        CheckBox cb41 = new CheckBox();
        grid.add(cb41, 1, 6);

        CheckBox cb42 = new CheckBox();
        grid.add(cb42, 2, 6);

        CheckBox cb43 = new CheckBox();
        grid.add(cb43, 3, 6);

        CheckBox cb44 = new CheckBox();
        grid.add(cb44, 4, 6);

        CheckBox cb45 = new CheckBox();
        grid.add(cb45, 5, 6);

        CheckBox cb46 = new CheckBox();
        grid.add(cb46, 6, 6);

        CheckBox cb47 = new CheckBox();
        grid.add(cb47, 7, 6);

        // Checkboxes for row 6
        CheckBox cb51 = new CheckBox();
        grid.add(cb51, 1, 7);

        CheckBox cb52 = new CheckBox();
        grid.add(cb52, 2, 7);

        CheckBox cb53 = new CheckBox();
        grid.add(cb53, 3, 7);

        CheckBox cb54 = new CheckBox();
        grid.add(cb54, 4, 7);

        CheckBox cb55 = new CheckBox();
        grid.add(cb55, 5, 7);

        CheckBox cb56 = new CheckBox();
        grid.add(cb56, 6, 7);

        CheckBox cb57 = new CheckBox();
        grid.add(cb57, 7, 7);

        // CheckBoxes for row 7
        CheckBox cb61 = new CheckBox();
        grid.add(cb61, 1, 8);

        CheckBox cb62 = new CheckBox();
        grid.add(cb62, 2, 8);

        CheckBox cb63 = new CheckBox();
        grid.add(cb63, 3, 8);

        CheckBox cb64 = new CheckBox();
        grid.add(cb64, 4, 8);

        CheckBox cb65 = new CheckBox();
        grid.add(cb65, 5, 8);

        CheckBox cb66 = new CheckBox();
        grid.add(cb66, 6, 8);

        CheckBox cb67 = new CheckBox();
        grid.add(cb67, 7, 8);

        // CheckBoxes for row 8
        CheckBox cb71 = new CheckBox();
        grid.add(cb71, 1, 9);

        CheckBox cb72 = new CheckBox();
        grid.add(cb72, 2, 9);

        CheckBox cb73 = new CheckBox();
        grid.add(cb73, 3, 9);

        CheckBox cb74 = new CheckBox();
        grid.add(cb74, 4, 9);

        CheckBox cb75 = new CheckBox();
        grid.add(cb75, 5, 9);

        CheckBox cb76 = new CheckBox();
        grid.add(cb76, 6, 9);

        CheckBox cb77 = new CheckBox();
        grid.add(cb77, 7, 9);

        // Checkboxes for row 9
        CheckBox cb81 = new CheckBox();
        grid.add(cb81, 1, 10);

        CheckBox cb82 = new CheckBox();
        grid.add(cb82, 2, 10);

        CheckBox cb83 = new CheckBox();
        grid.add(cb83, 3, 10);

        CheckBox cb84 = new CheckBox();
        grid.add(cb84, 4, 10);

        CheckBox cb85 = new CheckBox();
        grid.add(cb85, 5, 10);

        CheckBox cb86 = new CheckBox();
        grid.add(cb86, 6, 10);

        CheckBox cb87 = new CheckBox();
        grid.add(cb87, 7, 10);

        // CheckBoxes for row 10
        CheckBox cb91 = new CheckBox();
        grid.add(cb91, 1, 11);

        CheckBox cb92 = new CheckBox();
        grid.add(cb92, 2, 11);

        CheckBox cb93 = new CheckBox();
        grid.add(cb93, 3, 11);

        CheckBox cb94 = new CheckBox();
        grid.add(cb94, 4, 11);

        CheckBox cb95 = new CheckBox();
        grid.add(cb95, 5, 11);

        CheckBox cb96 = new CheckBox();
        grid.add(cb96, 6, 11);

        CheckBox cb97 = new CheckBox();
        grid.add(cb97, 7, 11);

        // Checkboxes for row 11
        CheckBox cb101 = new CheckBox();
        grid.add(cb101, 1, 12);

        CheckBox cb102 = new CheckBox();
        grid.add(cb102, 2, 12);

        CheckBox cb103 = new CheckBox();
        grid.add(cb103, 3, 12);

        CheckBox cb104 = new CheckBox();
        grid.add(cb104, 4, 12);

        CheckBox cb105 = new CheckBox();
        grid.add(cb105, 5, 12);

        CheckBox cb106 = new CheckBox();
        grid.add(cb106, 6, 12);

        CheckBox cb107 = new CheckBox();
        grid.add(cb107, 7, 12);

        // Checkboxes for row 12
        CheckBox cb111 = new CheckBox();
        grid.add(cb111, 1, 13);

        CheckBox cb112 = new CheckBox();
        grid.add(cb112, 2, 13);

        CheckBox cb113 = new CheckBox();
        grid.add(cb113, 3, 13);

        CheckBox cb114 = new CheckBox();
        grid.add(cb114, 4, 13);

        CheckBox cb115 = new CheckBox();
        grid.add(cb115, 5, 13);

        CheckBox cb116 = new CheckBox();
        grid.add(cb116, 6, 13);

        CheckBox cb117 = new CheckBox();
        grid.add(cb117, 7, 13);

        // Home Scene
        BorderPane BPane = new BorderPane();
        BPane.setCenter(grid);
        BPane.setTop(stack);

        // HOME Scene
        Scene home = new Scene(BPane, 490, 700);

        // Stats Scene 1

        GridPane statsRootPane = new GridPane();
        {
            statsRootPane.setPadding(new Insets(25, 25, 25, 25));
            statsRootPane.setHgap(25);
            statsRootPane.setVgap(15);
            statsRootPane.setStyle("-fx-background-color: #B99976;");
        }

        statsScene1 = new Scene(statsRootPane, 410, 600);
        Line line = new Line();
        line.setStartX(100.0);
        line.setStartY(150.0);
        line.setEndX(500.0);
        line.setEndY(150.0);
        Text statsTitle = new Text();
        statsTitle.setFont((Font.font("Cambria", FontWeight.SEMI_BOLD, 21)));

        Button homeButton = new Button("Home");
        homeButton.setOnAction(e -> primaryStage.setScene(home));
        Button clearStatsButton = new Button("Clear");
        Label statsPercentLabel = new Label();
        statsPercentLabel.setFont((Font.font("Cambria", 16)));
        Label weekLabel = new Label("You did this habit on: ");
        weekLabel.setFont((Font.font("Cambria", FontWeight.SEMI_BOLD, 20)));
        Label mondayLabel = new Label("Monday");
        mondayLabel.setFont((Font.font("Cambria", 16)));
        Label tuesdayLabel = new Label("Tuesday");
        tuesdayLabel.setFont((Font.font("Cambria", 16)));
        Label wednesdayLabel = new Label("Wednesday");
        wednesdayLabel.setFont((Font.font("Cambria", 16)));
        Label thursdayLabel = new Label("Thursday");
        thursdayLabel.setFont((Font.font("Cambria", 16)));
        Label fridayLabel = new Label("Friday");
        fridayLabel.setFont((Font.font("Cambria", 16)));
        Label saturdayLabel = new Label("Saturday");
        saturdayLabel.setFont((Font.font("Cambria", 16)));
        Label sundayLabel = new Label("Sunday");
        sundayLabel.setFont((Font.font("Cambria", 16)));

        Label statsLabel = new Label();
        statsLabel.setFont((Font.font("Cambria", 16)));
        clearStatsButton.setOnAction(e -> {
            statsLabel.setText("");
            statsTitle.setText("");
            statsPercentLabel.setText("");
            countBoxes1 = 0;
            mondayLabel.setTextFill(Color.BLACK);
            tuesdayLabel.setTextFill(Color.BLACK);
            wednesdayLabel.setTextFill(Color.BLACK);
            thursdayLabel.setTextFill(Color.BLACK);
            fridayLabel.setTextFill(Color.BLACK);
            saturdayLabel.setTextFill(Color.BLACK);
            sundayLabel.setTextFill(Color.BLACK);
            cb01.setSelected(false);
            cb02.setSelected(false);
            cb03.setSelected(false);
            cb04.setSelected(false);
            cb05.setSelected(false);
            cb06.setSelected(false);
            cb07.setSelected(false);

        });

        Button caclstatsButton = new Button("Calculate");

        statsRootPane.add(statsTitle, 0, 0);
        statsRootPane.add(caclstatsButton, 0, 3);
        statsRootPane.add(statsLabel, 0, 1);
        statsRootPane.add(statsPercentLabel, 0, 2);
        statsRootPane.add(line, 0, 4);
        statsRootPane.add(weekLabel, 0, 5);
        statsRootPane.add(mondayLabel, 0, 6);
        statsRootPane.add(tuesdayLabel, 0, 7);
        statsRootPane.add(wednesdayLabel, 0, 8);
        statsRootPane.add(thursdayLabel, 0, 9);
        statsRootPane.add(fridayLabel, 0, 10);
        statsRootPane.add(saturdayLabel, 0, 11);
        statsRootPane.add(sundayLabel, 0, 12);
        statsRootPane.add(homeButton, 0, 13);
        statsRootPane.add(clearStatsButton, 0, 14);

        // StatsSCENE2
        GridPane statsRootPane2 = new GridPane();
        {
            statsRootPane2.setPadding(new Insets(25, 25, 25, 25));
            statsRootPane2.setHgap(25);
            statsRootPane2.setVgap(15);
            statsRootPane2.setStyle("-fx-background-color: #B99976;");
        }

        statsScene2 = new Scene(statsRootPane2, 400, 600);
        Text statsTitle2 = new Text();
        statsTitle2.setFont((Font.font("Cambria", FontWeight.SEMI_BOLD, 21)));
        Line line2 = new Line();
        line2.setStartX(100.0);
        line2.setStartY(150.0);
        line2.setEndX(500.0);
        line2.setEndY(150.0);
        Label statsPercentLabel2 = new Label();
        statsPercentLabel2.setFont((Font.font("Cambria", 16)));
        Label weekLabel2 = new Label("You did this habit on: ");
        weekLabel2.setFont((Font.font("Cambria", FontWeight.SEMI_BOLD, 20)));
        Label mondayLabel2 = new Label("Monday");
        mondayLabel2.setFont((Font.font("Cambria", 16)));
        Label tuesdayLabel2 = new Label("Tuesday");
        tuesdayLabel2.setFont((Font.font("Cambria", 16)));
        Label wednesdayLabel2 = new Label("Wednesday");
        wednesdayLabel2.setFont((Font.font("Cambria", 16)));
        Label thursdayLabel2 = new Label("Thursday");
        thursdayLabel2.setFont((Font.font("Cambria", 16)));
        Label fridayLabel2 = new Label("Friday");
        fridayLabel2.setFont((Font.font("Cambria", 16)));
        Label saturdayLabel2 = new Label("Saturday");
        saturdayLabel2.setFont((Font.font("Cambria", 16)));
        Label sundayLabel2 = new Label("Sunday");
        sundayLabel2.setFont((Font.font("Cambria", 16)));
        Button homeButton2 = new Button("Home");
        homeButton2.setOnAction(e -> primaryStage.setScene(home));
        Button clearStatsButton2 = new Button("Clear");

        Label statsLabel2 = new Label();
        statsLabel2.setFont((Font.font("Cambria", 16)));
        clearStatsButton2.setOnAction(e -> {
            statsLabel2.setText("");
            statsTitle2.setText("");
            statsPercentLabel2.setText("");
            countBoxes2 = 0;
            mondayLabel2.setTextFill(Color.BLACK);
            tuesdayLabel2.setTextFill(Color.BLACK);
            wednesdayLabel2.setTextFill(Color.BLACK);
            thursdayLabel2.setTextFill(Color.BLACK);
            fridayLabel2.setTextFill(Color.BLACK);
            saturdayLabel2.setTextFill(Color.BLACK);
            sundayLabel2.setTextFill(Color.BLACK);
            cb1.setSelected(false);
            cb2.setSelected(false);
            cb3.setSelected(false);
            cb4.setSelected(false);
            cb5.setSelected(false);
            cb6.setSelected(false);
            cb7.setSelected(false);
        });
        Button caclstatsButton2 = new Button("Calculate");

        statsRootPane2.add(statsTitle2, 0, 0);
        statsRootPane2.add(caclstatsButton2, 0, 3);
        statsRootPane2.add(statsLabel2, 0, 1);
        statsRootPane2.add(statsPercentLabel2, 0, 2);
        statsRootPane2.add(line2, 0, 4);
        statsRootPane2.add(weekLabel2, 0, 5);
        statsRootPane2.add(mondayLabel2, 0, 6);
        statsRootPane2.add(tuesdayLabel2, 0, 7);
        statsRootPane2.add(wednesdayLabel2, 0, 8);
        statsRootPane2.add(thursdayLabel2, 0, 9);
        statsRootPane2.add(fridayLabel2, 0, 10);
        statsRootPane2.add(saturdayLabel2, 0, 11);
        statsRootPane2.add(sundayLabel2, 0, 12);
        statsRootPane2.add(homeButton2, 0, 13);
        statsRootPane2.add(clearStatsButton2, 0, 14);

        // StatsSCENE3
        GridPane statsRootPane3 = new GridPane();
        {
            statsRootPane3.setPadding(new Insets(25, 25, 25, 25));
            statsRootPane3.setHgap(25);
            statsRootPane3.setVgap(15);
            statsRootPane3.setStyle("-fx-background-color: #B99976;");
        }
        Line line3 = new Line();
        line3.setStartX(100.0);
        line3.setStartY(150.0);
        line3.setEndX(500.0);
        line3.setEndY(150.0);
        Text statsTitle3 = new Text();
        statsTitle3.setFont((Font.font("Cambria", FontWeight.SEMI_BOLD, 21)));
        statsScene3 = new Scene(statsRootPane3, 400, 600);
        Button homeButton3 = new Button("Home");
        homeButton3.setOnAction(e -> primaryStage.setScene(home));
        Button clearStatsButton3 = new Button("Clear");
        Label statsPercentLabel3 = new Label();
        statsPercentLabel3.setFont((Font.font("Cambria", 16)));
        Label weekLabel3 = new Label("You did this habit on: ");
        weekLabel3.setFont((Font.font("Cambria", FontWeight.SEMI_BOLD, 20)));
        Label mondayLabel3 = new Label("Monday");
        mondayLabel3.setFont((Font.font("Cambria", 16)));
        Label tuesdayLabel3 = new Label("Tuesday");
        tuesdayLabel3.setFont((Font.font("Cambria", 16)));
        Label wednesdayLabel3 = new Label("Wednesday");
        wednesdayLabel3.setFont((Font.font("Cambria", 16)));
        Label thursdayLabel3 = new Label("Thursday");
        thursdayLabel3.setFont((Font.font("Cambria", 16)));
        Label fridayLabel3 = new Label("Friday");
        fridayLabel3.setFont((Font.font("Cambria", 16)));
        Label saturdayLabel3 = new Label("Saturday");
        saturdayLabel3.setFont((Font.font("Cambria", 16)));
        Label sundayLabel3 = new Label("Sunday");
        sundayLabel3.setFont((Font.font("Cambria", 16)));
        Label statsLabel3 = new Label();
        statsLabel3.setFont((Font.font("Cambria", 16)));

        clearStatsButton3.setOnAction(e -> {
            statsLabel3.setText("");
            statsPercentLabel3.setText("");
            statsTitle3.setText("");
            countBoxes3 = 0;
            mondayLabel3.setTextFill(Color.BLACK);
            tuesdayLabel3.setTextFill(Color.BLACK);
            wednesdayLabel3.setTextFill(Color.BLACK);
            thursdayLabel3.setTextFill(Color.BLACK);
            fridayLabel3.setTextFill(Color.BLACK);
            saturdayLabel3.setTextFill(Color.BLACK);
            sundayLabel3.setTextFill(Color.BLACK);
            cb21.setSelected(false);
            cb22.setSelected(false);
            cb23.setSelected(false);
            cb24.setSelected(false);
            cb25.setSelected(false);
            cb26.setSelected(false);
            cb27.setSelected(false);

        });

        Button caclstatsButton3 = new Button("Calculate");

        statsRootPane3.add(statsTitle3, 0, 0);
        statsRootPane3.add(caclstatsButton3, 0, 3);
        statsRootPane3.add(statsLabel3, 0, 1);
        statsRootPane3.add(statsPercentLabel3, 0, 2);
        statsRootPane3.add(line3, 0, 4);
        statsRootPane3.add(weekLabel3, 0, 5);
        statsRootPane3.add(mondayLabel3, 0, 6);
        statsRootPane3.add(tuesdayLabel3, 0, 7);
        statsRootPane3.add(wednesdayLabel3, 0, 8);
        statsRootPane3.add(thursdayLabel3, 0, 9);
        statsRootPane3.add(fridayLabel3, 0, 10);
        statsRootPane3.add(saturdayLabel3, 0, 11);
        statsRootPane3.add(sundayLabel3, 0, 12);
        statsRootPane3.add(homeButton3, 0, 13);
        statsRootPane3.add(clearStatsButton3, 0, 14);

        // STatsScene4
        GridPane statsRootPane4 = new GridPane();
        {
            statsRootPane4.setPadding(new Insets(25, 25, 25, 25));
            statsRootPane4.setHgap(25);
            statsRootPane4.setVgap(15);
            statsRootPane4.setStyle("-fx-background-color: #B99976;");
        }
        Line line4 = new Line();
        line4.setStartX(100.0);
        line4.setStartY(150.0);
        line4.setEndX(500.0);
        line4.setEndY(150.0);
        Text statsTitle4 = new Text();
        statsTitle4.setFont((Font.font("Cambria", FontWeight.SEMI_BOLD, 21)));
        statsScene4 = new Scene(statsRootPane4, 400, 600);
        Button homeButton4 = new Button("Home");
        Label statsPercentLabel4 = new Label();
        statsPercentLabel4.setFont((Font.font("Cambria", 16)));
        homeButton4.setOnAction(e -> primaryStage.setScene(home));
        Button clearStatsButton4 = new Button("Clear");
        Label weekLabel4 = new Label("You did this habit on: ");
        weekLabel4.setFont((Font.font("Cambria", FontWeight.SEMI_BOLD, 20)));
        Label mondayLabel4 = new Label("Monday");
        mondayLabel4.setFont((Font.font("Cambria", 16)));
        Label tuesdayLabel4 = new Label("Tuesday");
        tuesdayLabel4.setFont((Font.font("Cambria", 16)));
        Label wednesdayLabel4 = new Label("Wednesday");
        wednesdayLabel4.setFont((Font.font("Cambria", 16)));
        Label thursdayLabel4 = new Label("Thursday");
        thursdayLabel4.setFont((Font.font("Cambria", 16)));
        Label fridayLabel4 = new Label("Friday");
        fridayLabel4.setFont((Font.font("Cambria", 16)));
        Label saturdayLabel4 = new Label("Saturday");
        saturdayLabel4.setFont((Font.font("Cambria", 16)));
        Label sundayLabel4 = new Label("Sunday");
        sundayLabel4.setFont((Font.font("Cambria", 16)));

        Label statsLabel4 = new Label();
        statsLabel4.setFont((Font.font("Cambria", 16)));
        clearStatsButton4.setOnAction(e -> {
            statsLabel4.setText("");
            statsPercentLabel4.setText("");
            countBoxes4 = 0;
            statsTitle4.setText("");
            mondayLabel4.setTextFill(Color.BLACK);
            tuesdayLabel4.setTextFill(Color.BLACK);
            wednesdayLabel4.setTextFill(Color.BLACK);
            thursdayLabel4.setTextFill(Color.BLACK);
            fridayLabel4.setTextFill(Color.BLACK);
            saturdayLabel4.setTextFill(Color.BLACK);
            sundayLabel4.setTextFill(Color.BLACK);
            cb31.setSelected(false);
            cb32.setSelected(false);
            cb33.setSelected(false);
            cb34.setSelected(false);
            cb35.setSelected(false);
            cb36.setSelected(false);
            cb37.setSelected(false);
            

        });
        Button caclstatsButton4 = new Button("Calculate");

        statsRootPane4.add(statsTitle4, 0, 0);
        statsRootPane4.add(caclstatsButton4, 0, 3);
        statsRootPane4.add(statsLabel4, 0, 1);
        statsRootPane4.add(statsPercentLabel4, 0, 2);
        statsRootPane4.add(line4, 0, 4);
        statsRootPane4.add(weekLabel4, 0, 5);
        statsRootPane4.add(mondayLabel4, 0, 6);
        statsRootPane4.add(tuesdayLabel4, 0, 7);
        statsRootPane4.add(wednesdayLabel4, 0, 8);
        statsRootPane4.add(thursdayLabel4, 0, 9);
        statsRootPane4.add(fridayLabel4, 0, 10);
        statsRootPane4.add(saturdayLabel4, 0, 11);
        statsRootPane4.add(sundayLabel4, 0, 12);
        statsRootPane4.add(homeButton4, 0, 13);
        statsRootPane4.add(clearStatsButton4, 0, 14);

        // STatsScene5
        GridPane statsRootPane5 = new GridPane();
        {
            statsRootPane5.setPadding(new Insets(25, 25, 25, 25));
            statsRootPane5.setHgap(25);
            statsRootPane5.setVgap(15);
            statsRootPane5.setStyle("-fx-background-color: #B99976;");
        }

        statsScene5 = new Scene(statsRootPane5, 400, 600);
        Line line5 = new Line();
        line5.setStartX(100.0);
        line5.setStartY(150.0);
        line5.setEndX(500.0);
        line5.setEndY(150.0);
        Text statsTitle5 = new Text();
        statsTitle5.setFont((Font.font("Cambria", FontWeight.SEMI_BOLD, 21)));
        Label statsPercentLabel5 = new Label();
        statsPercentLabel5.setFont((Font.font("Cambria", 16)));
        Label weekLabel5 = new Label("You did this habit on: ");
        weekLabel5.setFont((Font.font("Cambria", FontWeight.SEMI_BOLD, 21)));
        Label mondayLabel5 = new Label("Monday");
        mondayLabel5.setFont((Font.font("Cambria", 16)));
        Label tuesdayLabel5 = new Label("Tuesday");
        tuesdayLabel5.setFont((Font.font("Cambria", 16)));
        Label wednesdayLabel5 = new Label("Wednesday");
        wednesdayLabel5.setFont((Font.font("Cambria", 16)));
        Label thursdayLabel5 = new Label("Thursday");
        thursdayLabel5.setFont((Font.font("Cambria", 16)));
        Label fridayLabel5 = new Label("Friday");
        fridayLabel5.setFont((Font.font("Cambria", 16)));
        Label saturdayLabel5 = new Label("Saturday");
        saturdayLabel5.setFont((Font.font("Cambria", 16)));
        Label sundayLabel5 = new Label("Sunday");
        sundayLabel5.setFont((Font.font("Cambria", 16)));
        Button homeButton5 = new Button("Home");
        homeButton5.setOnAction(e -> primaryStage.setScene(home));
        Button clearStatsButton5 = new Button("Clear");

        Label statsLabel5 = new Label();
        statsLabel5.setFont((Font.font("Cambria", 16)));
        clearStatsButton5.setOnAction(e -> {
            statsLabel5.setText("");
            statsPercentLabel5.setText("");
            statsTitle5.setText("");
            countBoxes5 = 0;
            mondayLabel5.setTextFill(Color.BLACK);;
            tuesdayLabel5.setTextFill(Color.BLACK);
            wednesdayLabel5.setTextFill(Color.BLACK);
            thursdayLabel5.setTextFill(Color.BLACK);
            fridayLabel5.setTextFill(Color.BLACK);
            saturdayLabel5.setTextFill(Color.BLACK);
            sundayLabel5.setTextFill(Color.BLACK);
            cb41.setSelected(false);
            cb42.setSelected(false);
            cb43.setSelected(false);
            cb44.setSelected(false);
            cb45.setSelected(false);
            cb46.setSelected(false);
            cb47.setSelected(false);
        });
        Button caclstatsButton5 = new Button("Calculate");

        statsRootPane5.add(statsTitle5, 0, 0);
        statsRootPane5.add(caclstatsButton5, 0, 3);
        statsRootPane5.add(statsLabel5, 0, 1);
        statsRootPane5.add(statsPercentLabel5, 0, 2);
        statsRootPane5.add(line5, 0, 4);
        statsRootPane5.add(weekLabel5, 0, 5);
        statsRootPane5.add(mondayLabel5, 0, 6);
        statsRootPane5.add(tuesdayLabel5, 0, 7);
        statsRootPane5.add(wednesdayLabel5, 0, 8);
        statsRootPane5.add(thursdayLabel5, 0, 9);
        statsRootPane5.add(fridayLabel5, 0, 10);
        statsRootPane5.add(saturdayLabel5, 0, 11);
        statsRootPane5.add(sundayLabel5, 0, 12);
        statsRootPane5.add(homeButton5, 0, 13);
        statsRootPane5.add(clearStatsButton5, 0, 14);

        // STatsScene6
        GridPane statsRootPane6 = new GridPane();
        {
            statsRootPane6.setPadding(new Insets(25, 25, 25, 25));
            statsRootPane6.setHgap(25);
            statsRootPane6.setVgap(15);
            statsRootPane6.setStyle("-fx-background-color: #B99976;");
        }

        statsScene6 = new Scene(statsRootPane6, 400, 600);
        Line line6 = new Line();
        line6.setStartX(100.0);
        line6.setStartY(150.0);
        line6.setEndX(500.0);
        line6.setEndY(150.0);
        Text statsTitle6 = new Text();
        statsTitle6.setFont((Font.font("Cambria", FontWeight.SEMI_BOLD, 21)));
        Label statsPercentLabel6 = new Label();
        statsPercentLabel6.setFont((Font.font("Cambria", 16)));
        Label weekLabel6 = new Label("You did this habit on: ");
        weekLabel6.setFont((Font.font("Cambria", FontWeight.SEMI_BOLD, 20)));
        Label mondayLabel6 = new Label("Monday");
        mondayLabel6.setFont((Font.font("Cambria", 16)));
        Label tuesdayLabel6 = new Label("Tuesday");
        tuesdayLabel6.setFont((Font.font("Cambria", 16)));
        Label wednesdayLabel6 = new Label("Wednesday");
        wednesdayLabel6.setFont((Font.font("Cambria", 16)));
        Label thursdayLabel6 = new Label("Thursday");
        thursdayLabel6.setFont((Font.font("Cambria", 16)));
        Label fridayLabel6 = new Label("Friday");
        fridayLabel6.setFont((Font.font("Cambria", 16)));
        Label saturdayLabel6 = new Label("Saturday");
        saturdayLabel6.setFont((Font.font("Cambria", 16)));
        Label sundayLabel6 = new Label("Sunday");
        sundayLabel6.setFont((Font.font("Cambria", 16)));

        Button homeButton6 = new Button("Home");
        homeButton6.setOnAction(e -> primaryStage.setScene(home));
        Button clearStatsButton6 = new Button("Clear");

        Label statsLabel6 = new Label();
        statsLabel6.setFont((Font.font("Cambria", 16)));
        clearStatsButton6.setOnAction(e -> {
            statsLabel6.setText("");
            statsPercentLabel6.setText("");
            statsTitle6.setText("");
            countBoxes6 = 0;
            mondayLabel6.setTextFill(Color.BLACK);
            tuesdayLabel6.setTextFill(Color.BLACK);
            wednesdayLabel6.setTextFill(Color.BLACK);
            thursdayLabel6.setTextFill(Color.BLACK);
            fridayLabel6.setTextFill(Color.BLACK);
            saturdayLabel6.setTextFill(Color.BLACK);
            sundayLabel6.setTextFill(Color.BLACK);
            cb51.setSelected(false);
            cb52.setSelected(false);
            cb53.setSelected(false);
            cb54.setSelected(false);
            cb55.setSelected(false);
            cb56.setSelected(false);
            cb57.setSelected(false);
           
        });
        Button caclstatsButton6 = new Button("Calculate");

        statsRootPane6.add(statsTitle6, 0, 0);
        statsRootPane6.add(caclstatsButton6, 0, 3);
        statsRootPane6.add(statsLabel6, 0, 1);
        statsRootPane6.add(statsPercentLabel6, 0, 2);
        statsRootPane6.add(line6, 0, 4);
        statsRootPane6.add(weekLabel6, 0, 5);
        statsRootPane6.add(mondayLabel6, 0, 6);
        statsRootPane6.add(tuesdayLabel6, 0, 7);
        statsRootPane6.add(wednesdayLabel6, 0, 8);
        statsRootPane6.add(thursdayLabel6, 0, 9);
        statsRootPane6.add(fridayLabel6, 0, 10);
        statsRootPane6.add(saturdayLabel6, 0, 11);
        statsRootPane6.add(sundayLabel6, 0, 12);
        statsRootPane6.add(homeButton6, 0, 13);
        statsRootPane6.add(clearStatsButton6, 0, 14);

        // STatsScene7
        GridPane statsRootPane7 = new GridPane();
        {
            statsRootPane7.setPadding(new Insets(25, 25, 25, 25));
            statsRootPane7.setHgap(25);
            statsRootPane7.setVgap(15);
            statsRootPane7.setStyle("-fx-background-color: #B99976;");
        }

        statsScene7 = new Scene(statsRootPane7, 400, 600);
        Line line7 = new Line();
        line7.setStartX(100.0);
        line7.setStartY(150.0);
        line7.setEndX(500.0);
        line7.setEndY(150.0);
        Text statsTitle7 = new Text();
        statsTitle7.setFont((Font.font("Cambria", FontWeight.SEMI_BOLD, 21)));
        Label statsPercentLabel7 = new Label();
        statsPercentLabel7.setFont((Font.font("Cambria", 16)));
        Label weekLabel7 = new Label("You did this habit on: ");
        weekLabel7.setFont((Font.font("Cambria", FontWeight.SEMI_BOLD, 20)));
        Label mondayLabel7 = new Label("Monday");
        mondayLabel7.setFont((Font.font("Cambria", 16)));
        Label tuesdayLabel7 = new Label("Tuesday");
        tuesdayLabel7.setFont((Font.font("Cambria", 16)));
        Label wednesdayLabel7 = new Label("Wednesday");
        wednesdayLabel7.setFont((Font.font("Cambria", 16)));
        Label thursdayLabel7 = new Label("Thursday");
        thursdayLabel7.setFont((Font.font("Cambria", 16)));
        Label fridayLabel7 = new Label("Friday");
        fridayLabel7.setFont((Font.font("Cambria", 16)));
        Label saturdayLabel7 = new Label("Saturday");
        saturdayLabel7.setFont((Font.font("Cambria", 16)));
        Label sundayLabel7 = new Label("Sunday");
        sundayLabel7.setFont((Font.font("Cambria", 16)));
        Button homeButton7 = new Button("Home");
        homeButton7.setOnAction(e -> primaryStage.setScene(home));
        Button clearStatsButton7 = new Button("Clear");

        Label statsLabel7 = new Label();
        statsLabel7.setFont((Font.font("Cambria", 16)));
        clearStatsButton7.setOnAction(e -> {
            statsLabel7.setText("");
            statsPercentLabel7.setText("");
            countBoxes7 = 0;
            statsTitle7.setText("");
            mondayLabel7.setTextFill(Color.BLACK);
            tuesdayLabel7.setTextFill(Color.BLACK);
            wednesdayLabel7.setTextFill(Color.BLACK);
            thursdayLabel7.setTextFill(Color.BLACK);
            fridayLabel7.setTextFill(Color.BLACK);
            saturdayLabel7.setTextFill(Color.BLACK);
            sundayLabel7.setTextFill(Color.BLACK);
            cb61.setSelected(false);
            cb62.setSelected(false);
            cb63.setSelected(false);
            cb64.setSelected(false);
            cb65.setSelected(false);
            cb66.setSelected(false);
            cb67.setSelected(false);


        });
        Button caclstatsButton7 = new Button("Calculate");

        statsRootPane7.add(statsTitle7, 0, 0);
        statsRootPane7.add(caclstatsButton7, 0, 3);
        statsRootPane7.add(statsLabel7, 0, 1);
        statsRootPane7.add(statsPercentLabel7, 0, 2);
        statsRootPane7.add(line7, 0, 4);
        statsRootPane7.add(weekLabel7, 0, 5);
        statsRootPane7.add(mondayLabel7, 0, 6);
        statsRootPane7.add(tuesdayLabel7, 0, 7);
        statsRootPane7.add(wednesdayLabel7, 0, 8);
        statsRootPane7.add(thursdayLabel7, 0, 9);
        statsRootPane7.add(fridayLabel7, 0, 10);
        statsRootPane7.add(saturdayLabel7, 0, 11);
        statsRootPane7.add(sundayLabel7, 0, 12);
        statsRootPane7.add(homeButton7, 0, 13);
        statsRootPane7.add(clearStatsButton7, 0, 14);

        // STatsScene8
        GridPane statsRootPane8 = new GridPane();
        {
            statsRootPane8.setPadding(new Insets(25, 25, 25, 25));
            statsRootPane8.setHgap(25);
            statsRootPane8.setVgap(15);
            statsRootPane8.setStyle("-fx-background-color: #B99976;");
        }

        statsScene8 = new Scene(statsRootPane8, 400, 600);
        Line line8 = new Line();
        line8.setStartX(100.0);
        line8.setStartY(150.0);
        line8.setEndX(500.0);
        line8.setEndY(150.0);
        Text statsTitle8 = new Text();
        statsTitle8.setFont((Font.font("Cambria", FontWeight.SEMI_BOLD, 21)));
        Label statsPercentLabel8 = new Label();
        statsPercentLabel8.setFont((Font.font("Cambria", 16)));
        Label weekLabel8 = new Label("You did this habit on: ");
        weekLabel8.setFont((Font.font("Cambria", FontWeight.SEMI_BOLD, 20)));
        Label mondayLabel8 = new Label("Monday");
        mondayLabel8.setFont((Font.font("Cambria", 16)));
        Label tuesdayLabel8 = new Label("Tuesday");
        tuesdayLabel8.setFont((Font.font("Cambria", 16)));
        Label wednesdayLabel8 = new Label("Wednesday");
        wednesdayLabel8.setFont((Font.font("Cambria", 16)));
        Label thursdayLabel8 = new Label("Thursday");
        thursdayLabel8.setFont((Font.font("Cambria", 16)));
        Label fridayLabel8 = new Label("Friday");
        fridayLabel8.setFont((Font.font("Cambria", 16)));
        Label saturdayLabel8 = new Label("Saturday");
        saturdayLabel8.setFont((Font.font("Cambria", 16)));
        Label sundayLabel8 = new Label("Sunday");
        sundayLabel8.setFont((Font.font("Cambria", 16)));
        Button homeButton8 = new Button("Home");
        homeButton8.setOnAction(e -> primaryStage.setScene(home));
        Button clearStatsButton8 = new Button("Clear");

        Label statsLabel8 = new Label();
        statsLabel8.setFont((Font.font("Cambria", 16)));
        clearStatsButton8.setOnAction(e -> {
            statsLabel8.setText("");
            statsPercentLabel8.setText("");
            statsTitle8.setText("");
            countBoxes8 = 0;
            mondayLabel8.setTextFill(Color.BLACK);
            tuesdayLabel8.setTextFill(Color.BLACK);
            wednesdayLabel8.setTextFill(Color.BLACK);
            thursdayLabel8.setTextFill(Color.BLACK);
            fridayLabel8.setTextFill(Color.BLACK);
            saturdayLabel8.setTextFill(Color.BLACK);
            sundayLabel8.setTextFill(Color.BLACK);
            cb71.setSelected(false);
            cb72.setSelected(false);
            cb73.setSelected(false);
            cb74.setSelected(false);
            cb75.setSelected(false);
            cb76.setSelected(false);
            cb77.setSelected(false);
        });
        Button caclstatsButton8 = new Button("Calculate");

        statsRootPane8.add(statsTitle8, 0, 0);
        statsRootPane8.add(caclstatsButton8, 0, 3);
        statsRootPane8.add(statsLabel8, 0, 1);
        statsRootPane8.add(statsPercentLabel8, 0, 2);
        statsRootPane8.add(line8, 0, 4);
        statsRootPane8.add(weekLabel8, 0, 5);
        statsRootPane8.add(mondayLabel8, 0, 6);
        statsRootPane8.add(tuesdayLabel8, 0, 7);
        statsRootPane8.add(wednesdayLabel8, 0, 8);
        statsRootPane8.add(thursdayLabel8, 0, 9);
        statsRootPane8.add(fridayLabel8, 0, 10);
        statsRootPane8.add(saturdayLabel8, 0, 11);
        statsRootPane8.add(sundayLabel8, 0, 12);
        statsRootPane8.add(homeButton8, 0, 13);
        statsRootPane8.add(clearStatsButton8, 0, 14);

        // STatsScene9
        GridPane statsRootPane9 = new GridPane();
        {
            statsRootPane9.setPadding(new Insets(25, 25, 25, 25));
            statsRootPane9.setHgap(25);
            statsRootPane9.setVgap(15);
            statsRootPane9.setStyle("-fx-background-color: #B99976;");
        }

        statsScene9 = new Scene(statsRootPane9, 400, 600);
        Line line9 = new Line();
        line9.setStartX(100.0);
        line9.setStartY(150.0);
        line9.setEndX(500.0);
        line9.setEndY(150.0);
        Text statsTitle9 = new Text();
        statsTitle9.setFont((Font.font("Cambria", FontWeight.SEMI_BOLD, 21)));
        Label statsPercentLabel9 = new Label();
        statsPercentLabel9.setFont((Font.font("Cambria", 16)));
        Label weekLabel9 = new Label("You did this habit on: ");
        weekLabel9.setFont((Font.font("Cambria", FontWeight.SEMI_BOLD, 20)));
        Label mondayLabel9 = new Label("Monday");
        mondayLabel9.setFont((Font.font("Cambria", 16)));
        Label tuesdayLabel9 = new Label("Tuesday");
        tuesdayLabel9.setFont((Font.font("Cambria", 16)));
        Label wednesdayLabel9 = new Label("Wednesday");
        wednesdayLabel9.setFont((Font.font("Cambria", 16)));
        Label thursdayLabel9 = new Label("Thursday");
        thursdayLabel9.setFont((Font.font("Cambria", 16)));
        Label fridayLabel9 = new Label("Friday");
        fridayLabel9.setFont((Font.font("Cambria", 16)));
        Label saturdayLabel9 = new Label("Saturday");
        saturdayLabel9.setFont((Font.font("Cambria", 16)));
        Label sundayLabel9 = new Label("Sunday");
        sundayLabel9.setFont((Font.font("Cambria", 16)));
        Button homeButton9 = new Button("Home");
        homeButton9.setOnAction(e -> primaryStage.setScene(home));
        Button clearStatsButton9 = new Button("Clear");

        Label statsLabel9 = new Label();
        statsLabel9.setFont((Font.font("Cambria", 16)));
        clearStatsButton9.setOnAction(e -> {
            statsLabel9.setText("");
            statsPercentLabel9.setText("");
            countBoxes9 = 0;
            statsTitle9.setText("");
            mondayLabel9.setTextFill(Color.BLACK);
            tuesdayLabel9.setTextFill(Color.BLACK);
            wednesdayLabel9.setTextFill(Color.BLACK);
            thursdayLabel9.setTextFill(Color.BLACK);
            fridayLabel9.setTextFill(Color.BLACK);
            saturdayLabel9.setTextFill(Color.BLACK);
            sundayLabel9.setTextFill(Color.BLACK);
            cb81.setSelected(false);
            cb82.setSelected(false);
            cb83.setSelected(false);
            cb84.setSelected(false);
            cb85.setSelected(false);
            cb86.setSelected(false);
            cb87.setSelected(false);
            
        });
        Button caclstatsButton9 = new Button("Calculate");

        statsRootPane9.add(statsTitle9, 0, 0);
        statsRootPane9.add(caclstatsButton9, 0, 3);
        statsRootPane9.add(statsLabel9, 0, 1);
        statsRootPane9.add(statsPercentLabel9, 0, 2);
        statsRootPane9.add(line9, 0, 4);
        statsRootPane9.add(weekLabel9, 0, 5);
        statsRootPane9.add(mondayLabel9, 0, 6);
        statsRootPane9.add(tuesdayLabel9, 0, 7);
        statsRootPane9.add(wednesdayLabel9, 0, 8);
        statsRootPane9.add(thursdayLabel9, 0, 9);
        statsRootPane9.add(fridayLabel9, 0, 10);
        statsRootPane9.add(saturdayLabel9, 0, 11);
        statsRootPane9.add(sundayLabel9, 0, 12);
        statsRootPane9.add(homeButton9, 0, 13);
        statsRootPane9.add(clearStatsButton9, 0, 14);

        // STatsScene10
        GridPane statsRootPane10 = new GridPane();
        {
            statsRootPane10.setPadding(new Insets(25, 25, 25, 25));
            statsRootPane10.setHgap(25);
            statsRootPane10.setVgap(15);
            statsRootPane10.setStyle("-fx-background-color: #B99976;");
        }

        statsScene10 = new Scene(statsRootPane10, 400, 600);
        Line line10 = new Line();
        line10.setStartX(100.0);
        line10.setStartY(150.0);
        line10.setEndX(500.0);
        line10.setEndY(150.0);
        Text statsTitle10 = new Text();
        statsTitle10.setFont((Font.font("Cambria", FontWeight.SEMI_BOLD, 21)));
        Label statsPercentLabel10 = new Label();
        statsPercentLabel10.setFont((Font.font("Cambria", 16)));
        Label weekLabel10 = new Label("You did this habit on: ");
        weekLabel10.setFont((Font.font("Cambria", FontWeight.SEMI_BOLD, 20)));
        Label mondayLabel10 = new Label("Monday");
        mondayLabel10.setFont((Font.font("Cambria", 16)));
        Label tuesdayLabel10 = new Label("Tuesday");
        tuesdayLabel10.setFont((Font.font("Cambria", 16)));
        Label wednesdayLabel10 = new Label("Wednesday");
        wednesdayLabel10.setFont((Font.font("Cambria", 16)));
        Label thursdayLabel10 = new Label("Thursday");
        thursdayLabel10.setFont((Font.font("Cambria", 16)));
        Label fridayLabel10 = new Label("Friday");
        fridayLabel10.setFont((Font.font("Cambria", 16)));
        Label saturdayLabel10 = new Label("Saturday");
        saturdayLabel10.setFont((Font.font("Cambria", 16)));
        Label sundayLabel10 = new Label("Sunday");
        sundayLabel10.setFont((Font.font("Cambria", 16)));
        Button homeButton10 = new Button("Home");
        homeButton10.setOnAction(e -> primaryStage.setScene(home));
        Button clearStatsButton10 = new Button("Clear");

        Label statsLabel10 = new Label();
        statsLabel10.setFont((Font.font("Cambria", 16)));
        clearStatsButton10.setOnAction(e -> {
            statsLabel10.setText("");
            statsPercentLabel10.setText("");
            countBoxes10 = 0;
            statsTitle10.setText("");
            mondayLabel10.setTextFill(Color.BLACK);
            tuesdayLabel10.setTextFill(Color.BLACK);
            wednesdayLabel10.setTextFill(Color.BLACK);
            thursdayLabel10.setTextFill(Color.BLACK);
            fridayLabel10.setTextFill(Color.BLACK);
            saturdayLabel10.setTextFill(Color.BLACK);
            sundayLabel10.setTextFill(Color.BLACK);
            cb91.setSelected(false);
            cb92.setSelected(false);
            cb93.setSelected(false);
            cb94.setSelected(false);
            cb95.setSelected(false);
            cb96.setSelected(false);
            cb97.setSelected(false);
        });
        Button caclstatsButton10 = new Button("Calculate");

        statsRootPane10.add(statsTitle10, 0, 0);
        statsRootPane10.add(caclstatsButton10, 0, 3);
        statsRootPane10.add(statsLabel10, 0, 1);
        statsRootPane10.add(statsPercentLabel10, 0, 2);
        statsRootPane10.add(line10, 0, 4);
        statsRootPane10.add(weekLabel10, 0, 5);
        statsRootPane10.add(mondayLabel10, 0, 6);
        statsRootPane10.add(tuesdayLabel10, 0, 7);
        statsRootPane10.add(wednesdayLabel10, 0, 8);
        statsRootPane10.add(thursdayLabel10, 0, 9);
        statsRootPane10.add(fridayLabel10, 0, 10);
        statsRootPane10.add(saturdayLabel10, 0, 11);
        statsRootPane10.add(sundayLabel10, 0, 12);
        statsRootPane10.add(homeButton10, 0, 13);
        statsRootPane10.add(clearStatsButton10, 0, 14);

        // STatsScene11
        GridPane statsRootPane11 = new GridPane();
        {
            statsRootPane11.setPadding(new Insets(25, 25, 25, 25));
            statsRootPane11.setHgap(25);
            statsRootPane11.setVgap(15);
            statsRootPane11.setStyle("-fx-background-color: #B99976;");
        }

        statsScene11 = new Scene(statsRootPane11, 400, 600);
        Line line11 = new Line();
        line11.setStartX(100.0);
        line11.setStartY(150.0);
        line11.setEndX(500.0);
        line11.setEndY(150.0);
        Text statsTitle11 = new Text();
        statsTitle11.setFont((Font.font("Cambria", FontWeight.SEMI_BOLD, 21)));
        Label statsPercentLabel11 = new Label();
        statsPercentLabel11.setFont((Font.font("Cambria", 16)));
        Label weekLabel11 = new Label("You did this habit on: ");
        weekLabel11.setFont((Font.font("Cambria", FontWeight.SEMI_BOLD, 20)));
        Label mondayLabel11 = new Label("Monday");
        mondayLabel11.setFont((Font.font("Cambria", 16)));
        Label tuesdayLabel11 = new Label("Tuesday");
        tuesdayLabel11.setFont((Font.font("Cambria", 16)));
        Label wednesdayLabel11 = new Label("Wednesday");
        wednesdayLabel11.setFont((Font.font("Cambria", 16)));
        Label thursdayLabel11 = new Label("Thursday");
        thursdayLabel11.setFont((Font.font("Cambria", 16)));
        Label fridayLabel11 = new Label("Friday");
        fridayLabel11.setFont((Font.font("Cambria", 16)));
        Label saturdayLabel11 = new Label("Saturday");
        saturdayLabel11.setFont((Font.font("Cambria", 16)));
        Label sundayLabel11 = new Label("Sunday");
        sundayLabel11.setFont((Font.font("Cambria", 16)));
        Button homeButton11 = new Button("Home");
        homeButton11.setOnAction(e -> primaryStage.setScene(home));
        Button clearStatsButton11 = new Button("Clear");

        Label statsLabel11 = new Label();
        statsLabel11.setFont((Font.font("Cambria", 16)));
        clearStatsButton11.setOnAction(e -> {
            statsLabel11.setText("");
            statsPercentLabel11.setText("");
            countBoxes11 = 0;
            statsTitle11.setText("");
            mondayLabel11.setTextFill(Color.BLACK);
            tuesdayLabel11.setTextFill(Color.BLACK);
            wednesdayLabel11.setTextFill(Color.BLACK);
            thursdayLabel11.setTextFill(Color.BLACK);
            fridayLabel11.setTextFill(Color.BLACK);
            saturdayLabel11.setTextFill(Color.BLACK);
            sundayLabel11.setTextFill(Color.BLACK);
            cb101.setSelected(false);
            cb102.setSelected(false);
            cb103.setSelected(false);
            cb104.setSelected(false);
            cb105.setSelected(false);
            cb106.setSelected(false);
            cb107.setSelected(false);
        });
        Button caclstatsButton11 = new Button("Calculate");

        statsRootPane11.add(statsTitle11, 0, 0);
        statsRootPane11.add(caclstatsButton11, 0, 3);
        statsRootPane11.add(statsLabel11, 0, 1);
        statsRootPane11.add(statsPercentLabel11, 0, 2);
        statsRootPane11.add(line11, 0, 4);
        statsRootPane11.add(weekLabel11, 0, 5);
        statsRootPane11.add(mondayLabel11, 0, 6);
        statsRootPane11.add(tuesdayLabel11, 0, 7);
        statsRootPane11.add(wednesdayLabel11, 0, 8);
        statsRootPane11.add(thursdayLabel11, 0, 9);
        statsRootPane11.add(fridayLabel11, 0, 10);
        statsRootPane11.add(saturdayLabel11, 0, 11);
        statsRootPane11.add(sundayLabel11, 0, 12);
        statsRootPane11.add(homeButton11, 0, 13);
        statsRootPane11.add(clearStatsButton11, 0, 14);

        // STatsScene12
        GridPane statsRootPane12 = new GridPane();
        {
            statsRootPane12.setPadding(new Insets(25, 25, 25, 25));
            statsRootPane12.setHgap(25);
            statsRootPane12.setVgap(15);
            statsRootPane12.setStyle("-fx-background-color: #B99976;");
        }

        statsScene12 = new Scene(statsRootPane12, 400, 600);
        Line line12 = new Line();
        line12.setStartX(100.0);
        line12.setStartY(150.0);
        line12.setEndX(500.0);
        line12.setEndY(150.0);
        Text statsTitle12 = new Text();
        statsTitle12.setFont((Font.font("Cambria", FontWeight.SEMI_BOLD, 21)));
        Label statsPercentLabel12 = new Label();
        statsPercentLabel12.setFont((Font.font("Cambria", 16)));
        Label weekLabel12 = new Label("You did this habit on: ");
        weekLabel12.setFont((Font.font("Cambria", FontWeight.SEMI_BOLD, 20)));
        Label mondayLabel12 = new Label("Monday");
        mondayLabel12.setFont((Font.font("Cambria", 16)));
        Label tuesdayLabel12 = new Label("Tuesday");
        tuesdayLabel12.setFont((Font.font("Cambria", 16)));
        Label wednesdayLabel12 = new Label("Wednesday");
        wednesdayLabel12.setFont((Font.font("Cambria", 16)));
        Label thursdayLabel12 = new Label("Thursday");
        thursdayLabel12.setFont((Font.font("Cambria", 16)));
        Label fridayLabel12 = new Label("Friday");
        fridayLabel12.setFont((Font.font("Cambria", 16)));
        Label saturdayLabel12 = new Label("Saturday");
        saturdayLabel12.setFont((Font.font("Cambria", 16)));
        Label sundayLabel12 = new Label("Sunday");
        sundayLabel12.setFont((Font.font("Cambria", 16)));
        Button homeButton12 = new Button("Home");
        homeButton12.setOnAction(e -> primaryStage.setScene(home));
        Button clearStatsButton12 = new Button("Clear");

        Label statsLabel12 = new Label();
        statsLabel12.setFont((Font.font("Cambria", 16)));
        clearStatsButton12.setOnAction(e -> {
            statsLabel12.setText("");
            statsPercentLabel12.setText("");
            countBoxes12 = 0;
            statsTitle12.setText("");
            mondayLabel12.setTextFill(Color.BLACK);
            tuesdayLabel12.setTextFill(Color.BLACK);
            wednesdayLabel12.setTextFill(Color.BLACK);
            thursdayLabel12.setTextFill(Color.BLACK);
            fridayLabel12.setTextFill(Color.BLACK);
            saturdayLabel12.setTextFill(Color.BLACK);
            sundayLabel12.setTextFill(Color.BLACK);
            cb111.setSelected(false);
            cb112.setSelected(false);
            cb113.setSelected(false);
            cb114.setSelected(false);
            cb115.setSelected(false);
            cb116.setSelected(false);
            cb117.setSelected(false);
            
        });
        Button caclstatsButton12 = new Button("Calculate");

        statsRootPane12.add(statsTitle12, 0, 0);
        statsRootPane12.add(caclstatsButton12, 0, 3);
        statsRootPane12.add(statsLabel12, 0, 1);
        statsRootPane12.add(statsPercentLabel12, 0, 2);
        statsRootPane12.add(line12, 0, 4);
        statsRootPane12.add(weekLabel12, 0, 5);
        statsRootPane12.add(mondayLabel12, 0, 6);
        statsRootPane12.add(tuesdayLabel12, 0, 7);
        statsRootPane12.add(wednesdayLabel12, 0, 8);
        statsRootPane12.add(thursdayLabel12, 0, 9);
        statsRootPane12.add(fridayLabel12, 0, 10);
        statsRootPane12.add(saturdayLabel12, 0, 11);
        statsRootPane12.add(sundayLabel12, 0, 12);
        statsRootPane12.add(homeButton12, 0, 13);
        statsRootPane12.add(clearStatsButton12, 0, 14);

        // Add A Habit GridPane
        GridPane addHabitRootPane = new GridPane();
        {
            addHabitRootPane.setPadding(new Insets(25, 25, 25, 25));
            addHabitRootPane.setHgap(25);
            addHabitRootPane.setVgap(15);
            addHabitRootPane.setStyle("-fx-background-color: #B99976;");

        }

        // ADD A HABIT SCENE
        addAHabitScene = new Scene(addHabitRootPane, 400, 600);

        Text text1 = new Text("Add A New Habit");
        text1.setFont(Font.font("Cambria", FontWeight.BOLD, 22));
        Label nameLabel = new Label("Habit name:");
        TextField addNameInput = new TextField();
        Label descriptionLabel = new Label("Description of Habit:");
        TextField decriptionInput = new TextField();
        Button createHabitButton = new Button();
        {
            createHabitButton.setText("Start tracking your habit");
        }
        Button clearButton = new Button();
        {
            clearButton.setText("Clear");
        }
        clearButton.setOnAction(e -> {
            addNameInput.clear();
            decriptionInput.clear();

        });

        Label colorpickLabel = new Label("Pick desired color:");
        ColorPicker habitColor = new ColorPicker();
        {
            habitColor.getStyleClass().add("split-button");

        }

        ComboBox<String> habitCategoryComboBox = new ComboBox<>();
        Label habitCategoryLabel = new Label("Choose a category for your habit:");
        habitCategoryComboBox.setEditable(false);
        habitCategoryComboBox.getItems().add("Exercise");
        habitCategoryComboBox.getItems().add("Financial");
        habitCategoryComboBox.getItems().add("Health");
        habitCategoryComboBox.getItems().add("Wellbeing");
        habitCategoryComboBox.getItems().add("Around the House");
        habitCategoryComboBox.getItems().add("Custom Habit");

        Label exerciseComboLabel = new Label("Choose a sub category: ");
        final ComboBox<String> exerciseComboBox = new ComboBox<String>();
        exerciseComboBox.getItems().addAll(
                "Cardio",
                "Lifting",
                "Swimming",
                "Yoga",
                "Burn Calories",
                "Anaerobic");
        Label financialComboLabel = new Label("Choose a sub category: ");
        final ComboBox<String> financialComboBox = new ComboBox<String>();
        financialComboBox.getItems().addAll(
                "Save money",
                "No-spending",
                "Track expenses",
                "Follow a Budget",
                "Pay off Debt");

        Label healthComboLabel = new Label("Choose a sub category: ");
        final ComboBox<String> healthComboBox = new ComboBox<String>();
        healthComboBox.getItems().addAll(
                "Drink Water",
                "Eat Fruits",
                "Eat Vegetables",
                "No sugar",
                "Sleep early");

        Label wellbeingComboLabel = new Label("Choose a sub category: ");
        final ComboBox<String> wellbeingComboBox = new ComboBox<String>();
        wellbeingComboBox.getItems().addAll(
                "Breathing",
                "Meditation",
                "Read a Book",
                "Learning",
                "Review Today",
                "Mind Clearning Activity",
                "Journaling");

        Label houseComboLabel = new Label("Choose a sub category: ");
        final ComboBox<String> houseComboBox = new ComboBox<String>();
        houseComboBox.getItems().addAll(
                "Cleaning",
                "Organizing",
                "Meal Prep",
                "Check Email",
                "Homework",
                "Finish To-Do List"

        );

        var comboBoxIndex = new int[] { habitCategoryComboBox.getSelectionModel().getSelectedIndex() };

        addHabitRootPane.add(text1, 0, 0);
        addHabitRootPane.add(habitCategoryLabel, 0, 1);
        addHabitRootPane.add(habitCategoryComboBox, 1, 1);
        addHabitRootPane.add(nameLabel, 0, 2);
        addHabitRootPane.add(addNameInput, 1, 2);
        addHabitRootPane.add(descriptionLabel, 0, 3);
        addHabitRootPane.add(decriptionInput, 1, 3);

        // ADD A HABIT 2
        GridPane addHabitRootPane2 = new GridPane();
        {
            addHabitRootPane2.setPadding(new Insets(25, 25, 25, 25));
            addHabitRootPane2.setHgap(25);
            addHabitRootPane2.setVgap(15);
            addHabitRootPane2.setStyle("-fx-background-color: #B99976;");
        }

        addAHabitScene2 = new Scene(addHabitRootPane2, 400, 600);

        Label label2 = new Label("Add A New Habit");
        label2.setFont(Font.font("Cambria", FontWeight.BOLD, 20));
        Label nameLabel2 = new Label("Habit name:");
        TextField addNameInput2 = new TextField();
        Label descriptionLabel2 = new Label("Description of Habit:");
        TextField decriptionInput2 = new TextField();
        Button createHabitButton2 = new Button();
        {
            createHabitButton2.setText("Start tracking your habit");
        }
        createHabitButton2.setOnAction(e -> primaryStage.setScene(home));

        Button clearButton2 = new Button();
        {
            clearButton2.setText("Clear");
        }
        clearButton2.setOnAction(e -> {
            addNameInput2.clear();
            decriptionInput2.clear();

        });

        Label colorpickLabel2 = new Label("Pick desired color:");
        ColorPicker habitColor2 = new ColorPicker();
        {
            habitColor2.getStyleClass().add("split-button");

        }

        ComboBox<String> habitCategoryComboBox2 = new ComboBox<>();
        Label habitCategoryLabel2 = new Label("Choose a category for your habit:");
        habitCategoryComboBox2.setEditable(false);
        habitCategoryComboBox2.getItems().add("Exercise");
        habitCategoryComboBox2.getItems().add("Financial");
        habitCategoryComboBox2.getItems().add("Health");
        habitCategoryComboBox2.getItems().add("Wellbeing");
        habitCategoryComboBox2.getItems().add("Around the House");
        habitCategoryComboBox2.getItems().add("Custom Habit");

        Label exerciseComboLabel2 = new Label("Choose a sub category: ");
        final ComboBox<String> exerciseComboBox2 = new ComboBox<String>();
        exerciseComboBox2.getItems().addAll(
                "Cardio",
                "Lifting",
                "Swimming",
                "Yoga",
                "Burn Calories",
                "Anaerobic");
        Label financialComboLabel2 = new Label("Choose a sub category: ");
        final ComboBox<String> financialComboBox2 = new ComboBox<String>();
        financialComboBox2.getItems().addAll(
                "Save money",
                "No-spending",
                "Track expenses",
                "Follow a Budget",
                "Pay off Debt");

        Label healthComboLabel2 = new Label("Choose a sub category: ");
        final ComboBox<String> healthComboBox2 = new ComboBox<String>();
        healthComboBox2.getItems().addAll(
                "Drink Water",
                "Eat Fruits",
                "Eat Vegetables",
                "No sugar",
                "Sleep early");

        Label wellbeingComboLabel2 = new Label("Choose a sub category: ");
        final ComboBox<String> wellbeingComboBox2 = new ComboBox<String>();
        wellbeingComboBox2.getItems().addAll(
                "Breathing",
                "Meditation",
                "Read a Book",
                "Learning",
                "Review Today",
                "Mind Clearning Activity",
                "Journaling");

        Label houseComboLabel2 = new Label("Choose a sub category: ");
        final ComboBox<String> houseComboBox2 = new ComboBox<String>();
        houseComboBox2.getItems().addAll(
                "Cleaning",
                "Organizing",
                "Meal Prep",
                "Check Email",
                "Homework",
                "Finish To-Do List"

        );

        var comboBoxIndex2 = new int[] { habitCategoryComboBox2.getSelectionModel().getSelectedIndex() };

        addHabitRootPane2.add(label2, 0, 0);
        addHabitRootPane2.add(habitCategoryLabel2, 0, 1);
        addHabitRootPane2.add(habitCategoryComboBox2, 1, 1);
        addHabitRootPane2.add(nameLabel2, 0, 2);
        addHabitRootPane2.add(addNameInput2, 1, 2);
        addHabitRootPane2.add(descriptionLabel2, 0, 3);
        addHabitRootPane2.add(decriptionInput2, 1, 3);

        // ADD A HABIT SCENE 3
        GridPane addHabitRootPane3 = new GridPane();
        {

            addHabitRootPane3.setPadding(new Insets(25, 25, 25, 25));
            addHabitRootPane3.setHgap(25);
            addHabitRootPane3.setVgap(15);
            addHabitRootPane3.setStyle("-fx-background-color: #B99976;");

        }

        // ADD A HABIT SCENE 3
        addAHabitScene3 = new Scene(addHabitRootPane3, 400, 600);

        Label label3 = new Label("Add A New Habit");
        label3.setFont(Font.font("Cambria", FontWeight.BOLD, 20));
        Label nameLabel3 = new Label("Habit name:");
        TextField addNameInput3 = new TextField();
        Label descriptionLabel3 = new Label("Description of Habit:");
        TextField decriptionInput3 = new TextField();
        Button createHabitButton3 = new Button();
        {
            createHabitButton3.setText("Start tracking your habit");
        }
        createHabitButton3.setOnAction(e -> primaryStage.setScene(home));

        Button clearButton3 = new Button();
        {
            clearButton3.setText("Clear");
        }
        clearButton3.setOnAction(e -> {
            addNameInput3.clear();
            decriptionInput3.clear();

        });

        Label colorpickLabel3 = new Label("Pick desired color:");
        ColorPicker habitColor3 = new ColorPicker();
        {
            habitColor3.getStyleClass().add("split-button");

        }

        ComboBox<String> habitCategoryComboBox3 = new ComboBox<>();
        Label habitCategoryLabel3 = new Label("Choose a category for your habit:");
        habitCategoryComboBox3.setEditable(false);
        habitCategoryComboBox3.getItems().add("Exercise");
        habitCategoryComboBox3.getItems().add("Financial");
        habitCategoryComboBox3.getItems().add("Health");
        habitCategoryComboBox3.getItems().add("Wellbeing");
        habitCategoryComboBox3.getItems().add("Around the House");
        habitCategoryComboBox3.getItems().add("Custom Habit");

        Label exerciseComboLabel3 = new Label("Choose a sub category: ");
        final ComboBox<String> exerciseComboBox3 = new ComboBox<String>();
        exerciseComboBox3.getItems().addAll(
                "Cardio",
                "Lifting",
                "Swimming",
                "Yoga",
                "Burn Calories",
                "Anaerobic");
        Label financialComboLabel3 = new Label("Choose a sub category: ");
        final ComboBox<String> financialComboBox3 = new ComboBox<String>();
        financialComboBox3.getItems().addAll(
                "Save money",
                "No-spending",
                "Track expenses",
                "Follow a Budget",
                "Pay off Debt");

        Label healthComboLabel3 = new Label("Choose a sub category: ");
        final ComboBox<String> healthComboBox3 = new ComboBox<String>();
        healthComboBox3.getItems().addAll(
                "Drink Water",
                "Eat Fruits",
                "Eat Vegetables",
                "No sugar",
                "Sleep early");

        Label wellbeingComboLabel3 = new Label("Choose a sub category: ");
        final ComboBox<String> wellbeingComboBox3 = new ComboBox<String>();
        wellbeingComboBox3.getItems().addAll(
                "Breathing",
                "Meditation",
                "Read a Book",
                "Learning",
                "Review Today",
                "Mind Clearning Activity",
                "Journaling");

        Label houseComboLabel3 = new Label("Choose a sub category: ");
        final ComboBox<String> houseComboBox3 = new ComboBox<String>();
        houseComboBox3.getItems().addAll(
                "Cleaning",
                "Organizing",
                "Meal Prep",
                "Check Email",
                "Homework",
                "Finish To-Do List"

        );

        var comboBoxIndex3 = new int[] { habitCategoryComboBox3.getSelectionModel().getSelectedIndex() };

        addHabitRootPane3.add(label3, 0, 0);
        addHabitRootPane3.add(habitCategoryLabel3, 0, 1);
        addHabitRootPane3.add(habitCategoryComboBox3, 1, 1);
        addHabitRootPane3.add(nameLabel3, 0, 2);
        addHabitRootPane3.add(addNameInput3, 1, 2);
        addHabitRootPane3.add(descriptionLabel3, 0, 3);
        addHabitRootPane3.add(decriptionInput3, 1, 3);

        // ADD A HABIT SCENE 4
        GridPane addHabitRootPane4 = new GridPane();
        {
            addHabitRootPane4.setPadding(new Insets(25, 25, 25, 25));
            addHabitRootPane4.setHgap(25);
            addHabitRootPane4.setVgap(15);
            addHabitRootPane4.setStyle("-fx-background-color: #B99976;");

        }

        // ADD A HABIT SCENE 4
        addAHabitScene4 = new Scene(addHabitRootPane4, 400, 600);

        Label label4 = new Label("Add A New Habit");
        label4.setFont(Font.font("Cambria", FontWeight.BOLD, 20));
        Label nameLabel4 = new Label("Habit name:");
        TextField addNameInput4 = new TextField();
        Label descriptionLabel4 = new Label("Description of Habit:");
        TextField decriptionInput4 = new TextField();
        Button createHabitButton4 = new Button();
        {
            createHabitButton4.setText("Start tracking your habit");
        }
        createHabitButton4.setOnAction(e -> primaryStage.setScene(home));

        Button clearButton4 = new Button();
        {
            clearButton4.setText("Clear");
        }
        clearButton4.setOnAction(e -> {
            addNameInput4.clear();
            decriptionInput4.clear();

        });

        Label colorpickLabel4 = new Label("Pick desired color:");
        ColorPicker habitColor4 = new ColorPicker();
        {
            habitColor4.getStyleClass().add("split-button");

        }

        ComboBox<String> habitCategoryComboBox4 = new ComboBox<>();
        Label habitCategoryLabel4 = new Label("Choose a category for your habit:");
        habitCategoryComboBox4.setEditable(false);
        habitCategoryComboBox4.getItems().add("Exercise");
        habitCategoryComboBox4.getItems().add("Financial");
        habitCategoryComboBox4.getItems().add("Health");
        habitCategoryComboBox4.getItems().add("Wellbeing");
        habitCategoryComboBox4.getItems().add("Around the House");
        habitCategoryComboBox4.getItems().add("Custom Habit");

        Label exerciseComboLabel4 = new Label("Choose a sub category: ");
        final ComboBox<String> exerciseComboBox4 = new ComboBox<String>();
        exerciseComboBox4.getItems().addAll(
                "Cardio",
                "Lifting",
                "Swimming",
                "Yoga",
                "Burn Calories",
                "Anaerobic");
        Label financialComboLabel4 = new Label("Choose a sub category: ");
        final ComboBox<String> financialComboBox4 = new ComboBox<String>();
        financialComboBox4.getItems().addAll(
                "Save money",
                "No-spending",
                "Track expenses",
                "Follow a Budget",
                "Pay off Debt");

        Label healthComboLabel4 = new Label("Choose a sub category: ");
        final ComboBox<String> healthComboBox4 = new ComboBox<String>();
        healthComboBox4.getItems().addAll(
                "Drink Water",
                "Eat Fruits",
                "Eat Vegetables",
                "No sugar",
                "Sleep early");

        Label wellbeingComboLabel4 = new Label("Choose a sub category: ");
        final ComboBox<String> wellbeingComboBox4 = new ComboBox<String>();
        wellbeingComboBox4.getItems().addAll(
                "Breathing",
                "Meditation",
                "Read a Book",
                "Learning",
                "Review Today",
                "Mind Clearning Activity",
                "Journaling");

        Label houseComboLabel4 = new Label("Choose a sub category: ");
        final ComboBox<String> houseComboBox4 = new ComboBox<String>();
        houseComboBox4.getItems().addAll(
                "Cleaning",
                "Organizing",
                "Meal Prep",
                "Check Email",
                "Homework",
                "Finish To-Do List"

        );

        var comboBoxIndex4 = new int[] { habitCategoryComboBox4.getSelectionModel().getSelectedIndex() };

        addHabitRootPane4.add(label4, 0, 0);
        addHabitRootPane4.add(habitCategoryLabel4, 0, 1);
        addHabitRootPane4.add(habitCategoryComboBox4, 1, 1);
        addHabitRootPane4.add(nameLabel4, 0, 2);
        addHabitRootPane4.add(addNameInput4, 1, 2);
        addHabitRootPane4.add(descriptionLabel4, 0, 3);
        addHabitRootPane4.add(decriptionInput4, 1, 3);

        // ADD A HABIT 5
        GridPane addHabitRootPane5 = new GridPane();
        {
            addHabitRootPane5.setPadding(new Insets(25, 25, 25, 25));
            addHabitRootPane5.setHgap(25);
            addHabitRootPane5.setVgap(15);
            addHabitRootPane5.setStyle("-fx-background-color: #B99976;");

        }

        // ADD A HABIT SCENE
        addAHabitScene5 = new Scene(addHabitRootPane5, 400, 600);

        Label label5 = new Label("Add A New Habit");
        label5.setFont(Font.font("Cambria", FontWeight.BOLD, 20));
        Label nameLabel5 = new Label("Habit name:");
        TextField addNameInput5 = new TextField();
        Label descriptionLabel5 = new Label("Description of Habit:");
        TextField decriptionInput5 = new TextField();
        Button createHabitButton5 = new Button();
        {
            createHabitButton5.setText("Start tracking your habit");
        }
        createHabitButton5.setOnAction(e -> primaryStage.setScene(home));

        Button clearButton5 = new Button();
        {
            clearButton5.setText("Clear");
        }
        clearButton5.setOnAction(e -> {
            addNameInput5.clear();
            decriptionInput5.clear();

        });

        Label colorpickLabel5 = new Label("Pick desired color:");
        ColorPicker habitColor5 = new ColorPicker();
        {
            habitColor5.getStyleClass().add("split-button");

        }

        ComboBox<String> habitCategoryComboBox5 = new ComboBox<>();
        Label habitCategoryLabel5 = new Label("Choose a category for your habit:");
        habitCategoryComboBox5.setEditable(false);
        habitCategoryComboBox5.getItems().add("Exercise");
        habitCategoryComboBox5.getItems().add("Financial");
        habitCategoryComboBox5.getItems().add("Health");
        habitCategoryComboBox5.getItems().add("Wellbeing");
        habitCategoryComboBox5.getItems().add("Around the House");
        habitCategoryComboBox5.getItems().add("Custom Habit");

        Label exerciseComboLabel5 = new Label("Choose a sub category: ");
        final ComboBox<String> exerciseComboBox5 = new ComboBox<String>();
        exerciseComboBox5.getItems().addAll(
                "Cardio",
                "Lifting",
                "Swimming",
                "Yoga",
                "Burn Calories",
                "Anaerobic");
        Label financialComboLabel5 = new Label("Choose a sub category: ");
        final ComboBox<String> financialComboBox5 = new ComboBox<String>();
        financialComboBox5.getItems().addAll(
                "Save money",
                "No-spending",
                "Track expenses",
                "Follow a Budget",
                "Pay off Debt");

        Label healthComboLabel5 = new Label("Choose a sub category: ");
        final ComboBox<String> healthComboBox5 = new ComboBox<String>();
        healthComboBox5.getItems().addAll(
                "Drink Water",
                "Eat Fruits",
                "Eat Vegetables",
                "No sugar",
                "Sleep early");

        Label wellbeingComboLabel5 = new Label("Choose a sub category: ");
        final ComboBox<String> wellbeingComboBox5 = new ComboBox<String>();
        wellbeingComboBox5.getItems().addAll(
                "Breathing",
                "Meditation",
                "Read a Book",
                "Learning",
                "Review Today",
                "Mind Clearning Activity",
                "Journaling");

        Label houseComboLabel5 = new Label("Choose a sub category: ");
        final ComboBox<String> houseComboBox5 = new ComboBox<String>();
        houseComboBox5.getItems().addAll(
                "Cleaning",
                "Organizing",
                "Meal Prep",
                "Check Email",
                "Homework",
                "Finish To-Do List"

        );

        var comboBoxIndex5 = new int[] { habitCategoryComboBox5.getSelectionModel().getSelectedIndex() };

        addHabitRootPane5.add(label5, 0, 0);
        addHabitRootPane5.add(habitCategoryLabel5, 0, 1);
        addHabitRootPane5.add(habitCategoryComboBox5, 1, 1);
        addHabitRootPane5.add(nameLabel5, 0, 2);
        addHabitRootPane5.add(addNameInput5, 1, 2);
        addHabitRootPane5.add(descriptionLabel5, 0, 3);
        addHabitRootPane5.add(decriptionInput5, 1, 3);

        // ADD A HABIT 6
        GridPane addHabitRootPane6 = new GridPane();
        {
            addHabitRootPane6.setPadding(new Insets(25, 25, 25, 25));
            addHabitRootPane6.setHgap(25);
            addHabitRootPane6.setVgap(15);
            addHabitRootPane6.setStyle("-fx-background-color: #B99976;");

        }

        // ADD A HABIT SCENE 6
        addAHabitScene6 = new Scene(addHabitRootPane6, 400, 600);

        Label label6 = new Label("Add A New Habit");
        label6.setFont(Font.font("Cambria", FontWeight.BOLD, 20));
        Label nameLabel6 = new Label("Habit name:");
        TextField addNameInput6 = new TextField();
        Label descriptionLabel6 = new Label("Description of Habit:");
        TextField decriptionInput6 = new TextField();
        Button createHabitButton6 = new Button();
        {
            createHabitButton6.setText("Start tracking your habit");
        }
        createHabitButton6.setOnAction(e -> primaryStage.setScene(home));

        Button clearButton6 = new Button();
        {
            clearButton6.setText("Clear");
        }
        clearButton6.setOnAction(e -> {
            addNameInput6.clear();
            decriptionInput6.clear();

        });

        Label colorpickLabel6 = new Label("Pick desired color:");
        ColorPicker habitColor6 = new ColorPicker();
        {
            habitColor6.getStyleClass().add("split-button");

        }

        ComboBox<String> habitCategoryComboBox6 = new ComboBox<>();
        Label habitCategoryLabel6 = new Label("Choose a category for your habit:");
        habitCategoryComboBox6.setEditable(false);
        habitCategoryComboBox6.getItems().add("Exercise");
        habitCategoryComboBox6.getItems().add("Financial");
        habitCategoryComboBox6.getItems().add("Health");
        habitCategoryComboBox6.getItems().add("Wellbeing");
        habitCategoryComboBox6.getItems().add("Around the House");
        habitCategoryComboBox6.getItems().add("Custom Habit");

        Label exerciseComboLabel6 = new Label("Choose a sub category: ");
        final ComboBox<String> exerciseComboBox6 = new ComboBox<String>();
        exerciseComboBox6.getItems().addAll(
                "Cardio",
                "Lifting",
                "Swimming",
                "Yoga",
                "Burn Calories",
                "Anaerobic");
        Label financialComboLabel6 = new Label("Choose a sub category: ");
        final ComboBox<String> financialComboBox6 = new ComboBox<String>();
        financialComboBox6.getItems().addAll(
                "Save money",
                "No-spending",
                "Track expenses",
                "Follow a Budget",
                "Pay off Debt");

        Label healthComboLabel6 = new Label("Choose a sub category: ");
        final ComboBox<String> healthComboBox6 = new ComboBox<String>();
        healthComboBox6.getItems().addAll(
                "Drink Water",
                "Eat Fruits",
                "Eat Vegetables",
                "No sugar",
                "Sleep early");

        Label wellbeingComboLabel6 = new Label("Choose a sub category: ");
        final ComboBox<String> wellbeingComboBox6 = new ComboBox<String>();
        wellbeingComboBox6.getItems().addAll(
                "Breathing",
                "Meditation",
                "Read a Book",
                "Learning",
                "Review Today",
                "Mind Clearning Activity",
                "Journaling");

        Label houseComboLabel6 = new Label("Choose a sub category: ");
        final ComboBox<String> houseComboBox6 = new ComboBox<String>();
        houseComboBox6.getItems().addAll(
                "Cleaning",
                "Organizing",
                "Meal Prep",
                "Check Email",
                "Homework",
                "Finish To-Do List"

        );

        var comboBoxIndex6 = new int[] { habitCategoryComboBox6.getSelectionModel().getSelectedIndex() };

        addHabitRootPane6.add(label6, 0, 0);
        addHabitRootPane6.add(habitCategoryLabel6, 0, 1);
        addHabitRootPane6.add(habitCategoryComboBox6, 1, 1);
        addHabitRootPane6.add(nameLabel6, 0, 2);
        addHabitRootPane6.add(addNameInput6, 1, 2);
        addHabitRootPane6.add(descriptionLabel6, 0, 3);
        addHabitRootPane6.add(decriptionInput6, 1, 3);

        // ADD A HABIT 7
        GridPane addHabitRootPane7 = new GridPane();
        {
            addHabitRootPane7.setPadding(new Insets(25, 25, 25, 25));
            addHabitRootPane7.setHgap(25);
            addHabitRootPane7.setVgap(15);
            addHabitRootPane7.setStyle("-fx-background-color: #B99976;");

        }

        // ADD A HABIT SCENE 7
        addAHabitScene7 = new Scene(addHabitRootPane7, 400, 600);

        Label label7 = new Label("Add A New Habit");
        label7.setFont(Font.font("Cambria", FontWeight.BOLD, 20));
        Label nameLabel7 = new Label("Habit name:");
        TextField addNameInput7 = new TextField();
        Label descriptionLabel7 = new Label("Description of Habit:");
        TextField decriptionInput7 = new TextField();
        Button createHabitButton7 = new Button();
        {
            createHabitButton7.setText("Start tracking your habit");
        }
        createHabitButton7.setOnAction(e -> primaryStage.setScene(home));

        Button clearButton7 = new Button();
        {
            clearButton7.setText("Clear");
        }
        clearButton7.setOnAction(e -> {
            addNameInput7.clear();
            decriptionInput7.clear();

        });

        Label colorpickLabel7 = new Label("Pick desired color:");
        ColorPicker habitColor7 = new ColorPicker();
        {
            habitColor7.getStyleClass().add("split-button");

        }

        ComboBox<String> habitCategoryComboBox7 = new ComboBox<>();
        Label habitCategoryLabel7 = new Label("Choose a category for your habit:");
        habitCategoryComboBox7.setEditable(false);
        habitCategoryComboBox7.getItems().add("Exercise");
        habitCategoryComboBox7.getItems().add("Financial");
        habitCategoryComboBox7.getItems().add("Health");
        habitCategoryComboBox7.getItems().add("Wellbeing");
        habitCategoryComboBox7.getItems().add("Around the House");
        habitCategoryComboBox7.getItems().add("Custom Habit");

        Label exerciseComboLabel7 = new Label("Choose a sub category: ");
        final ComboBox<String> exerciseComboBox7 = new ComboBox<String>();
        exerciseComboBox7.getItems().addAll(
                "Cardio",
                "Lifting",
                "Swimming",
                "Yoga",
                "Burn Calories",
                "Anaerobic");
        Label financialComboLabel7 = new Label("Choose a sub category: ");
        final ComboBox<String> financialComboBox7 = new ComboBox<String>();
        financialComboBox7.getItems().addAll(
                "Save money",
                "No-spending",
                "Track expenses",
                "Follow a Budget",
                "Pay off Debt");

        Label healthComboLabel7 = new Label("Choose a sub category: ");
        final ComboBox<String> healthComboBox7 = new ComboBox<String>();
        healthComboBox7.getItems().addAll(
                "Drink Water",
                "Eat Fruits",
                "Eat Vegetables",
                "No sugar",
                "Sleep early");

        Label wellbeingComboLabel7 = new Label("Choose a sub category: ");
        final ComboBox<String> wellbeingComboBox7 = new ComboBox<String>();
        wellbeingComboBox7.getItems().addAll(
                "Breathing",
                "Meditation",
                "Read a Book",
                "Learning",
                "Review Today",
                "Mind Clearning Activity",
                "Journaling");

        Label houseComboLabel7 = new Label("Choose a sub category: ");
        final ComboBox<String> houseComboBox7 = new ComboBox<String>();
        houseComboBox7.getItems().addAll(
                "Cleaning",
                "Organizing",
                "Meal Prep",
                "Check Email",
                "Homework",
                "Finish To-Do List"

        );

        var comboBoxIndex7 = new int[] { habitCategoryComboBox7.getSelectionModel().getSelectedIndex() };

        addHabitRootPane7.add(label7, 0, 0);
        addHabitRootPane7.add(habitCategoryLabel7, 0, 1);
        addHabitRootPane7.add(habitCategoryComboBox7, 1, 1);
        addHabitRootPane7.add(nameLabel7, 0, 2);
        addHabitRootPane7.add(addNameInput7, 1, 2);
        addHabitRootPane7.add(descriptionLabel7, 0, 3);
        addHabitRootPane7.add(decriptionInput7, 1, 3);

        // ADD A HABIT 8
        GridPane addHabitRootPane8 = new GridPane();
        {
            addHabitRootPane8.setPadding(new Insets(25, 25, 25, 25));
            addHabitRootPane8.setHgap(25);
            addHabitRootPane8.setVgap(15);
            addHabitRootPane8.setStyle("-fx-background-color: #B99976;");

        }

        // ADD A HABIT SCENE 8
        addAHabitScene8 = new Scene(addHabitRootPane8, 400, 600);

        Label label8 = new Label("Add A New Habit");
        label8.setFont(Font.font("Cambria", FontWeight.BOLD, 20));
        Label nameLabel8 = new Label("Habit name:");
        TextField addNameInput8 = new TextField();
        Label descriptionLabel8 = new Label("Description of Habit:");
        TextField decriptionInput8 = new TextField();
        Button createHabitButton8 = new Button();
        {
            createHabitButton8.setText("Start tracking your habit");
        }
        createHabitButton8.setOnAction(e -> primaryStage.setScene(home));

        Button clearButton8 = new Button();
        {
            clearButton8.setText("Clear");
        }
        clearButton8.setOnAction(e -> {
            addNameInput8.clear();
            decriptionInput8.clear();

        });

        Label colorpickLabel8 = new Label("Pick desired color:");
        ColorPicker habitColor8 = new ColorPicker();
        {
            habitColor8.getStyleClass().add("split-button");

        }

        ComboBox<String> habitCategoryComboBox8 = new ComboBox<>();
        Label habitCategoryLabel8 = new Label("Choose a category for your habit:");
        habitCategoryComboBox8.setEditable(false);
        habitCategoryComboBox8.getItems().add("Exercise");
        habitCategoryComboBox8.getItems().add("Financial");
        habitCategoryComboBox8.getItems().add("Health");
        habitCategoryComboBox8.getItems().add("Wellbeing");
        habitCategoryComboBox8.getItems().add("Around the House");
        habitCategoryComboBox8.getItems().add("Custom Habit");

        Label exerciseComboLabel8 = new Label("Choose a sub category: ");
        final ComboBox<String> exerciseComboBox8 = new ComboBox<String>();
        exerciseComboBox8.getItems().addAll(
                "Cardio",
                "Lifting",
                "Swimming",
                "Yoga",
                "Burn Calories",
                "Anaerobic");
        Label financialComboLabel8 = new Label("Choose a sub category: ");
        final ComboBox<String> financialComboBox8 = new ComboBox<String>();
        financialComboBox8.getItems().addAll(
                "Save money",
                "No-spending",
                "Track expenses",
                "Follow a Budget",
                "Pay off Debt");

        Label healthComboLabel8 = new Label("Choose a sub category: ");
        final ComboBox<String> healthComboBox8 = new ComboBox<String>();
        healthComboBox8.getItems().addAll(
                "Drink Water",
                "Eat Fruits",
                "Eat Vegetables",
                "No sugar",
                "Sleep early");

        Label wellbeingComboLabel8 = new Label("Choose a sub category: ");
        final ComboBox<String> wellbeingComboBox8 = new ComboBox<String>();
        wellbeingComboBox8.getItems().addAll(
                "Breathing",
                "Meditation",
                "Read a Book",
                "Learning",
                "Review Today",
                "Mind Clearning Activity",
                "Journaling");

        Label houseComboLabel8 = new Label("Choose a sub category: ");
        final ComboBox<String> houseComboBox8 = new ComboBox<String>();
        houseComboBox8.getItems().addAll(
                "Cleaning",
                "Organizing",
                "Meal Prep",
                "Check Email",
                "Homework",
                "Finish To-Do List"

        );

        var comboBoxIndex8 = new int[] { habitCategoryComboBox.getSelectionModel().getSelectedIndex() };

        addHabitRootPane8.add(label8, 0, 0);
        addHabitRootPane8.add(habitCategoryLabel8, 0, 1);
        addHabitRootPane8.add(habitCategoryComboBox8, 1, 1);
        addHabitRootPane8.add(nameLabel8, 0, 2);
        addHabitRootPane8.add(addNameInput8, 1, 2);
        addHabitRootPane8.add(descriptionLabel8, 0, 3);
        addHabitRootPane8.add(decriptionInput8, 1, 3);

        // ADD A HABIT 9
        GridPane addHabitRootPane9 = new GridPane();
        {
            addHabitRootPane9.setPadding(new Insets(25, 25, 25, 25));
            addHabitRootPane9.setHgap(25);
            addHabitRootPane9.setVgap(15);
            addHabitRootPane9.setStyle("-fx-background-color: #B99976;");

        }

        // ADD A HABIT SCENE 9
        addAHabitScene9 = new Scene(addHabitRootPane9, 400, 600);

        Label label9 = new Label("Add A New Habit");
        label9.setFont(Font.font("Cambria", FontWeight.BOLD, 20));
        Label nameLabel9 = new Label("Habit name:");
        TextField addNameInput9 = new TextField();
        Label descriptionLabel9 = new Label("Description of Habit:");
        TextField decriptionInput9 = new TextField();
        Button createHabitButton9 = new Button();
        {
            createHabitButton9.setText("Start tracking your habit");
        }
        createHabitButton9.setOnAction(e -> primaryStage.setScene(home));

        Button clearButton9 = new Button();
        {
            clearButton9.setText("Clear");
        }
        clearButton9.setOnAction(e -> {
            addNameInput9.clear();
            decriptionInput9.clear();

        });

        Label colorpickLabel9 = new Label("Pick desired color:");
        ColorPicker habitColor9 = new ColorPicker();
        {
            habitColor9.getStyleClass().add("split-button");

        }

        ComboBox<String> habitCategoryComboBox9 = new ComboBox<>();
        Label habitCategoryLabel9 = new Label("Choose a category for your habit:");
        habitCategoryComboBox9.setEditable(false);
        habitCategoryComboBox9.getItems().add("Exercise");
        habitCategoryComboBox9.getItems().add("Financial");
        habitCategoryComboBox9.getItems().add("Health");
        habitCategoryComboBox9.getItems().add("Wellbeing");
        habitCategoryComboBox9.getItems().add("Around the House");
        habitCategoryComboBox9.getItems().add("Custom Habit");

        Label exerciseComboLabel9 = new Label("Choose a sub category: ");
        final ComboBox<String> exerciseComboBox9 = new ComboBox<String>();
        exerciseComboBox9.getItems().addAll(
                "Cardio",
                "Lifting",
                "Swimming",
                "Yoga",
                "Burn Calories",
                "Anaerobic");
        Label financialComboLabel9 = new Label("Choose a sub category: ");
        final ComboBox<String> financialComboBox9 = new ComboBox<String>();
        financialComboBox9.getItems().addAll(
                "Save money",
                "No-spending",
                "Track expenses",
                "Follow a Budget",
                "Pay off Debt");

        Label healthComboLabel9 = new Label("Choose a sub category: ");
        final ComboBox<String> healthComboBox9 = new ComboBox<String>();
        healthComboBox9.getItems().addAll(
                "Drink Water",
                "Eat Fruits",
                "Eat Vegetables",
                "No sugar",
                "Sleep early");

        Label wellbeingComboLabel9 = new Label("Choose a sub category: ");
        final ComboBox<String> wellbeingComboBox9 = new ComboBox<String>();
        wellbeingComboBox9.getItems().addAll(
                "Breathing",
                "Meditation",
                "Read a Book",
                "Learning",
                "Review Today",
                "Mind Clearning Activity",
                "Journaling");

        Label houseComboLabel9 = new Label("Choose a sub category: ");
        final ComboBox<String> houseComboBox9 = new ComboBox<String>();
        houseComboBox9.getItems().addAll(
                "Cleaning",
                "Organizing",
                "Meal Prep",
                "Check Email",
                "Homework",
                "Finish To-Do List"

        );

        var comboBoxIndex9 = new int[] { habitCategoryComboBox9.getSelectionModel().getSelectedIndex() };

        addHabitRootPane9.add(label9, 0, 0);
        addHabitRootPane9.add(habitCategoryLabel9, 0, 1);
        addHabitRootPane9.add(habitCategoryComboBox9, 1, 1);
        addHabitRootPane9.add(nameLabel9, 0, 2);
        addHabitRootPane9.add(addNameInput9, 1, 2);
        addHabitRootPane9.add(descriptionLabel9, 0, 3);
        addHabitRootPane9.add(decriptionInput9, 1, 3);

        // ADD A HABIT 10
        GridPane addHabitRootPane10 = new GridPane();
        {
            addHabitRootPane10.setPadding(new Insets(25, 25, 25, 25));
            addHabitRootPane10.setHgap(25);
            addHabitRootPane10.setVgap(15);
            addHabitRootPane10.setStyle("-fx-background-color: #B99976;");

        }

        // ADD A HABIT SCENE
        addAHabitScene10 = new Scene(addHabitRootPane10, 400, 600);

        Label label10 = new Label("Add A New Habit");
        label10.setFont(Font.font("Cambria", FontWeight.BOLD, 20));
        Label nameLabel10 = new Label("Habit name:");
        TextField addNameInput10 = new TextField();
        Label descriptionLabel10 = new Label("Description of Habit:");
        TextField decriptionInput10 = new TextField();
        Button createHabitButton10 = new Button();
        {
            createHabitButton10.setText("Start tracking your habit");
        }
        createHabitButton10.setOnAction(e -> primaryStage.setScene(home));
        Button clearButton10 = new Button();
        {
            clearButton10.setText("Clear");
        }
        clearButton10.setOnAction(e -> {
            addNameInput10.clear();
            decriptionInput10.clear();

        });

        Label colorpickLabel10 = new Label("Pick desired color:");
        ColorPicker habitColor10 = new ColorPicker();
        {
            habitColor10.getStyleClass().add("split-button");

        }

        ComboBox<String> habitCategoryComboBox10 = new ComboBox<>();
        Label habitCategoryLabel10 = new Label("Choose a category for your habit:");
        habitCategoryComboBox10.setEditable(false);
        habitCategoryComboBox10.getItems().add("Exercise");
        habitCategoryComboBox10.getItems().add("Financial");
        habitCategoryComboBox10.getItems().add("Health");
        habitCategoryComboBox10.getItems().add("Wellbeing");
        habitCategoryComboBox10.getItems().add("Around the House");
        habitCategoryComboBox10.getItems().add("Custom Habit");

        Label exerciseComboLabel10 = new Label("Choose a sub category: ");
        final ComboBox<String> exerciseComboBox10 = new ComboBox<String>();
        exerciseComboBox10.getItems().addAll(
                "Cardio",
                "Lifting",
                "Swimming",
                "Yoga",
                "Burn Calories",
                "Anaerobic");
        Label financialComboLabel10 = new Label("Choose a sub category: ");
        final ComboBox<String> financialComboBox10 = new ComboBox<String>();
        financialComboBox10.getItems().addAll(
                "Save money",
                "No-spending",
                "Track expenses",
                "Follow a Budget",
                "Pay off Debt");

        Label healthComboLabel10 = new Label("Choose a sub category: ");
        final ComboBox<String> healthComboBox10 = new ComboBox<String>();
        healthComboBox10.getItems().addAll(
                "Drink Water",
                "Eat Fruits",
                "Eat Vegetables",
                "No sugar",
                "Sleep early");

        Label wellbeingComboLabel10 = new Label("Choose a sub category: ");
        final ComboBox<String> wellbeingComboBox10 = new ComboBox<String>();
        wellbeingComboBox10.getItems().addAll(
                "Breathing",
                "Meditation",
                "Read a Book",
                "Learning",
                "Review Today",
                "Mind Clearning Activity",
                "Journaling");

        Label houseComboLabel10 = new Label("Choose a sub category: ");
        final ComboBox<String> houseComboBox10 = new ComboBox<String>();
        houseComboBox10.getItems().addAll(
                "Cleaning",
                "Organizing",
                "Meal Prep",
                "Check Email",
                "Homework",
                "Finish To-Do List"

        );

        var comboBoxIndex10 = new int[] { habitCategoryComboBox10.getSelectionModel().getSelectedIndex() };

        addHabitRootPane10.add(label10, 0, 0);
        addHabitRootPane10.add(habitCategoryLabel10, 0, 1);
        addHabitRootPane10.add(habitCategoryComboBox10, 1, 1);
        addHabitRootPane10.add(nameLabel10, 0, 2);
        addHabitRootPane10.add(addNameInput10, 1, 2);
        addHabitRootPane10.add(descriptionLabel10, 0, 3);
        addHabitRootPane10.add(decriptionInput10, 1, 3);

        // ADD A HABIT 11
        GridPane addHabitRootPane11 = new GridPane();
        {
            addHabitRootPane11.setPadding(new Insets(25, 25, 25, 25));
            addHabitRootPane11.setHgap(25);
            addHabitRootPane11.setVgap(15);
            addHabitRootPane11.setStyle("-fx-background-color: #B99976;");

        }

        // ADD A HABIT SCENE 11
        addAHabitScene11 = new Scene(addHabitRootPane11, 400, 600);

        Label label11 = new Label("Add A New Habit");
        label11.setFont(Font.font("Cambria", FontWeight.BOLD, 20));
        Label nameLabel11 = new Label("Habit name:");
        TextField addNameInput11 = new TextField();
        Label descriptionLabel11 = new Label("Description of Habit:");
        TextField decriptionInput11 = new TextField();
        Button createHabitButton11 = new Button();
        {
            createHabitButton11.setText("Start tracking your habit");
        }
        createHabitButton11.setOnAction(e -> primaryStage.setScene(home));

        Button clearButton11 = new Button();
        {
            clearButton11.setText("Clear");
        }
        clearButton11.setOnAction(e -> {
            addNameInput11.clear();
            decriptionInput11.clear();

        });

        Label colorpickLabel11 = new Label("Pick desired color:");
        ColorPicker habitColor11 = new ColorPicker();
        {
            habitColor11.getStyleClass().add("split-button");

        }

        ComboBox<String> habitCategoryComboBox11 = new ComboBox<>();
        Label habitCategoryLabel11 = new Label("Choose a category for your habit:");
        habitCategoryComboBox11.setEditable(false);
        habitCategoryComboBox11.getItems().add("Exercise");
        habitCategoryComboBox11.getItems().add("Financial");
        habitCategoryComboBox11.getItems().add("Health");
        habitCategoryComboBox11.getItems().add("Wellbeing");
        habitCategoryComboBox11.getItems().add("Around the House");
        habitCategoryComboBox11.getItems().add("Custom Habit");

        Label exerciseComboLabel11 = new Label("Choose a sub category: ");
        final ComboBox<String> exerciseComboBox11 = new ComboBox<String>();
        exerciseComboBox11.getItems().addAll(
                "Cardio",
                "Lifting",
                "Swimming",
                "Yoga",
                "Burn Calories",
                "Anaerobic");
        Label financialComboLabel11 = new Label("Choose a sub category: ");
        final ComboBox<String> financialComboBox11 = new ComboBox<String>();
        financialComboBox11.getItems().addAll(
                "Save money",
                "No-spending",
                "Track expenses",
                "Follow a Budget",
                "Pay off Debt");

        Label healthComboLabel11 = new Label("Choose a sub category: ");
        final ComboBox<String> healthComboBox11 = new ComboBox<String>();
        healthComboBox11.getItems().addAll(
                "Drink Water",
                "Eat Fruits",
                "Eat Vegetables",
                "No sugar",
                "Sleep early");

        Label wellbeingComboLabel11 = new Label("Choose a sub category: ");
        final ComboBox<String> wellbeingComboBox11 = new ComboBox<String>();
        wellbeingComboBox11.getItems().addAll(
                "Breathing",
                "Meditation",
                "Read a Book",
                "Learning",
                "Review Today",
                "Mind Clearning Activity",
                "Journaling");

        Label houseComboLabel11 = new Label("Choose a sub category: ");
        final ComboBox<String> houseComboBox11 = new ComboBox<String>();
        houseComboBox11.getItems().addAll(
                "Cleaning",
                "Organizing",
                "Meal Prep",
                "Check Email",
                "Homework",
                "Finish To-Do List"

        );

        var comboBoxIndex11 = new int[] { habitCategoryComboBox11.getSelectionModel().getSelectedIndex() };

        addHabitRootPane11.add(label11, 0, 0);
        addHabitRootPane11.add(habitCategoryLabel11, 0, 1);
        addHabitRootPane11.add(habitCategoryComboBox11, 1, 1);
        addHabitRootPane11.add(nameLabel11, 0, 2);
        addHabitRootPane11.add(addNameInput11, 1, 2);
        addHabitRootPane11.add(descriptionLabel11, 0, 3);
        addHabitRootPane11.add(decriptionInput11, 1, 3);

        // ADD A HABIT 12
        GridPane addHabitRootPane12 = new GridPane();
        {
            addHabitRootPane12.setPadding(new Insets(25, 25, 25, 25));
            addHabitRootPane12.setHgap(25);
            addHabitRootPane12.setVgap(15);
            addHabitRootPane12.setStyle("-fx-background-color: #B99976;");

        }

        // ADD A HABIT SCENE 12
        addAHabitScene12 = new Scene(addHabitRootPane12, 400, 600);

        Label label12 = new Label("Add A New Habit");
        label12.setFont(Font.font("Cambria", FontWeight.BOLD, 20));
        Label nameLabel12 = new Label("Habit name:");
        TextField addNameInput12 = new TextField();
        Label descriptionLabel12 = new Label("Description of Habit:");
        TextField decriptionInput12 = new TextField();
        Button createHabitButton12 = new Button();
        {
            createHabitButton12.setText("Start tracking your habit");
        }
        createHabitButton12.setOnAction(e -> primaryStage.setScene(home));

        Button clearButton12 = new Button();
        {
            clearButton12.setText("Clear");
        }
        clearButton12.setOnAction(e -> {
            addNameInput12.clear();
            decriptionInput12.clear();

        });

        Label colorpickLabel12 = new Label("Pick desired color:");
        ColorPicker habitColor12 = new ColorPicker();
        {
            habitColor12.getStyleClass().add("split-button");

        }

        ComboBox<String> habitCategoryComboBox12 = new ComboBox<>();
        Label habitCategoryLabel12 = new Label("Choose a category for your habit:");
        habitCategoryComboBox12.setEditable(false);
        habitCategoryComboBox12.getItems().add("Exercise");
        habitCategoryComboBox12.getItems().add("Financial");
        habitCategoryComboBox12.getItems().add("Health");
        habitCategoryComboBox12.getItems().add("Wellbeing");
        habitCategoryComboBox12.getItems().add("Around the House");
        habitCategoryComboBox12.getItems().add("Custom Habit");

        Label exerciseComboLabel12 = new Label("Choose a sub category: ");
        final ComboBox<String> exerciseComboBox12 = new ComboBox<String>();
        exerciseComboBox12.getItems().addAll(
                "Cardio",
                "Lifting",
                "Swimming",
                "Yoga",
                "Burn Calories",
                "Anaerobic");
        Label financialComboLabel12 = new Label("Choose a sub category: ");
        final ComboBox<String> financialComboBox12 = new ComboBox<String>();
        financialComboBox12.getItems().addAll(
                "Save money",
                "No-spending",
                "Track expenses",
                "Follow a Budget",
                "Pay off Debt");

        Label healthComboLabel12 = new Label("Choose a sub category: ");
        final ComboBox<String> healthComboBox12 = new ComboBox<String>();
        healthComboBox12.getItems().addAll(
                "Drink Water",
                "Eat Fruits",
                "Eat Vegetables",
                "No sugar",
                "Sleep early");

        Label wellbeingComboLabel12 = new Label("Choose a sub category: ");
        final ComboBox<String> wellbeingComboBox12 = new ComboBox<String>();
        wellbeingComboBox12.getItems().addAll(
                "Breathing",
                "Meditation",
                "Read a Book",
                "Learning",
                "Review Today",
                "Mind Clearning Activity",
                "Journaling");

        Label houseComboLabel12 = new Label("Choose a sub category: ");
        final ComboBox<String> houseComboBox12 = new ComboBox<String>();
        houseComboBox12.getItems().addAll(
                "Cleaning",
                "Organizing",
                "Meal Prep",
                "Check Email",
                "Homework",
                "Finish To-Do List"

        );

        var comboBoxIndex12 = new int[] { habitCategoryComboBox12.getSelectionModel().getSelectedIndex() };

        addHabitRootPane12.add(label12, 0, 0);
        addHabitRootPane12.add(habitCategoryLabel12, 0, 1);
        addHabitRootPane12.add(habitCategoryComboBox12, 1, 1);
        addHabitRootPane12.add(nameLabel12, 0, 2);
        addHabitRootPane12.add(addNameInput12, 1, 2);
        addHabitRootPane12.add(descriptionLabel12, 0, 3);
        addHabitRootPane12.add(decriptionInput12, 1, 3);

        primaryStage.setScene(home);

        primaryStage.show();

        /* EVENT HANDLERS */
        habitCategoryComboBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                addHabitRootPane.getChildren().clear();
                addHabitRootPane.add(text1, 0, 0, 2, 1);
                addHabitRootPane.add(habitCategoryLabel, 0, 1);
                addHabitRootPane.add(habitCategoryComboBox, 1, 1);
                addHabitRootPane.add(nameLabel, 0, 3);
                addHabitRootPane.add(addNameInput, 1, 3);
                addHabitRootPane.add(descriptionLabel, 0, 4);
                addHabitRootPane.add(decriptionInput, 1, 4);
                comboBoxIndex[0] = habitCategoryComboBox.getSelectionModel().getSelectedIndex();
                switch (comboBoxIndex[0]) {
                    case 0 -> { // EXERCISE
                        addHabitRootPane.add(exerciseComboLabel, 0, 2);
                        addHabitRootPane.add(exerciseComboBox, 1, 2);
                    }
                    case 1 -> { // FINANCIAL
                        addHabitRootPane.add(financialComboLabel, 0, 2);
                        addHabitRootPane.add(financialComboBox, 1, 2);

                    }
                    case 2 -> { // HEALTH
                        addHabitRootPane.add(healthComboLabel, 0, 2);
                        addHabitRootPane.add(healthComboBox, 1, 2);

                    }
                    case 3 -> { // WELLBEING
                        addHabitRootPane.add(wellbeingComboLabel, 0, 2);
                        addHabitRootPane.add(wellbeingComboBox, 1, 2);

                    }
                    case 4 -> { // HOUSE
                        addHabitRootPane.add(houseComboLabel, 0, 2);
                        addHabitRootPane.add(houseComboBox, 1, 2);

                    }
                    default -> {

                    }

                }

                addHabitRootPane.add(createHabitButton, 1, 7);
                addHabitRootPane.add(colorpickLabel, 0, 5);
                addHabitRootPane.add(habitColor, 1, 5);
                addHabitRootPane.add(clearButton, 0, 7);
            }

        });

        habitColor.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Color color = habitColor.getValue();
                if (color != null) {
                    button2.setStyle("-fx-background-color:" + color.toString().replace("0x", "#"));
                    statsButton2.setStyle("-fx-background-color:" + color.toString().replace("0x", "#"));
                    cb01.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb02.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb03.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb04.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb05.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb06.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb07.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));

                }

            }

        });
        // HABIT 2
        habitCategoryComboBox2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                addHabitRootPane2.getChildren().clear();
                addHabitRootPane2.add(label2, 0, 0, 2, 1);
                addHabitRootPane2.add(habitCategoryLabel2, 0, 1);
                addHabitRootPane2.add(habitCategoryComboBox2, 1, 1);
                addHabitRootPane2.add(nameLabel2, 0, 3);
                addHabitRootPane2.add(addNameInput2, 1, 3);
                addHabitRootPane2.add(descriptionLabel2, 0, 4);
                addHabitRootPane2.add(decriptionInput2, 1, 4);
                comboBoxIndex2[0] = habitCategoryComboBox2.getSelectionModel().getSelectedIndex();
                switch (comboBoxIndex2[0]) {
                    case 0 -> { // EXERCISE
                        addHabitRootPane2.add(exerciseComboLabel2, 0, 2);
                        addHabitRootPane2.add(exerciseComboBox2, 1, 2);
                    }
                    case 1 -> { // FINANCIAL
                        addHabitRootPane2.add(financialComboLabel2, 0, 2);
                        addHabitRootPane2.add(financialComboBox2, 1, 2);

                    }
                    case 2 -> { // HEALTH
                        addHabitRootPane2.add(healthComboLabel2, 0, 2);
                        addHabitRootPane2.add(healthComboBox2, 1, 2);

                    }
                    case 3 -> { // WELLBEING
                        addHabitRootPane2.add(wellbeingComboLabel2, 0, 2);
                        addHabitRootPane2.add(wellbeingComboBox2, 1, 2);

                    }
                    case 4 -> { // HOUSE
                        addHabitRootPane2.add(houseComboLabel2, 0, 2);
                        addHabitRootPane2.add(houseComboBox2, 1, 2);

                    }
                    default -> {

                    }

                }

                addHabitRootPane2.add(createHabitButton2, 1, 7);
                addHabitRootPane2.add(colorpickLabel2, 0, 5);
                addHabitRootPane2.add(habitColor2, 1, 5);
                addHabitRootPane2.add(clearButton2, 0, 7);
            }

        });

        habitColor2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Color color = habitColor2.getValue();
                if (color != null) {
                    button3.setStyle("-fx-background-color:" + color.toString().replace("0x", "#"));
                    statsButton3.setStyle("-fx-background-color:" + color.toString().replace("0x", "#"));
                    cb1.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb2.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb3.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb4.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb5.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb6.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb7.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                }

            }

        });
        // HABIT 3
        habitCategoryComboBox3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                addHabitRootPane3.getChildren().clear();
                addHabitRootPane3.add(label3, 0, 0, 2, 1);
                addHabitRootPane3.add(habitCategoryLabel3, 0, 1);
                addHabitRootPane3.add(habitCategoryComboBox3, 1, 1);
                addHabitRootPane3.add(nameLabel3, 0, 3);
                addHabitRootPane3.add(addNameInput3, 1, 3);
                addHabitRootPane3.add(descriptionLabel3, 0, 4);
                addHabitRootPane3.add(decriptionInput3, 1, 4);
                comboBoxIndex3[0] = habitCategoryComboBox3.getSelectionModel().getSelectedIndex();
                switch (comboBoxIndex3[0]) {
                    case 0 -> { // EXERCISE
                        addHabitRootPane3.add(exerciseComboLabel3, 0, 2);
                        addHabitRootPane3.add(exerciseComboBox3, 1, 2);
                    }
                    case 1 -> { // FINANCIAL
                        addHabitRootPane3.add(financialComboLabel3, 0, 2);
                        addHabitRootPane3.add(financialComboBox3, 1, 2);

                    }
                    case 2 -> { // HEALTH
                        addHabitRootPane3.add(healthComboLabel3, 0, 2);
                        addHabitRootPane3.add(healthComboBox3, 1, 2);

                    }
                    case 3 -> { // WELLBEING
                        addHabitRootPane3.add(wellbeingComboLabel3, 0, 2);
                        addHabitRootPane3.add(wellbeingComboBox3, 1, 2);

                    }
                    case 4 -> { // HOUSE
                        addHabitRootPane3.add(houseComboLabel3, 0, 2);
                        addHabitRootPane3.add(houseComboBox3, 1, 2);

                    }
                    default -> {

                    }

                }

                addHabitRootPane3.add(createHabitButton3, 1, 7);
                addHabitRootPane3.add(colorpickLabel3, 0, 5);
                addHabitRootPane3.add(habitColor3, 1, 5);
                addHabitRootPane3.add(clearButton3, 0, 7);

            }

        });

        habitColor3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Color color = habitColor3.getValue();
                if (color != null) {
                    button4.setStyle("-fx-background-color:" + color.toString().replace("0x", "#"));
                    statsButton4.setStyle("-fx-background-color:" + color.toString().replace("0x", "#"));
                    cb21.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb22.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb23.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb24.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb25.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb26.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb27.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                }

            }

        });
        // HABIT 4
        habitCategoryComboBox4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                addHabitRootPane4.getChildren().clear();
                addHabitRootPane4.add(label4, 0, 0, 2, 1);
                addHabitRootPane4.add(habitCategoryLabel4, 0, 1);
                addHabitRootPane4.add(habitCategoryComboBox4, 1, 1);
                addHabitRootPane4.add(nameLabel4, 0, 3);
                addHabitRootPane4.add(addNameInput4, 1, 3);
                addHabitRootPane4.add(descriptionLabel4, 0, 4);
                addHabitRootPane4.add(decriptionInput4, 1, 4);
                comboBoxIndex4[0] = habitCategoryComboBox4.getSelectionModel().getSelectedIndex();
                switch (comboBoxIndex4[0]) {
                    case 0 -> { // EXERCISE
                        addHabitRootPane4.add(exerciseComboLabel4, 0, 2);
                        addHabitRootPane4.add(exerciseComboBox4, 1, 2);
                    }
                    case 1 -> { // FINANCIAL
                        addHabitRootPane4.add(financialComboLabel4, 0, 2);
                        addHabitRootPane4.add(financialComboBox4, 1, 2);

                    }
                    case 2 -> { // HEALTH
                        addHabitRootPane4.add(healthComboLabel4, 0, 2);
                        addHabitRootPane4.add(healthComboBox4, 1, 2);

                    }
                    case 3 -> { // WELLBEING
                        addHabitRootPane4.add(wellbeingComboLabel4, 0, 2);
                        addHabitRootPane4.add(wellbeingComboBox4, 1, 2);

                    }
                    case 4 -> { // HOUSE
                        addHabitRootPane4.add(houseComboLabel4, 0, 2);
                        addHabitRootPane4.add(houseComboBox4, 1, 2);

                    }
                    default -> {

                    }

                }

                addHabitRootPane4.add(createHabitButton4, 1, 7);
                addHabitRootPane4.add(colorpickLabel4, 0, 5);
                addHabitRootPane4.add(habitColor4, 1, 5);
                addHabitRootPane4.add(clearButton4, 0, 7);
            }

        });

        habitColor4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Color color = habitColor4.getValue();
                if (color != null) {
                    button5.setStyle("-fx-background-color:" + color.toString().replace("0x", "#"));
                    statsButton5.setStyle("-fx-background-color:" + color.toString().replace("0x", "#"));
                    cb31.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb32.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb33.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb34.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb35.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb36.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb37.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                }

            }

        });
        // HABIT 5
        habitCategoryComboBox5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                addHabitRootPane5.getChildren().clear();
                addHabitRootPane5.add(label5, 0, 0, 2, 1);
                addHabitRootPane5.add(habitCategoryLabel5, 0, 1);
                addHabitRootPane5.add(habitCategoryComboBox5, 1, 1);
                addHabitRootPane5.add(nameLabel5, 0, 3);
                addHabitRootPane5.add(addNameInput5, 1, 3);
                addHabitRootPane5.add(descriptionLabel5, 0, 4);
                addHabitRootPane5.add(decriptionInput5, 1, 4);
                comboBoxIndex5[0] = habitCategoryComboBox5.getSelectionModel().getSelectedIndex();
                switch (comboBoxIndex5[0]) {
                    case 0 -> { // EXERCISE
                        addHabitRootPane5.add(exerciseComboLabel5, 0, 2);
                        addHabitRootPane5.add(exerciseComboBox5, 1, 2);
                    }
                    case 1 -> { // FINANCIAL
                        addHabitRootPane5.add(financialComboLabel5, 0, 2);
                        addHabitRootPane5.add(financialComboBox5, 1, 2);

                    }
                    case 2 -> { // HEALTH
                        addHabitRootPane5.add(healthComboLabel5, 0, 2);
                        addHabitRootPane5.add(healthComboBox5, 1, 2);

                    }
                    case 3 -> { // WELLBEING
                        addHabitRootPane5.add(wellbeingComboLabel5, 0, 2);
                        addHabitRootPane5.add(wellbeingComboBox5, 1, 2);

                    }
                    case 4 -> { // HOUSE
                        addHabitRootPane5.add(houseComboLabel5, 0, 2);
                        addHabitRootPane5.add(houseComboBox5, 1, 2);

                    }
                    default -> {

                    }

                }

                addHabitRootPane5.add(createHabitButton5, 1, 7);
                addHabitRootPane5.add(colorpickLabel5, 0, 5);
                addHabitRootPane5.add(habitColor5, 1, 5);
                addHabitRootPane5.add(clearButton5, 0, 7);
            }

        });

        habitColor5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Color color = habitColor5.getValue();
                if (color != null) {
                    button6.setStyle("-fx-background-color:" + color.toString().replace("0x", "#"));
                    statsButton6.setStyle("-fx-background-color:" + color.toString().replace("0x", "#"));
                    cb41.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb42.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb43.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb44.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb45.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb46.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb47.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                }

            }

        });
        // HABIT 6
        habitCategoryComboBox6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                addHabitRootPane6.getChildren().clear();
                addHabitRootPane6.add(label6, 0, 0, 2, 1);
                addHabitRootPane6.add(habitCategoryLabel6, 0, 1);
                addHabitRootPane6.add(habitCategoryComboBox6, 1, 1);
                addHabitRootPane6.add(nameLabel6, 0, 3);
                addHabitRootPane6.add(addNameInput6, 1, 3);
                addHabitRootPane6.add(descriptionLabel6, 0, 4);
                addHabitRootPane6.add(decriptionInput6, 1, 4);
                comboBoxIndex6[0] = habitCategoryComboBox6.getSelectionModel().getSelectedIndex();
                switch (comboBoxIndex6[0]) {
                    case 0 -> { // EXERCISE
                        addHabitRootPane6.add(exerciseComboLabel6, 0, 2);
                        addHabitRootPane6.add(exerciseComboBox6, 1, 2);
                    }
                    case 1 -> { // FINANCIAL
                        addHabitRootPane6.add(financialComboLabel6, 0, 2);
                        addHabitRootPane6.add(financialComboBox6, 1, 2);

                    }
                    case 2 -> { // HEALTH
                        addHabitRootPane6.add(healthComboLabel6, 0, 2);
                        addHabitRootPane6.add(healthComboBox6, 1, 2);

                    }
                    case 3 -> { // WELLBEING
                        addHabitRootPane6.add(wellbeingComboLabel6, 0, 2);
                        addHabitRootPane6.add(wellbeingComboBox6, 1, 2);

                    }
                    case 4 -> { // HOUSE
                        addHabitRootPane6.add(houseComboLabel6, 0, 2);
                        addHabitRootPane6.add(houseComboBox6, 1, 2);

                    }
                    default -> {

                    }

                }

                addHabitRootPane6.add(createHabitButton6, 1, 7);
                addHabitRootPane6.add(colorpickLabel6, 0, 5);
                addHabitRootPane6.add(habitColor6, 1, 5);
                addHabitRootPane6.add(clearButton6, 0, 7);
            }

        });

        habitColor6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Color color = habitColor6.getValue();
                if (color != null) {
                    button7.setStyle("-fx-background-color:" + color.toString().replace("0x", "#"));
                    statsButton7.setStyle("-fx-background-color:" + color.toString().replace("0x", "#"));
                    cb51.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb52.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb53.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb54.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb54.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb55.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb56.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb57.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));

                }

            }

        });
        // HABIT 7
        habitCategoryComboBox7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                addHabitRootPane7.getChildren().clear();
                addHabitRootPane7.add(label7, 0, 0, 2, 1);
                addHabitRootPane7.add(habitCategoryLabel7, 0, 1);
                addHabitRootPane7.add(habitCategoryComboBox7, 1, 1);
                addHabitRootPane7.add(nameLabel7, 0, 3);
                addHabitRootPane7.add(addNameInput7, 1, 3);
                addHabitRootPane7.add(descriptionLabel7, 0, 4);
                addHabitRootPane7.add(decriptionInput7, 1, 4);
                comboBoxIndex7[0] = habitCategoryComboBox7.getSelectionModel().getSelectedIndex();
                switch (comboBoxIndex7[0]) {
                    case 0 -> { // EXERCISE
                        addHabitRootPane7.add(exerciseComboLabel7, 0, 2);
                        addHabitRootPane7.add(exerciseComboBox7, 1, 2);
                    }
                    case 1 -> { // FINANCIAL
                        addHabitRootPane7.add(financialComboLabel7, 0, 2);
                        addHabitRootPane7.add(financialComboBox7, 1, 2);

                    }
                    case 2 -> { // HEALTH
                        addHabitRootPane.add(healthComboLabel7, 0, 2);
                        addHabitRootPane.add(healthComboBox7, 1, 2);

                    }
                    case 3 -> { // WELLBEING
                        addHabitRootPane7.add(wellbeingComboLabel7, 0, 2);
                        addHabitRootPane7.add(wellbeingComboBox7, 1, 2);

                    }
                    case 4 -> { // HOUSE
                        addHabitRootPane7.add(houseComboLabel7, 0, 2);
                        addHabitRootPane7.add(houseComboBox7, 1, 2);

                    }
                    default -> {

                    }

                }

                addHabitRootPane7.add(createHabitButton7, 1, 7);
                addHabitRootPane7.add(colorpickLabel7, 0, 5);
                addHabitRootPane7.add(habitColor7, 1, 5);
                addHabitRootPane7.add(clearButton7, 0, 7);
            }

        });

        habitColor7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Color color = habitColor7.getValue();
                if (color != null) {
                    button8.setStyle("-fx-background-color:" + color.toString().replace("0x", "#"));
                    statsButton8.setStyle("-fx-background-color:" + color.toString().replace("0x", "#"));
                    cb61.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb62.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb63.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb64.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb65.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb66.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb67.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));

                }

            }

        });
        // HABIT 8
        habitCategoryComboBox8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                addHabitRootPane8.getChildren().clear();
                addHabitRootPane8.add(label8, 0, 0, 2, 1);
                addHabitRootPane8.add(habitCategoryLabel8, 0, 1);
                addHabitRootPane8.add(habitCategoryComboBox8, 1, 1);
                addHabitRootPane8.add(nameLabel8, 0, 3);
                addHabitRootPane8.add(addNameInput8, 1, 3);
                addHabitRootPane8.add(descriptionLabel8, 0, 4);
                addHabitRootPane8.add(decriptionInput8, 1, 4);
                comboBoxIndex8[0] = habitCategoryComboBox8.getSelectionModel().getSelectedIndex();
                switch (comboBoxIndex8[0]) {
                    case 0 -> { // EXERCISE
                        addHabitRootPane8.add(exerciseComboLabel8, 0, 2);
                        addHabitRootPane8.add(exerciseComboBox8, 1, 2);
                    }
                    case 1 -> { // FINANCIAL
                        addHabitRootPane8.add(financialComboLabel8, 0, 2);
                        addHabitRootPane8.add(financialComboBox8, 1, 2);

                    }
                    case 2 -> { // HEALTH
                        addHabitRootPane8.add(healthComboLabel8, 0, 2);
                        addHabitRootPane8.add(healthComboBox8, 1, 2);

                    }
                    case 3 -> { // WELLBEING
                        addHabitRootPane8.add(wellbeingComboLabel8, 0, 2);
                        addHabitRootPane8.add(wellbeingComboBox8, 1, 2);

                    }
                    case 4 -> { // HOUSE
                        addHabitRootPane8.add(houseComboLabel8, 0, 2);
                        addHabitRootPane8.add(houseComboBox8, 1, 2);

                    }
                    default -> {

                    }

                }

                addHabitRootPane8.add(createHabitButton8, 1, 7);
                addHabitRootPane8.add(colorpickLabel8, 0, 5);
                addHabitRootPane8.add(habitColor8, 1, 5);
                addHabitRootPane8.add(clearButton8, 0, 7);
            }

        });

        habitColor8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Color color = habitColor8.getValue();
                if (color != null) {
                    button9.setStyle("-fx-background-color:" + color.toString().replace("0x", "#"));
                    statsButton9.setStyle("-fx-background-color:" + color.toString().replace("0x", "#"));
                    cb71.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb72.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb73.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb74.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb75.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb76.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb77.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));

                }

            }

        });

        // HABIT 9

        habitCategoryComboBox9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                addHabitRootPane9.getChildren().clear();
                addHabitRootPane9.add(label9, 0, 0, 2, 1);
                addHabitRootPane9.add(habitCategoryLabel9, 0, 1);
                addHabitRootPane9.add(habitCategoryComboBox9, 1, 1);
                addHabitRootPane9.add(nameLabel9, 0, 3);
                addHabitRootPane9.add(addNameInput9, 1, 3);
                addHabitRootPane9.add(descriptionLabel9, 0, 4);
                addHabitRootPane9.add(decriptionInput9, 1, 4);
                comboBoxIndex9[0] = habitCategoryComboBox9.getSelectionModel().getSelectedIndex();
                switch (comboBoxIndex9[0]) {
                    case 0 -> { // EXERCISE
                        addHabitRootPane9.add(exerciseComboLabel9, 0, 2);
                        addHabitRootPane9.add(exerciseComboBox9, 1, 2);
                    }
                    case 1 -> { // FINANCIAL
                        addHabitRootPane9.add(financialComboLabel9, 0, 2);
                        addHabitRootPane9.add(financialComboBox9, 1, 2);

                    }
                    case 2 -> { // HEALTH
                        addHabitRootPane9.add(healthComboLabel9, 0, 2);
                        addHabitRootPane9.add(healthComboBox9, 1, 2);

                    }
                    case 3 -> { // WELLBEING
                        addHabitRootPane9.add(wellbeingComboLabel9, 0, 2);
                        addHabitRootPane9.add(wellbeingComboBox9, 1, 2);

                    }
                    case 4 -> { // HOUSE
                        addHabitRootPane9.add(houseComboLabel9, 0, 2);
                        addHabitRootPane9.add(houseComboBox9, 1, 2);

                    }
                    default -> {

                    }

                }

                addHabitRootPane9.add(createHabitButton9, 1, 7);
                addHabitRootPane9.add(colorpickLabel9, 0, 5);
                addHabitRootPane9.add(habitColor9, 1, 5);
                addHabitRootPane9.add(clearButton9, 0, 7);
            }

        });

        habitColor9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Color color = habitColor9.getValue();
                if (color != null) {
                    button10.setStyle("-fx-background-color:" + color.toString().replace("0x", "#"));
                    statsButton10.setStyle("-fx-background-color:" + color.toString().replace("0x", "#"));
                    cb81.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb82.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb83.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb84.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb85.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb86.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb87.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));

                }

            }

        });

        // HABIT 10
        habitCategoryComboBox10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                addHabitRootPane10.getChildren().clear();
                addHabitRootPane10.add(label10, 0, 0, 2, 1);
                addHabitRootPane10.add(habitCategoryLabel10, 0, 1);
                addHabitRootPane10.add(habitCategoryComboBox10, 1, 1);
                addHabitRootPane10.add(nameLabel10, 0, 3);
                addHabitRootPane10.add(addNameInput10, 1, 3);
                addHabitRootPane10.add(descriptionLabel10, 0, 4);
                addHabitRootPane10.add(decriptionInput10, 1, 4);
                comboBoxIndex10[0] = habitCategoryComboBox10.getSelectionModel().getSelectedIndex();
                switch (comboBoxIndex10[0]) {
                    case 0 -> { // EXERCISE
                        addHabitRootPane10.add(exerciseComboLabel10, 0, 2);
                        addHabitRootPane10.add(exerciseComboBox10, 1, 2);
                    }
                    case 1 -> { // FINANCIAL
                        addHabitRootPane10.add(financialComboLabel10, 0, 2);
                        addHabitRootPane10.add(financialComboBox10, 1, 2);

                    }
                    case 2 -> { // HEALTH
                        addHabitRootPane10.add(healthComboLabel10, 0, 2);
                        addHabitRootPane10.add(healthComboBox10, 1, 2);

                    }
                    case 3 -> { // WELLBEING
                        addHabitRootPane10.add(wellbeingComboLabel10, 0, 2);
                        addHabitRootPane10.add(wellbeingComboBox10, 1, 2);

                    }
                    case 4 -> { // HOUSE
                        addHabitRootPane10.add(houseComboLabel10, 0, 2);
                        addHabitRootPane10.add(houseComboBox10, 1, 2);

                    }
                    default -> {

                    }

                }

                addHabitRootPane10.add(createHabitButton10, 1, 7);
                addHabitRootPane10.add(colorpickLabel10, 0, 5);
                addHabitRootPane10.add(habitColor10, 1, 5);
                addHabitRootPane10.add(clearButton10, 0, 7);
            }

        });

        habitColor10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Color color = habitColor10.getValue();
                if (color != null) {
                    button11.setStyle("-fx-background-color:" + color.toString().replace("0x", "#"));
                    statsButton11.setStyle("-fx-background-color:" + color.toString().replace("0x", "#"));
                    cb91.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb92.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb93.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb94.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb95.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb96.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb97.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                }

            }

        });

        // HABIT 11
        habitCategoryComboBox11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                addHabitRootPane11.getChildren().clear();
                addHabitRootPane11.add(label11, 0, 0, 2, 1);
                addHabitRootPane11.add(habitCategoryLabel11, 0, 1);
                addHabitRootPane11.add(habitCategoryComboBox11, 1, 1);
                addHabitRootPane11.add(nameLabel11, 0, 3);
                addHabitRootPane11.add(addNameInput11, 1, 3);
                addHabitRootPane11.add(descriptionLabel11, 0, 4);
                addHabitRootPane11.add(decriptionInput11, 1, 4);
                comboBoxIndex11[0] = habitCategoryComboBox11.getSelectionModel().getSelectedIndex();
                switch (comboBoxIndex11[0]) {
                    case 0 -> { // EXERCISE
                        addHabitRootPane11.add(exerciseComboLabel11, 0, 2);
                        addHabitRootPane11.add(exerciseComboBox11, 1, 2);
                    }
                    case 1 -> { // FINANCIAL
                        addHabitRootPane11.add(financialComboLabel11, 0, 2);
                        addHabitRootPane11.add(financialComboBox11, 1, 2);

                    }
                    case 2 -> { // HEALTH
                        addHabitRootPane11.add(healthComboLabel11, 0, 2);
                        addHabitRootPane11.add(healthComboBox11, 1, 2);

                    }
                    case 3 -> { // WELLBEING
                        addHabitRootPane11.add(wellbeingComboLabel11, 0, 2);
                        addHabitRootPane11.add(wellbeingComboBox11, 1, 2);

                    }
                    case 4 -> { // HOUSE
                        addHabitRootPane11.add(houseComboLabel11, 0, 2);
                        addHabitRootPane11.add(houseComboBox11, 1, 2);

                    }
                    default -> {

                    }

                }

                addHabitRootPane11.add(createHabitButton11, 1, 7);
                addHabitRootPane11.add(colorpickLabel11, 0, 5);
                addHabitRootPane11.add(habitColor11, 1, 5);
                addHabitRootPane11.add(clearButton11, 0, 7);
            }

        });

        habitColor11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Color color = habitColor11.getValue();
                if (color != null) {
                    button12.setStyle("-fx-background-color:" + color.toString().replace("0x", "#"));
                    statsButton12.setStyle("-fx-background-color:" + color.toString().replace("0x", "#"));
                    cb101.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb102.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb103.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb104.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb105.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb106.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb107.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));

                }

            }

        });

        // HABIT 12
        habitCategoryComboBox12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                addHabitRootPane12.getChildren().clear();
                addHabitRootPane12.add(label12, 0, 0, 2, 1);
                addHabitRootPane12.add(habitCategoryLabel12, 0, 1);
                addHabitRootPane12.add(habitCategoryComboBox12, 1, 1);
                addHabitRootPane12.add(nameLabel12, 0, 3);
                addHabitRootPane12.add(addNameInput12, 1, 3);
                addHabitRootPane12.add(descriptionLabel12, 0, 4);
                addHabitRootPane12.add(decriptionInput12, 1, 4);
                comboBoxIndex12[0] = habitCategoryComboBox12.getSelectionModel().getSelectedIndex();
                switch (comboBoxIndex12[0]) {
                    case 0 -> { // EXERCISE
                        addHabitRootPane12.add(exerciseComboLabel12, 0, 2);
                        addHabitRootPane12.add(exerciseComboBox12, 1, 2);
                    }
                    case 1 -> { // FINANCIAL
                        addHabitRootPane12.add(financialComboLabel12, 0, 2);
                        addHabitRootPane12.add(financialComboBox12, 1, 2);

                    }
                    case 2 -> { // HEALTH
                        addHabitRootPane12.add(healthComboLabel12, 0, 2);
                        addHabitRootPane12.add(healthComboBox12, 1, 2);

                    }
                    case 3 -> { // WELLBEING
                        addHabitRootPane12.add(wellbeingComboLabel12, 0, 2);
                        addHabitRootPane12.add(wellbeingComboBox12, 1, 2);

                    }
                    case 4 -> { // HOUSE
                        addHabitRootPane12.add(houseComboLabel12, 0, 2);
                        addHabitRootPane12.add(houseComboBox12, 1, 2);

                    }
                    default -> {

                    }

                }

                addHabitRootPane12.add(createHabitButton12, 1, 7);
                addHabitRootPane12.add(colorpickLabel12, 0, 5);
                addHabitRootPane12.add(habitColor12, 1, 5);
                addHabitRootPane12.add(clearButton12, 0, 7);
            }

        });

        habitColor12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Color color = habitColor12.getValue();
                if (color != null) {
                    button13.setStyle("-fx-background-color:" + color.toString().replace("0x", "#"));
                    statsButton13.setStyle("-fx-background-color:" + color.toString().replace("0x", "#"));
                    cb111.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb112.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb113.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb114.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb115.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb116.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                    cb117.setStyle("-fx-border-color:" + color.toString().replace("0x", "#"));
                }

            }

        });
        // Replace label name create habit button 1
        createHabitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (!addNameInput.getText().equals("") && !decriptionInput.getText().equals("")) {
                    button2.setText(addNameInput.getText() + '\n' + decriptionInput.getText());
                    primaryStage.setScene(home);
                } else {
                    Error.display("Error!", "Both the habit name and description must have input.");
                }

            }
        });
        // Replace label name create habit button 2
        createHabitButton2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (!addNameInput2.getText().equals("") && !decriptionInput2.getText().equals("")) {
                    button3.setText(addNameInput2.getText() + '\n' + decriptionInput2.getText());
                    primaryStage.setScene(home);
                } else {
                    Error.display("Error!", "Both the habit name and description must have input.");
                }

            }
        });
        // Replace label name create habit button 3
        createHabitButton3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (!addNameInput3.getText().equals("") && !decriptionInput3.getText().equals("")) {
                    button4.setText(addNameInput3.getText() + '\n' + decriptionInput3.getText());

                    primaryStage.setScene(home);
                } else {
                    Error.display("Error!", "Both the habit name and description must have input.");
                }

            }
        });
        createHabitButton4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (!addNameInput4.getText().equals("") && !decriptionInput4.getText().equals("")) {
                    button5.setText(addNameInput4.getText() + '\n' + decriptionInput4.getText());

                    primaryStage.setScene(home);
                } else {
                    Error.display("Error!", "Both the habit name and description must have input.");
                }

            }
        });
        createHabitButton5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (!addNameInput5.getText().equals("") && !decriptionInput5.getText().equals("")) {
                    button6.setText(addNameInput5.getText() + '\n' + decriptionInput5.getText());

                    primaryStage.setScene(home);
                } else {
                    Error.display("Error!", "Both the habit name and description must have input.");
                }

            }
        });
        createHabitButton6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (!addNameInput6.getText().equals("") && !decriptionInput6.getText().equals("")) {
                    button7.setText(addNameInput6.getText() + '\n' + decriptionInput6.getText());

                    primaryStage.setScene(home);
                } else {
                    Error.display("Error!", "Both the habit name and description must have input.");
                }

            }
        });
        createHabitButton7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (!addNameInput7.getText().equals("") && !decriptionInput7.getText().equals("")) {
                    button8.setText(addNameInput7.getText() + '\n' + decriptionInput7.getText());

                    primaryStage.setScene(home);
                } else {
                    Error.display("Error!", "Both the habit name and description must have input.");
                }

            }
        });
        createHabitButton8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (!addNameInput8.getText().equals("") && !decriptionInput8.getText().equals("")) {
                    button9.setText(addNameInput8.getText() + '\n' + decriptionInput8.getText());

                    primaryStage.setScene(home);

                } else {
                    Error.display("Error!", "Both the habit name and description must have input.");
                }

            }
        });
        createHabitButton9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (!addNameInput9.getText().equals("") && !decriptionInput9.getText().equals("")) {
                    button10.setText(addNameInput9.getText() + '\n' + decriptionInput9.getText());

                    primaryStage.setScene(home);
                } else {
                    Error.display("Error!", "Both the habit name and description must have input.");
                }

            }
        });
        createHabitButton10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (!addNameInput10.getText().equals("") && !decriptionInput10.getText().equals("")) {
                    button11.setText(addNameInput10.getText() + '\n' + decriptionInput10.getText());

                    primaryStage.setScene(home);
                } else {
                    Error.display("Error!", "Both the habit name and description must have input.");
                }

            }
        });
        createHabitButton11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (!addNameInput11.getText().equals("") && !decriptionInput11.getText().equals("")) {
                    button12.setText(addNameInput11.getText() + '\n' + decriptionInput11.getText());

                    primaryStage.setScene(home);
                } else {
                    Error.display("Error!", "Both the habit name and description must have input.");
                }

            }
        });
        createHabitButton12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (!addNameInput12.getText().equals("") && !decriptionInput12.getText().equals("")) {
                    button13.setText(addNameInput12.getText() + '\n' + decriptionInput12.getText());
                    primaryStage.setScene(home);
                } else {
                    Error.display("Error!", "Both the habit name and description must have input.");
                }

            }
        });
        caclstatsButton.setOnAction(e -> {
            if (!addNameInput.getText().equals("")) {
                statsTitle.setText("Statistics for your habit: " + addNameInput.getText());
            }
            if (cb01.isSelected()) {
                countBoxes1 = countBoxes1 + 1;
                statsLabel.setText("You did this Habit: " + countBoxes1 + " times.");
                statsPercent = (float) countBoxes1 / 7 * 100;
                statsPercentLabel.setText("Your average for doing this habit is: " + statsPercent + "%");
                mondayLabel.setTextFill(Color.WHITE);
            }
            if (cb02.isSelected()) {
                countBoxes1 = countBoxes1 + 1;
                statsLabel.setText("You did this Habit: " + countBoxes1 + " times.");
                statsPercent = (float) countBoxes1 / 7 * 100;
                statsPercentLabel.setText("Your average for doing this habit is: " + statsPercent + "%");
                tuesdayLabel.setTextFill(Color.WHITE);
            }
            if (cb03.isSelected()) {
                countBoxes1 = countBoxes1 + 1;
                statsLabel.setText("You did this Habit: " + countBoxes1 + " times.");
                statsPercent = (float) countBoxes1 / 7 * 100;
                statsPercentLabel.setText("Your average for doing this habit is: " + statsPercent + "%");
                wednesdayLabel.setTextFill(Color.WHITE);
            }
            if (cb04.isSelected()) {
                countBoxes1 = countBoxes1 + 1;
                statsLabel.setText("You did this Habit: " + countBoxes1 + " times.");
                statsPercent = (float) countBoxes1 / 7 * 100;
                statsPercentLabel.setText("Your average for doing this habit is: " + statsPercent + "%");
                thursdayLabel.setTextFill(Color.WHITE);
            }
            if (cb05.isSelected()) {
                countBoxes1 = countBoxes1 + 1;
                statsLabel.setText("You did this Habit: " + countBoxes1 + " times.");
                statsPercent = (float) countBoxes1 / 7 * 100;
                statsPercentLabel.setText("Your average for doing this habit is: " + statsPercent + "%");
                fridayLabel.setTextFill(Color.WHITE);
            }
            if (cb06.isSelected()) {
                countBoxes1 = countBoxes1 + 1;
                statsLabel.setText("You did this Habit: " + countBoxes1 + " times.");
                statsPercent = (float) countBoxes1 / 7 * 100;
                statsPercentLabel.setText("Your average for doing this habit is: " + statsPercent + "%");
                saturdayLabel.setTextFill(Color.WHITE);
            }
            if (cb07.isSelected()) {
                countBoxes1 = countBoxes1 + 1;
                statsLabel.setText("You did this Habit: " + countBoxes1 + " times.");
                statsPercent = (float) countBoxes1 / 7 * 100;
                statsPercentLabel.setText("Your average for doing this habit is: " + statsPercent + "%");
                sundayLabel.setTextFill(Color.WHITE);
            }
            if (!cb01.isSelected() && !cb02.isSelected() && !cb03.isSelected() && !cb04.isSelected()
                    && !cb05.isSelected() && !cb06.isSelected() && !cb07.isSelected()) {
                Error.display("Uh Oh!", "You did not do this habit any day this week.");
            }

        });

        caclstatsButton2.setOnAction(e -> {
            if (!addNameInput2.getText().equals("")) {
                statsTitle2.setText("Statistics for your habit: " + addNameInput2.getText());
            }
            if (cb1.isSelected()) {
                countBoxes2 = countBoxes2 + 1;
                statsLabel2.setText("You did this Habit: " + countBoxes2 + " times.");
                statsPercent2 = (float) countBoxes2 / 7 * 100;
                statsPercentLabel2.setText("Your average for doing this habit is: " + statsPercent2 + "%");
                mondayLabel2.setTextFill(Color.WHITE);
            }
            if (cb2.isSelected()) {
                countBoxes2 = countBoxes2 + 1;
                statsLabel2.setText("You did this Habit: " + countBoxes2 + " times.");
                statsPercent2 = (float) countBoxes2 / 7 * 100;
                statsPercentLabel2.setText("Your average for doing this habit is: " + statsPercent2 + "%");
                tuesdayLabel2.setTextFill(Color.WHITE);
            }
            if (cb3.isSelected()) {
                countBoxes2 = countBoxes2 + 1;
                statsLabel2.setText("You did this Habit: " + countBoxes2 + " times.");
                statsPercent2 = (float) countBoxes2 / 7 * 100;
                statsPercentLabel2.setText("Your average for doing this habit is: " + statsPercent2 + "%");
                wednesdayLabel2.setTextFill(Color.WHITE);

            }
            if (cb4.isSelected()) {
                countBoxes2 = countBoxes2 + 1;
                statsLabel2.setText("You did this Habit: " + countBoxes2 + " times.");
                statsPercent2 = (float) countBoxes2 / 7 * 100;
                statsPercentLabel2.setText("Your average for doing this habit is: " + statsPercent2 + "%");
                thursdayLabel2.setTextFill(Color.WHITE);
            }
            if (cb5.isSelected()) {
                countBoxes2 = countBoxes2 + 1;
                statsLabel2.setText("You did this Habit: " + countBoxes2 + " times.");
                statsPercent2 = (float) countBoxes2 / 7 * 100;
                statsPercentLabel2.setText("Your average for doing this habit is: " + statsPercent2 + "%");
                fridayLabel2.setTextFill(Color.WHITE);
            }
            if (cb6.isSelected()) {
                countBoxes2 = countBoxes2 + 1;
                statsLabel2.setText("You did this Habit: " + countBoxes2 + " times.");
                statsPercent2 = (float) countBoxes2 / 7 * 100;
                statsPercentLabel2.setText("Your average for doing this habit is: " + statsPercent2 + "%");
                saturdayLabel2.setTextFill(Color.WHITE);
            }
            if (cb7.isSelected()) {
                countBoxes2 = countBoxes2 + 1;
                statsLabel2.setText("You did this Habit: " + countBoxes2 + " times.");
                statsPercent2 = (float) countBoxes2 / 7 * 100;
                statsPercentLabel2.setText("Your average for doing this habit is: " + statsPercent2 + "%");
                sundayLabel2.setTextFill(Color.WHITE);
            }
            if (!cb1.isSelected() && !cb2.isSelected() && !cb3.isSelected() && !cb4.isSelected() && !cb5.isSelected()
                    && !cb6.isSelected() && !cb7.isSelected()) {
                Error.display("Uh Oh!", "You did not do this habit any day this week.");
            }
        });

        caclstatsButton3.setOnAction(e -> {
            if (!addNameInput3.getText().equals("")) {
                statsTitle3.setText("Statistics for your habit: " + addNameInput3.getText());
            }
            if (cb21.isSelected()) {
                countBoxes3 = countBoxes3 + 1;
                statsLabel3.setText("You did this Habit: " + countBoxes3 + " times.");
                statsPercent3 = (float) countBoxes3 / 7 * 100;
                statsPercentLabel3.setText("Your average for doing this habit is: " + statsPercent3 + "%");
                mondayLabel3.setTextFill(Color.WHITE);
            }
            if (cb22.isSelected()) {
                countBoxes3 = countBoxes3 + 1;
                statsLabel3.setText("You did this Habit: " + countBoxes3 + " times.");
                statsPercent3 = (float) countBoxes3 / 7 * 100;
                statsPercentLabel3.setText("Your average for doing this habit is: " + statsPercent3 + "%");
                tuesdayLabel3.setTextFill(Color.WHITE);
            }
            if (cb23.isSelected()) {
                countBoxes3 = countBoxes3 + 1;
                statsLabel3.setText("You did this Habit: " + countBoxes3 + " times.");
                statsPercent3 = (float) countBoxes3 / 7 * 100;
                statsPercentLabel3.setText("Your average for doing this habit is: " + statsPercent3 + "%");
                wednesdayLabel3.setTextFill(Color.WHITE);
            }
            if (cb24.isSelected()) {
                countBoxes3 = countBoxes3 + 1;
                statsLabel3.setText("You did this Habit: " + countBoxes3 + " times.");
                statsPercent3 = (float) countBoxes3 / 7 * 100;
                statsPercentLabel3.setText("Your average for doing this habit is: " + statsPercent3 + "%");
                thursdayLabel3.setTextFill(Color.WHITE);
            }
            if (cb25.isSelected()) {
                countBoxes3 = countBoxes3 + 1;
                statsLabel3.setText("You did this Habit: " + countBoxes3 + " times.");
                statsPercent3 = (float) countBoxes3 / 7 * 100;
                statsPercentLabel3.setText("Your average for doing this habit is: " + statsPercent3 + "%");
                fridayLabel3.setTextFill(Color.WHITE);
            }
            if (cb26.isSelected()) {
                countBoxes3 = countBoxes3 + 1;
                statsLabel3.setText("You did this Habit: " + countBoxes3 + " times.");
                statsPercent3 = (float) countBoxes3 / 7 * 100;
                statsPercentLabel3.setText("Your average for doing this habit is: " + statsPercent3 + "%");
                saturdayLabel3.setTextFill(Color.WHITE);
            }
            if (cb27.isSelected()) {
                countBoxes3 = countBoxes3 + 1;
                statsLabel3.setText("You did this Habit: " + countBoxes3 + " times.");
                statsPercent3 = (float) countBoxes3 / 7 * 100;
                statsPercentLabel3.setText("Your average for doing this habit is: " + statsPercent3 + "%");
                sundayLabel3.setTextFill(Color.WHITE);
            }
            if (!cb21.isSelected() && !cb22.isSelected() && !cb23.isSelected() && !cb24.isSelected()
                    && !cb25.isSelected() && !cb26.isSelected() && !cb27.isSelected()) {
                Error.display("Uh Oh!", "You did not do this habit any day this week.");
            }
        });

        caclstatsButton4.setOnAction(e -> {
            if (!addNameInput4.getText().equals("")) {
                statsTitle4.setText("Statistics for your habit: " + addNameInput4.getText());
            }
            if (cb31.isSelected()) {
                countBoxes4 = countBoxes4 + 1;
                statsLabel4.setText("You did this Habit: " + countBoxes4 + " times.");
                statsPercent4 = (float) countBoxes4 / 7 * 100;
                statsPercentLabel4.setText("Your average for doing this habit is: " + statsPercent4 + "%");
                mondayLabel4.setTextFill(Color.WHITE);
            }
            if (cb32.isSelected()) {
                countBoxes4 = countBoxes4 + 1;
                statsLabel4.setText("You did this Habit: " + countBoxes4 + " times.");
                statsPercent4 = (float) countBoxes4 / 7 * 100;
                statsPercentLabel4.setText("Your average for doing this habit is: " + statsPercent4 + "%");
                tuesdayLabel4.setTextFill(Color.WHITE);
            }

            if (cb33.isSelected()) {
                countBoxes4 = countBoxes4 + 1;
                statsLabel4.setText("You did this Habit: " + countBoxes4 + " times.");
                statsPercent4 = (float) countBoxes4 / 7 * 100;
                statsPercentLabel4.setText("Your average for doing this habit is: " + statsPercent4 + "%");
                wednesdayLabel4.setTextFill(Color.WHITE);
            }
            if (cb34.isSelected()) {
                countBoxes4 = countBoxes4 + 1;
                statsLabel4.setText("You did this Habit: " + countBoxes4 + " times.");
                statsPercent4 = (float) countBoxes4 / 7 * 100;
                statsPercentLabel4.setText("Your average for doing this habit is: " + statsPercent4 + "%");
                thursdayLabel4.setTextFill(Color.WHITE);
            }
            if (cb35.isSelected()) {
                countBoxes4 = countBoxes4 + 1;
                statsLabel4.setText("You did this Habit: " + countBoxes4 + " times.");
                statsPercent4 = (float) countBoxes4 / 7 * 100;
                statsPercentLabel4.setText("Your average for doing this habit is: " + statsPercent4 + "%");
                fridayLabel4.setTextFill(Color.WHITE);
            }
            if (cb36.isSelected()) {
                countBoxes4 = countBoxes4 + 1;
                statsLabel4.setText("You did this Habit: " + countBoxes4 + " times.");
                statsPercent4 = (float) countBoxes4 / 7 * 100;
                statsPercentLabel4.setText("Your average for doing this habit is: " + statsPercent4 + "%");
                saturdayLabel4.setTextFill(Color.WHITE);
            }
            if (cb37.isSelected()) {
                countBoxes4 = countBoxes4 + 1;
                statsLabel4.setText("You did this Habit: " + countBoxes4 + " times.");
                statsPercent4 = (float) countBoxes4 / 7 * 100;
                statsPercentLabel4.setText("Your average for doing this habit is: " + statsPercent4 + "%");
                sundayLabel4.setTextFill(Color.WHITE);
            }
            if (!cb31.isSelected() && !cb32.isSelected() && !cb33.isSelected() && !cb34.isSelected()
                    && !cb35.isSelected() && !cb36.isSelected() && !cb37.isSelected()) {
                Error.display("Uh Oh!", "You did not do this habit any day this week.");
            }

        });

        caclstatsButton5.setOnAction(e -> {
            if (!addNameInput5.getText().equals("")) {
                statsTitle5.setText("Statistics for your habit: " + addNameInput5.getText());
            }
            if (cb41.isSelected()) {
                countBoxes5 = countBoxes5 + 1;
                statsLabel5.setText("You did this Habit: " + countBoxes5 + " times.");
                statsPercent5 = (float) countBoxes5 / 7 * 100;
                statsPercentLabel5.setText("Your average for doing this habit is: " + statsPercent5 + "%");
                mondayLabel5.setTextFill(Color.WHITE);
            }
            if (cb42.isSelected()) {
                countBoxes5 = countBoxes5 + 1;
                statsLabel5.setText("You did this Habit: " + countBoxes5 + " times.");
                statsPercent5 = (float) countBoxes5 / 7 * 100;
                statsPercentLabel5.setText("Your average for doing this habit is: " + statsPercent5 + "%");
                tuesdayLabel5.setTextFill(Color.WHITE);
            }
            if (cb43.isSelected()) {
                countBoxes5 = countBoxes5 + 1;
                statsLabel5.setText("You did this Habit: " + countBoxes5 + " times.");
                statsPercent5 = (float) countBoxes5 / 7 * 100;
                statsPercentLabel5.setText("Your average for doing this habit is: " + statsPercent5 + "%");
                wednesdayLabel5.setTextFill(Color.WHITE);
            }
            if (cb44.isSelected()) {
                countBoxes5 = countBoxes5 + 1;
                statsLabel5.setText("You did this Habit: " + countBoxes5 + " times.");
                statsPercent5 = (float) countBoxes5 / 7 * 100;
                statsPercentLabel5.setText("Your average for doing this habit is: " + statsPercent5 + "%");
                thursdayLabel5.setTextFill(Color.WHITE);
            }
            if (cb45.isSelected()) {
                countBoxes5 = countBoxes5 + 1;
                statsLabel5.setText("You did this Habit: " + countBoxes5 + " times.");
                statsPercent5 = (float) countBoxes5 / 7 * 100;
                statsPercentLabel5.setText("Your average for doing this habit is: " + statsPercent5 + "%");
                fridayLabel5.setTextFill(Color.WHITE);
            }
            if (cb46.isSelected()) {
                countBoxes5 = countBoxes5 + 1;
                statsLabel5.setText("You did this Habit: " + countBoxes5 + " times.");
                statsPercent5 = (float) countBoxes5 / 7 * 100;
                statsPercentLabel5.setText("Your average for doing this habit is: " + statsPercent5 + "%");
                saturdayLabel5.setTextFill(Color.WHITE);
            }
            if (cb47.isSelected()) {
                countBoxes5 = countBoxes5 + 1;
                statsLabel5.setText("You did this Habit: " + countBoxes5 + " times.");
                statsPercent5 = (float) countBoxes5 / 7 * 100;
                statsPercentLabel5.setText("Your average for doing this habit is: " + statsPercent5 + "%");
                sundayLabel5.setTextFill(Color.WHITE);
            }
            if (!cb41.isSelected() && !cb42.isSelected() && !cb43.isSelected() && !cb44.isSelected()
                    && !cb45.isSelected() && !cb46.isSelected() && !cb47.isSelected()) {
                Error.display("Uh Oh!", "You did not do this habit any day this week.");
            }
        });

        caclstatsButton6.setOnAction(e -> {
            if (!addNameInput6.getText().equals("")) {
                statsTitle6.setText("Statistics for your habit: " + addNameInput6.getText());
            }
            if (cb51.isSelected()) {
                countBoxes6 = countBoxes6 + 1;
                statsLabel6.setText("You did this Habit: " + countBoxes6 + " times.");
                statsPercent6 = (float) countBoxes6 / 7 * 100;
                statsPercentLabel6.setText("Your average for doing this habit is: " + statsPercent6 + "%");
                mondayLabel6.setTextFill(Color.WHITE);
            }
            if (cb52.isSelected()) {
                countBoxes6 = countBoxes6 + 1;
                statsLabel6.setText("You did this Habit: " + countBoxes6 + " times.");
                statsPercent6 = (float) countBoxes6 / 7 * 100;
                statsPercentLabel6.setText("Your average for doing this habit is: " + statsPercent6 + "%");
                tuesdayLabel6.setTextFill(Color.WHITE);
            }
            if (cb53.isSelected()) {
                countBoxes6 = countBoxes6 + 1;
                statsLabel6.setText("You did this Habit: " + countBoxes6 + " times.");
                statsPercent6 = (float) countBoxes6 / 7 * 100;
                statsPercentLabel6.setText("Your average for doing this habit is: " + statsPercent6 + "%");
                wednesdayLabel6.setTextFill(Color.WHITE);
            }
            if (cb54.isSelected()) {
                countBoxes6 = countBoxes6 + 1;
                statsLabel6.setText("You did this Habit: " + countBoxes6 + " times.");
                statsPercent6 = (float) countBoxes6 / 7 * 100;
                statsPercentLabel6.setText("Your average for doing this habit is: " + statsPercent6 + "%");
                thursdayLabel6.setTextFill(Color.WHITE);
            }
            if (cb55.isSelected()) {
                countBoxes6 = countBoxes6 + 1;
                statsLabel6.setText("You did this Habit: " + countBoxes6 + " times.");
                statsPercent6 = (float) countBoxes6 / 7 * 100;
                statsPercentLabel6.setText("Your average for doing this habit is: " + statsPercent6 + "%");
                fridayLabel6.setTextFill(Color.WHITE);
            }
            if (cb56.isSelected()) {
                countBoxes6 = countBoxes6 + 1;
                statsLabel6.setText("You did this Habit: " + countBoxes6 + " times.");
                statsPercent6 = (float) countBoxes6 / 7 * 100;
                statsPercentLabel6.setText("Your average for doing this habit is: " + statsPercent6 + "%");
                saturdayLabel6.setTextFill(Color.WHITE);
            }
            if (cb57.isSelected()) {
                countBoxes6 = countBoxes6 + 1;
                statsLabel6.setText("You did this Habit: " + countBoxes6 + " times.");
                statsPercent6 = (float) countBoxes6 / 7 * 100;
                statsPercentLabel6.setText("Your average for doing this habit is: " + statsPercent6 + "%");
                sundayLabel6.setTextFill(Color.WHITE);
            }
            if (!cb51.isSelected() && !cb52.isSelected() && !cb53.isSelected() && !cb54.isSelected()
                    && !cb55.isSelected() && !cb56.isSelected() && !cb57.isSelected()) {
                Error.display("Uh Oh!", "You did not do this habit any day this week.");
            }
        });

        caclstatsButton7.setOnAction(e -> {
            if (!addNameInput7.getText().equals("")) {
                statsTitle7.setText("Statistics for your habit: " + addNameInput7.getText());
            }
            if (cb61.isSelected()) {
                countBoxes7 = countBoxes7 + 1;
                statsLabel7.setText("You did this Habit: " + countBoxes7 + " times.");
                statsPercent7 = (float) countBoxes7 / 7 * 100;
                statsPercentLabel7.setText("Your average for doing this habit is: " + statsPercent7 + "%");
                mondayLabel7.setTextFill(Color.WHITE);
            }
            if (cb62.isSelected()) {
                countBoxes7 = countBoxes7 + 1;
                statsLabel7.setText("You did this Habit: " + countBoxes7 + " times.");
                statsPercent7 = (float) countBoxes7 / 7 * 100;
                statsPercentLabel7.setText("Your average for doing this habit is: " + statsPercent7 + "%");
                tuesdayLabel7.setTextFill(Color.WHITE);
            }
            if (cb63.isSelected()) {
                countBoxes7 = countBoxes7 + 1;
                statsLabel7.setText("You did this Habit: " + countBoxes7 + " times.");
                statsPercent7 = (float) countBoxes7 / 7 * 100;
                statsPercentLabel7.setText("Your average for doing this habit is: " + statsPercent7 + "%");
                wednesdayLabel7.setTextFill(Color.WHITE);
            }
            if (cb64.isSelected()) {
                countBoxes7 = countBoxes7 + 1;
                statsLabel7.setText("You did this Habit: " + countBoxes7 + " times.");
                statsPercent7 = (float) countBoxes7 / 7 * 100;
                statsPercentLabel7.setText("Your average for doing this habit is: " + statsPercent7 + "%");
                thursdayLabel7.setTextFill(Color.WHITE);
            }
            if (cb65.isSelected()) {
                countBoxes7 = countBoxes7 + 1;
                statsLabel7.setText("You did this Habit: " + countBoxes7 + " times.");
                statsPercent7 = (float) countBoxes7 / 7 * 100;
                statsPercentLabel7.setText("Your average for doing this habit is: " + statsPercent7 + "%");
                fridayLabel7.setTextFill(Color.WHITE);
            }
            if (cb66.isSelected()) {
                countBoxes7 = countBoxes7 + 1;
                statsLabel7.setText("You did this Habit: " + countBoxes7 + " times.");
                statsPercent7 = (float) countBoxes7 / 7 * 100;
                statsPercentLabel7.setText("Your average for doing this habit is: " + statsPercent7 + "%");
                saturdayLabel7.setTextFill(Color.WHITE);
            }
            if (cb67.isSelected()) {
                countBoxes7 = countBoxes7 + 1;
                statsLabel7.setText("You did this Habit: " + countBoxes7 + " times.");
                statsPercent7 = (float) countBoxes7 / 7 * 100;
                statsPercentLabel7.setText("Your average for doing this habit is: " + statsPercent7 + "%");
                sundayLabel7.setTextFill(Color.WHITE);
            }
            if (!cb61.isSelected() && !cb62.isSelected() && !cb63.isSelected() && !cb64.isSelected()
                    && !cb65.isSelected() && !cb66.isSelected() && !cb67.isSelected()) {
                Error.display("Uh Oh!", "You did not do this habit any day this week.");
            }
        });
        caclstatsButton8.setOnAction(e -> {
            if (!addNameInput8.getText().equals("")) {
                statsTitle8.setText("Statistics for your habit: " + addNameInput8.getText());
            }
            if (cb71.isSelected()) {
                countBoxes8 = countBoxes8 + 1;
                statsLabel8.setText("You did this Habit: " + countBoxes8 + " times.");
                statsPercent8 = (float) countBoxes8 / 7 * 100;
                statsPercentLabel8.setText("Your average for doing this habit is: " + statsPercent8 + "%");
                mondayLabel8.setTextFill(Color.WHITE);
            }
            if (cb72.isSelected()) {
                countBoxes8 = countBoxes8 + 1;
                statsLabel8.setText("You did this Habit: " + countBoxes8 + " times.");
                statsPercent8 = (float) countBoxes8 / 7 * 100;
                statsPercentLabel8.setText("Your average for doing this habit is: " + statsPercent8 + "%");
                tuesdayLabel8.setTextFill(Color.WHITE);
            }
            if (cb73.isSelected()) {
                countBoxes8 = countBoxes8 + 1;
                statsLabel8.setText("You did this Habit: " + countBoxes8 + " times.");
                statsPercent8 = (float) countBoxes8 / 7 * 100;
                statsPercentLabel8.setText("Your average for doing this habit is: " + statsPercent8 + "%");
                wednesdayLabel8.setTextFill(Color.WHITE);
            }
            if (cb74.isSelected()) {
                countBoxes8 = countBoxes8 + 1;
                statsLabel8.setText("You did this Habit: " + countBoxes8 + " times.");
                statsPercent8 = (float) countBoxes8 / 7 * 100;
                statsPercentLabel8.setText("Your average for doing this habit is: " + statsPercent8 + "%");
                thursdayLabel8.setTextFill(Color.WHITE);
            }
            if (cb75.isSelected()) {
                countBoxes8 = countBoxes8 + 1;
                statsLabel8.setText("You did this Habit: " + countBoxes8 + " times.");
                statsPercent8 = (float) countBoxes8 / 7 * 100;
                statsPercentLabel8.setText("Your average for doing this habit is: " + statsPercent8 + "%");
                fridayLabel8.setTextFill(Color.WHITE);
            }
            if (cb76.isSelected()) {
                countBoxes8 = countBoxes8 + 1;
                statsLabel8.setText("You did this Habit: " + countBoxes8 + " times.");
                statsPercent8 = (float) countBoxes8 / 7 * 100;
                statsPercentLabel8.setText("Your average for doing this habit is: " + statsPercent8 + "%");
                saturdayLabel8.setTextFill(Color.WHITE);
            }
            if (cb77.isSelected()) {
                countBoxes8 = countBoxes8 + 1;
                statsLabel8.setText("You did this Habit: " + countBoxes8 + " times.");
                statsPercent8 = (float) countBoxes8 / 7 * 100;
                statsPercentLabel8.setText("Your average for doing this habit is: " + statsPercent8 + "%");
                sundayLabel8.setTextFill(Color.WHITE);
            }
            if (!cb71.isSelected() && !cb72.isSelected() && !cb73.isSelected() && !cb74.isSelected()
                    && !cb75.isSelected() && !cb76.isSelected() && !cb77.isSelected()) {
                Error.display("Uh Oh!", "You did not do this habit any day this week.");
            }
        });

        caclstatsButton9.setOnAction(e -> {
            if (!addNameInput9.getText().equals("")) {
                statsTitle9.setText("Statistics for your habit: " + addNameInput9.getText());
            }
            if (cb81.isSelected()) {
                countBoxes9 = countBoxes9 + 1;
                statsLabel9.setText("You did this Habit: " + countBoxes9 + " times.");
                statsPercent9 = (float) countBoxes9 / 7 * 100;
                statsPercentLabel9.setText("Your average for doing this habit is: " + statsPercent9 + "%");
                mondayLabel9.setTextFill(Color.WHITE);
            }
            if (cb82.isSelected()) {
                countBoxes9 = countBoxes9 + 1;
                statsLabel9.setText("You did this Habit: " + countBoxes9 + " times.");
                statsPercent9 = (float) countBoxes9 / 7 * 100;
                statsPercentLabel9.setText("Your average for doing this habit is: " + statsPercent9 + "%");
                tuesdayLabel9.setTextFill(Color.WHITE);
            }
            if (cb83.isSelected()) {
                countBoxes9 = countBoxes9 + 1;
                statsLabel9.setText("You did this Habit: " + countBoxes9 + " times.");
                statsPercent9 = (float) countBoxes9 / 7 * 100;
                statsPercentLabel9.setText("Your average for doing this habit is: " + statsPercent9 + "%");
                wednesdayLabel9.setTextFill(Color.WHITE);
            }
            if (cb84.isSelected()) {
                countBoxes9 = countBoxes9 + 1;
                statsLabel9.setText("You did this Habit: " + countBoxes9 + " times.");
                statsPercent9 = (float) countBoxes9 / 7 * 100;
                statsPercentLabel9.setText("Your average for doing this habit is: " + statsPercent9 + "%");
                thursdayLabel9.setTextFill(Color.WHITE);
            }
            if (cb85.isSelected()) {
                countBoxes9 = countBoxes9 + 1;
                statsLabel9.setText("You did this Habit: " + countBoxes9 + " times.");
                statsPercent9 = (float) countBoxes9 / 7 * 100;
                statsPercentLabel9.setText("Your average for doing this habit is: " + statsPercent9 + "%");
                fridayLabel9.setTextFill(Color.WHITE);
            }
            if (cb86.isSelected()) {
                countBoxes9 = countBoxes9 + 1;
                statsLabel9.setText("You did this Habit: " + countBoxes9 + " times.");
                statsPercent9 = (float) countBoxes9 / 7 * 100;
                statsPercentLabel9.setText("Your average for doing this habit is: " + statsPercent9 + "%");
                saturdayLabel9.setTextFill(Color.WHITE);
            }
            if (cb87.isSelected()) {
                countBoxes9 = countBoxes9 + 1;
                statsLabel9.setText("You did this Habit: " + countBoxes9 + " times.");
                statsPercent9 = (float) countBoxes9 / 7 * 100;
                statsPercentLabel9.setText("Your average for doing this habit is: " + statsPercent9 + "%");
                sundayLabel9.setTextFill(Color.WHITE);
            }
            if (!cb81.isSelected() && !cb82.isSelected() && !cb83.isSelected() && !cb84.isSelected()
                    && !cb85.isSelected() && !cb86.isSelected() && !cb87.isSelected()) {
                Error.display("Uh Oh!", "You did not do this habit any day this week.");
            }
        });

        caclstatsButton10.setOnAction(e -> {
            if (!addNameInput10.getText().equals("")) {
                statsTitle10.setText("Statistics for your habit: " + addNameInput10.getText());
            }
            if (cb91.isSelected()) {
                countBoxes10 = countBoxes10 + 1;
                statsLabel10.setText("You did this Habit: " + countBoxes10 + " times.");
                statsPercent10 = (float) countBoxes10 / 7 * 100;
                statsPercentLabel10.setText("Your average for doing this habit is: " + statsPercent10 + "%");
                mondayLabel10.setTextFill(Color.WHITE);
            }

            if (cb92.isSelected()) {
                countBoxes10 = countBoxes10 + 1;
                statsLabel10.setText("You did this Habit: " + countBoxes10 + " times.");
                statsPercent10 = (float) countBoxes10 / 7 * 100;
                statsPercentLabel10.setText("Your average for doing this habit is: " + statsPercent10 + "%");
                tuesdayLabel10.setTextFill(Color.WHITE);
            }
            if (cb93.isSelected()) {
                countBoxes10 = countBoxes10 + 1;
                statsLabel10.setText("You did this Habit: " + countBoxes10 + " times.");
                statsPercent10 = (float) countBoxes10 / 7 * 100;
                statsPercentLabel10.setText("Your average for doing this habit is: " + statsPercent10 + "%");
                wednesdayLabel10.setTextFill(Color.WHITE);
            }
            if (cb94.isSelected()) {
                countBoxes10 = countBoxes10 + 1;
                statsLabel10.setText("You did this Habit: " + countBoxes10 + " times.");
                statsPercent10 = (float) countBoxes10 / 7 * 100;
                statsPercentLabel10.setText("Your average for doing this habit is: " + statsPercent10 + "%");
                thursdayLabel10.setTextFill(Color.WHITE);
            }
            if (cb95.isSelected()) {
                countBoxes10 = countBoxes10 + 1;
                statsLabel10.setText("You did this Habit: " + countBoxes10 + " times.");
                statsPercent10 = (float) countBoxes10 / 7 * 100;
                statsPercentLabel10.setText("Your average for doing this habit is: " + statsPercent10 + "%");
                fridayLabel10.setTextFill(Color.WHITE);
            }
            if (cb96.isSelected()) {
                countBoxes10 = countBoxes10 + 1;
                statsLabel10.setText("You did this Habit: " + countBoxes10 + " times.");
                statsPercent10 = (float) countBoxes10 / 7 * 100;
                statsPercentLabel10.setText("Your average for doing this habit is: " + statsPercent10 + "%");
                saturdayLabel10.setTextFill(Color.WHITE);
            }
            if (cb97.isSelected()) {
                countBoxes10 = countBoxes10 + 1;
                statsLabel10.setText("You did this Habit: " + countBoxes10 + " times.");
                statsPercent10 = (float) countBoxes10 / 7 * 100;
                statsPercentLabel10.setText("Your average for doing this habit is: " + statsPercent10 + "%");
                sundayLabel10.setTextFill(Color.WHITE);
            }
            if (!cb91.isSelected() && !cb92.isSelected() && !cb93.isSelected() && !cb94.isSelected()
                    && !cb95.isSelected() && !cb96.isSelected() && !cb97.isSelected()) {
                Error.display("Uh Oh!", "You did not do this habit any day this week.");
            }
        });

        caclstatsButton11.setOnAction(e -> {
            if (cb101.isSelected()) {
                if (!addNameInput11.getText().equals("")) {
                    statsTitle11.setText("Statistics for your habit: " + addNameInput11.getText());
                }
                countBoxes11 = countBoxes11 + 1;
                statsLabel11.setText("You did this Habit: " + countBoxes11 + " times.");
                statsPercent11 = (float) countBoxes11 / 7 * 100;
                statsPercentLabel11.setText("Your average for doing this habit is: " + statsPercent11 + "%");
                mondayLabel11.setTextFill(Color.WHITE);
            }
            if (cb102.isSelected()) {
                countBoxes11 = countBoxes11 + 1;
                statsLabel11.setText("You did this Habit: " + countBoxes11 + " times.");
                statsPercent11 = (float) countBoxes11 / 7 * 100;
                statsPercentLabel11.setText("Your average for doing this habit is: " + statsPercent11 + "%");
                tuesdayLabel11.setTextFill(Color.WHITE);
            }
            if (cb103.isSelected()) {
                countBoxes11 = countBoxes11 + 1;
                statsLabel11.setText("You did this Habit: " + countBoxes11 + " times.");
                statsPercent11 = (float) countBoxes11 / 7 * 100;
                statsPercentLabel11.setText("Your average for doing this habit is: " + statsPercent11 + "%");
                wednesdayLabel11.setTextFill(Color.WHITE);
            }
            if (cb104.isSelected()) {
                countBoxes11 = countBoxes11 + 1;
                statsLabel11.setText("You did this Habit: " + countBoxes11 + " times.");
                statsPercent11 = (float) countBoxes11 / 7 * 100;
                statsPercentLabel11.setText("Your average for doing this habit is: " + statsPercent11 + "%");
                thursdayLabel11.setTextFill(Color.WHITE);
            }
            if (cb105.isSelected()) {
                countBoxes11 = countBoxes11 + 1;
                statsLabel11.setText("You did this Habit: " + countBoxes11 + " times.");
                statsPercent11 = (float) countBoxes11 / 7 * 100;
                statsPercentLabel11.setText("Your average for doing this habit is: " + statsPercent11 + "%");
                fridayLabel11.setTextFill(Color.WHITE);
            }
            if (cb106.isSelected()) {
                countBoxes11 = countBoxes11 + 1;
                statsLabel11.setText("You did this Habit: " + countBoxes11 + " times.");
                statsPercent11 = (float) countBoxes11 / 7 * 100;
                statsPercentLabel11.setText("Your average for doing this habit is: " + statsPercent11 + "%");
                saturdayLabel11.setTextFill(Color.WHITE);
            }
            if (cb107.isSelected()) {
                countBoxes11 = countBoxes11 + 1;
                statsLabel11.setText("You did this Habit: " + countBoxes11 + " times.");
                statsPercent11 = (float) countBoxes11 / 7 * 100;
                statsPercentLabel11.setText("Your average for doing this habit is: " + statsPercent11 + "%");
                sundayLabel11.setTextFill(Color.WHITE);
            }
            if (!cb101.isSelected() && !cb102.isSelected() && !cb103.isSelected() && !cb104.isSelected()
                    && !cb105.isSelected() && !cb106.isSelected() && !cb107.isSelected()) {
                Error.display("Uh Oh!", "You did not do this habit any day this week.");
            }
        });

        caclstatsButton12.setOnAction(e -> {
            if (!addNameInput12.getText().equals("")) {
                statsTitle12.setText("Statistics for your habit: " + addNameInput12.getText());
            }
            if (cb111.isSelected()) {
                countBoxes12 = countBoxes12 + 1;
                statsLabel12.setText("You did this Habit: " + countBoxes12 + " times.");
                statsPercent12 = (float) countBoxes12 / 7 * 100;
                statsPercentLabel12.setText("Your average for doing this habit is: " + statsPercent12 + "%");
                mondayLabel12.setTextFill(Color.WHITE);
            }
            if (cb112.isSelected()) {
                countBoxes12 = countBoxes12 + 1;
                statsLabel12.setText("You did this Habit: " + countBoxes12 + " times.");
                statsPercent12 = (float) countBoxes12 / 7 * 100;
                statsPercentLabel12.setText("Your average for doing this habit is: " + statsPercent12 + "%");
                tuesdayLabel12.setTextFill(Color.WHITE);
            }
            if (cb113.isSelected()) {
                countBoxes12 = countBoxes12 + 1;
                statsLabel12.setText("You did this Habit: " + countBoxes12 + " times.");
                statsPercent12 = (float) countBoxes12 / 7 * 100;
                statsPercentLabel12.setText("Your average for doing this habit is: " + statsPercent12 + "%");
                wednesdayLabel12.setTextFill(Color.WHITE);
            }
            if (cb114.isSelected()) {
                countBoxes12 = countBoxes12 + 1;
                statsLabel12.setText("You did this Habit: " + countBoxes12 + " times.");
                statsPercent12 = (float) countBoxes12 / 7 * 100;
                statsPercentLabel12.setText("Your average for doing this habit is: " + statsPercent12 + "%");
                thursdayLabel12.setTextFill(Color.WHITE);
            }
            if (cb115.isSelected()) {
                countBoxes12 = countBoxes12 + 1;
                statsLabel12.setText("You did this Habit: " + countBoxes12 + " times.");
                statsPercent12 = (float) countBoxes12 / 7 * 100;
                statsPercentLabel12.setText("Your average for doing this habit is: " + statsPercent12 + "%");
                fridayLabel12.setTextFill(Color.WHITE);
            }
            if (cb116.isSelected()) {
                countBoxes12 = countBoxes12 + 1;
                statsLabel12.setText("You did this Habit: " + countBoxes12 + " times.");
                statsPercent12 = (float) countBoxes12 / 7 * 100;
                statsPercentLabel12.setText("Your average for doing this habit is: " + statsPercent12 + "%");
                saturdayLabel12.setTextFill(Color.WHITE);
            }
            if (cb117.isSelected()) {
                countBoxes12 = countBoxes12 + 1;
                statsLabel12.setText("You did this Habit: " + countBoxes12 + " times.");
                statsPercent12 = (float) countBoxes12 / 7 * 100;
                statsPercentLabel12.setText("Your average for doing this habit is: " + statsPercent12 + "%");
                sundayLabel12.setTextFill(Color.WHITE);
            }
            if (!cb111.isSelected() && !cb112.isSelected() && !cb113.isSelected() && !cb114.isSelected()
                    && !cb115.isSelected() && !cb116.isSelected() && !cb117.isSelected()) {
                Error.display("Uh Oh!", "You did not do this habit any day this week.");
            }
        });

    }

}
