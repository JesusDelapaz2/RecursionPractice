public class RecursionPractice
{
    public static void main (String[]args)
    {
        int recursionInput = 3;
        int iterativeInput = 3;

        int recursiveSolution = recursiveFactorial(recursionInput);
        System.out.println("The recursive solution for " + recursionInput + " is: " + recursiveSolution);

        int iterativeSolution = iterativeFactorial(iterativeInput);
        System.out.println("The iterative solution for " + iterativeInput + " is: " + iterativeSolution);
    }
    public static int recursiveFactorial(int recursionInput)
    {
        if (recursionInput > 0) {
            return recursionInput * recursiveFactorial(recursionInput - 1);
        } else
        {
            return 1;
        }
    }
    public static int iterativeFactorial (int iterativeInput)
    {
        int result = 1;

        while (iterativeInput > 0)
        {
            result *= iterativeInput;
            iterativeInput -= 1;
        }

        return result;
    }

}