package view;

public class GameView {
	/**
	 * The View to Model Adapter for this View
	 */
	private View2ModelAdapter mainAdapter;
	/**
	 * Constructor this GameView
	 * @param mainAdapter The View to Model Adapter for this View
	 */
	public GameView(View2ModelAdapter mainAdapter){
		this.mainAdapter = mainAdapter;
	}
	/**
	 * Starts the Game View
	 */
	public void start(){
		
	}
	/**
	 * Test function to print string to console
	 * @param arg the string to print
	 */
	public void printToConsole(String arg){
		System.out.println(arg);
	}
}
