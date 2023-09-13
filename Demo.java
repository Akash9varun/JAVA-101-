
// Relational Operators 

// <,>, = means assignment operator 
// == is used to compare two values 
// != not equal
// <=,>= are relational operators 

/*
class Demo 
{
    public static void main(String args[])
    {
        int x = 6;
        int y = 7;

        boolean result = x != y;

        System.out.println(result);
  

    }
    
}
*/
//Logical Operators 
// x < y(T/F) AND/OR  a > b (T/F) --- Combined Output(T/F)
// AND-- &  OR -- |   NOT-- !
// Instead using using 1 &,| --- you can use &&,||
// tt - t | tt - t | t -f 
// tf - f | tf - t | f - t
// ft - f | ft - f |
// ff -f  | ff - f |

/*
class Demo 
{
    public static void main(String args[])
    {
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        //boolean result = x < y || a < b || a > 1;
        boolean result = a > b;
        System.out.println(! result); // Not Operator usage
  

    }
    
}
*/

// Conditional Statements 
//if-else
/*
class Demo 
{
    public static void main(String args[])
    {

        int x = 28;

        if(x>10 && x<=20) // Accepted Value is 11-20   // if(true)/if(false) or if(x>10)
        System.out.println("Hello");
        else
        System.out.println("Bye");

    }
    
}
*/

// IF ELSE EXAMPLE 2
/*
class Demo 
{
    public static void main(String args[])
    {

        int x = 8;
        int y = 7;


        if(x>y)
        { // if multiple statement you have use curly braces for if statement

          System.out.println(x);
          System.out.println("Thank You");
        }
        
        else
        System.out.println(y);

    }
    
}
*/
// IF ELSE EXAMPLE 3
/*
class Demo 
{
    public static void main(String args[])
    {

        int x = 8;
        int y = 7;
        int z = 9;


        if(x>y && x>z) //false
        System.out.println(x);
        
        //else if (y>x && y>z) // Since above we are already comparing x>y since we will get to know it's false you can write this code as follows : 
        else if(y>z)
        System.out.println(y);

        else
        System.out.println(z);


    }
    
}
*/
/*
class Demo 
{
    public static void main(String args[])
    {
        int n = 4;
        int result = 0;


        // if(n%2==0)
        // result = 10;

        // else
        // result = 20;

        // ?: - turnary operator 

        result = n%2==0 ? 10 : 20; // if(?) even print 10 before colon ..else(:) print 20 after colon ..

        System.out.println(result);


    }
    
}
*/

// Switch Statement
// Based on the value it will execute the particular case
/*
class Demo 
{
    public static void main(String args[])
    {
        int n = 8;

        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a Valid Number");
// IF there are no cases that match.. you can add a default case option....


        }


    }
    
}
*/

// LOOPS

// repeat this statement 4 times
        // loop - while, do while , for

        // 100 - condition


class Demo 
{
    public static void main(String args[])
    {
        int i = 1;

        while(i<=4)
        {
            System.out.println("Hi" + i);

            i++;

        }
        
          System.out.println("Bye" + i);
          // output is 5, since i is declared out of the loop (int i)
          

    }
    
}