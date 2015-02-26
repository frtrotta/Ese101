package quadraticequationsolver;

import complexnumber.*;

public class QuadraticEquationSolver {
    private float a;
    private float b;
    private float c;
    private float delta;
    
    
    
    private void computeDeterminant() {
        this.delta = (float)Math.pow(this.getB(), 2) - 4 * this.getA() * this.getC();
    }
    
    public ComplexNumber computeX1() {
        this.computeDeterminant();
        ComplexNumber r = new ComplexNumber();
        if(this.delta < 0) {
            r.setRe(-this.getB());
            r.setIm((float)Math.sqrt(-this.delta));
        }
        else {
            r.setRe(-this.getB() + (float)Math.sqrt(this.delta));
            r.setIm(0);
        }
        r.setRe(r.getRe() / (2*this.getA()));
        r.setIm(r.getIm() / (2*this.getA()));
        return r;
    }
    
    public ComplexNumber computeX2() {
        this.computeDeterminant();
        ComplexNumber r = new ComplexNumber();
        if(this.delta < 0) {
            r.setRe(-this.getB());
            r.setIm(-(float)Math.sqrt(-this.delta));
        }
        else {
            r.setRe(-this.getB() - (float)Math.sqrt(this.delta));
            r.setIm(0);
        }
        r.setRe(r.getRe() / (2*this.getA()));
        r.setIm(r.getIm() / (2*this.getA()));
        return r;
    }

    public float getA() {
        return a;
    }

    public void setA(float value) {
        if( value != 0) {
            this.a = value;
        }
        else {
            throw new IllegalArgumentException("The value of a must be different from 0.");
        }
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
}
