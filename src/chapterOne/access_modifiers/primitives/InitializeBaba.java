package chapterOne.access_modifiers.primitives;

public class InitializeBaba {

    public int valid() {
        int y = 10;
        int x;
        x = 3;
        int reply = x + y; // DOES NOT COMPILE
        return reply;
    }

    public void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
//        System.out.println(onlyOneBranch); // DOES NOT COMPILE
    }

    public void eat (int piecesOfCheese) {

        int bitesOfCheese = 1;
    }

    public void eatIfHungry(boolean hungry){
        if (hungry) {
            int bitesOfCheese = 1;
        }
//        System.out.println(bitesOfCheese);// DOES NOT COMPILE
    }

    public void eatMore(boolean hungry, int amountOfFood) {
        int roomInBelly = 5;
        if (hungry) {
            boolean timeToEat = true;
            while (amountOfFood >0) {
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }
        System.out.println(amountOfFood);
        System.out.println(hungry);
        System.out.println(roomInBelly);
        System.out.println(amountOfFood);
    }

}
