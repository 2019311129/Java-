package HomeWork1;

public class CPU {

	private int speed;
	private String name;
	
	CPU(){
		
	}
	CPU (int speed){
      this.speed=speed;
      }
	
	void setSpeed(int speed) {
		this.speed=speed;
	}
	void setname(String n){
		name = n;
	}
	public int getSpeed() {
		return speed;
	}
	public String getname(){
		return name;
	}
}
