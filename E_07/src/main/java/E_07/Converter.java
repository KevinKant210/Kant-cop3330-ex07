package E_07;

import java.text.DecimalFormat;

public class Converter {
    final float convRate = (float) .09290304;
    int dimensions;
    private DecimalFormat df = new DecimalFormat("###.###");
    public Converter (int dimensions){
        this.dimensions = dimensions;
    }

    public float toMeter(){
        return Float.parseFloat(df.format(dimensions*convRate));
    }

    public void calcRoom(){
        System.out.println("The area is " + dimensions + " square feet");

        System.out.println("The area in meters is " + toMeter() + " Meters");
    }
}
