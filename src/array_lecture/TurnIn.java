package array_lecture;

public class TurnIn
{
    public static void main(String[] args)
    {
        printDays();
        evenNums();
        increment();

    }

    public static void increment()
    {
        double[] doubles = new double[10];

        for (int i = 0; i < 10 ; i++)
        {
            doubles[i] = (i + 1) + .5;
            System.out.println(doubles[i]);
        }

        double sum = 0.0;
        for (int i = 0; i < doubles.length; i++)
        {
            sum+=doubles[i];
        }
        System.out.println(sum);
    }

    public static void evenNums()
    {
        int[] nums = new int[50];

        for (int i = 0; i < 50; i++)
        {
            nums[i] = (i+1)*2;
            System.out.println(nums[i]);
        }
    }

    public static void printDays()
    {
        String[] daysOfWeek = {"monday", "tuesday", "wednesday",
                "thursday", "friday", "saturday", "sunday"};

        for (int i = 0; i < daysOfWeek.length; i++)
        {
            if(daysOfWeek[i].equals("monday"))
            {
                daysOfWeek[i] = "saturday";
                System.out.println(daysOfWeek[i]);
            }
        }
    }
}
