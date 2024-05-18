package _03_Intro_to_Enums;

enum StatesOfMatter {
	
	//SOLID, LIQUID, GAS;
	SOLID(0), LIQUID(25.55), GAS(100);
	
	int celsiusTemp;
	private void Temp(int celsiusTemp) {
		this.celsiusTemp = celsiusTemp;
	}
}
