package sample;

public class Bloomerang extends Boomer {
    private static long lastadded=0;
    public Bloomerang(int x, int y, int row, int col) {
        super(x, y, 0, 150, 100 ,10,  25, 2 , row, col);
    }

    @Override
    public void act() {

    }

    public static long getLastadded() {        
        return lastadded;
    }

    public static void setLastadded(long lastadded) {
        Bloomerang.lastadded = lastadded;
    }

	@Override
	public void act2() {
		// TODO Auto-generated method stub
		
	}
}
