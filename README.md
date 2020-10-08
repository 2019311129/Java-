# 一.实验内容
1.类中定义不少于两个构造方法
2.每个类定义不少于2个属性，且属性的类型应该多样化
3.根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断
4.尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法
# 二.实验方法
1.CPU类中用getSpeed返回speed的值，再将其m的值赋给speed。
2.HardDisk和PC类都用set~()的方法将各自的变量参数赋值。
3.最后用show（）的方法显示结果
# 三.核心方法
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
# 四.实验结果
![程序运行结果](https://github.com/3256268435/Java-/blob/main/%E7%A8%8B%E5%BA%8F%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C.png)
# 五.实验感想
