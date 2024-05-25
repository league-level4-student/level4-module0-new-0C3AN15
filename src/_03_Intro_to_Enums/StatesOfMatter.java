package _03_Intro_to_Enums;

enum StatesOfMatter {
	
	//SOLID, LIQUID, GAS;
	SOLID(0), LIQUID(25), GAS(100);
	
	int celsiusTemp;
	private StatesOfMatter(int celsiusTemp) {
		this.celsiusTemp = celsiusTemp;
	}
	
	static int convertToFahrenheit(int temp) {
		
		return (temp * 9/5) + 32;
	}
}
