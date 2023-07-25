import java.security.Principal;

public class InstrumentTest {
	public static void main(String[] args) {

	/*	Guitar guitar = new Guitar();
		guitar.use();
		guitar.tuneStrings();
		guitar.play();
		guitar.pluck();
		
		Violin violin = new Violin();
		violin.use();
		violin.tuneStrings();
		violin.play();
		violin.bow();
		*/

//		Violin sbmi = new Violin();
//		sbmi.use();
//		sbmi.play();
//		sbmi.tuneStrings();
//		sbmi.bow();
//The method pluck() is undefined for the 
//		type StringBasedMusicalInstrument		
//		
//		Flute musicalInstrumentObj = new Flute();
//		musicalInstrumentObj.play();
		
		
//		musicalInstrumentObj.windInstrument();
		
		Telescope telescope = new Telescope();
		telescope.use();
		telescope.observe();
		telescope.lightResolution(); //Error 
		
		
		ECGMachine ecgMachineObj = new ECGMachine();
		
		Heart heart = new Heart(150,210);
		
		Report report = ecgMachineObj.makeECGReport(heart);
		
		System.out.println(report);
		
	}
}

interface Instrument
{
	void use(); //by default method is public and abstract
}
/////////-------  MUSICAL INSTRUMENT -----------
abstract class MusicalInstrument implements Instrument
{
	abstract void play();
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}
class Guitar extends StringBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Guitar...");
	}
	void play() {
		System.out.println("Playing Guitar...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Guitar...");

	}
	void pluck() {
		System.out.println("Plucking Strings of Guitar...");

	}
}


class Violin extends StringBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Violin...");
	}
	void play() {
		System.out.println("Playing Violin...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Violin...");

	}
	void bow() {
		System.out.println("Bowing Strings of Violin...");

	}
}

abstract class AirBasedMusicalInstrument extends MusicalInstrument
{
	abstract void blowAir();
}

class Flute extends AirBasedMusicalInstrument{
	
	public void use() {
		System.out.println("Using Flute...");
	}
	public void blowAir() {
		System.out.println(" Making music...");
	}

	void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing Flute...");
	}
	
	void windInstrument() {
		System.out.println("Flute is a wind instrument, and makes sound through air vibrations.");
	}
	
	
}
class Harmonium extends AirBasedMusicalInstrument{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using Harmonium...");
	}

	@Override
	void blowAir() {
		// TODO Auto-generated method stub
		System.out.println(" Making music...");
	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing Harmonium...");
	}
	void keyboardInstrument() {
		System.out.println("Flute is a wind instrument, and makes sound through air vibrations");
	}
	
}
//////////////////////////////////////////////////////////////////////
abstract class DrumBasedMusicalIntrument extends MusicalInstrument
{
	abstract void tuneSurface();
}

class Tabla extends DrumBasedMusicalIntrument{

	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using Tabla...");
	}
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing Tabla...");
	}
	
	@Override
	void tuneSurface() {
		// TODO Auto-generated method stub
		System.out.println("Tunning the Surface");
	}
	
	void smallTabla(){
		System.out.println("Create treble and tonal sound");
	}
	void largeTabla() {
		System.out.println("Create bass ... ");
	}

	
}
class Dhol extends DrumBasedMusicalIntrument{

	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using Dhol...");
	}
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing Dhol...");
	}
	@Override
	void tuneSurface() {
		// TODO Auto-generated method stub
		System.out.println("Tunning the Surface");
	}
	
	void speciality() {
		System.out.println("Dhol Can Produces low frequency and High frequency sound.");
	}
}

////////////-----MEDICAL INSTRUMENT-------
abstract class MedicalInstrument implements Instrument{
	abstract void operate();
}

abstract class PathelogicalInstrument extends MedicalInstrument{
	abstract void reader();
}
   

class Glucometer extends PathelogicalInstrument{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using Glucometer...");
	}

	@Override
	void reader() {
		// TODO Auto-generated method stub
		System.out.println("Taking reading Glucometer");
	}

	@Override
	void operate() {
		// TODO Auto-generated method stub
		System.out.println("Operating Glucometer...");
	}
	
	void SugarCount() {
		System.out.println("Measuring Sugar level in blood");
	}
	
}

class ECGMachine extends PathelogicalInstrument{

	
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using ECGMachine...");
	}

	@Override
	void reader() {
		// TODO Auto-generated method stub
		System.out.println("Taking reading of ECGMachine");
	}

	@Override
	void operate() {
		// TODO Auto-generated method stub
		System.out.println("Operating ECGMachine...");
	}
	
	void heartRate() {
		System.out.println("Checking Heart rhytm");
	}
	
	
	
	Report makeECGReport(Heart heart) {
		
		Report report = new Report();
		
		if(heart.getHeartRate()>=60 && heart.getHeartRate()<=100) {
			report.setHeartCondition("Normal");
		}
		else if(heart.getHeartRate()>100) {
			report.setHeartCondition("Tachycardia"); 
		}
		else if (heart.getHeartRate()<60){
			report.setHeartCondition("Bradycardia"); 
		}
				
		if(heart.getPrInterval() >200) {
			report.setAVdelay(true);
		}
		else {
			report.setAVdelay(false); 
		}
		
		return report;
	}
}

class Report{
	String heartCondition;//in 15 seconds
							//Normal: 60-100 bpm
							//Tachycardia: > 100 bpm
								//Bradycardia: < 60 bpm
	boolean  isAVdelay; //Normal or >200ms = AVdelay
	
	
	@Override
	public String toString() {
		System.out.println("\n--------------Report ------------");
		return "heartCondition = " + heartCondition + ",\n is AV delay    = " + isAVdelay + "]";
	}
	
	
	public String getHeartCondition() {
		return heartCondition;
	}
	public void setHeartCondition(String heartCondition) {
		this.heartCondition = heartCondition;
	}
	public boolean isAVdelay() {
		return isAVdelay;
	}
	public void setAVdelay(boolean isAVdelay) {
		this.isAVdelay = isAVdelay;
	}
	
}
class Heart{
	int heartRate;//in BPM
	int prInterval;//The PR interval should be between 120-200 ms
	
	
	@Override
	public String toString() {
		return "Heart [heartRate=" + heartRate + ", prInterval=" + prInterval + "]";
	}
	
	
	public Heart(int heartRate, int prInterval) {
		super();
		this.heartRate = heartRate;
		this.prInterval = prInterval;
	}
	public int getHeartRate() {
		return heartRate;
	}
	public void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
	}

	public int getPrInterval() {
		return prInterval;
	}
	public void setPrInterval(int prInterval) {
		this.prInterval = prInterval;
	}
	
	
}


abstract class SurgicalInstrument extends MedicalInstrument{
	abstract void strile();
}

class SurgicalCutter extends SurgicalInstrument{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using Surgical Cutter...");
	}

	@Override
	void strile() {
		// TODO Auto-generated method stub
		System.out.println("steriling surgical cutter...");
	}

	@Override
	void operate() {
		// TODO Auto-generated method stub
		System.out.println("Operating surgical cutter...");
	}
	
	void dissect() {
		System.out.println("Surgical cutter is cutting tissue...");
	}
	
}

class SurgicalNeedle extends SurgicalInstrument{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using Surgical Needle...");
	}

	@Override
	void strile() {
		// TODO Auto-generated method stub
		System.out.println("steriling surgical Needle...");
	}

	@Override
	void operate() {
		// TODO Auto-generated method stub
		System.out.println("Operating surgical Needle...");
	}
	
	void stitches() {
		System.out.println("Stitching using surgical needle");
	}
	
}
////////////////////---------------//////////////////////////////
abstract class ElectricalInstrument implements Instrument
{
	abstract void detect();//Detect the Voltage // Or detect the current charge
}

class voltMeter extends ElectricalInstrument{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using voltMeter...");
	}

	@Override
	void detect() {
		// TODO Auto-generated method stub
		System.out.println("Detecting voltage... ");
	}
	
	void measureVoltage() {
		System.out.println("Measuring the potential difference between two points of electronic circuit");
	}
	
}
   
class GalvanoMeter extends ElectricalInstrument{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using GalvanoMeter...");
	}

	@Override
	void detect() {
		// TODO Auto-generated method stub
		System.out.println("Detecting charge... ");
	}
	
	void measureCurrent() {
		System.out.println("Measuring the amount of current passing through...");
	}
	
}

//////////////////----------------------////////////////////////////
abstract class OpticalInstrument implements Instrument
{
	abstract void observe();//
}

 class Microscope extends OpticalInstrument{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using Microscope...");
	}

	@Override
	void observe() {
		// TODO Auto-generated method stub
		System.out.println("Observing micro organism...");
	}
	
	void tissueAnalysis() {
		System.out.println("Analyzing tissue using microscope");
	}
	

}
class Telescope extends OpticalInstrument{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using Telescope...");
	}

	@Override
	void observe() {
		// TODO Auto-generated method stub
		System.out.println("Observing faint light from astronomical source....");
	}
	
	void lightResolution() {
		System.out.println("Making objects from outer space appear bright and large");
	}
}
///////////////////////////////////////////////////
abstract class ElectonicInstrument implements Instrument
{
	abstract void produce();//oscillator
}

class Resistor extends ElectonicInstrument{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using Resistor ... ");
	}

	@Override
	void produce() {
		// TODO Auto-generated method stub
		System.out.println("Produces resistance to the flow of current...");
	}

	
}
class Oscillator extends ElectonicInstrument{ //Oscillators are essential components that produce a periodic electronic signal, 
	//typically a sine wave or square wave. Oscillators convert DC signal to periodic AC signals which can be used to set frequency, 
	//be used for audio applications, or used as a clock signal.

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using Oscillator ... ");
	}

	@Override
	void produce() {
		// TODO Auto-generated method stub
		System.out.println("Produces resistance to the flow of current...");
	}

	void convert() {
		System.out.println("Converting DC signal to periodic AC signals ...");
	}

}
////////////////////////////////////////////////////////////
abstract class MechanicalInstrument implements Instrument
{
	abstract void cut();//oscillator
}

class Scissor extends MechanicalInstrument{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using Scissor ...");
	}

	@Override
	void cut() {
		// TODO Auto-generated method stub
		System.out.println("Cutting thick and heavy material...");
	}//produces resistance
	
}
 class WireCutter extends MechanicalInstrument{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using Wire Cutter...");
	}

	@Override
	void cut() {
		// TODO Auto-generated method stub
		System.out.println("Cutting Wire...");
	}
}
//////////////////////////////////////


