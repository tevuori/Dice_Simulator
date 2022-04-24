public class main {
    public static void main(String[] args){
        printDice(1);
    }
    public static void printDice(int number){
        switch(number){
            case 1:
                String[] dice = new String[]{
                        "* * * * *",
                        "*       *",
                        "*   #   *",
                        "*       *",
                        "* * * * *"
                };
                for (String s: dice) {System.out.println(s);}
                break;
                
        }

    }
}
