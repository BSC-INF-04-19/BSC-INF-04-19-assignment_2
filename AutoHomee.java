
import javafx.application.Application;
import javafx.geometry.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class AutoHomee extends Application{

      // declaring the rooms
    static Button Room1,Room2, Room3, Room4 , Room5 , Room6 , Room7 , B1 , B2 , B3;

    // status of the bulb
    static boolean[] roomStatus = {false, false, false, false, false , false , false};

    

    static Button bAll, b12, b1, b2, b3, b4, b5, b6, b7;

    @Override
    public void start (Stage stage){

    Scene scene = new Scene (MyVBox()); 
    stage.setScene(scene);
    stage.setTitle("AutoHome"); 
    stage.setResizable(true);
    stage.show(); 


    // room1 bulb status
    b1.setOnAction(e -> {
        //bulb is off
        if(roomStatus[0])
            Room1.setStyle("-fx--border-color: black;-fx-background-color:grey;");
        //switches the bulb on
        else
             Room1.setStyle("-fx--border-color: black;-fx-background-color:yellow  ;");

        roomStatus[0] = !roomStatus[0];

    }

    
    );
    b2.setOnAction(e -> {
        //switches the bulb off 
        if(roomStatus[1])
            Room2.setStyle("-fx-background-color:grey ;-fx--border-color: black;");
        //the bulb is on
        else
             Room2.setStyle("-fx-background-color:green ;-fx--border-color: black;");

        roomStatus[1] = !roomStatus[1];
        
    }

    
    );
    b3.setOnAction(e -> {
        //switches the bulb off 
        if(roomStatus[2])
            Room3.setStyle("-fx--border-color: #000000;-fx-background-color:grey ;");
        //switches the bulb on
        else
             Room3.setStyle("-fx--border-color: #000000;-fx-background-color:orange ;");

        roomStatus[2] = !roomStatus[2];

    }

    
    );
    b4.setOnAction(e -> {
        //switches the bulb off 
        if(roomStatus[3])
            Room4.setStyle("-fx-background-color:grey ;-fx--border-color: black;");
        //switches the bulb on
        else
             Room4.setStyle("-fx-background-color:orange ;-fx--border-color: black;");

        roomStatus[3] = !roomStatus[3];

    }

    
    );

    // bulb status room 5
    b5.setOnAction(e -> {
        //switches the bulb off 
        if(roomStatus[4])
            Room5.setStyle("-fx-background-color:grey ;-fx--border-color: black;");
        //switches the bulb on
        else
             Room5.setStyle("-fx-background-color:yellow ;-fx--border-color: black;");

        roomStatus[4] = !roomStatus[4];

    }

    
    );
    // bulb status room 6
    b6.setOnAction(e -> {
        //switches the bulb off 
        if(roomStatus[5])
            Room6.setStyle("-fx-background-color:grey ;-fx--border-color: black;");
        //switches the bulb on
        else
             Room6.setStyle("-fx-background-color:red ;-fx--border-color: black;");

        roomStatus[5] = !roomStatus[5];

    }

    
    );

     // bulb status room 7
    b7.setOnAction(e -> {
        //switches the bulb off 
        if(roomStatus[6])
            Room7.setStyle("-fx-background-color:grey ;-fx--border-color: black;");
        //switches the bulb on
        else
             Room7.setStyle("-fx-background-color:yellow ;-fx--border-color: black;");

        roomStatus[6] = !roomStatus[6];

    }

    
    );

    b12.setOnAction(e-> {
        boolean bothOn;
        // sets both bulbs off
        if(roomStatus[0] && roomStatus[1]){
            Room1.setStyle("-fx-background-color:grey ;-fx--border-color: black;");
            Room2.setStyle("-fx-background-color:grey ;-fx--border-color: black;");
            bothOn = false;
        }
        // sets both bulbs on
        else{
            Room1.setStyle("-fx-background-color:yellow ;-fx--border-color: black;");
            Room2.setStyle("-fx-background-color:green ;-fx--border-color: black;");
            bothOn = true;
        }
         //updates the room status for room 1 and 2
        roomStatus[0]= bothOn; 
        roomStatus[1]= bothOn; 

    });

    bAll.setOnAction( e -> {
        if(roomStatus[0]  && roomStatus[1] && roomStatus[2]  && roomStatus[3]  && roomStatus[4]  && roomStatus[5]  && roomStatus[6]){
            Room1.setStyle("-fx-background-color:grey ;-fx--border-color: black;");
            Room2.setStyle("-fx-background-color:grey ;-fx--border-color: black;");
            Room3.setStyle("-fx-background-color:grey ;-fx--border-color: black;");
            Room4.setStyle("-fx-background-color:grey ;-fx--border-color: black;");
            Room5.setStyle("-fx-background-color:grey ;-fx--border-color: black;");
            Room6.setStyle("-fx-background-color:grey ;-fx--border-color: black;");
            Room7.setStyle("-fx-background-color:grey ;-fx--border-color: black;");


            //turn all rooms off
            for(boolean s: roomStatus){
                s=false;
            }
        }
        else {

            Room1.setStyle("-fx-background-color:yellow ;-fx--border-color: black;");
            Room2.setStyle("-fx-background-color:green ;-fx--border-color: black;");
            Room3.setStyle("-fx-background-color:orange ;-fx--border-color: black;");
            Room4.setStyle("-fx-background-color:orange ;-fx--border-color: black;");
            Room5.setStyle("-fx-background-color:yellow ;-fx--border-color: black;");
            Room6.setStyle("-fx-background-color:red ;-fx--border-color: black;");
            Room7.setStyle("-fx-background-color:yellow ;-fx--border-color: black;");
            

             //turn all rooms on
            for(boolean s: roomStatus){
                s=true;
            }
        }
    });

}

public VBox MyVBox () {

    BorderPane window = new BorderPane();
    window.setTop(MymainHBox());
    window.setCenter(buttons());
    


    VBox Hope = new VBox ();
    Hope.setStyle("-fx-background-color:white;");
    Hope.getChildren().addAll(MymainHBox(), buttons());
    return Hope;
}
public HBox MymainHBox (){
    
    HBox hbox = new HBox ();
    hbox.setPadding(new Insets(50,50,50,50));
    Room1 = new Button("Room1");
    Room1.setPrefSize (175 , 200);
    Room1.setStyle("-fx-background-color:grey; -fx-border-color:black;");

    hbox.getChildren().addAll(Room1 , B());
    return hbox;
}
 public HBox A (){

     HBox A = new HBox();
     Room5 = new Button("Room5");
     Room5.setPrefSize (100 , 160);
     Room5.setStyle("-fx-background-color:grey; -fx-border-color:black;");
     A.getChildren().addAll(getVBox(),Room5);
     return A;

 }

 public VBox B (){

     VBox B = new VBox();
     B.getChildren().addAll(A() , House());
     return B;

 }

public HBox getRoom3Room4(){

    HBox Room34 = new HBox();
    Room3 = new Button ("Room 3");
    Room4 = new Button ("Room4");
    Room3.setPrefSize (85 , 130);
    Room3.setStyle("-fx-background-color:grey; -fx-border-color:black;");
    Room4.setPrefSize (85 , 130);
    Room4.setStyle("-fx-background-color:grey; -fx-border-color:black;");
    Room34.getChildren().addAll(Room3 , Room4);
    return Room34;
}
public VBox bulbx(){

    VBox bulbx = new VBox();
    return bulbx;
}

public HBox House (){

    HBox House = new HBox ();
    Room6 = new Button ("Room6");
    Room7 = new Button ("Room7");
    Room6.setPrefSize (130 , 130);
    Room6.setStyle("-fx-background-color:grey; -fx-border-color:black;");
    Room7.setPrefSize (140, 130);
    Room7.setStyle("-fx-background-color:grey; -fx-border-color:black;");
    House.getChildren().addAll(Room6 , Room7);
    return House;
}

public VBox getVBox(){
    VBox vbox = new VBox();
    Room2 = new Button ("Room2");
    Room2.setPrefSize (170 , 30);
    Room2.setStyle("-fx-background-color:grey; -fx-border-color:black;");    
    vbox.getChildren().addAll(getRoom3Room4(), Room2);
    return vbox;
}

public static void main (String args []){

    launch(args);
}

    public static GridPane  buttons(){

        GridPane gPane = new GridPane();
        gPane.setPadding(new Insets(50));
        gPane.setVgap(10);
        gPane.setHgap(20);
        gPane.setAlignment(Pos.CENTER);
        
 // creating buttons for rooms
        bAll = new Button ("AllRooms ON/OFF");
        b12 = new Button ("Room1&2 ON/OFF");
        b1 = new Button ("Room1 ON/OFF");
        b1.setMaxWidth(Double.MAX_VALUE);
        b2 = new Button ("Room2 ON/OFF");
        b3 = new Button ("Room3 ON/OFF");
        b4 = new Button ("Room4 ON/OFF");
        b5 = new Button ("Room5 ON/OFF");
        b6 = new Button ("Room6 ON/OFF");
        b7 = new Button ("Room7 ON/OFF");

        gPane.add(bAll, 0,0);
        gPane.add(b12, 0,1);
        gPane.add(b1,  0,2);
        gPane.add(b2,  1,0);
        gPane.add(b3,  1,1);
        gPane.add(b4,  1,2);
        gPane.add(b5,  2,0);
        gPane.add(b6,  2,1);
        gPane.add(b7,  2,2);
        
        return gPane;

    }

}