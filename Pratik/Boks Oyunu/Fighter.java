import java.util.Random;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    Random rnd = new Random();
    Fighter(String name, int damage, int health, int weight,int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Fighter foe)
    {
        if(foe.isDodge())
        {
            System.out.println(this.name+"=>"+foe.name+" 'i ıskaladı.");
            System.out.println(foe.name + " " + foe.health + " canı kaldı.");
            System.out.println("===========================================================");
            return foe.health;
        }
        else
        {
            foe.health-= this.damage;
            System.out.println(this.name + "=>" + foe.name + " " + damage + " hasar vurdu.");
            System.out.println(foe.name + " " + foe.health + " canı kaldı.");
            System.out.println("===========================================================");
            return foe.health;
        }
        
        
    }
    public boolean isDodge()
    {
        int value = rnd.nextInt(100);
        return value <= this.dodge;
    }
}
