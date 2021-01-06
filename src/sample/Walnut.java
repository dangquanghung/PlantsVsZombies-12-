package sample;

public class Walnut extends Barrier{
    private static long lastadded;
    public Walnut(int x, int y, int row, int col) {
        super(x, y, 0, 50, 10, row, col);
    }

    @Override
    public void act() {
        //nothing here
    }

    public static long getLastadded() {
        return lastadded;
    }

    public static void setLastadded(long lastadded) {
        Walnut.lastadded = lastadded;
    }

	@Override
	public void act2() {
		// TODO Auto-generated method stub
		
	}
}
