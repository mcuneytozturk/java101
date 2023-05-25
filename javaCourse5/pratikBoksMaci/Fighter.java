package javaCourse5.pratikBoksMaci;

public class Fighter {
    String name;
    double damage;
    double health;
    double weight;
    double defence;
    double dodge;

    Fighter(String name, double damage, double health, double weight, double defence, double dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.defence = defence;
        this.dodge = dodge;
    }

    double hit(Fighter foe){
        if(foe.isDodge()){
            System.out.println(foe.name + " hasarı blokladı");
            return foe.health;
        }
        if(foe.health - this.damage < 0){
            return 0;
        }
        
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar");
        return foe.health - (this.damage * (100 - foe.defence) / 100);
    }

    boolean isDodge(){
        double randomNum = Math.random() * 100;
        return randomNum < this.dodge;
    }
}
