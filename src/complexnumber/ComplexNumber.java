package complexnumber;

public class ComplexNumber {
    private float re;
    private float im;
    
    public ComplexNumber(float re, float im) {
        this.re = re;
        this.im = im;
    }
    
    public ComplexNumber() {
        this.re = 0;
        this.im = 0;
    }
    
    public String formatComplexNumber() {
        String r = this.getRe() + "+(" + this.getIm() + ")i";
        return r;
    }

    public float getRe() {
        return re;
    }

    public void setRe(float re) {
        this.re = re;
    }

    public float getIm() {
        return im;
    }

    public void setIm(float im) {
        this.im = im;
    }
}
