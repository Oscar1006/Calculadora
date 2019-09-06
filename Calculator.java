import java.lang.Math;
import java.util.Scanner;

public class Calculator
{
	public double operating1, operating2, result;
	public String stringOperating;
	public String operator;
	Scanner reader;
	boolean nonExistentOperator;

	/*------------------------------------------------------


	public static void main(String[] Args){

		reader = new Scanner(System.in);
		int restart, calculatorType;
		do {
			System.out.println("Select a way to use the calculator:\n1.One operation at time\n2.Flow of operations")
			while(calculatorType = 1)
			{
				do {
					System.out.println("Enter the operator you want to use, if you are not sure how to write it press the enter key.");
					operator = reader.nextString();
					while(operator = "null" || operator = "") {
						System.out.println("Addition: +\nSustraction: -\nMultiplication: *\nDivision: /\nModulus: %\nSine: sin");
						System.out.println("Cosine: cos\nTangent: tan\nBase 10 Logarithm: log10\nBase n logarithm: log");
						System.out.println("Square root: root2\nNth Root: root\nExponenttiation: ^");
						System.out.println("Convert degrees to radians: rad\nConvert radians to degrees: deg");
						System.out.println("Convert decimals to hexadecimals: dh\nConvert decimals to binariess: db");
						System.out.println("Convert hexadecimals to decimals: hd\nConvert hexadecimals to binaries: hb");
						System.out.println("Convert binaries to decimals: bd\nConvert binaries to hexadecimals: bh");
					}
				}
				while(operator = "null" || operator = "");
				Calculator.oneOperationAtTime(double result);
				System.out.println("El resultado es: " + result);
				System.out.println("Do you want to do another operation?\n1.Si\n2.No");
				restart = reader.nextInt();
				if(restart != 1)
					calculatorType = 3;
			}
		}
		while (calculatorType = 3);
	}

	/*--------------------------------------------------------------------------------------------------------------------------*/

	public static double makeAddition(double operating1, double operating2)
	{
		double addition = operating1 + operating2;
		return addition;
	}

	/*--------------------------------------------------------------------------------------------------------------------------*/

	public static double makeSubtraction(double operating1, double operating2)
	{
		double subtraction = operating1 - operating2;
		return subtraction;
	}

	/*--------------------------------------------------------------------------------------------------------------------------*/

	public static double makeMultiplication(double operating1, double operating2)
	{
		double multiplication = operating1 - operating2;
		return multiplication;
	}

	/*--------------------------------------------------------------------------------------------------------------------------*/

	public static double makeDivision(double operating1, double operating2)
	{
		double division = operating1 / operating2;
		return division;
	}

	/*--------------------------------------------------------------------------------------------------------------------------*/

	public static double makeModulus(double operating1, double operating2)
	{
		double modulus = operating1 % operating2;
		return modulus;
	}

	/*--------------------------------------------------------------------------------------------------------------------------*/

	public static double makeSine(double operating1)
	{
		operating1 = operating1*Math.PI;
		double sine = Math.sin(operating1);
		return sine;
	}

	/*--------------------------------------------------------------------------------------------------------------------------*/

	public static double makeCosine(double operating1)
	{
		operating1 = operating1*Math.PI;
		double cosine = Math.cos(operating1);
		return cosine;
	}

	/*--------------------------------------------------------------------------------------------------------------------------*/

	public static double makeTangent(double operating1)
	{
		operating1 = operating1*Math.PI;
		double tangent = Math.tan(operating1);
		return tangent;
	}

	/*--------------------------------------------------------------------------------------------------------------------------*/

	public static double makeLogarithm10(double operating1)
	{
		double logarithm10 = Math.log10(operating1);
		return logarithm10;
	}

	/*--------------------------------------------------------------------------------------------------------------------------*/

	public static double makeLogarithm(double operating1, double operating2)
	{
		double logarithm = (Math.log10(operating2))/(Math.log10(operating1);
		return logarithm;
	}

	/*--------------------------------------------------------------------------------------------------------------------------*/

	public static double makeSquareRoot(double operating1)
	{
		for(int contador = 0; contador <= 10; contador++)
			operating1 = (operating1/2)+(900/(2*operating1));
		double squareRoot = operating1;
		return squareRoot;
	}

	/*--------------------------------------------------------------------------------------------------------------------------*/

	public static double makeRoot(double operating1, double operating2)
	{
		operating2 = 1/operating2;
		double root = Math.pow(operating1, operating2);
		return root;
	}

	/*--------------------------------------------------------------------------------------------------------------------------*/

	public static double makePower(double operating1, double operating2)
	{

		return power;
	}

	/*--------------------------------------------------------------------------------------------------------------------------*/

	public static double makeFactorial(double operating1)
	{
		return factorial;
	}

	/*--------------------------------------------------------------------------------------------------------------------------*/

	public static double makeBase10OfX(double operating1)
	{
		double base10 = Math.pow(10, operating1);
		return base10;
	}

	/*--------------------------------------------------------------------------------------------------------------------------*/

	public static double makeConvertDegreesToRadians(double operating1)
	{
		double dRadians = Math.toRadians(operating1);
		return dRadians;
	}

	/*--------------------------------------------------------------------------------------------------------------------------*/

	public static double makeConvertRadiansToDegrees(double operating1)
	{
		double rDegrees = Math.toDegrees(operating1);
		return rDegrees;
	}

	/*--------------------------------------------------------------------------------------------------------------------------*/

	public static double makeConvertDecimalToHexadecimal(double operating1)
	{
		return dHexade;
	}

	/*--------------------------------------------------------------------------------------------------------------------------*/
	public static double makeConvertDecimalToBinary(double operating1)
	{
		return dBinary;
	}

	/*--------------------------------------------------------------------------------------------------------------------------*/
	public static double makeConvertHexadecimalToDecimal(double operating1)
	{
		return hDecimal;
	}

	/*--------------------------------------------------------------------------------------------------------------------------*/
	public static double makeConvertHexadecimalToBinary(double operating1)
	{
		return hBinary;
	}

	/*--------------------------------------------------------------------------------------------------------------------------*/
	public static double makeConvertBinaryToDecimal(double operating1)
	{
		return bDecimal;
	}

	/*--------------------------------------------------------------------------------------------------------------------------*/
	public static double makeConvertBinaryToHexadecimal(double operating1)
	{
		return bHexadecimal;
	}

	/*--------------------------------------------------------------------------------------------------------------------------*/

	public static void oneOperationAtTime(double result)
	{
		if (operator.equalsIgnoreCase("+"))
		{
			System.out.println("Enter the value of the first operating: ");
			operating1 = reader.nextDouble();
			System.out.println("Enter the value of the second operating: ");
			operating2 = reader.nextDouble();
			result = Calculator.makeAddition(double operating1, double operating2);
		}
		else if(operator.equalsIgnoreCase("-"))
		{
			System.out.println("Enter the value of the first operating: ");
			operating1 = reader.nextDouble();
			System.out.println("Enter the value of the second operating: ");
			operating2 = reader.nextDouble();
			result = Calculator.makeSubtraction(double operating1, double operating2);
		}
		else if(operator.equalsIgnoreCase("*"))
		{
			System.out.println("Enter the value of the first operating: ");
			operating1 = reader.nextDouble();
			System.out.println("Enter the value of the second operating: ");
			operating2 = reader.nextDouble();
			result = Calculator.makeMultiplication(double operating1, double operating2);
		}
		else if(operator.equalsIgnoreCase("/"))
		{
			System.out.println("Enter the value of the first operating: ");
			operating1 = reader.nextDouble();
			System.out.println("Enter the value of the second operating: ");
			operating2 = reader.nextDouble();
			result = Calculator.makeDivision(double operating1, double operating2);
		}
		else if(operator.equalsIgnoreCase("%"))
		{
			System.out.println("Enter the value of the first operating: ");
			operating1 = reader.nextDouble();
			System.out.println("Enter the value of the second operating: ");
			operating2 = reader.nextDouble();
			result = Calculator.makeModulus(double operating1, double operating2);
		}
		else if(operator.equalsIgnoreCase("sin"))
		{
			System.out.println("Enter the value of an angle in radians: ");
			operating1 = reader.nextDouble();
			result = Calculator.makeSine(double operating1);
		}
		else if(operator.equalsIgnoreCase("cos"))
		{
			System.out.println("Enter the value of an angle in radians: ");
			operating1 = reader.nextDouble();
			result = Calculator.makeCosine(double operating1);
		}
		else if(operator.equalsIgnoreCase("tan"))
		{
			System.out.println("Enter the value of an angle in radians: ");
			operating1 = reader.nextDouble();
			result = Calculator.makeTangent(double operating1);
		}
		else if(operator.equalsIgnoreCase("log10"))
		{
			System.out.println("Enter the value of the argument: ");
			operating1 = reader.nextDouble();
			result = Calculator.Logarithm10(double operating1);
		}
		else if(operator.equalsIgnoreCase("log"))
		{
			System.out.println("Enter the value of the base: ");
			operating1 = reader.nextDouble();
			System.out.println("Enter the value of the argument: ");
			operating2 = reader.nextDouble();
			result = Calculator.makeLogarithm(double operating1, double operating2);
		}
		else if(operator.equalsIgnoreCase("root2"))
		{
			System.out.println("Enter the value of the radicand: ");
			operating1 = reader.nextDouble();
			result = Calculator.makeSquareRoot(double operating1);
		}
		else if(operator.equalsIgnoreCase("root"))
		{
			System.out.println("Enter the value of the radicand: ");
			operating1 = reader.nextDouble();
			System.out.println("Enter the value of the index: ");
			operating2 = reader.nextDouble();
			result = Calculator.makeRoot(double operating1, double operating2);
		}
		else if(operator.equalsIgnoreCase("^"))
			result = Calculator.makePower(double operating1, double operating2);
		else if(operator.equalsIgnoreCase("!"))
			result = Calculator.makeFactorial(double operating1);
		else if(operator.equalsIgnoreCase("10^"))
		{
			System.out.println("Enter the value of the exponent: ");
			operating1 = reader.nextDouble();
			result = Calculator.makeBase10OfX(double operating1);
		}
		else if(operator.equalsIgnoreCase("rad"))
		{
			System.out.println("Enter the value of an angle in degrees: ");
			operating1 = reader.nextDouble();
			result = Calculator.makeConvertDegreesToRadians(double operating1);
		}
		else if(operator.equalsIgnoreCase("deg"))
		{
			System.out.println("Enter the value of an angle in radians: ");
			operating1 = reader.nextDouble();
			result = Calculator.makeConvertRadiansToDegrees(double operating1);
		}
		else if(operator.equalsIgnoreCase("dh"))
			result = Calculator.makeConvertDecimalToHexadecimal(double operating1);
		else if(operator.equalsIgnoreCase("db"))
			result = Calculator.makeConvertDecimalToBinary(double operating1);
		else if(operator.equalsIgnoreCase("hd"))
			result = Calculator.makeConvertHexadecimalToDecimal(double operating1);
		else if(operator.equalsIgnoreCase("hb"))
			result = Calculator.makeConvertHexadecimalToBinary(double operating1);
		else if(operator.equalsIgnoreCase("bd"))
			result = Calculator.makeConvertBinaryToDecimal(double operating1);
		else if(operator.equalsIgnoreCase("bh"))
			result = Calculator.makeConvertBinaryToHexadecimal(double operating1);
		else
			result = 0;
	}

}
