public class VirtualPet {
    private int health;
    private int hunger;
    private int thirst;
    private String name;
    private boolean alive;



    public VirtualPet(String name, int health, int hunger, int thirst, boolean alive) {
        this.name = name;
        this.health = health;
        this.hunger = hunger;
        this.thirst = thirst;
        this.alive = alive;


    }

    public String getName() {
        return name;

    }

    public int getHealth() {
        return health;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void feed(int foodPortion) {
        hunger -= foodPortion * 10;
        if(hunger <= 0){
            hunger = 0;
        }
    }


    public void water(int waterPortion) {
        thirst -= waterPortion * 25;
        if (thirst <= 0){
            thirst = 0;
        }
    }

    public void play(int playtime) {
        health += playtime * 10;
        if (health >= 100) {
            health = 100;
        }
    }

    public boolean getAlive(){
        if (health == 0){
            return !alive;
        }
        else {
            return alive;
        }
    }

    public void tick(){
        health -= 10;
        hunger += 10;
        thirst += 10;
    }




}
