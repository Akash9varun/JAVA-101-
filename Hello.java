/// Everymachine has JVM support.. JVM Job is to execute java code 
/// java is platform independent but need to have jvm
/// but jvm is dependent 😂( will not work in ios)
/// JVM READS BYTE CODE  
/// 1ST FILE WILL NEED TO HAVE MAIN FUNCTION(signature)
/// public static void main (signature )always pass this method
/// hello.class file is the byte code 
/// JRE- JAVA RUN TIME ENV AND JVM - JAVA VIRTUAL MACHINE 
/// JVM IS A PART OF JRE 
/// JDK WILL BE INSTALLED BY DEV'S .. JRE AND JDK WILL BE THERE INSIDE IT 
/// INSTALLING NEW JDK, WE WILL GET JVM AND JRE 

/// VARIABLE - NAME & VALUE WILL BE THERE
/// JAVA IS STRONGLY TYPED LANG
/// DIFFERENT VARAIBLE[BOX] WILL HAVE VALUE
/// NUMBER - INT, WORDS- STRINGS 

///class Hello
///{
    ///public static void main(String a[])
    ///{
        ///int num1 = 3;
        ///int num2 = 5;
        ///int result = num1 + num2;
        ///System.out.println(result);
    
   /// }
///}
///

/// 2 types of data types
/// primitive - INT, FLOAT, CHAR, BOOLEAN 
/// INT - BYTE,SHORT,INT,LONG
/// FLOAT - DOUBLE,FLOAT (8,4 bytes respectively.)
/// INT --- INT - 4 BYTES, Long - 8 bytes, SHORT -2BYTES, BYTE - 1 BYTE
/// in java double is by default
/// char - 2bytes 
/// java follows unicode 
/// byte - only until 127



/* 
class Hello
{
    public static void main(String a[])
    {
        int num1 = 3;
        byte by = 5;
        short sh = 558;
        long l = 5854l;

        float f = 5.8f;
        double d = 5.8;

        char c = 'k';

        boolean b = true;


    }
}
*/


/* 
class Hello
{
    public static void main(String a[])
    {
        /// in java you can differentiate zeroes by putting underscore such int num1 = 10_00_000;
        /// int num1 = 0b101 which 5 in binary.. it also works 
        /// int num1 = 0x7E which means 126 in hexadecimal numbers.. which also works 
        // literals 
        // int value will work in float
        // double num1 = 12e10; also works 


        char c = 'a';
        c++;
        System.out.println(c);
        
        


    }
}
*/

// TYPE CONVERSION AND CASTING 
// byte b = 127 ;, int a = 256 ;
// b = a; will not work 
// reverse will work a = b -- implicit 
// type of a is int has bigger range. 
// byte b = 127 , int a = 12 
// b = (byte)a; (this is called casting - explicit)
// float f = 5.6f; , int x = (int)f; value will be 5 
//



/*
class Hello
{
    public static void main(String args[])
    {
        //byte b = 125; // (-127 to 127)
        int a = 257;
        byte k = (byte)a;
        //now incase more than 127 while casting it will divide the number .. it will use modulus function % .. it will divide the number by 256
        // hence 257/256 ----- 1

        float f = 5.6f; 
        int t = (int)f;


        System.out.println(t);




    }
    
}

*/


// Type Promotion 

/* 
class Hello
{
    public static void main(String args[])
    {
        byte a = 10;
        byte b = 30;
        // when we perform operation a * b it will be going out of byte range
        // 

        int result = a * b;

        System.out.println(result);

    

    }
    
}

*/


// Operators
/* 
class Hello
{
    public static void main(String args[])
    {
        int num = 7;
        // int num2 = 5;


        // int result = num1 % num2;// to get reminder 

        //int result = num1 / num2; // qoutient to get you use / for division
        // num1 = num1 + 2; instead this use shortcut below

        //num += 2;// same for all other operations -=,*= 
        //num += 1;// shortcut for adding 1 is down below 
        //num++; // increment  (post increment)
        //num--;
        // instead of saying num++ you can say
        //++num; // pre increment
        // these operations will behave differently whhen fetching the value 

        //int result = ++num;// output is 8 
        int result = num++; // output is 7
        // num++ will fetch the value and then increment 
        // ++ num it will first increment and fetch the value 


        System.out.println(result);

    }
    
}
*/
// Arithmetic operators done 


// Relative Operators 

// <,>, = means assignment operator 
// == is used to compare two values 
// != not equal



class Hello
{
    public static void main(String args[])
    {
        int x = 6;
        int y = 5;




        
  

    }
    
}