package roboKata;
import robocode.*;


public class r0 extends Robot {

  public void run(){
    while(true){
      ahead(100);
      turnGunRight(360);
      back(100);
      turnGunRight(360);
    }

  }

}
