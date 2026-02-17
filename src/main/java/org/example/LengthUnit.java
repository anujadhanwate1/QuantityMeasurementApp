package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LengthUnit {

    public enum Length {
        INCH(1.0), // Base unit
        FEET(12.0), // 1 foot = 12 inches
        YARD(36.0), // 1 yard = 3 feet
        CENTIMETER(0.393701);

        private final double inchesConversionFactor;

        Length(double inchesConversionFactor) {
            this.inchesConversionFactor = inchesConversionFactor;
        }

        public double getConverter() {
            return inchesConversionFactor;
        }
    }

    public LengthUnit(){
    }

    public double convertToActualUnit(double value, Length unit1){
        return value * unit1.getConverter();
    }

    public double convertToActualUnit(double value, Length unit1, Length unit2){
        double baseValue = value * unit1.getConverter();
        return baseValue / unit2.getConverter();
    }

    public static void main(String[] args) {
        LengthUnit L1 = new LengthUnit();
        double convertedVal = L1.convertToActualUnit(3,Length.FEET);
        System.out.println("Function 1 : "+convertedVal);
        double convertedVal2 = L1.convertToActualUnit(3,Length.INCH,Length.CENTIMETER);
        System.out.println("Function 2 : "+convertedVal2);
    }
}
