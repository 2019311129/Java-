package HomeWork1;

public class HardDisk {
	int amount;
	String lx;
	void setAmounr(int m ) {
		amount=m;
	}
	int getAmount() {
		
		return amount;
	}
	void setlx(String x){
		lx = x;
	}
	
    
	String getlx(){
		if (lx == "HDD"||lx == "SSD"){
            return lx;
        }
        else{
            return "others";
        }
	}
	

}
