import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode k
     */
     
    Scanner in = new Scanner(System.in);
    int no = in.nextInt();
    int[] numbers = new int[no];
    for (int i = 0; i < no; i++)
    {
      numbers[i] = in.nextInt();
    }

    int highestcount = 0;
    int highestnumber = 0;
    for (int i = 0; i < no; i++)
    {
      int x = numbers[i];
      int count = 1;
      for (int y = no-1; y > i; y--)
      {
        if (numbers[y] == x)
        {
          count++;
        }
      }
      if (count > highestcount)
      {
        highestcount = count;
        highestnumber = numbers[i];
      }
    }

    System.out.println(highestnumber);
  }
}
