import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.input.*;
import javafx.event.*;
import java.util.Random;
import java.util.Scanner;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.paint.*;




public class Game1 extends Application{

  private StackPane myPane = new StackPane();//moet altijd boven private scene
  private Scene myScene = new Scene(myPane, 1500, 1000);
  private Image img1 = new Image("img/gameName.png");
  private Image img2 = new Image("img/castle1.jpg");
  private Image img3 = new Image("img/halway1.jpg");
  private Image img4 = new Image("img/butler1.png");
  private Image img5 = new Image("img/enemy1.png");
  private Image img6 = new Image("img/enemy2.png");
  private Image img7 = new Image("img/enemy3.png");
  private Image img8 = new Image("img/halway2.jpg");
  private Image img9 = new Image("img/gate1.jpg");
  private Image img10 = new Image("img/boss1.gif_c200");
  private ImageView imgView1;
  private ImageView imgView2;
  private ImageView imgView3;
  private ImageView imgView4;
  private ImageView imgView5;
  private ImageView imgView6;
  private ImageView imgView7;
  private ImageView imgView8;
  private ImageView imgView9;
  private ImageView imgView10;


  public static void main(String[] args) {

      launch(args);

  }

  public void start(Stage primaryStage){

    int lives = 3;

    primaryStage.setScene(myScene);
    primaryStage.setTitle("Game");
    Button a = new Button("Start Game");
    Button a2 = new Button("next");
    Button a3 = new Button();
    Button a4 = new Button("next");
    Button a5 = new Button("next");
    Button a6 = new Button("next");
    Button a7 = new Button("next");
    Button a8 = new Button("next");
    Button a9 = new Button("next");
    Button a10 = new Button("next");
    Button a11 = new Button("next");
    Button a12 = new Button("next");
    Button a13 = new Button("next");
    Button a14 = new Button("next");
    Button a15 = new Button("next");
    Button a16 = new Button("next");
    Button a17 = new Button("next");


    //antwoord 1 buttons
    Button aw1 = new Button("1");
    Button aw2 = new Button("2");
    Button aw3 = new Button("3");
    Button aw4 = new Button("an Anchor");
    Button aw5 = new Button("a Bal");
    Button aw6 = new Button("a letter");
    Button aw7 = new Button("Mount Rushmore");
    Button aw8 = new Button("Talking Heads");
    Button aw9 = new Button("Nosound");
    Button aw10 = new Button("myChemicalRomance");
    Button aw11 = new Button("1st");
    Button aw12 = new Button("2nd");
    Button aw13 = new Button("3d");
    Button aw14 = new Button("Warmth");
    Button aw15 = new Button("A balloon");
    Button aw16 = new Button("Age");
    Button aw17 = new Button("Prison");
    Button aw18 = new Button("Hotel");
    Button aw19 = new Button("Home");
    Button aw20 = new Button("8");
    Button aw21 = new Button("11");
    Button aw22 = new Button("10");
    Button aw23 = new Button("26");
    Button aw24 = new Button("2nd");
    Button aw25 = new Button("Anchor");
    Button aw26 = new Button("Age");
    Button aw27 = new Button("1 million/1 billion chance");
    Button aw28 = new Button("1000/1 million");
    Button aw29 = new Button("1/10");
    Button aw30 = new Button("enemy 1");
    Button aw31 = new Button("enemy 2");
    Button aw32 = new Button("enemy 3");
    Button aw33 = new Button("You");
    Button aw34 = new Button("none");
    Button aw35 = new Button("1");
    Button aw36 = new Button("2");
    Button aw37 = new Button("3");
    Button aw38 = new Button("4");
    Button aw39 = new Button("Jeff Cook");
    Button aw40 = new Button("Jon Hitchcock");
    Button aw41 = new Button("Alfred Benedickt");
    Button aw42 = new Button("Alfred Beneduckt");
    Button aw43 = new Button("Love");
    Button aw44 = new Button("Hate");
    Button aw45 = new Button("Loneliness");

    Text textGood = new Text();
    Text textWrong = new Text();


    Text text = new Text();
    Text text2 = new Text();
    Text text3 = new Text();
    Text text4 = new Text();
    Text text5 = new Text();
    Text text6 = new Text();
    Text text7 = new Text();
    Text text8 = new Text();
    Text text9 = new Text();
    Text text10 = new Text();
    Text text11 = new Text();
    Text text12 = new Text();
    Text text13 = new Text();
    Text text14 = new Text();
    Text text15 = new Text();
    Text text16 = new Text();
    Text text17 = new Text();
    Text text18 = new Text();
    Text text19 = new Text();
    Text text20 = new Text();
    Text text21 = new Text();
    Text text22 = new Text();
    Text text23 = new Text();
    Text text24 = new Text();
    Text text25 = new Text();
    Text text26 = new Text();
    Text text27 = new Text();
    Text text28 = new Text();
    Text text29 = new Text();
    Text text30 = new Text();
    Text text31 = new Text();
    Text text32 = new Text();
    Text text33 = new Text();
    Text text34 = new Text();
    Text text35 = new Text();
    Text text36 = new Text();
    Text text37 = new Text();
    //intro
    text.setFill(Color.RED);
    text2.setFill(Color.RED);
    text3.setFill(Color.RED);
    text4.setFill(Color.RED);
    //butler1
    text5.setFill(Color.WHITE);
    text6.setFill(Color.WHITE);
    text7.setFill(Color.WHITE);
    text8.setFill(Color.WHITE);
    text9.setFill(Color.WHITE);

    //enemy 1
    text10.setFill(Color.GREY);
    text11.setFill(Color.GREY);
    text12.setFill(Color.GREY);
    text13.setFill(Color.GREY);
    text14.setFill(Color.GREY);
    text15.setFill(Color.GREY);

    //enemy2
    text16.setFill(Color.ORANGE);
    text17.setFill(Color.ORANGE);
    text18.setFill(Color.ORANGE);
    text19.setFill(Color.ORANGE);
    text20.setFill(Color.ORANGE);
    text21.setFill(Color.ORANGE);

    //enemy3
    text22.setFill(Color.YELLOW);
    text23.setFill(Color.YELLOW);
    text24.setFill(Color.YELLOW);
    text25.setFill(Color.YELLOW);
    text26.setFill(Color.YELLOW);
    text27.setFill(Color.YELLOW);

    text28.setFill(Color.GREEN);
    text29.setFill(Color.GREEN);
    text30.setFill(Color.GREEN);
    text31.setFill(Color.GREEN);
    text32.setFill(Color.GREEN);
    text33.setFill(Color.GREEN);
    text34.setFill(Color.GREEN);
    text35.setFill(Color.GREEN);
    text36.setFill(Color.GREEN);
    text37.setFill(Color.GREEN);


    textGood.setFill(Color.GREEN);
    textWrong.setFill(Color.RED);
    //intro
    text.setText("Welkom on 6 game's island.");
    text2.setText("On this island you must beat all the bosses in there own game");
    text3.setText("So you can become ISLAND CHAMPION.");
    text4.setText("Press the castle to enter");

    //Buttler1
    text5.setText("Good evening sir. My name is Alfred Benedickt and i'm the butler of this castle.");
    text6.setText("If you want to meet my master you need to go through this hallway.");
    text7.setText("But be awere there are others that wil be blocking your way");
    text8.setText("if you want to get through you need to beat them by solving their riddles");
    text9.setText("If you get 3 of their riddles wrong you have to start over. Good luck Sir.");

    //Good - bad Awnsers
    textGood.setText("Correct");
    textWrong.setText("Wrong");

    //enemy1
    text10.setText("I like to stand in the way i like to play the fiddle you can only pass if you can solve my riddles");
    text11.setText("You have a choice between 3 rooms, room 1 is on fire, room 2 has assasins with loaded guns and knives and room 3 has 3 wolves who havent eaten for years witch room is the safest");
    text12.setText("Good now riddle 2");
    text13.setText("When you need me you throw me away. But when you're done with me you bring me back. WHAT AM I?");
    text14.setText("Good now its time for the final riddle");
    text15.setText("What rock group has four men that don't sing?");

    //enemy2
    text16.setText("I'm yellow i'm mean if you don't solve my riddles then please leave the scene");
    text17.setText("You run a race an you pass the person in second place, What place are you in?");
    text18.setText("Great next riddle.");
    text19.setText("I go up but never come down. What am i?");
    text20.setText("And now the final riddle");
    text21.setText("A diamond plate, a glowing grate, a place you never leave. where am I?");

    text22.setText("You've come far and lots of enemy's you crossed but you have to beat me before you can fight the boss");
    text23.setText("How many letters are there in the alphabet?");
    text24.setText("Ok next Question.");
    text25.setText("What was the awnser to the second enemys 1st question");
    text26.setText("And now the final riddle");
    text27.setText("i have a million dice with 1000 sides how big is the chance that they all land on 1000");

    //boss
    text28.setText("Riddle me this Riddle me that Riddle me what Riddle you're gonna get");
    text29.setText("Riddle me this Riddle me that witch enemy whas wearing a hat");
    text30.setText("Correct no of them were and i wasnt wearing a hat but i am wearing a hat i'm just starting next riddle.");
    text31.setText("Riddle me this Riddle me that how many opponents did you have");
    text32.setText("Correct you HAD 3 and you are fighting me right now so you didnt had me yet Ok 3rd riddle");
    text33.setText("Riddle me this Riddle me that what is the name that my buttler has");
    text34.setText("I'm sure that you wont get this one");
    text35.setText("Riddle me this Riddle me that how long do i live in the mansion");
    text36.setText("Correct because this is a castle and now the final riddle");
    text37.setText("I can fill a room or just one heart. Others may have me but I can not be shared.");



    a3.setGraphic(new ImageView(img2));

    a.setTranslateX(0);
    a.setTranslateY(250);

    imgView1 = new ImageView(img1);
    imgView1.setScaleX(1.45);
    imgView1.setScaleY(6.8);

    imgView3 = new ImageView(img3);
    imgView3.setScaleX(2.85);
    imgView3.setScaleY(1.6);

    imgView3.setTranslateY(-200);


    imgView4 = new ImageView(img4);
    imgView4.setScaleX(1.85);
    imgView4.setScaleY(1.5);

    imgView4.setTranslateY(15);

    imgView5 = new ImageView(img5);
    imgView5.setScaleX(1.85);
    imgView5.setScaleY(1.4);

    imgView5.setTranslateY(9);

    imgView6 = new ImageView(img6);
    imgView6.setScaleX(1.85);
    imgView6.setScaleY(1.4);

    imgView6.setTranslateY(15);

    imgView7 = new ImageView(img7);
    imgView7.setScaleX(0.55);
    imgView7.setScaleY(0.3);

    imgView7.setTranslateY(8);

    imgView8 = new ImageView(img8);
    imgView8.setScaleX(2.85);
    imgView8.setScaleY(0.65);

    imgView8.setTranslateY(-180);

    imgView9 = new ImageView(img9);
    imgView9.setScaleX(2.85);
    imgView9.setScaleY(1.25);

    imgView9.setTranslateY(-180);

    imgView10 = new ImageView(img10);
    imgView10.setScaleX(2.85);
    imgView10.setScaleY(1.25);

    imgView10.setTranslateY(-180);



    myPane.setStyle("-fx-background-color: #000000;");
    myPane.getChildren().add(imgView1);
    myPane.getChildren().add(a);



      a.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event){


          //text postisies
          text2.setTranslateX(0);
          text2.setTranslateY(50);
          text3.setTranslateX(0);
          text3.setTranslateY(100);

          //text grote
          text.setFont(Font.font (30));
          text2.setFont(Font.font (30));
          text3.setFont(Font.font (30));

          //pane haalt text
          myPane.getChildren().add(text3);
          myPane.getChildren().add(text);
          myPane.getChildren().add(text2);

          //items die verwijderd worden als je op knop b drukt
          myPane.getChildren().remove(a);
          myPane.getChildren().remove(imgView1);

          //next button
          myPane.getChildren().add(a2);
          a2.setTranslateX(0);
          a2.setTranslateY(200);

}
      });

      a2.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event){




          text4.setFont(Font.font (30));
          text4.setTranslateX(0);
          text4.setTranslateY(300);
          myPane.getChildren().add(text4);

          myPane.getChildren().add(a3);
          a3.setScaleX(0.45);
          a3.setScaleY(0.45);
          a3.setTranslateX(0);
          a3.setTranslateY(0);


          myPane.getChildren().remove(a2);
          myPane.getChildren().remove(text);
          myPane.getChildren().remove(text2);
          myPane.getChildren().remove(text3);



    }
  });


a3.setOnAction(new EventHandler<ActionEvent>() {
  @Override
  public void handle(ActionEvent event){




    text5.setFont(Font.font (30));
    text6.setFont(Font.font (30));
    text7.setFont(Font.font (30));
    text8.setFont(Font.font (30));
    text9.setFont(Font.font (30));

    text5.setTranslateX(0);
    text5.setTranslateY(200);
    text6.setTranslateX(0);
    text6.setTranslateY(250);
    text7.setTranslateX(0);
    text7.setTranslateY(300);
    text8.setTranslateX(0);
    text8.setTranslateY(350);
    text9.setTranslateY(400);

    myPane.getChildren().add(text5);
    myPane.getChildren().add(text6);
    myPane.getChildren().add(text7);
    myPane.getChildren().add(text8);
    myPane.getChildren().add(text9);

    myPane.getChildren().add(imgView9);
    myPane.getChildren().add(imgView8);
    myPane.getChildren().add(imgView3);
    myPane.getChildren().add(imgView4);

    myPane.getChildren().add(a4);



    myPane.getChildren().remove(a3);
    myPane.getChildren().remove(text4);
    a4.setTranslateX(0);
    a4.setTranslateY(450);



}
});
//na dit een loop maken
a4.setOnAction(new EventHandler<ActionEvent>() {
  @Override
  public void handle(ActionEvent event){

     myPane.getChildren().add(text10);
     myPane.getChildren().add(text11);

     text10.setTranslateX(0);
     text10.setTranslateY(200);
     text11.setTranslateX(0);
     text11.setTranslateY(250);

     text10.setFont(Font.font (30));
     text11.setFont(Font.font (20));

     myPane.getChildren().add(imgView5);

     myPane.getChildren().add(aw1);
     aw1.setTranslateX(0);
     aw1.setTranslateY(350);

     myPane.getChildren().add(aw2);
     aw2.setTranslateX(0);
     aw2.setTranslateY(400);

     myPane.getChildren().add(aw3);
     aw3.setTranslateX(0);
     aw3.setTranslateY(450);



    myPane.getChildren().remove(text5);
    myPane.getChildren().remove(text6);
    myPane.getChildren().remove(text7);
    myPane.getChildren().remove(text8);
    myPane.getChildren().remove(text9);
    myPane.getChildren().remove(textWrong);

    myPane.getChildren().remove(imgView4);
    myPane.getChildren().remove(a4);


}
});
aw1.setOnAction(new EventHandler<ActionEvent>() {
  @Override
  public void handle(ActionEvent event){

    myPane.getChildren().add(textWrong);
    textWrong.setFont(Font.font (60));

    myPane.getChildren().add(a4);


    myPane.getChildren().remove(imgView5);
    myPane.getChildren().remove(text10);
    myPane.getChildren().remove(text11);
    myPane.getChildren().remove(aw1);
    myPane.getChildren().remove(aw2);
    myPane.getChildren().remove(aw3);

  }
  });

aw2.setOnAction(new EventHandler<ActionEvent>() {
  @Override
  public void handle(ActionEvent event){

    myPane.getChildren().add(textWrong);
    textWrong.setFont(Font.font (60));

    myPane.getChildren().add(a4);


    myPane.getChildren().remove(imgView5);
    myPane.getChildren().remove(text10);
    myPane.getChildren().remove(text11);
    myPane.getChildren().remove(aw1);
    myPane.getChildren().remove(aw2);
    myPane.getChildren().remove(aw3);

    }
    });

aw3.setOnAction(new EventHandler<ActionEvent>() {
  @Override
  public void handle(ActionEvent event){

    myPane.getChildren().add(textGood);
    textGood.setFont(Font.font (60));

    myPane.getChildren().add(a5);
    a5.setTranslateX(0);
    a5.setTranslateY(400);


    myPane.getChildren().remove(imgView5);
    myPane.getChildren().remove(text10);
    myPane.getChildren().remove(text11);
    myPane.getChildren().remove(aw1);
    myPane.getChildren().remove(aw2);
    myPane.getChildren().remove(aw3);
  }
  });

  a5.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event){

      myPane.getChildren().add(text12);
      text12.setFont(Font.font (30));

      myPane.getChildren().add(text13);
      text13.setFont(Font.font (30));

      text12.setTranslateX(0);
      text12.setTranslateY(200);
      text13.setTranslateX(0);
      text13.setTranslateY(250);

      myPane.getChildren().add(aw4);
      aw4.setTranslateX(0);
      aw4.setTranslateY(350);

      myPane.getChildren().add(aw5);
      aw5.setTranslateX(0);
      aw5.setTranslateY(400);

      myPane.getChildren().add(aw6);
      aw6.setTranslateX(0);
      aw6.setTranslateY(450);

      myPane.getChildren().add(imgView5);

      myPane.getChildren().remove(textWrong);



      myPane.getChildren().remove(aw1);
      myPane.getChildren().remove(aw2);
      myPane.getChildren().remove(aw3);
      myPane.getChildren().remove(a5);
      myPane.getChildren().remove(textGood);
    }
    });

    aw4.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event){

        myPane.getChildren().add(textGood);
        textGood.setFont(Font.font (60));

        myPane.getChildren().add(a6);
        a6.setTranslateX(0);
        a6.setTranslateY(450);

        myPane.getChildren().remove(imgView5);
        myPane.getChildren().remove(text12);
        myPane.getChildren().remove(text13);
        myPane.getChildren().remove(aw4);
        myPane.getChildren().remove(aw5);
        myPane.getChildren().remove(aw6);

      }
      });
    aw5.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event){

        myPane.getChildren().add(textWrong);
        textWrong.setFont(Font.font (60));

        myPane.getChildren().add(a5);

        myPane.getChildren().remove(imgView5);
        myPane.getChildren().remove(text12);
        myPane.getChildren().remove(text13);
        myPane.getChildren().remove(aw4);
        myPane.getChildren().remove(aw5);
        myPane.getChildren().remove(aw6);

      }
      });
    aw6.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event){

          myPane.getChildren().add(textWrong);
          textWrong.setFont(Font.font (60));

          myPane.getChildren().add(a5);

          myPane.getChildren().remove(imgView5);
          myPane.getChildren().remove(text12);
          myPane.getChildren().remove(text13);
          myPane.getChildren().remove(aw4);
          myPane.getChildren().remove(aw5);
          myPane.getChildren().remove(aw6);

      }
      });

      a6.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event){

          myPane.getChildren().add(text14);
          text14.setFont(Font.font (30));

          myPane.getChildren().add(text15);
          text15.setFont(Font.font (30));

          text14.setTranslateX(0);
          text14.setTranslateY(200);
          text15.setTranslateX(0);
          text15.setTranslateY(250);

          myPane.getChildren().add(aw7);
          aw7.setTranslateX(0);
          aw7.setTranslateY(300);

          myPane.getChildren().add(aw8);
          aw8.setTranslateX(0);
          aw8.setTranslateY(350);

          myPane.getChildren().add(aw9);
          aw9.setTranslateX(0);
          aw9.setTranslateY(400);

          myPane.getChildren().add(aw10);
          aw10.setTranslateX(0);
          aw10.setTranslateY(450);

          myPane.getChildren().add(imgView5);



          myPane.getChildren().remove(aw4);
          myPane.getChildren().remove(aw5);
          myPane.getChildren().remove(aw6);
          myPane.getChildren().remove(a6);

          myPane.getChildren().remove(textGood);
          myPane.getChildren().remove(textWrong);
        }
        });

        aw7.setOnAction(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event){

            myPane.getChildren().add(textGood);
            textGood.setFont(Font.font (60));

            myPane.getChildren().add(a7);
            a7.setTranslateX(0);
            a7.setTranslateY(450);

            myPane.getChildren().remove(imgView5);
            myPane.getChildren().remove(text14);
            myPane.getChildren().remove(text15);
            myPane.getChildren().remove(aw7);
            myPane.getChildren().remove(aw8);
            myPane.getChildren().remove(aw9);
            myPane.getChildren().remove(aw10);

          }
          });

          aw8.setOnAction(new EventHandler<ActionEvent>() {
              @Override
              public void handle(ActionEvent event){

                myPane.getChildren().add(textWrong);
                textWrong.setFont(Font.font (60));

                myPane.getChildren().add(a6);

                myPane.getChildren().remove(imgView5);
                myPane.getChildren().remove(text14);
                myPane.getChildren().remove(text15);
                myPane.getChildren().remove(aw7);
                myPane.getChildren().remove(aw8);
                myPane.getChildren().remove(aw9);
                myPane.getChildren().remove(aw10);

            }
            });

          aw9.setOnAction(new EventHandler<ActionEvent>() {
              @Override
              public void handle(ActionEvent event){

                myPane.getChildren().add(textWrong);
                textWrong.setFont(Font.font (60));

                myPane.getChildren().add(a6);

                myPane.getChildren().remove(imgView5);
                myPane.getChildren().remove(text14);
                myPane.getChildren().remove(text15);
                myPane.getChildren().remove(aw7);
                myPane.getChildren().remove(aw8);
                myPane.getChildren().remove(aw9);
                myPane.getChildren().remove(aw10);

            }
            });

            aw10.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event){

                  myPane.getChildren().add(textWrong);
                  textWrong.setFont(Font.font (60));

                  myPane.getChildren().add(a6);

                  myPane.getChildren().remove(imgView5);
                  myPane.getChildren().remove(text14);
                  myPane.getChildren().remove(text15);
                  myPane.getChildren().remove(aw7);
                  myPane.getChildren().remove(aw8);
                  myPane.getChildren().remove(aw9);
                  myPane.getChildren().remove(aw10);

              }
              });





              //Vijand2
              a7.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event){

                   myPane.getChildren().add(text16);
                   myPane.getChildren().add(text17);


                   myPane.getChildren().add(imgView6);


                   text16.setTranslateX(0);
                   text16.setTranslateY(200);
                   text17.setTranslateX(0);
                   text17.setTranslateY(250);

                   text16.setFont(Font.font (40));
                   text17.setFont(Font.font (40));

                   myPane.getChildren().add(aw11);
                   aw11.setTranslateX(0);
                   aw11.setTranslateY(350);

                   myPane.getChildren().add(aw12);
                   aw12.setTranslateX(0);
                   aw12.setTranslateY(400);

                   myPane.getChildren().add(aw13);
                   aw13.setTranslateX(0);
                   aw13.setTranslateY(450);



                   myPane.getChildren().remove(text14);
                   myPane.getChildren().remove(text15);

                  myPane.getChildren().remove(textGood);
                  myPane.getChildren().remove(textWrong);
                  myPane.getChildren().remove(a7);

                  myPane.getChildren().remove(imgView4);
                  myPane.getChildren().remove(imgView5);
                  myPane.getChildren().remove(imgView3);
                  myPane.getChildren().remove(a4);

                  myPane.getChildren().remove(aw7);
                  myPane.getChildren().remove(aw8);
                  myPane.getChildren().remove(aw9);
                  myPane.getChildren().remove(aw10);


              }
              });
              aw11.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event){

                  myPane.getChildren().add(textWrong);
                  textWrong.setFont(Font.font (60));

                  myPane.getChildren().add(a7);



                  myPane.getChildren().remove(imgView6);
                  myPane.getChildren().remove(text16);
                  myPane.getChildren().remove(text17);
                  myPane.getChildren().remove(aw11);
                  myPane.getChildren().remove(aw12);
                  myPane.getChildren().remove(aw13);

                }
                });

                aw12.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event){

                    myPane.getChildren().add(textGood);
                    textGood.setFont(Font.font (60));

                    myPane.getChildren().add(a8);
                    a8.setTranslateX(0);
                    a8.setTranslateY(400);



                    myPane.getChildren().remove(imgView6);
                    myPane.getChildren().remove(text16);
                    myPane.getChildren().remove(text17);
                    myPane.getChildren().remove(aw11);
                    myPane.getChildren().remove(aw12);
                    myPane.getChildren().remove(aw13);
                  }
                  });

                  aw13.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event){

                      myPane.getChildren().add(textWrong);
                      textWrong.setFont(Font.font (60));

                      myPane.getChildren().add(a7);



                      myPane.getChildren().remove(imgView6);
                      myPane.getChildren().remove(text16);
                      myPane.getChildren().remove(text17);
                      myPane.getChildren().remove(aw11);
                      myPane.getChildren().remove(aw12);
                      myPane.getChildren().remove(aw13);

                    }
                    });

                a8.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event){

                    myPane.getChildren().add(text18);
                    text18.setFont(Font.font (30));

                    myPane.getChildren().add(text19);
                    text19.setFont(Font.font (30));

                    text18.setTranslateX(0);
                    text18.setTranslateY(200);
                    text19.setTranslateX(0);
                    text19.setTranslateY(250);

                    myPane.getChildren().add(aw14);
                    aw14.setTranslateX(0);
                    aw14.setTranslateY(350);

                    myPane.getChildren().add(aw15);
                    aw15.setTranslateX(0);
                    aw15.setTranslateY(400);

                    myPane.getChildren().add(aw16);
                    aw16.setTranslateX(0);
                    aw16.setTranslateY(450);

                    myPane.getChildren().add(imgView6);





                    myPane.getChildren().remove(aw11);
                    myPane.getChildren().remove(aw12);
                    myPane.getChildren().remove(aw13);
                    myPane.getChildren().remove(a8);
                    myPane.getChildren().remove(textGood);
                    myPane.getChildren().remove(textWrong);
                  }
                  });

                  aw14.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event){

                      myPane.getChildren().add(textWrong);
                      textWrong.setFont(Font.font (60));

                      myPane.getChildren().add(a8);

                      myPane.getChildren().remove(imgView6);
                      myPane.getChildren().remove(text18);
                      myPane.getChildren().remove(text19);
                      myPane.getChildren().remove(aw14);
                      myPane.getChildren().remove(aw15);
                      myPane.getChildren().remove(aw16);

                    }
                    });
                  aw15.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event){

                      myPane.getChildren().add(textWrong);
                      textWrong.setFont(Font.font (60));

                      myPane.getChildren().add(a8);

                      myPane.getChildren().remove(imgView6);
                      myPane.getChildren().remove(text18);
                      myPane.getChildren().remove(text19);
                      myPane.getChildren().remove(aw14);
                      myPane.getChildren().remove(aw15);
                      myPane.getChildren().remove(aw16);

                    }
                    });
                    aw16.setOnAction(new EventHandler<ActionEvent>() {
                      @Override
                      public void handle(ActionEvent event){

                        myPane.getChildren().add(textGood);
                        textGood.setFont(Font.font (60));

                        myPane.getChildren().add(a9);
                        a9.setTranslateX(0);
                        a9.setTranslateY(450);

                        myPane.getChildren().remove(a8);

                        myPane.getChildren().remove(imgView6);
                        myPane.getChildren().remove(text18);
                        myPane.getChildren().remove(text19);
                        myPane.getChildren().remove(aw14);
                        myPane.getChildren().remove(aw15);
                        myPane.getChildren().remove(aw16);

                      }
                      });


                    a9.setOnAction(new EventHandler<ActionEvent>() {
                      @Override
                      public void handle(ActionEvent event){

                        myPane.getChildren().add(text20);
                        text20.setFont(Font.font (45));

                        myPane.getChildren().add(text21);
                        text21.setFont(Font.font (45));

                        text20.setTranslateX(0);
                        text20.setTranslateY(200);
                        text21.setTranslateX(0);
                        text21.setTranslateY(250);

                        myPane.getChildren().add(aw17);
                        aw17.setTranslateX(0);
                        aw17.setTranslateY(300);

                        myPane.getChildren().add(aw18);
                        aw18.setTranslateX(0);
                        aw18.setTranslateY(350);

                        myPane.getChildren().add(aw19);
                        aw19.setTranslateX(0);
                        aw19.setTranslateY(400);


                        myPane.getChildren().add(imgView6);




                        myPane.getChildren().remove(a9);

                        myPane.getChildren().remove(textGood);
                        myPane.getChildren().remove(textWrong);
                      }
                      });

                      aw17.setOnAction(new EventHandler<ActionEvent>() {
                          @Override
                          public void handle(ActionEvent event){

                            myPane.getChildren().add(textWrong);
                            textWrong.setFont(Font.font (60));

                            myPane.getChildren().add(a9);

                            myPane.getChildren().remove(imgView6);
                            myPane.getChildren().remove(text20);
                            myPane.getChildren().remove(text21);
                            myPane.getChildren().remove(aw17);
                            myPane.getChildren().remove(aw18);
                            myPane.getChildren().remove(aw19);


                        }
                        });

                        aw18.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event){

                              myPane.getChildren().add(textWrong);
                              textWrong.setFont(Font.font (60));

                              myPane.getChildren().add(a9);

                              myPane.getChildren().remove(imgView6);
                              myPane.getChildren().remove(text20);
                              myPane.getChildren().remove(text21);
                              myPane.getChildren().remove(aw17);
                              myPane.getChildren().remove(aw18);
                              myPane.getChildren().remove(aw19);


                          }
                          });

                          aw19.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event){

                              myPane.getChildren().add(textGood);
                              textGood.setFont(Font.font (60));

                              myPane.getChildren().add(a10);
                              a10.setTranslateX(0);
                              a10.setTranslateY(450);

                              myPane.getChildren().remove(imgView6);
                              myPane.getChildren().remove(text20);
                              myPane.getChildren().remove(text21);
                              myPane.getChildren().remove(aw17);
                              myPane.getChildren().remove(aw18);
                              myPane.getChildren().remove(aw19);


                            }
                            });

                            //Vijand3
                            a10.setOnAction(new EventHandler<ActionEvent>() {
                              @Override
                              public void handle(ActionEvent event){

                                 myPane.getChildren().add(text22);
                                 myPane.getChildren().add(text23);


                                 myPane.getChildren().add(imgView7);


                                 text22.setTranslateX(0);
                                 text22.setTranslateY(200);
                                 text23.setTranslateX(0);
                                 text23.setTranslateY(250);

                                 text22.setFont(Font.font (40));
                                 text23.setFont(Font.font (40));

                                 myPane.getChildren().add(aw20);
                                 aw20.setTranslateX(0);
                                 aw20.setTranslateY(300);

                                 myPane.getChildren().add(aw21);
                                 aw21.setTranslateX(0);
                                 aw21.setTranslateY(350);

                                 myPane.getChildren().add(aw22);
                                 aw22.setTranslateX(0);
                                 aw22.setTranslateY(400);

                                 myPane.getChildren().add(aw23);
                                 aw23.setTranslateX(0);
                                 aw23.setTranslateY(450);



                                 myPane.getChildren().remove(text14);
                                 myPane.getChildren().remove(text15);

                                myPane.getChildren().remove(textGood);
                                myPane.getChildren().remove(textWrong);
                                myPane.getChildren().remove(a10);


                                myPane.getChildren().remove(imgView8);





                            }
                            });
                            aw20.setOnAction(new EventHandler<ActionEvent>() {
                              @Override
                              public void handle(ActionEvent event){

                                myPane.getChildren().add(textWrong);
                                textWrong.setFont(Font.font (60));

                                myPane.getChildren().add(a10);



                                myPane.getChildren().remove(imgView7);
                                myPane.getChildren().remove(text22);
                                myPane.getChildren().remove(text23);
                                myPane.getChildren().remove(aw20);
                                myPane.getChildren().remove(aw21);
                                myPane.getChildren().remove(aw22);
                                myPane.getChildren().remove(aw23);

                              }
                              });

                              aw21.setOnAction(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent event){

                                  myPane.getChildren().add(textGood);
                                  textGood.setFont(Font.font (60));

                                  myPane.getChildren().add(a11);
                                  a11.setTranslateX(0);
                                  a11.setTranslateY(450);


                                  myPane.getChildren().remove(imgView7);
                                  myPane.getChildren().remove(text22);
                                  myPane.getChildren().remove(text23);
                                  myPane.getChildren().remove(aw20);
                                  myPane.getChildren().remove(aw21);
                                  myPane.getChildren().remove(aw22);
                                  myPane.getChildren().remove(aw23);
                                }
                                });

                                aw22.setOnAction(new EventHandler<ActionEvent>() {
                                  @Override
                                  public void handle(ActionEvent event){

                                    myPane.getChildren().add(textWrong);
                                    textWrong.setFont(Font.font (60));

                                    myPane.getChildren().add(a10);



                                    myPane.getChildren().remove(imgView7);
                                    myPane.getChildren().remove(text22);
                                    myPane.getChildren().remove(text23);
                                    myPane.getChildren().remove(aw20);
                                    myPane.getChildren().remove(aw21);
                                    myPane.getChildren().remove(aw22);
                                    myPane.getChildren().remove(aw23);

                                  }
                                  });

                                  aw23.setOnAction(new EventHandler<ActionEvent>() {
                                    @Override
                                    public void handle(ActionEvent event){

                                      myPane.getChildren().add(textWrong);
                                      textWrong.setFont(Font.font (60));

                                      myPane.getChildren().add(a10);



                                      myPane.getChildren().remove(imgView7);
                                      myPane.getChildren().remove(text22);
                                      myPane.getChildren().remove(text23);
                                      myPane.getChildren().remove(aw20);
                                      myPane.getChildren().remove(aw21);
                                      myPane.getChildren().remove(aw22);
                                      myPane.getChildren().remove(aw23);
                                    }
                                    });

                              a11.setOnAction(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent event){

                                  myPane.getChildren().add(text24);
                                  text24.setFont(Font.font (30));

                                  myPane.getChildren().add(text25);
                                  text25.setFont(Font.font (30));

                                  text24.setTranslateX(0);
                                  text24.setTranslateY(200);
                                  text25.setTranslateX(0);
                                  text25.setTranslateY(250);

                                  myPane.getChildren().add(aw24);
                                  aw24.setTranslateX(0);
                                  aw24.setTranslateY(350);

                                  myPane.getChildren().add(aw25);
                                  aw25.setTranslateX(0);
                                  aw25.setTranslateY(400);

                                  myPane.getChildren().add(aw26);
                                  aw26.setTranslateX(0);
                                  aw26.setTranslateY(450);

                                  myPane.getChildren().add(imgView7);

                                  myPane.getChildren().remove(textWrong);




                                  myPane.getChildren().remove(a11);
                                  myPane.getChildren().remove(textGood);
                                }
                                });

                                aw24.setOnAction(new EventHandler<ActionEvent>() {
                                  @Override
                                  public void handle(ActionEvent event){

                                    myPane.getChildren().add(textGood);
                                    textWrong.setFont(Font.font (60));

                                    myPane.getChildren().add(a12);
                                    a12.setTranslateX(0);
                                    a12.setTranslateY(450);

                                    myPane.getChildren().remove(imgView7);
                                    myPane.getChildren().remove(text24);
                                    myPane.getChildren().remove(text25);
                                    myPane.getChildren().remove(aw24);
                                    myPane.getChildren().remove(aw25);
                                    myPane.getChildren().remove(aw26);

                                  }
                                  });
                                aw25.setOnAction(new EventHandler<ActionEvent>() {
                                  @Override
                                  public void handle(ActionEvent event){

                                    myPane.getChildren().add(textWrong);
                                    textWrong.setFont(Font.font (60));

                                    myPane.getChildren().add(a11);

                                    myPane.getChildren().remove(imgView7);
                                    myPane.getChildren().remove(text24);
                                    myPane.getChildren().remove(text25);
                                    myPane.getChildren().remove(aw24);
                                    myPane.getChildren().remove(aw25);
                                    myPane.getChildren().remove(aw26);

                                  }
                                  });
                                  aw26.setOnAction(new EventHandler<ActionEvent>() {
                                    @Override
                                    public void handle(ActionEvent event){

                                      myPane.getChildren().add(textWrong);
                                      textGood.setFont(Font.font (60));


                                      myPane.getChildren().add(a11);

                                      myPane.getChildren().remove(imgView7);
                                      myPane.getChildren().remove(text24);
                                      myPane.getChildren().remove(text25);
                                      myPane.getChildren().remove(aw24);
                                      myPane.getChildren().remove(aw25);
                                      myPane.getChildren().remove(aw26);

                                    }
                                    });


                                  a12.setOnAction(new EventHandler<ActionEvent>() {
                                    @Override
                                    public void handle(ActionEvent event){

                                      myPane.getChildren().add(text26);
                                      text26.setFont(Font.font (45));

                                      myPane.getChildren().add(text27);
                                      text27.setFont(Font.font (45));

                                      text26.setTranslateX(0);
                                      text26.setTranslateY(200);
                                      text27.setTranslateX(0);
                                      text27.setTranslateY(250);

                                      myPane.getChildren().add(aw27);
                                      aw27.setTranslateX(0);
                                      aw27.setTranslateY(300);

                                      myPane.getChildren().add(aw28);
                                      aw28.setTranslateX(0);
                                      aw28.setTranslateY(350);

                                      myPane.getChildren().add(aw29);
                                      aw29.setTranslateX(0);
                                      aw29.setTranslateY(400);


                                      myPane.getChildren().add(imgView7);




                                      myPane.getChildren().remove(a12);

                                      myPane.getChildren().remove(textGood);
                                      myPane.getChildren().remove(textWrong);
                                    }
                                    });

                                    aw27.setOnAction(new EventHandler<ActionEvent>() {
                                        @Override
                                        public void handle(ActionEvent event){

                                          myPane.getChildren().add(textGood);
                                          textWrong.setFont(Font.font (60));

                                          myPane.getChildren().add(a13);
                                          a13.setTranslateX(0);
                                          a13.setTranslateY(450);

                                          myPane.getChildren().remove(imgView7);
                                          myPane.getChildren().remove(text26);
                                          myPane.getChildren().remove(text27);
                                          myPane.getChildren().remove(aw27);
                                          myPane.getChildren().remove(aw28);
                                          myPane.getChildren().remove(aw29);


                                      }
                                      });

                                      aw28.setOnAction(new EventHandler<ActionEvent>() {
                                          @Override
                                          public void handle(ActionEvent event){

                                            myPane.getChildren().add(textWrong);
                                            textWrong.setFont(Font.font (60));

                                            myPane.getChildren().add(a12);

                                            myPane.getChildren().remove(imgView7);
                                            myPane.getChildren().remove(text26);
                                            myPane.getChildren().remove(text27);
                                            myPane.getChildren().remove(aw27);
                                            myPane.getChildren().remove(aw28);
                                            myPane.getChildren().remove(aw29);

                                        }
                                        });

                                        aw29.setOnAction(new EventHandler<ActionEvent>() {
                                          @Override
                                          public void handle(ActionEvent event){

                                            myPane.getChildren().add(textWrong);
                                            textGood.setFont(Font.font (60));

                                            myPane.getChildren().add(a12);


                                            myPane.getChildren().remove(imgView7);
                                            myPane.getChildren().remove(text26);
                                            myPane.getChildren().remove(text27);
                                            myPane.getChildren().remove(aw27);
                                            myPane.getChildren().remove(aw28);
                                            myPane.getChildren().remove(aw29);

                                          }
                                          });


                                          //Boss

                                          a13.setOnAction(new EventHandler<ActionEvent>() {
                                            @Override
                                            public void handle(ActionEvent event){

                                               myPane.getChildren().add(text28);
                                               myPane.getChildren().add(text29);


                                               myPane.getChildren().add(imgView10);


                                               text28.setTranslateX(0);
                                               text28.setTranslateY(200);
                                               text29.setTranslateX(0);
                                               text29.setTranslateY(250);

                                               text28.setFont(Font.font (40));
                                               text29.setFont(Font.font (40));

                                               myPane.getChildren().add(aw30);
                                               aw30.setTranslateX(0);
                                               aw30.setTranslateY(300);

                                               myPane.getChildren().add(aw31);
                                               aw31.setTranslateX(0);
                                               aw31.setTranslateY(300);

                                               myPane.getChildren().add(aw32);
                                               aw32.setTranslateX(0);
                                               aw32.setTranslateY(350);

                                               myPane.getChildren().add(aw33);
                                               aw33.setTranslateX(0);
                                               aw33.setTranslateY(400);

                                               myPane.getChildren().add(aw33);
                                               aw33.setTranslateX(0);
                                               aw33.setTranslateY(450);





                                              myPane.getChildren().remove(textGood);
                                              myPane.getChildren().remove(textWrong);
                                              myPane.getChildren().remove(a13);


                                              myPane.getChildren().remove(imgView8);





                                          }
                                          });
                                          aw20.setOnAction(new EventHandler<ActionEvent>() {
                                            @Override
                                            public void handle(ActionEvent event){

                                              myPane.getChildren().add(textWrong);
                                              textWrong.setFont(Font.font (60));

                                              myPane.getChildren().add(a10);



                                              myPane.getChildren().remove(imgView7);
                                              myPane.getChildren().remove(text22);
                                              myPane.getChildren().remove(text23);
                                              myPane.getChildren().remove(aw20);
                                              myPane.getChildren().remove(aw21);
                                              myPane.getChildren().remove(aw22);
                                              myPane.getChildren().remove(aw23);

                                            }
                                            });

                                            aw21.setOnAction(new EventHandler<ActionEvent>() {
                                              @Override
                                              public void handle(ActionEvent event){

                                                myPane.getChildren().add(textGood);
                                                textGood.setFont(Font.font (60));

                                                myPane.getChildren().add(a11);
                                                a11.setTranslateX(0);
                                                a11.setTranslateY(450);


                                                myPane.getChildren().remove(imgView7);
                                                myPane.getChildren().remove(text22);
                                                myPane.getChildren().remove(text23);
                                                myPane.getChildren().remove(aw20);
                                                myPane.getChildren().remove(aw21);
                                                myPane.getChildren().remove(aw22);
                                                myPane.getChildren().remove(aw23);
                                              }
                                              });

                                              aw22.setOnAction(new EventHandler<ActionEvent>() {
                                                @Override
                                                public void handle(ActionEvent event){

                                                  myPane.getChildren().add(textWrong);
                                                  textWrong.setFont(Font.font (60));

                                                  myPane.getChildren().add(a10);



                                                  myPane.getChildren().remove(imgView7);
                                                  myPane.getChildren().remove(text22);
                                                  myPane.getChildren().remove(text23);
                                                  myPane.getChildren().remove(aw20);
                                                  myPane.getChildren().remove(aw21);
                                                  myPane.getChildren().remove(aw22);
                                                  myPane.getChildren().remove(aw23);

                                                }
                                                });

                                                aw23.setOnAction(new EventHandler<ActionEvent>() {
                                                  @Override
                                                  public void handle(ActionEvent event){

                                                    myPane.getChildren().add(textWrong);
                                                    textWrong.setFont(Font.font (60));

                                                    myPane.getChildren().add(a10);



                                                    myPane.getChildren().remove(imgView7);
                                                    myPane.getChildren().remove(text22);
                                                    myPane.getChildren().remove(text23);
                                                    myPane.getChildren().remove(aw20);
                                                    myPane.getChildren().remove(aw21);
                                                    myPane.getChildren().remove(aw22);
                                                    myPane.getChildren().remove(aw23);
                                                  }
                                                  });

                                            a14.setOnAction(new EventHandler<ActionEvent>() {
                                              @Override
                                              public void handle(ActionEvent event){

                                                myPane.getChildren().add(text24);
                                                text24.setFont(Font.font (30));

                                                myPane.getChildren().add(text25);
                                                text25.setFont(Font.font (30));

                                                text24.setTranslateX(0);
                                                text24.setTranslateY(200);
                                                text25.setTranslateX(0);
                                                text25.setTranslateY(250);

                                                myPane.getChildren().add(aw24);
                                                aw24.setTranslateX(0);
                                                aw24.setTranslateY(350);

                                                myPane.getChildren().add(aw25);
                                                aw25.setTranslateX(0);
                                                aw25.setTranslateY(400);

                                                myPane.getChildren().add(aw26);
                                                aw26.setTranslateX(0);
                                                aw26.setTranslateY(450);

                                                myPane.getChildren().add(imgView7);

                                                myPane.getChildren().remove(textWrong);




                                                myPane.getChildren().remove(a11);
                                                myPane.getChildren().remove(textGood);
                                              }
                                              });

                                              aw24.setOnAction(new EventHandler<ActionEvent>() {
                                                @Override
                                                public void handle(ActionEvent event){

                                                  myPane.getChildren().add(textGood);
                                                  textWrong.setFont(Font.font (60));

                                                  myPane.getChildren().add(a12);
                                                  a12.setTranslateX(0);
                                                  a12.setTranslateY(450);

                                                  myPane.getChildren().remove(imgView7);
                                                  myPane.getChildren().remove(text24);
                                                  myPane.getChildren().remove(text25);
                                                  myPane.getChildren().remove(aw24);
                                                  myPane.getChildren().remove(aw25);
                                                  myPane.getChildren().remove(aw26);

                                                }
                                                });
                                              aw25.setOnAction(new EventHandler<ActionEvent>() {
                                                @Override
                                                public void handle(ActionEvent event){

                                                  myPane.getChildren().add(textWrong);
                                                  textWrong.setFont(Font.font (60));

                                                  myPane.getChildren().add(a11);

                                                  myPane.getChildren().remove(imgView7);
                                                  myPane.getChildren().remove(text24);
                                                  myPane.getChildren().remove(text25);
                                                  myPane.getChildren().remove(aw24);
                                                  myPane.getChildren().remove(aw25);
                                                  myPane.getChildren().remove(aw26);

                                                }
                                                });
                                                aw26.setOnAction(new EventHandler<ActionEvent>() {
                                                  @Override
                                                  public void handle(ActionEvent event){

                                                    myPane.getChildren().add(textWrong);
                                                    textGood.setFont(Font.font (60));


                                                    myPane.getChildren().add(a11);

                                                    myPane.getChildren().remove(imgView7);
                                                    myPane.getChildren().remove(text24);
                                                    myPane.getChildren().remove(text25);
                                                    myPane.getChildren().remove(aw24);
                                                    myPane.getChildren().remove(aw25);
                                                    myPane.getChildren().remove(aw26);

                                                  }
                                                  });


                                                a15.setOnAction(new EventHandler<ActionEvent>() {
                                                  @Override
                                                  public void handle(ActionEvent event){

                                                    myPane.getChildren().add(text26);
                                                    text26.setFont(Font.font (45));

                                                    myPane.getChildren().add(text27);
                                                    text27.setFont(Font.font (45));

                                                    text26.setTranslateX(0);
                                                    text26.setTranslateY(200);
                                                    text27.setTranslateX(0);
                                                    text27.setTranslateY(250);

                                                    myPane.getChildren().add(aw27);
                                                    aw27.setTranslateX(0);
                                                    aw27.setTranslateY(300);

                                                    myPane.getChildren().add(aw28);
                                                    aw28.setTranslateX(0);
                                                    aw28.setTranslateY(350);

                                                    myPane.getChildren().add(aw29);
                                                    aw29.setTranslateX(0);
                                                    aw29.setTranslateY(400);


                                                    myPane.getChildren().add(imgView7);




                                                    myPane.getChildren().remove(a12);

                                                    myPane.getChildren().remove(textGood);
                                                    myPane.getChildren().remove(textWrong);
                                                  }
                                                  });

                                                  aw27.setOnAction(new EventHandler<ActionEvent>() {
                                                      @Override
                                                      public void handle(ActionEvent event){

                                                        myPane.getChildren().add(textGood);
                                                        textWrong.setFont(Font.font (60));

                                                        myPane.getChildren().add(a13);
                                                        a13.setTranslateX(0);
                                                        a13.setTranslateY(450);

                                                        myPane.getChildren().remove(imgView7);
                                                        myPane.getChildren().remove(text26);
                                                        myPane.getChildren().remove(text27);
                                                        myPane.getChildren().remove(aw27);
                                                        myPane.getChildren().remove(aw28);
                                                        myPane.getChildren().remove(aw29);


                                                    }
                                                    });

                                                    aw28.setOnAction(new EventHandler<ActionEvent>() {
                                                        @Override
                                                        public void handle(ActionEvent event){

                                                          myPane.getChildren().add(textWrong);
                                                          textWrong.setFont(Font.font (60));

                                                          myPane.getChildren().add(a12);

                                                          myPane.getChildren().remove(imgView7);
                                                          myPane.getChildren().remove(text26);
                                                          myPane.getChildren().remove(text27);
                                                          myPane.getChildren().remove(aw27);
                                                          myPane.getChildren().remove(aw28);
                                                          myPane.getChildren().remove(aw29);

                                                      }
                                                      });

                                                      aw29.setOnAction(new EventHandler<ActionEvent>() {
                                                        @Override
                                                        public void handle(ActionEvent event){

                                                          myPane.getChildren().add(textWrong);
                                                          textGood.setFont(Font.font (60));

                                                          myPane.getChildren().add(a12);


                                                          myPane.getChildren().remove(imgView7);
                                                          myPane.getChildren().remove(text26);
                                                          myPane.getChildren().remove(text27);
                                                          myPane.getChildren().remove(aw27);
                                                          myPane.getChildren().remove(aw28);
                                                          myPane.getChildren().remove(aw29);

                                                        }
                                                        });

                                                        a16.setOnAction(new EventHandler<ActionEvent>() {
                                                          @Override
                                                          public void handle(ActionEvent event){

                                                            myPane.getChildren().add(text26);
                                                            text26.setFont(Font.font (45));

                                                            myPane.getChildren().add(text27);
                                                            text27.setFont(Font.font (45));

                                                            text26.setTranslateX(0);
                                                            text26.setTranslateY(200);
                                                            text27.setTranslateX(0);
                                                            text27.setTranslateY(250);

                                                            myPane.getChildren().add(aw27);
                                                            aw27.setTranslateX(0);
                                                            aw27.setTranslateY(300);

                                                            myPane.getChildren().add(aw28);
                                                            aw28.setTranslateX(0);
                                                            aw28.setTranslateY(350);

                                                            myPane.getChildren().add(aw29);
                                                            aw29.setTranslateX(0);
                                                            aw29.setTranslateY(400);


                                                            myPane.getChildren().add(imgView7);




                                                            myPane.getChildren().remove(a12);

                                                            myPane.getChildren().remove(textGood);
                                                            myPane.getChildren().remove(textWrong);
                                                          }
                                                          });

                                                          aw27.setOnAction(new EventHandler<ActionEvent>() {
                                                              @Override
                                                              public void handle(ActionEvent event){

                                                                myPane.getChildren().add(textGood);
                                                                textWrong.setFont(Font.font (60));

                                                                myPane.getChildren().add(a13);
                                                                a13.setTranslateX(0);
                                                                a13.setTranslateY(450);

                                                                myPane.getChildren().remove(imgView7);
                                                                myPane.getChildren().remove(text26);
                                                                myPane.getChildren().remove(text27);
                                                                myPane.getChildren().remove(aw27);
                                                                myPane.getChildren().remove(aw28);
                                                                myPane.getChildren().remove(aw29);


                                                            }
                                                            });

                                                            aw28.setOnAction(new EventHandler<ActionEvent>() {
                                                                @Override
                                                                public void handle(ActionEvent event){

                                                                  myPane.getChildren().add(textWrong);
                                                                  textWrong.setFont(Font.font (60));

                                                                  myPane.getChildren().add(a12);

                                                                  myPane.getChildren().remove(imgView7);
                                                                  myPane.getChildren().remove(text26);
                                                                  myPane.getChildren().remove(text27);
                                                                  myPane.getChildren().remove(aw27);
                                                                  myPane.getChildren().remove(aw28);
                                                                  myPane.getChildren().remove(aw29);

                                                              }
                                                              });

                                                              aw29.setOnAction(new EventHandler<ActionEvent>() {
                                                                @Override
                                                                public void handle(ActionEvent event){

                                                                  myPane.getChildren().add(textWrong);
                                                                  textGood.setFont(Font.font (60));

                                                                  myPane.getChildren().add(a12);


                                                                  myPane.getChildren().remove(imgView7);
                                                                  myPane.getChildren().remove(text26);
                                                                  myPane.getChildren().remove(text27);
                                                                  myPane.getChildren().remove(aw27);
                                                                  myPane.getChildren().remove(aw28);
                                                                  myPane.getChildren().remove(aw29);

                                                                }
                                                                });

                                                                a17.setOnAction(new EventHandler<ActionEvent>() {
                                                                  @Override
                                                                  public void handle(ActionEvent event){

                                                                    myPane.getChildren().add(text26);
                                                                    text26.setFont(Font.font (45));

                                                                    myPane.getChildren().add(text27);
                                                                    text27.setFont(Font.font (45));

                                                                    text26.setTranslateX(0);
                                                                    text26.setTranslateY(200);
                                                                    text27.setTranslateX(0);
                                                                    text27.setTranslateY(250);

                                                                    myPane.getChildren().add(aw27);
                                                                    aw27.setTranslateX(0);
                                                                    aw27.setTranslateY(300);

                                                                    myPane.getChildren().add(aw28);
                                                                    aw28.setTranslateX(0);
                                                                    aw28.setTranslateY(350);

                                                                    myPane.getChildren().add(aw29);
                                                                    aw29.setTranslateX(0);
                                                                    aw29.setTranslateY(400);


                                                                    myPane.getChildren().add(imgView7);




                                                                    myPane.getChildren().remove(a12);

                                                                    myPane.getChildren().remove(textGood);
                                                                    myPane.getChildren().remove(textWrong);
                                                                  }
                                                                  });

                                                                  aw27.setOnAction(new EventHandler<ActionEvent>() {
                                                                      @Override
                                                                      public void handle(ActionEvent event){

                                                                        myPane.getChildren().add(textGood);
                                                                        textWrong.setFont(Font.font (60));

                                                                        myPane.getChildren().add(a13);
                                                                        a13.setTranslateX(0);
                                                                        a13.setTranslateY(450);

                                                                        myPane.getChildren().remove(imgView7);
                                                                        myPane.getChildren().remove(text26);
                                                                        myPane.getChildren().remove(text27);
                                                                        myPane.getChildren().remove(aw27);
                                                                        myPane.getChildren().remove(aw28);
                                                                        myPane.getChildren().remove(aw29);


                                                                    }
                                                                    });

                                                                    aw28.setOnAction(new EventHandler<ActionEvent>() {
                                                                        @Override
                                                                        public void handle(ActionEvent event){

                                                                          myPane.getChildren().add(textWrong);
                                                                          textWrong.setFont(Font.font (60));

                                                                          myPane.getChildren().add(a12);

                                                                          myPane.getChildren().remove(imgView7);
                                                                          myPane.getChildren().remove(text26);
                                                                          myPane.getChildren().remove(text27);
                                                                          myPane.getChildren().remove(aw27);
                                                                          myPane.getChildren().remove(aw28);
                                                                          myPane.getChildren().remove(aw29);

                                                                      }
                                                                      });

                                                                      aw29.setOnAction(new EventHandler<ActionEvent>() {
                                                                        @Override
                                                                        public void handle(ActionEvent event){

                                                                          myPane.getChildren().add(textWrong);
                                                                          textGood.setFont(Font.font (60));

                                                                          myPane.getChildren().add(a12);


                                                                          myPane.getChildren().remove(imgView7);
                                                                          myPane.getChildren().remove(text26);
                                                                          myPane.getChildren().remove(text27);
                                                                          myPane.getChildren().remove(aw27);
                                                                          myPane.getChildren().remove(aw28);
                                                                          myPane.getChildren().remove(aw29);

                                                                        }
                                                                        });



        primaryStage.show();
  }
}
