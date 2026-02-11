package org.example;

public class feetMeasurement {
    public static class Feet { // inner class
        private final double feetValue;

        public Feet(double feetValue){ //constructor
            this.feetValue = feetValue;
        }
        @Override
        public boolean equals(Object obj){
            if(this == obj) return true;
            if(obj == null || !(obj instanceof Feet)) return false;

            Feet num = (Feet) obj;
            return Double.compare(this.feetValue, num.feetValue) == 0;
        }
    }

    public static void main(String[] args) {
        Feet feet1 = new Feet(7);
        Feet feet2 = new Feet(7);
        System.out.println(feet1.equals(feet2)); // true
    }
}
