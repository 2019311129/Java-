package HomeWork1;

public class Test {
	public static void main(String args[]) {
		CPU cpu=new CPU();
		cpu.setSpeed(3000);
		cpu.setname("i7");
		HardDisk disk=new HardDisk();
		disk.setlx("SSD");
		disk.setAmounr(500);
		PC pc=new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
	}
}
