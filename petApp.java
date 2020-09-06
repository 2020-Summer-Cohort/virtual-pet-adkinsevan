import java.util.Scanner;

public class petApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int randmHunger = (int)(Math.random()*6)+1;
        int randmThirst = (int)(Math.random()*6)+1;
        int randmBoredom = (int)(Math.random()*6)+1;
        int randmSmell = (int)(Math.random()*6)+1;

        Pet hamster = new Pet(randmHunger, randmThirst, randmBoredom, randmSmell);

        System.out.println("Welcome to your virtual pet!");
        System.out.println("Your pet is a small hamster with many needs.");
        System.out.println("Please name your hamster.");
        String hamName = input.nextLine();
        System.out.println("You entered " + hamName + ". ");
        System.out.println("Would you like to keep this name?");
        System.out.println("Y/N");
        String nameConfirm = input.nextLine();
        while (nameConfirm.equalsIgnoreCase("N")){
            System.out.println("Please name your hamster.");
            hamName = input.nextLine();
            System.out.println("You entered " + hamName + " . ");
            System.out.println("Would you like to keep this name?");
            System.out.println("Y/N?");
            nameConfirm = input.nextLine();
        }
        System.out.println("What would you like to do with " + hamName + "?");
        System.out.println("1: Check status of " + hamName);
        System.out.println("2: Feed " + hamName);
        System.out.println("3: Give water to " + hamName);
        System.out.println("4: Play with " + hamName);
        System.out.println("5: Clean " + hamName + "'s cage");
        System.out.println("6: Quit the program and give up on " + hamName);
        String select = input.nextLine();

        while (!select.equals("6")) {
            if(select.equals("1")) {
                if(hamster.getHunger() <=6 && hamster.getThirst() <=6 && hamster.getBoredom() <=6 && hamster.getSmell() <= 6){
                    System.out.println( "@-----@");
                    System.out.println("( ^ . ^ )___");
                    System.out.println("( = w = )   )p");
                    System.out.println("()----()---()");
                    System.out.println(hamName + " is feeling great");
                }
                else if(hamster.getHunger() >= 13 && hamster.getThirst() >= 13 && hamster.getBoredom() >= 13 && hamster.getSmell() >= 13){
                    System.out.println("@-----@");
                    System.out.println("( x . x )___");
                    System.out.println("( = w = )   )p");
                    System.out.println("()----()---()");
                    System.out.println(hamName + "has seen better days, hopefully they can pull through");
                    System.out.println(hamName + " has a hunger level of " + hamster.getHunger());
                    System.out.println(hamName + " has a boredom level of " + hamster.getBoredom());
                    System.out.println(hamName + " has a thirst level of " + hamster.getThirst());
                    System.out.println(hamName + " has a smell level of " + hamster.getSmell());
                }
                else if(hamster.getHunger() >= 13 || hamster.getBoredom() >=  13){
                    System.out.println(" @-----@");
                    System.out.println("( u . u )___");
                    System.out.println("( = _ = )   )p");
                    System.out.println("()----()---()");
                    System.out.println(hamName + " seems pretty bored, or maybe they're just hungry");
                    System.out.println(hamName + " has a hunger level of " + hamster.getHunger());
                    System.out.println(hamName + " has a boredom level of " + hamster.getBoredom());
                    System.out.println(hamName + " has a thirst level of " + hamster.getThirst());
                    System.out.println(hamName + " has a smell level of " + hamster.getSmell());
                    hamster.tick();
                }
                else {
                    System.out.println(hamName + " has a hunger level of " + hamster.getHunger());
                    System.out.println(hamName + " has a thirst level of " + hamster.getThirst());
                    System.out.println(hamName + " has a boredom level of " + hamster.getBoredom());
                    System.out.println(hamName + " has a smell level of " + hamster.getSmell());
                    hamster.tick();
                }
            } else if(select.equals("2")){
                System.out.println("What would you like to feed " + hamName + "?");
                System.out.println("1: Some oats");
                System.out.println("2: Some blueberries");
                System.out.println("3: A banana");
                System.out.println("4: Go back");
                String foodSelect = input.nextLine();
                    while (!foodSelect.equals("4")){
                        if(foodSelect.equals("1")){
                            hamster.feed(2);
                            System.out.println(hamName + " doesn't seem to like oats that much");
                            System.out.println(hamName + "'s hunger is now at " + hamster.getHunger());
                        }
                        else if (foodSelect.equals("2")){
                            hamster.feed(4);
                            System.out.println(hamName + " is happy to get some blueberries");
                            hamster.tick();
                            System.out.println(hamName + "'s hunger is now at " + hamster.getHunger());
                        }
                        else if (foodSelect.equals("3")){
                            hamster.feed(9);
                            System.out.println(" @-----@");
                            System.out.println("( ^ . ^ )___");
                            System.out.println("( = u = )   )p");
                            System.out.println("()----()---()");
                            System.out.println(hamName + " loves the banana");
                            hamster.tick();
                            hamster.tick();
                            System.out.println(hamName + "'s hunger level is now " + hamster.getHunger());
                        }
                        else {
                            System.out.println("Please select your option");
                        }
                        System.out.println("What would you like to feed " + hamName + "?");
                        System.out.println("1: Some oats");
                        System.out.println("2: Some blueberries");
                        System.out.println("3: A banana");
                        System.out.println("4: Go back");
                        foodSelect = input.nextLine();
                    }
            } else if(select.equals("3")){
                System.out.println("How much water would you like to give " + hamName + "?");
                System.out.println("1: A small dish");
                System.out.println("2: Fill their water drip");
                System.out.println("3: Go back");
                String waterSelect = input.nextLine();
                while (!waterSelect.equals("3")){
                    if(waterSelect.equals("1")) {
                        hamster.giveWater(3);
                        System.out.println(hamName + " starts drinking from the dish as you place it down");
                        hamster.tick();
                        System.out.println(hamName + "'s thirst level is now " + hamster.getThirst());
                    }
                    else if(waterSelect.equals("2")){
                            hamster.giveWater(8);
                            System.out.println(" @-----@");
                            System.out.println("( o . o )___");
                            System.out.println("( = n = )   )p");
                            System.out.println("()----()---()");
                            System.out.println(hamName + " looks at you as you fill their drip, they look happy");
                            hamster.tick();
                            hamster.tick();
                            System.out.println(hamName + "'s thirst level is now " + hamster.getThirst());
                    } else {
                        System.out.println("Please select your option");
                    }
                    System.out.println("How much water would you like to give " + hamName + "?");
                    System.out.println("1: A small dish");
                    System.out.println("2: Fill their water drip");
                    System.out.println("3: Go back");
                    waterSelect = input.nextLine();
                }
            } else if(select.equals("4")) {
                int randmPLay = (int)(Math.random()*8)+1;
                    if(randmPLay == 8){
                        hamster.playWith(randmPLay);
                        System.out.println("You take " + hamName + " out of his cage and let them run around the room");
                        hamster.tick();
                        System.out.println(hamName + "'s boredom level in now " + hamster.getBoredom());
                    }
                    else if(randmPLay == 4){
                        hamster.playWith(randmPLay);
                        System.out.println("You pick up " + hamName + " they're looking happy");
                        hamster.tick();
                        System.out.println(hamName + "'s boredom level in now " + hamster.getBoredom());
                    }
                    else if(randmPLay == 2){
                        hamster.playWith(randmPLay);
                        System.out.println("You flip " + hamName + " over in their cage, they seem to be having a good time sitting back up");
                        hamster.tick();
                        System.out.println(hamName + "'s boredom level in now " + hamster.getBoredom());
                    } else{
                        hamster.playWith(randmPLay);
                        System.out.println("You play with " + hamName);
                        hamster.tick();
                        System.out.println(hamName + "'s boredom level in now " + hamster.getBoredom());
                    }
            } else if(select.equals("5")){
                System.out.println("How would you like to clean " + hamName + "?");
                System.out.println("1: Clean up some poop in their cage");
                System.out.println("2: Change the bedding for the cage");
                System.out.println("3: Go back");
                String cleanSelect = input.nextLine();
                while (!cleanSelect.equals("3")){
                    if (cleanSelect.equals("1")){
                    hamster.clean(6);
                    System.out.println("You scoop up some poop from " + hamName + "'s cage");
                    System.out.println(hamName + "'s smell level is now " + hamster.getSmell());
                    hamster.tick();
                }
                   else if (cleanSelect.equals("2")){
                        hamster.clean(12);
                        System.out.println(hamName + " is excited to run around their clean cage");
                        hamster.tick();
                        hamster.tick();
                        hamster.tick();
                        System.out.println(hamName + "'s smell level is now " + hamster.getSmell());
                    } else{
                        System.out.println("Please select your option");
                    }
                    System.out.println("How would you like to clean " + hamName + "?");
                    System.out.println("1: Clean up some poop in their cage");
                    System.out.println("2: Change the bedding for the cage");
                    System.out.println("3: Go back");
                    cleanSelect = input.nextLine();
                }
                } else {
                System.out.println("Please select your option");
            }
            System.out.println("What would you like to do with " + hamName + "?");
            System.out.println("1: Check status of " + hamName);
            System.out.println("2: Feed " + hamName);
            System.out.println("3: Give water to " + hamName);
            System.out.println("4: Play with " + hamName);
            System.out.println("5: Clean " + hamName + "'s cage");
            System.out.println("6: Quit the program and give up on " + hamName);
            select = input.nextLine();
        }
        System.out.println(hamName + " looks sad, they'll see you again someday.");
        System.out.println("Goodbye");
    }
}