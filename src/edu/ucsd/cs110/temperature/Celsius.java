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
    }

    @Override
    public Temperature toFahrenheit() {
        Fahrenheit f = new Fahrenheit(((9f/5f) * this.getValue()) + 32f);
        return f;
    }

    public String toString()
    {
        // TODO: Complete this method
        return "" + this.getValue()+" C";
    }
}