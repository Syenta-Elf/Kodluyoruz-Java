import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    Random rnd = new Random();

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }   

    public void run()
    {
        if(isCheck())
        {
            // f1 başlayacak
            if(whoFirst())
            {
                while(this.f1.health > 0 && this.f2.health>0)
                {
                f2.health  = f1.hit(f2);
                if(f2.health == 0) break;
                f1.health  = f2.hit(f1);
                if(f1.health == 0) break;
                
                }
            }
            // f2 başlayacak
            else
            {
                while(this.f1.health > 0 && this.f2.health>0)
                {
                f1.health  = f2.hit(f1);
                if(f1.health == 0) break;
                f2.health  = f1.hit(f2);
                if(f2.health == 0) break;
                }
                
            }
            if(f1.health == 0) System.out.println(f1.name+" Mağlup oldu. "+f2.name+" kazandı!");
            if(f2.health == 0) System.out.println(f2.name+" Mağlup oldu"+f1.name+" kazandı!");
        }
        else
        {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    
    }
    boolean isCheck(){
        return(this.f1.weight >= minWeight && this.f1.weight<=maxWeight)&&(this.f2.weight >= minWeight && this.f2.weight<=maxWeight);
    }
    boolean whoFirst()
    {
        
        int number = rnd.nextInt(10);
        if(number%2==0) return true;
        else return false;
    }
}
