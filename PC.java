package HomeWork1;

public class PC {
	CPU cpu;
	HardDisk HD;
	
	void setCPU(CPU c) {
		cpu=c;
	}
	void setHardDisk(HardDisk h) {
		HD=h;
	}
	void show() {
		System.out.println("cpu的速度为："+cpu.getSpeed());
		System.out.println("cpu型号："+cpu.getname());
		System.out.println("硬盘容量为："+HD.getAmount());
		System.out.println("硬盘类型为："+HD.getlx());
	}
}
