package sample;

public class Bullet extends Actor{
    private int limit;
   
    private int row;
    private int damage;
    public Bullet(int x, int y, int speed, int row, int damage) {

        super(x, y, (double) speed);
        this.row=row;
        limit=1000;
       
        this.damage=damage;
    }

    @Override
    public void act(){
        if(x<limit) {
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
		// TODO Auto-generated method stub
		
	}
}
