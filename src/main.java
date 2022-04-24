import java.util.Random;

public class main {
    public static void main(String[] args){
        Random random = new Random();
        int r = random.nextInt(5);
        printDice(r+1);
    }
    public static void printDice(int number){
        switch(number){
            case 1:
                String[] dice1 = new String[]{
                        "* * * * *",
                        "*       *",
                        "*   #   *",
                        "*       *",
                        "* * * * *"
                };
                for (String s: dice1) {System.out.println(s);}
                break;
            case 2:
                String[] dice2 = new String[]{
                        "* * * * *",
                        "*    #  *",
                        "*       *",
                        "*  #    *",
                        "* * * * *"
                };
                for (String s: dice2) {System.out.println(s);}
                break;
            case 3:
                String[] dice3 = new String[]{
                        "* * * * *",
                        "*    #  *",
                        "*   #   *",
                        "*  #    *",
                        "* * * * *"
                };
                for (String s: dice3) {System.out.println(s);}
                break;
            case 4:
                String[] dice4 = new String[]{
                        "* * * * *",
                        "* #   # *",
                        "*       *",
                        "* #   # *",
                        "* * * * *"
                };
                for (String s: dice4) {System.out.println(s);}
                break;
            case 5:
                String[] dice5 = new String[]{
                        "* * * * *",
                        "* #   # *",
                        "*   #   *",
                        "* #   # *",
                        "* * * * *"
                };
                for (String s: dice5) {System.out.println(s);}
                break;
            case 6:
                String[] dice6 = new String[]{
                        "* * * * *",
                        "* #   # *",
                        "* #   # *",
                        "* #   # *",
                        "* * * * *"
                };
                for (String s: dice6) {System.out.println(s);}
                break;
        }

    }
}
