package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {

        return this;
        //return null;
    }

    @Override
    public Temperature toFahrenheit() {
        float c = this.getValue();

        return new Celsius(c* 9/5 + 32);
        //return null;
    }

    public String toString()
    {
        // TODO: Complete this method
        return Float.toString(this.getValue()) + " C";
        //return "";
    }
}
