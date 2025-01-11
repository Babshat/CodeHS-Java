public class Fraction
{
    // Create your instance variables and constructor here
    public int numerator;
    public int denominator;
    
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public int getNumerator() {
        return numerator;
    }
    
    public int getDenominator() {
        return denominator;
    }
    
    public void setNumerator(int x) {
        numerator = x;
    }
    
    
    public void setDenominator(int x) {
        denominator = x;
    }
    
   // Corrected add method
    public void add(Fraction other) {
        this.numerator = this.numerator * other.denominator + this.denominator * other.numerator;
        this.denominator = this.denominator * other.denominator;
    }

    // Corrected subtract method
    public void subtract(Fraction other) {
        this.numerator = this.numerator * other.denominator - this.denominator * other.numerator;
        this.denominator = this.denominator * other.denominator;
    }

    // Corrected multiply method
    public void multiply(Fraction other) {
        this.numerator *= other.getNumerator();
        this.denominator *= other.getDenominator();
    }

    
    public String toString() {
        return numerator + "/" + denominator;
    }
}
