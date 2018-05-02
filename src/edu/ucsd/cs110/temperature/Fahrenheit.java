package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
       float f = this.getValue();
       return new Fahrenheit((f-32)/(9/5));
        //return null;
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
        //return null;
    }

    public String toString()
    {
        // TODO: Complete this method
        return Float.toString(this.getValue()) + " F";
        //return "";
    }


}
