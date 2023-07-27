
public class MagicTest {
	 public static void main(String[] args) {

		 	Magician hm = new TableOfDeathMagician();
		 	hm.doTrick();
		 	
		 	System.out.println("----------------------------");
		 	
		 	Magician magician = new ThumbTrickMagician();
		 	magician.doTrick();
		 	
		 	System.out.println("----------------------------");
		 	
		 	Magician mathMagician = new MathMagecian();
		 	mathMagician.doTrick();
		 	
		 	System.out.println("----------------------------");
		 	
		 	Magician cupBallMagician = new CupAndBallMagician();
		 	cupBallMagician.doTrick();
		 	
		 	System.out.println("----------------------------");
	}
}
	

interface Magician {
	Magic doTrick();
}

class CardMagician implements Magician {
	public Magic doTrick() {
		System.out.println("Hiding cards inside sleevs...");
		Magic magic = new CardMagic();
		magic.show();
		return magic;
	}
}

class HatMagician implements Magician{
	public Magic doTrick() {
		System.out.println("Hiding hats and parrot inside hat...");
		Magic magic = new HatMagic();
		magic.show();
		return magic;
	}
}

interface Magic{
	void show();
}

class CardMagic implements Magic{
	public void show() {
		System.out.println("Showing cards in magical way...");
	}
}


class HatMagic implements Magic{
	public void show() {
		System.out.println("Showing Hat and Parrot ... in magical way... ");
	}
}

class TableOfDeathMagician implements Magician{
	public Magic doTrick() {
		System.out.println("Hiding Man inside Table...");
		Magic magic = new TableOfDeathMagic();
		magic.show();
		return magic;
	}
}

class TableOfDeathMagic implements Magic{
	public void show(){
		System.out.println("Showing Table of Death magic show...");
	}
}



class ThumbTrickMagician implements Magician{

	@Override
	public Magic doTrick() {
		System.out.println("Preparing for the Trick of Thumb...");
		Magic magic = new ThumbMagic();
		magic.show();
		return magic;
	}
	
}

class ThumbMagic implements Magic{

	@Override
	public void show() {
		System.out.println("Showing the detachable thumb maggic....");
		
	}
	
}

class MathMagecian implements Magician{
	public Magic doTrick() {
		System.out.println("Math Magician getting ready to perform..");
		Magic magic = new MathMagic();
		magic.show();
		return magic;
	}
}

class MathMagic implements Magic{
	public void show() {
		System.out.println("Math Magician Performing seemingly impossible feats ");
	}
}


class CupAndBallMagician implements Magician{
	public Magic doTrick() {
		System.out.println("Hiding Ball inside Cup .....");
		Magic magic = new CupAndBallMagic();
		magic.show();
		return magic;
	}
}

class CupAndBallMagic implements Magic{
	public void show() {
		System.out.println("Showing Cup and Ball Magic in magical way...");
	}
}



















