
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.name = "Ferrari";
		c.power = 200;
		c.start();
		c.start();
		c.stop();
//if you call the method igniteChamber or pumpGas, it won't work because they are private. 
//You can only call upon the public methods if it is a different class.

		Car c1 = new Car();
		c1.name = "BMW";
		c1.power = 350;
		c1.start();
		c1.stop();
		c1.stop();

	}

}