

import java.io.*;
public class Leer
{
    public static String dato ()
    {
	String Sdato = "";
	try
	{
	    InputStreamReader isr = new InputStreamReader (System.in);
	    BufferedReader flujoE = new BufferedReader (isr);
	    Sdato = flujoE.readLine ();
	}
	catch (IOException e)
	{
	    System.err.print ("error" + e.getMessage ());
	}
	return Sdato;
    }


    public static int datoInt ()

    {
	try
	{
	    return Integer.parseInt (dato ());
	}
	catch (NumberFormatException e)
	{


	    return Integer.MIN_VALUE;

	}
    }


    public static short datoShort ()

    {
	try
	{
	    return Short.parseShort (dato ());
	}


	catch (NumberFormatException e)
	{


	    return Short.MIN_VALUE;
	}
    }


    public static long datoLong ()

    {
	try
	{
	    return Long.parseLong (dato ());
	}


	catch (NumberFormatException e)
	{


	    return Long.MIN_VALUE;
	}
    }


    public static float datoFloat ()

    {
	try
	{
	    Float f = new Float (dato ());
	    return f.floatValue ();
	}


	catch (NumberFormatException e)
	{


	    return Float.NaN;
	}
    }


    public static double datoDouble ()

    {
	try
	{
	    Double f = new Double (dato ());
	    return f.doubleValue ();
	}


	catch (NumberFormatException e)
	{


	    return Double.NaN;
	}
    }
}
