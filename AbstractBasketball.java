public  abstract class AbstractBasketball implements Basketball {
    
    private int player = 5;
    private int hoophigh;
    private int basketballsize;
    private int quatermin;
    private int foulLimit;
    private String courtsize;

    public AbstractBasketball(){

    }

    public AbstractBasketball(int hoophigh, int basketballsize, int quatermin, int foulLimit, String courtsize){
        this.hoophigh=hoophigh;
        this.basketballsize=basketballsize;
        this.quatermin=quatermin;
        this.foulLimit=foulLimit;
        this.courtsize=courtsize;
        
    }
   
    @Override 
    public int getplayer(){
        return player;
    }
    @Override
    public int getHoophigh(){
        return hoophigh;

    }
    @Override
    public int getBasketballsize(){
        return basketballsize;

    }
    @Override
    public int getQuatermin(){
        return quatermin;


    }
    @Override
    public int getFoulLimit(){
        return foulLimit;

    }
    @Override
    public String getCourtsize(){
        return courtsize;
    }
    @Override
    public void showinfo(){
        System.out.println("Player per team :"+" "+" "+player);
        System.out.println("Hoop height:"+" "+hoophigh+" "+ "cm");
        System.out.println("Basketballsize:"+" "+basketballsize+" ");
        System.out.println("Quater Minute:"+" "+quatermin+" "+"min");
        System.out.println("Foul limit per person:"+" "+foulLimit+"time");
        System.out.println("Courtsize:"+" "+courtsize);
    }

}
