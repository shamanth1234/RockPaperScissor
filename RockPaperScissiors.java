import java.io.*;
import java.util.*;
class RockPaperScissiors{
    public static void main(String args[]){
        String playerchoice,computerchoice,winner;
        Random random=new Random();
        int computernumber=random.nextInt(3);
        if(computernumber==0){
            computerchoice="rock";
        }
        else if(computernumber==1){
            computerchoice="paper";
        }
        else if(computernumber==2){
            computerchoice="scissors";
        }
        else{
            computerchoice="invalid choice";
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ur choice{scissors,rock,paper}:");
        playerchoice=sc.nextLine();
        if(playerchoice.equals(computerchoice)){
            winner="Tie";
        }
        else if(playerchoice.equals("rock")&&computerchoice.equals("scissors")){
            winner="player";
        }
        else if(playerchoice.equals("scissors")&&computerchoice.equals("paper")){
            winner="player";
        }
        else if(playerchoice.equals("paper")&&computerchoice.equals("rock")){
            winner="player";
        }
        else{
            winner="computer";
        }
        System.out.println("The player chose:"+playerchoice);
        System.out.println("The computer chose:"+computerchoice);
        System.out.println("The winner is:"+winner);
    }
}