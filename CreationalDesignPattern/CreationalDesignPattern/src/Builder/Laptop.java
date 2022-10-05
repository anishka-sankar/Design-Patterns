package Builder;

public class Laptop {
	
	//mandatory fields
	private String ram;
	private String hdd;
	private String cpu;
	
	//optional fields
	private boolean isBluetooth;
	private boolean isWifi;
	
	///only getters
	
	public String getRam() {
		return ram;
	}
	
	public String getHdd() {
		return hdd;
	}
	
	public String getCpu() {
		return cpu;
	}
	
	public boolean isBluetooth() {
		return isBluetooth;
	}
	
	public boolean isWifi() {
		return isWifi;
	}
	
	//private constructor 
	private Laptop(LaptopBuilder builder) {
		this.cpu=builder.cpu;
		this.hdd=builder.hdd;
		this.ram=builder.ram;
		this.isBluetooth=builder.isBluetooth;
		this.isWifi=builder.isWifi;
		
	}
	
	
	
	
	public static class LaptopBuilder {
		//mandatory fields
		private String ram;
		private String hdd;
		private String cpu;
		
		//optional fields
		private boolean isBluetooth;
		private boolean isWifi;
		
		//constructors
		public LaptopBuilder(String ram, String hdd, String cpu) {
			super();
			this.cpu=cpu;
			this.hdd=hdd;
			this.ram=ram;
		}
		
		public Laptop build() {
			return new Laptop(this);
		}
		
		//only setters
		
		public void setRam(String ram) {
			this.ram = ram;
		}
		
		public void setHdd(String hdd) {
			this.hdd = hdd;
		}
		
		public void setCpu(String cpu) {
			this.cpu = cpu;
		}
		
		//should return object itself
		public LaptopBuilder setBluetooth(boolean isBluetooth) {
			this.isBluetooth = isBluetooth;
			return this;
		}
		
		//should return object itself	
		public LaptopBuilder setWifi(boolean isWifi) {
			this.isWifi = isWifi;
			return this;
		}
		
		
		
		
	}




	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isBluetooth=" + isBluetooth + ", isWifi="
				+ isWifi + "]";
	}
	
	
	
}
