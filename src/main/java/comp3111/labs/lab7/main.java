package comp3111.labs.lab7;

/*
 * note the bad coding style (deliberately written for debugging exercise) 
 */
public class main {
	public static void main(String[] args) {
		Animal animals[] = new Animal[10];
		//for (Animal a : animals)
		//{
			//a = new Animal();
		//}	
		for (int i=0; i< animals.length; i++) 
		{ 
			Animal a = new Animal();
		    animals[i] = a;
		}
		for (int iii = 0; iii < 10; iii++) {
			int ii = 0;
			for (; ii < 100 && animals[iii].isAlive() ; ii++) {
				System.out.print(animals[iii].getWeight() + " ");
				animals[iii].eat();
				if (ii % 3 == 0)
				animals[iii].poo();
			}
		}	
	}
}
