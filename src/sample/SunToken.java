package sample;

public class SunToken extends Actor {
    private double lastdropped;
    private int limit;
    private int value;
    public SunToken(int x, int y, int limit) {
        super(x, y, (double) 2);
        this.limit=limit;
        value=25;
    }
    public SunToken(int x, int y) {
        super(x, y, (double) 0);
        limit=0;
        value=50;
    }

    public int getValue(){
        return value;
    }


    @Override
    public void act(){
        if(y<limit) {
            setY((int) speed);
        }
    }

    public double getLastdropped() {
        return lastdropped;
    }
    public void setLastdropped(double lastdropped) {
        this.lastdropped = lastdropped;
    }
	@Override
	public void act2() {
		// TODO Auto-generated method stub
		
	}
}