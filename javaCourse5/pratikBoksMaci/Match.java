package javaCourse5.pratikBoksMaci;

import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }
    void run() {
        boolean starts = isStart();
        Fighter firstPlayer = starts ? f1 : f2;
        Fighter secondPlayer = starts ? f2 : f1;
        String start = starts ? f2.name + " başlıyor!!" : f1.name + " başlıyor!!";

        System.out.println(start);

        if (isCheck()) {
            while (!isWin()) {
                System.out.println("=== Yeni Round===");
    
                if (firstPlayer.health > 0) {
                    firstPlayer.health = secondPlayer.hit(firstPlayer);
                }
                if (secondPlayer.health > 0) {
                    secondPlayer.health = firstPlayer.hit(secondPlayer);
                }
    
                System.out.println(firstPlayer.name + " canı " + firstPlayer.health);
                System.out.println(secondPlayer.name + " canı " + secondPlayer.health);
            }
        } else {
            System.out.println("Sporcuların sikleti uymuyor");
        }
    }

    boolean isCheck(){
        if((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight) ) {
            return true;
        } else {
            return false;
        }
    }

    boolean isWin(){
        if(this.f1.health == 0){
            System.out.println(this.f2.name + " kazandı");
            return true;
        } 
        if(this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandı");
            return true;
        }
        return false;
    }

    boolean isStart(){
        Random random = new Random();
        boolean whoStarts = random.nextBoolean();

        return whoStarts;
    }
}
