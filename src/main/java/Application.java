import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Application {
    public static void main(String[] args) {

        if (args.length == 0) {
            int inputNumber;
            Scanner sc=new Scanner(System.in);
                System.out.println("Please enter how many numbers you will use");
                inputNumber = sc.nextInt();
                int [] numbersArray = new int[inputNumber];
                for (int i = 0; i <= inputNumber - 1; i++){
                    System.out.println("Please enter a number");
                    numbersArray[i] = sc.nextInt();
                }
            trialWithLists(numbersArray);
            //outputUserOptions(inputNumber, numbersArray);
        }
        else {
            int [] inputArray = new int[args.length];
            for (int i = 0; i <= args.length - 1; i++){
                inputArray[i] = Integer.parseInt(args[i]);
            }
            trialWithLists(inputArray);
            //outputUserOptions(args.length, inputArray);
        }
    }

    private static int addNumbersTogether(int [] inputNumbers) {
        int result = 0;
        for (int i = 0; i <= inputNumbers.length - 1; i++) {
            result = result + inputNumbers[i];
        }
        return result;
    }

    private static int multipleNumbersTogether(int [] inputNumbers) {
        int result = 1;
        for (int i = 0; i <= inputNumbers.length - 1; i++) {
            result = result * inputNumbers[i];
        }
        return result;
    }

    private static void calculateRange(int [] inputNumbers) {
        //2 8 10 15
        Arrays.sort(inputNumbers);
        int result;
        String resultString;
        for (int i = 0; i <= inputNumbers.length - 2; i++) {
            result = 0;
            resultString = "";
            int lowerNumber, higherNumber;
            lowerNumber = inputNumbers[i];
            higherNumber = inputNumbers[i+1];
            for (int j = lowerNumber; j <= higherNumber; j++){
                result = result + j;
                if(j <= higherNumber - 1){
                    resultString = resultString + j + " + ";
                }
                else{
                    resultString = resultString + j + " = ";
                }
            }
            System.out.println(resultString + result);
        }
        result = 0;
        int lowestNumber;
        int highestNumber;
        resultString = "";
        lowestNumber = inputNumbers[0];
        highestNumber = inputNumbers[inputNumbers.length - 1];
        for (int k = lowestNumber; k <= highestNumber; k++){
            result = result + k;
            if(k <= highestNumber - 1){
                resultString = resultString + k + " + ";
            }
            else{
                resultString = resultString + k + " = ";
            }
        }
            System.out.println(resultString + result);
    }

    private static String buildResultString(int [] inputNumbers, String resultSymbol){
        String resultString = "";
        for (int i = 0; i <= inputNumbers.length - 1; i++) {
            if (i <= inputNumbers.length - 2) {
                resultString = resultString + inputNumbers[i] + " " + resultSymbol + " ";
            }
            else {
                resultString = resultString + inputNumbers[i] + " " + "= ";
            }
        }
        return resultString;
    }

    private static void outputUserOptions(int numbersEntered, int [] inputNumbers) {
        char userChoice;
        int result;
        String resultString;
        System.out.println("Please select one of the options below: ");
        System.out.println("Please enter + for addition");
        System.out.println("Please enter * for multiplication");
        System.out.println("Please enter / for division");
        System.out.println("Please enter - for subtraction");
        System.out.println("Please enter r for range");
        Scanner sc=new Scanner(System.in);
        userChoice = sc.next().charAt(0);
        switch(userChoice){
            case '+' : result = addNumbersTogether(inputNumbers);
            resultString = buildResultString(inputNumbers, "+");
            System.out.println(resultString + result);
                break;
            case '*' : result = multipleNumbersTogether(inputNumbers);
            resultString = buildResultString(inputNumbers, "*");
            System.out.println(resultString + result);
                break;
            case '/' : break;
            case '-' : break;
            case 'r' : calculateRange(inputNumbers);
                break;
            default: System.out.println("Error you didn't choose the options provided");
        }
    }

    private static void trialWithLists(int [] inputNumbers){
        //int myInt = 1;
        List<Integer> inputList = new ArrayList<Integer>();
        int result = 0;
        //inputList.add(myInt);
        //System.out.println(inputList.get(0));
        //List<Integer> arrayList = Arrays.asList();
        for (int i = 0; i <= inputNumbers.length - 1; i++) {
            inputList.add(inputNumbers[i]);
        }
        for (int i = 0; i < inputList.size(); i++){
            System.out.println(inputList.get(i));
            result = result + inputList.get(i);
        }
        System.out.println(result);
    }
}
//Have the user inputting two numbers, once that's done have it work with multiplication and addition
