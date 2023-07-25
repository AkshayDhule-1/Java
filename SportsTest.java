
public class SportsTest {
	public static void main(String[] args) {
		
		Football football = new Football();
		
		football.play();
		football.FootballScore();
		football.playground();
		
	}
}


interface Sports{
	void play();
}


abstract class OutdoorGames implements Sports{
	abstract void playground();
} 


class Football extends OutdoorGames{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("playing Football...");
	}

	@Override
	void playground() {
		// TODO Auto-generated method stub
		System.out.println("Playground for Football is Rectangular.");
	}
	
	void FootballScore() {
		System.out.println("Football's score is goals");
	}
	
}

class Cricket extends OutdoorGames{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("playing Cricket...");
	}

	@Override
	void playground() {
		// TODO Auto-generated method stub
		System.out.println("Playground is Circular.");
	}
	
	void cricketScore() {
		System.out.println("Cricket runs are score");
	}
	
}




abstract class IndoorGames implements Sports{
	abstract void playingBoard();
}

class Carrom extends IndoorGames{

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing Carrom ...");
	}

	@Override
	void playingBoard() {
		// TODO Auto-generated method stub
		System.out.println("It required Carrom Board.");
	}
	

}

class Chess extends IndoorGames{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing Chess ...");
	}

	@Override
	void playingBoard() {
		// TODO Auto-generated method stub
		System.out.println("It required Chess Board.");
	}

	
}
