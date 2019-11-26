package array_lecture;

public class ArrayPractice
{
    public static void main(String[] args)
    {
        //declare an array with 5 characters
//        char[] name = new char[5];
          char[] name = {'f', 'r', 'a', 'n', 'k' };
          String anotherName = "Susie";

          name = anotherName.toCharArray();

//        name[0] = 'F';
//        name[1] = 'r';
//        name[2] = 'a';
//        name[3] = 'n';
//        name[4] = 'k';

        System.out.println("the first character is " + name[0]);
        name[0] = 'f';
        System.out.println("The first character is " + name[0]);
        System.out.println("the length of your name is " + name.length);
    }
}
