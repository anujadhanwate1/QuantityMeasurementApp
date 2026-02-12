package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LengthUnit {
    private final double value;
    private final Length unit;

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

    public LengthUnit(double value, Length unit){
        this.value= value;
        this.unit = unit;
    }

    public double convertToActualUnit(){
        return this.value * this.unit.getConverter();
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if(obj == null || getClass() !=obj.getClass()){
            return false;
        }
        LengthUnit unit1 = (LengthUnit) obj;
    System.out.println(this.convertToActualUnit());
        System.out.println(unit1.convertToActualUnit());
        return Double.compare(Double.parseDouble(String.format("%.2f", this.convertToActualUnit())), Double.parseDouble(String.format("%.2f", unit1.convertToActualUnit()))) == 0;
    }

    public static void main(String[] args) {
        LengthUnit L1 = new LengthUnit(1.0, LengthUnit.Length.FEET);
        LengthUnit L2 = new LengthUnit(12.0, LengthUnit.Length.INCH);

        LengthUnit L3 = new LengthUnit(1.0, LengthUnit.Length.YARD);
        LengthUnit L4 = new LengthUnit(36.0, LengthUnit.Length.INCH);

        LengthUnit L5 = new LengthUnit(0.33333, LengthUnit.Length.YARD);
        LengthUnit L6 = new LengthUnit(1.2, LengthUnit.Length.CENTIMETER);

//        LengthUnit L7 = new LengthUnit(100.0, Length.CENTIMETER);
//        LengthUnit L8 = new LengthUnit(39.3701, Length.INCH);
        System.out.println("------"+L1.equals(L2));
        System.out.println("------"+L3.equals(L4));
//        System.out.println("------"+L5.equals(L6));
    }
}
