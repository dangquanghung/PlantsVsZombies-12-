package sample;

public class BBoomerang extends Actor{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int limit1;
    private int row;
    private int damage;
    public BBoomerang(int x, int y, int speed, int row, int damage) {

        super(x, y, (double) speed);
        this.row=row;
        limit1=900;
//        limit2=150;
        this.damage=damage;
    }

    @Override
    public void act(){
        if(x<limit1) {
           setX(speed);
          
        }
        
    }

    public int getRow(){
        return row;
    }

    public int getDamage(){
        return damage;
    }

	@Override
	public void act2() {
//		 if(x>limit2) {
//			 setX_(speed);;
//   
//        }
		
	}
}