// == CS400 Summer 2024 File Header Information ==
// Name: Timmy Aziz
// Email: tgaziz@wisc.edu
// Account: Timmy-Aziz
// Lecturer: JIAZHEN ZHOU
// Notes to Grader: N/A

/*
 *	Color class
 */
public class Color{
	private String color;

	//Constructor
	public Color(String iniColor){
		if(isColorValid(iniColor)){
			this.color = iniColor;
		}
		else{
			System.out.println("Failed to initalize the color");
		}
	}

	//Getter
	public String getColor(){
		return this.color;
	}

	/* The method for changing the color
	 * TODO: Revise the code so that it return true only if the input color is valid
	 * 	and different from the exisitng color before making the change
	 */
	public boolean  changeColor(String newColor){
		if (!(this.color.equals(newColor)) && isColorValid(newColor)) {
			this.color = newColor;
			return true;
		}	
		return false;
	}

	public boolean isColorValid(String inputColor){
		String [] validColor = {"red","orange","yellow","green", "cyan", "blue","purple"};
		for(int i=0; i<validColor.length; i++){
			if(inputColor.equals(validColor[i])){
				return true;
			}
		}
		
		//Failed to find a match, the color is invalid
		return false;
	}
}
