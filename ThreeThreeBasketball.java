public class ThreeThreeBasketball {

  
    private final String courtsize= "15m wide x 11m long";
    private final  int player = 3 ;
    private int hoophigh;
    private int basketballsize;
    private int quatermin;
    private int foulLimit;

    public ThreeThreeBasketball(){
        System.out.println("3x3 Basketball");
    }
    

    public ThreeThreeBasketball(int hoophigh, int basketballsize, int quatermin, int foulLimit){
        this.hoophigh=hoophigh;
        this.basketballsize=basketballsize;
        this.quatermin=quatermin;
        this.foulLimit=foulLimit;
    }

    public void showinfo(){
        System.out.println("Player per team :"+" "+" "+player);
        System.out.println("Hoop height:"+" "+hoophigh+" "+ "cm");
        System.out.println("Basketballsize:"+" "+basketballsize+" ");
        System.out.println("Quater Minute:"+" "+quatermin+" "+"min");
        System.out.println("Foul limit per person:"+" "+foulLimit+" "+"time");
        System.out.println("Courtsize:"+" "+courtsize);
    }

   
  
}
