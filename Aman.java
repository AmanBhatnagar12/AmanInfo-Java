// Licensed Under Apache License
/*Know about me in terminal */
// V1.0
import java.util.*;
class aman{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);


        String v="Im a High school Student who loves to explore things and do programming as a hobby:)";
        String g="###AMAN BHATNAGAR###";

        // Detail


        System.out.println(g);
        System.out.println(v);

        System.out.println("########");
        String c;
// options to Enter


// Options
        System.out.println("Learning:)");
// Socials
        System.out.println("Socials:=]");
// Working on
        System.out.println("Working On =]");
        System.out.println("#####");
        System.out.println("Enter Options to know more about me :=] ");
        c=sc.next();
        System.out.println("#####");

        switch(c){

            case "Learning":
                System.out.println("Java ,C++ ,Full Stack Development");
                System.out.println("Bye 👋");
                break;

            case "Socials":
                System.out.println("Twitter:https://twitter.com/AmanBhatnagar47");
                System.out.println("Github:https://github.com/AmanBhatnagar12");
                System.out.println("Bye 👋 ");
                break ;
            case "Working":
                System.out.println("AliceOS Classic :A CLI Based OS with Pranav Krishna ");
                System.out.println("Bye 👋");
                break;

            default :
                System.out.println("Bye :}Meet you Later");

        }
    }
}