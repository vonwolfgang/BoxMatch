package BoksMacı;

public class Match {
    
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run(){
        if(isCheck()){
            while(this.f1.health>0 && this.f2.health>0){
                
                double randomNumber = Math.random()*2;
                randomNumber = Math.ceil(randomNumber);
                
                if(f1.f1chance == randomNumber){

                    this.f2.health = this.f1.hit(this.f2);
                    System.out.println(this.f2.name+": "+f2.health);

                    this.f1.health = this.f2.hit(this.f1);
                    System.out.println(this.f1.name +": "+ f1.health);
                
                }
                
                if (isWin()){
                      
                    //isWin();
                    break;
                }

                if(f2.f2chance == randomNumber){
                    this.f1.health = this.f2.hit(this.f1);
                    System.out.println(this.f1.name +": "+ f1.health);
                    
                    this.f2.health = this.f1.hit(this.f2);
                    System.out.println(this.f2.name+": "+f2.health);
                }
                if (isWin()){
                    //isWin();
                    break;
                }
                System.out.println("-----------New Raunt-----------");
            }

        }
        else{
            System.out.println("Fighters are not suitable for each other");
        }
    }

    boolean isCheck(){
        return(this.f1.weight >= minWeight && this.f1.weight<= maxWeight) && (this.f2.weight>=minWeight && this.f2.weight<=maxWeight);

    }

    boolean isWin(){

        if (this.f1.health ==0) {
            System.out.println("Winner: " + this.f2.name);
            System.out.println("Loser: " + this.f1.name);
            return true;
        }
        else if(this.f2.health==0){
            System.out.println("Winner: " + this.f1.name);
            System.out.println("Loser: " + this.f2.name);     
            return true;
        }
        return false;
    }


}
