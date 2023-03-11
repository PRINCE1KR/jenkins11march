package pkgcalculator;

public class MainCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator objscientificCalculator=new Calculator();
		String StrResult=objscientificCalculator.getwishes();
		
		if(StrResult.contains("Hello world")){
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		int resultAddition=objscientificCalculator.addition(13, 13);
		
		if(resultAddition==26){
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		
		

	}

}

