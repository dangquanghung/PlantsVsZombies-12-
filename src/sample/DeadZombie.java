package sample;

public class DeadZombie extends Actor{
	private static final long serialVersionUID = 1L;
	private static long lastadded = 0;
	private long last_used;
	public DeadZombie(double x, int y, double speed, long last_used) {
		super(x, y, 0);
		this.last_used = last_used;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}
	public void setX(double x) {
		super.x = x;
	}
	public void setY(int y) {
		super.y = y;
	}
	public double getSpeed() {
		return super.speed;
	}

	public long get_last_used(){
        return last_used;
    }
    public void set_last_used(long val){
        last_used = val;
    }

	@Override
	public void act2() {
		// TODO Auto-generated method stub
		
	}

}