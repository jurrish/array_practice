package array_lecture;

public class LoopingOverArrays
{
    public static void main(String[] args)
    {
        String[] petNames = {"fluffy", "chunkers", "furball", "rascal", "fuzzbucket","boops" };

        for (int i = 0; i < petNames.length; i++)
        {
            petNames[i] = petNames[i].toUpperCase();
            petNames[i] = petNames[i].replace("A", "@");
            System.out.println(petNames[i]);
        }
    }

    public static void changeNums()
    {
        int[] numbers = new int[6];
        numbers[0] = 13;
        numbers[1] = 3;
        numbers[2] = 17;
        numbers[3] = -1;
        numbers[4] = -5;
        numbers[5] = 0;

        //increment each number
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] +=2;
        }

        //print it out
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void coins()
    {
        //coin flips(true==heads, false==tails)
        boolean[] coinFlips = {false, true,false,false,
                false,true,true,false,true,true,true};

        for (int i = 0; i < coinFlips.length ; i++)
        {
            if(coinFlips[i]==true)
            {
                System.out.println("heads");
            } else
            {
                System.out.println("tails");
            }
        }
    }
}
