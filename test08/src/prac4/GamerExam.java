package prac4;

public class GamerExam {

	public static void main(String[] args) {
		Gamer gamer;
		gamer = new Amateur();
		gamer.run(50);
		gamer.jump(1);
		gamer.turn(2);
		gamer.show("Andrew Garfield");
		
		System.out.println();
		
		gamer = new Progamer();
		gamer.run(100);
		gamer.jump(3);
		gamer.turn(6);
		gamer.show("Keanu Reeves");
	}

}
