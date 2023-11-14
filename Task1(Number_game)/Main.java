import java.util.Scanner;

class rangen{
    public int genrate(int max,int min){
        return(int) (Math.random()*(max-min+1)+min);
    }
}

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        rangen rg = new rangen();
        int totalAttempts = 0;
        int win = 0;

        while(true) {
            System.out.println("Enter the max number:");
            int max = sc.nextInt();
            System.out.println("Enter the min number:");
            int min = sc.nextInt();

            int cnum = rg.genrate(max,min);
            int attempts = 0;

            while(true){
                System.out.println("Guess a number between "+max+" and "+min);
                int gnum = sc.nextInt();
                attempts++;

                if(gnum > cnum){
                    System.out.println("Its greater");
                }
                else if(gnum < cnum){
                    System.out.println("Its lower");
                }
                else{
                    System.out.println("Correct Guess!!");
                    win++;
                    break;
                }

            }
            totalAttempts += attempts;
            System.out.println("Attempts = " + attempts);
            System.out.println("Wins =" + win);
            double winrate =  (double) win/totalAttempts*100;
            System.out.println("Your winrate is \n"+winrate);
            System.out.println("Do you want to play again(yes/no)");
            String playagain = sc.next();
            if(!playagain.equalsIgnoreCase("yes")){
                sc.close();
                System.exit(0);
            }
        }
    }
}

