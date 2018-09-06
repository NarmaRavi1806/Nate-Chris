package inter;

public interface ITruncate {
	public static final int WEIGHT=180;
	final String area="15*8";
	 default void runinsidewater()
	{
		System.out.println("run inside water");
	}
	
	public void runonwater();
	abstract void flyinsky();
	public abstract void runonroad();
	

}
