
public class WashingMachineTest {
	public static void main(String[] args) {
		
//		WashingPowder washPowder = new WashingPowder(100,"Nirma", "Front Load", true, 10.0f);
//		Water water = new Water("soft",50,"40");
//		Electricity electricity = new Electricity("AC",30f,2.3,40,"Ramesh");
//		Cloth[] cloth = new Cloth[2];
//		cloth[0] = new Cloth("cotton","blue",34,"pant",false);
//		cloth[1] = new Cloth("silk","black",24,"shirt",false);
//		
//		
//		WashingMachine washingMachine = new WashingMachine("SAMSUNG",10);	
//		Laundry laundry = null;
//		try {
//			laundry = washingMachine.wash(washPowder,water,electricity,cloth);
//		} catch (NoElectricityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		catch (WaterSupplyException e1) {
//			System.out.println("No water Supply"+e1);
//		}
//		catch (WashPowderAvailabilityException e2) {
//			System.out.println("No WashPowder."+e2);
//		}
//		
//		
//		
//		
//		WashingPowder washPowder1 = new WashingPowder(50,"SurfExcel", "Front Load", true, 9.0f);
//		Water water1 = new Water("hard",40,"30");
//		Electricity electricity1 = new Electricity("AC",25f,2.1,50,"Suresh");
//		Cloth[] cloth1 = new Cloth[3];
//		cloth1[0] = new Cloth("cotton","Red",34,"pant",false);
//		cloth1[1] = new Cloth("silk","Blue",24,"shirt",false);
//		cloth1[2] = new Cloth("polyster","Green",24,"kurta",false);
//		
//		WashingMachine washingMachine1 = new WashingMachine("BOSCH",7);
//		Laundry laundry1 = null;
//		try {
//			laundry1 = washingMachine1.wash(washPowder1,water1,electricity1,cloth1);
//		} catch (NoElectricityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		catch (WaterSupplyException e1) {
//			System.out.println("No water Supply"+e1);
//		}
//		catch (WashPowderAvailabilityException e2) {
//			System.out.println("No WashPowder."+e2);
//		}
//		
//		
//		WashingPowder washPowder2 = new WashingPowder(50,"SurfExcel", "Front Load", true, 9.0f);
//		Water water2 = new Water("hard",40,"30");
//		Electricity electricity2 = new Electricity("AC",25f,2.1,50,"Suresh");
//		Cloth[] cloth2 = new Cloth[3];
//		cloth2[0] = new Cloth("cotton","Red",35,"pant",false);
//		cloth2[1] = new Cloth("silk","Blue",44,"shirt",false);
//		cloth2[2] = new Cloth("polyster","Green",34,"kurta",false);
//		
//
//	
//		WashingMachine washingMachine2 = new WashingMachine("LG",5);	
//		Laundry laundry2 = null;
//		try {
//			laundry2 = washingMachine2.wash(washPowder2,water2,electricity2,cloth2);
//		} catch (NoElectricityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		catch (WaterSupplyException e1) {
//			System.out.println("No water Supply"+e1);
//		}
//		catch (WashPowderAvailabilityException e2) {
//			System.out.println("No WashPowder."+e2);
//		}
//		
//		try {
//			washingMachine.join();
//			System.out.println(laundry);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		try {
//			washingMachine1.join();
//			System.out.println(laundry1);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		try {
//			washingMachine2.join();
//			System.out.println(laundry2);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		//------Checked----
//		
		
//		WashingMachine wmObj1 = new WashingMachine("BOSCH",20);
//		WashingMachine wmObj2 = new WashingMachine("SAMSUNG",30);
//		WashingMachine wmObj3 = new WashingMachine("LG",10);
		
//		wmObj1.start();
//		wmObj2.start();
//		wmObj3.start();
		
		
		
		
		WashingPowder washPowder = new WashingPowder(100,"Nirma", "Front Load", true, 10.0f);
		Water water = new Water("soft",50,"40");
		Electricity electricity = new Electricity("AC",30f,2.3,40,"Ramesh");
		Cloth[] cloth = new Cloth[2];
		cloth[0] = new Cloth("cotton","blue",34,"pant",false);
		cloth[1] = new Cloth("silk","black",24,"shirt",false);
		
		
		WashingMachine washingMachine = new WashingMachine("SAMSUNG",10,washPowder,water,electricity,cloth);	
//		Laundry laundry = null;
		
		
		
		
		
		WashingPowder washPowder1 = new WashingPowder(50,"SurfExcel", "Front Load", true, 9.0f);
		Water water1 = new Water("hard",40,"30");
		Electricity electricity1 = new Electricity("AC",25f,2.1,50,"Suresh");
		Cloth[] cloth1 = new Cloth[3];
		cloth1[0] = new Cloth("cotton","Red",34,"pant",false);
		cloth1[1] = new Cloth("silk","Blue",24,"shirt",false);
		cloth1[2] = new Cloth("polyster","Green",24,"kurta",false);
		
		WashingMachine washingMachine1 = new WashingMachine("BOSCH",7,washPowder1,water1,electricity1,cloth1);
//		Laundry laundry1 = null;
//		try {
//			laundry1 = washingMachine1.wash(washPowder1,water1,electricity1,cloth1);
//		} catch (NoElectricityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		catch (WaterSupplyException e1) {
//			System.out.println("No water Supply"+e1);
//		}
//		catch (WashPowderAvailabilityException e2) {
//			System.out.println("No WashPowder."+e2);
//		}
		
		washingMachine.start();
		washingMachine1.start();
	}
}

class NoElectricityException extends Exception{
	NoElectricityException(String msg){
		super(msg);
	}
}
class WaterSupplyException extends Exception{
	WaterSupplyException(String msg){
		super(msg);
	}
}

class WashPowderAvailabilityException extends Exception{
	WashPowderAvailabilityException(String msg){
		super(msg);
	}
}


class PowerCutOffException extends RuntimeException{
	PowerCutOffException(String msg){
		super(msg);
	}
}

class VoltageExceedsException extends RuntimeException{
	VoltageExceedsException(String msg){
		super(msg);
	}
}






class WashingMachine extends Thread { //isA
	
	String modelName;
	
	int time;
	
	WashingPowder washPowder;
	Water water;
	Electricity electricity;
	Cloth cloth[];
	

	WashingTub washTub = new WashingTub(); //hasA
		
	
	public WashingMachine(String modelName, int time, WashingPowder washPowder, Water water, Electricity electricity,
			Cloth[] cloth) {
		super();
		this.modelName = modelName;
		this.time = time;
		this.washPowder = washPowder;
		this.water = water;
		this.electricity = electricity;
		this.cloth = cloth;
	}

	
	public WashingMachine() {

	}
	
	public WashingMachine(String modelName,int time) {
		// TODO Auto-generated constructor stub
		this.time = time;
		this.modelName = modelName;
	}
		
		public void run() {
			
			Laundry laundry = new Laundry();
			try {
				
				laundry = wash(washPowder,water,electricity,cloth);
			} catch (NoElectricityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (WaterSupplyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (WashPowderAvailabilityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			for(int i=0;i<time;i++) {
//				double value = Math.random()%10;
				int value = (int) ((Math.random() * (100 - 0)) + 0);
				System.out.println(modelName+" Washing Machine is working "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if(value ==0) {
					PowerCutOffException ex3 = new PowerCutOffException(modelName+" Power Cutt Off...");
					throw ex3;
				}
				
				if(value>90) {
					VoltageExceedsException ex4 = new VoltageExceedsException(modelName+" Voltage Exceeds...");
					throw ex4;
				}
				
				
				
			}
			
			
			System.out.println(modelName+" has done washing cloth.");
			System.out.println(laundry);
		}
	
		Laundry wash(WashingPowder washPowder, Water water, Electricity electricity, Cloth cloth[]) throws NoElectricityException, WaterSupplyException, WashPowderAvailabilityException {
//			start();
			
			if(electricity.getVoltage()==0) {
				NoElectricityException ex1 = new NoElectricityException("No Electricity");
				throw ex1;
			}
			if(water.getQuantity()==0) {
				WaterSupplyException ex2 = new WaterSupplyException("No Water Supply");
				throw ex2;
			}
			if(washPowder.getQuantity()==0) {
				WashPowderAvailabilityException ex3= new WashPowderAvailabilityException("No WashPowder");
				throw ex3;
			}
			
			Laundry laundryObj = new Laundry();
			
			laundryObj.setMachineBrand(modelName);
			laundryObj.setCostOfWashingPowder(washPowder.getPrice());
			laundryObj.setElectricityUsed(electricity.getUnitUsed());
			laundryObj.setWaterUsed(water.getQuantity());
			
			int numberOfCloth = cloth.length;
			laundryObj.setNumberOfCloths(numberOfCloth);
			laundryObj.setTimeRequired(120);
			 
			int pricePerCloth = 20;
			float totalCost = numberOfCloth * pricePerCloth + (washPowder.getQuantity() * washPowder.getPrice()) ;
			
			laundryObj.setTotalCost(totalCost);
			
		
			
			return laundryObj;
		}

		public int getTime() {
			return time;
		}

		public void setTime(int time) {
			this.time = time;
		}
		
		
}

class Laundry {
	private String machineBrand;
	private int numberOfCloths; //cloth.length
	private float timeRequired;
	private float totalCost ;// cloth.length * price per cloth
	private float waterUsed;
	private float electricityUsed;
	private float costOfWashingPowder; //
	
	Laundry(){
		
	}


	public Laundry(String machineBrand, int numberOfCloths, float timeRequired, float totalCost, float waterUsed,
			float electricityUsed, float costOfWashingPowder) {
		super();
		this.machineBrand = machineBrand;
		this.numberOfCloths = numberOfCloths;
		this.timeRequired = timeRequired;
		this.totalCost = totalCost;
		this.waterUsed = waterUsed;
		this.electricityUsed = electricityUsed;
		this.costOfWashingPowder = costOfWashingPowder;
	}

	

	@Override
	public String toString() {
		return "\n--------Laundry----- \nmachineBrand = " + machineBrand + ", \nnumberOfCloths = " + numberOfCloths + ", \ntimeRequired = "
				+ timeRequired + ", \ntotalCost = " + totalCost + ", \nwaterUsed = " + waterUsed + ", \nelectricityUsed = "
				+ electricityUsed + ", \ncostOfWashingPowder = " + costOfWashingPowder + "\n";
	}


	public String getMachineBrand() {
		return machineBrand;
	}


	public void setMachineBrand(String machineBrand) {
		this.machineBrand = machineBrand;
	}


	public int getNumberOfCloths() {
		return numberOfCloths;
	}


	public void setNumberOfCloths(int numberOfCloths) {
		this.numberOfCloths = numberOfCloths;
	}


	public float getTimeRequired() {
		return timeRequired;
	}


	public void setTimeRequired(float timeRequired) {
		this.timeRequired = timeRequired;
	}


	public float getTotalCost() {
		return totalCost;
	}


	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}


	public float getWaterUsed() {
		return waterUsed;
	}


	public void setWaterUsed(float waterUsed) {
		this.waterUsed = waterUsed;
	}


	public float getElectricityUsed() {
		return electricityUsed;
	}


	public void setElectricityUsed(float electricityUsed) {
		this.electricityUsed = electricityUsed;
	}


	public float getCostOfWashingPowder() {
		return costOfWashingPowder;
	}


	public void setCostOfWashingPowder(float costOfWashingPowder) {
		this.costOfWashingPowder = costOfWashingPowder;
	}

	
	
}

class Tub {
	
}

class WashingTub  extends Tub {
	private int capacity;
	private String type; //
	public WashingTub(int capacity, String type) {
		super();
		this.capacity = capacity;
		this.type = type;
	}
	
	public WashingTub() {
		
	}
	
	@Override
	public String toString() {
		return "WashingTub [capacity=" + capacity + ", type=" + type + "]";
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}

class Powder {
	
}

class WashingPowder extends Powder { // isA

	private int quantity;
	private String brand;
	private String type;
	private boolean scented;
	private float price;
	
	public WashingPowder(int quantity, String brand, String type, boolean scented, float price) {
		super();
		this.quantity = quantity;
		this.brand = brand;
		this.type = type;
		this.scented = scented;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "WashingPowder [quantity=" + quantity + ", brand=" + brand + ", type=" + type + ", scented=" + scented
				+ ", price=" + price + "]";
	}
	/*public String toString() {
		String str = (scented) ? "Scented" :"Not Scented";
		return str+ " "+brand+" Washing Powder of "+type+ " type quantity used "+quantity+ " grams ";
	}*/

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isScented() {
		return scented;
	}

	public void setScented(boolean scented) {
		this.scented = scented;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}

class Water {
	private String type;
	private int quantity;
	private String temperature;
	
	public Water(String type, int quantity, String temperature) {
		super();
		this.type = type;
		this.quantity = quantity;
		this.temperature = temperature;
	}
	@Override
	public String toString() {
		return "Water [type=" + type + ", quantity=" + quantity + ", temperature=" + temperature + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

}

class Electricity {
	private String type; //ac dc
	private float voltage; 
	private int costPerUnit;
	private int unitUsed;
	private String supplier;
	private int timeTaken;
	
	public Electricity(String type, float voltage, double d, int unitUsed, String supplier) {
		super();
		
		this.type = type;
		this.voltage = voltage;
		this.costPerUnit = costPerUnit;
		this.unitUsed = unitUsed;
		this.supplier = supplier;
	}
	@Override
	public String toString() {
		return "Electricity [type=" + type + ", voltage=" + voltage + ", costPerUnit=" + costPerUnit + ", unitUsed="
				+ unitUsed + ", supplier=" + supplier + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getVoltage() {
		return voltage;
	}
	public void setVoltage(float voltage) {
		this.voltage = voltage;
	}
	public int getCostPerUnit() {
		return costPerUnit;
	}
	public void setCostPerUnit(int costPerUnit) {
		this.costPerUnit = costPerUnit;
	}
	public int getUnitUsed() {
		return unitUsed;
	}
	public void setUnitUsed(int unitUsed) {
		this.unitUsed = unitUsed;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	
	
	
}

class Cloth {
	private String material; //
	private String color;
	private float cost;
	private String type;
	private boolean clean; //
	
	public Cloth(String material, String color, float cost, String type, boolean clean) {
		super();
		this.material = material;
		this.color = color;
		this.cost = cost;
		this.type = type;
		this.clean = clean;
	}
	@Override
	public String toString() {
		return "Cloth [material=" + material + ", color=" + color + ", cost=" + cost + ", type=" + type + ", clean="
				+ clean + "]";
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isClean() {
		return clean;
	}
	public void setClean(boolean clean) {
		this.clean = clean;
	}
	

	
}
