public class BasketballAdapter extends AbstractBasketball {
  
     
    ThreeThreeBasketball threeBasketball;

    public BasketballAdapter(final ThreeThreeBasketball threeBasketball){
        this.threeBasketball= threeBasketball;
    }

    @Override
    public void showinfo() {
        threeBasketball.showinfo();
    }
   
    
    
    


    
   
    

}
