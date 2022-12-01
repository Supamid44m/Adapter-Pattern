public class AdapterDemo {
    public static void main(String[] args) {
        System.out.println("NBA");
        Nba bas1 = new Nba(305 ,7,12,5,"15m wide x 28m long");
        bas1.showinfo();
        System.out.println("-------------");
       
        System.out.println("ADAPTER basktetball");
        System.out.println(" ");
        BasketballAdapter bas2 = new BasketballAdapter(new ThreeThreeBasketball());
        bas2.showinfo();
    }
}
