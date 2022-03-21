package com.company;
import java.util.Scanner;
public class Main {
    //F To C :((inputValue-32.0f)*5.0f)/9.0f;
    //k To f : ((((inputValue -273.15f)*9.0f)/5.0f) + 32.0f)
        // F to C: ((t-32.0f)*5.0f)/9.0f
       // C to K: t+273.15f
      // K to F: (((t-273.15f)*9.0f)/5.0f)+32.0f
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        char inputType;
        char OutputType;
        float inputValue;
        float returnValue;

        System.out.print("input Type (F/C/k): ");
        inputType = reader.next().charAt(0);
        System.out.print("output Type (F/C/k): ");
        OutputType = reader.next().charAt(0);
        System.out.print("Temperature: ");
        inputValue = reader.nextFloat();

        switch (inputType)
        {
            case 'F':
                inputValue =  fTOc(inputValue);
                break;
            case 'C':
               break;
            case 'K':
                inputValue = fTOc(kTOf(inputValue));
            break;
            default:
                System.exit(1);
        }
        switch(OutputType)
        {
            case 'F':
                inputValue =  kTOf(cTOk(inputValue));
                break;
            case 'C':
                break;
            case 'K':
                inputValue = cTOk(inputValue);
                break;
            default:
                System.exit(1);
        }
        System.out.println(inputValue);
    }
    public static float  fTOc( float fval)
    {
       return  ((fval-32.0f)*5.0f)/9.0f;
    }
    public static float  kTOf( float kval)
    {
        return  (((kval-273.15f)*9.0f)/5.0f)+32.0f;
    }
    public static float  cTOk( float cval)
    {
        return  cval+273.15f;
    }
}