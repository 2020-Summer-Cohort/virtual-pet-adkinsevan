public class Pet {

    private int hunger;
    private int thirst;
    private int boredom;
    private int smell;

    public Pet(int hunger, int thirst, int boredom, int smell) {
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.smell = smell;
    }
    public int getHunger() {
        return hunger;
    }
    public int getThirst() {
        return thirst;
    }
    public int getBoredom() {
        return boredom;
    }
    public int getSmell() {
        return smell;
    }

    public void tick(){
        hunger++;
        thirst++;
        boredom++;
        smell++;
            int randmFeedChance = (int) (Math.random() * 6) + 1;
            int randmDrinkChance = (int) (Math.random() * 6) + 1;
            int randmPlayChance = (int) (Math.random() * 6) + 1;
            int randmCleanChance = (int) (Math.random() * 6) + 1;
            if (randmFeedChance == 3) {
                hunger--;
                thirst++;
                smell++;
                System.out.println("Your pet was feeling hungry so they fed themselves");
            } else if (randmDrinkChance == 3) {
                thirst--;
                System.out.println("Your pet was feeling thirsty so they had something to drink");
            } else if (randmPlayChance == 3) {
                boredom--;
                smell++;
                System.out.println("Your pet was feeling bored, so they run around the cage trying to get your attention");
            } else if (randmCleanChance == 3) {
                smell--;
                System.out.println("Your pet is getting dirty, they're trying to get clean");
            } else {
            }
       }
    public void feed(int food) {
        if (hunger <= food){
            hunger -= hunger;
        }
        else {
            hunger -= food;
        }
        smell++;
        thirst++;
    }
    public void giveWater(int waterAmnt) {
        thirst -= Math.min(thirst, waterAmnt);
    }
    public void playWith(int amt2Play) {
        if (boredom <= amt2Play){
            boredom -= boredom;
        } else {
            boredom -= amt2Play;
        }
        hunger++;
        smell++;
    }
    public void clean(int cleanAmnt) {
        if(smell <= cleanAmnt) {
            smell -= smell;
        } else {
            smell -= cleanAmnt;
        }
        boredom++;
    }
}


