package ohtu;

public class Submission {
    private String student_number;
    private int week;
    private int hours;
    
    private boolean a1;
    private boolean a2;
    private boolean a3;
    private boolean a4;
    private boolean a5;
    private boolean a6;
    private boolean a7;
    private boolean a8;
    private boolean a9;
    private boolean a10;
    private boolean a11;
    private boolean a12;
    private boolean a13;
    private boolean a14;
    private boolean a15;
    private boolean a16;
    private boolean a17;
    private boolean a18;
    private boolean a19;
    private boolean a20;

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean isA1() {
        return a1;
    }

    public void setA1(boolean a1) {
        this.a1 = a1;
    }

    public boolean isA2() {
        return a2;
    }

    public void setA2(boolean a2) {
        this.a2 = a2;
    }

    public boolean isA3() {
        return a3;
    }

    public void setA3(boolean a3) {
        this.a3 = a3;
    }

    public boolean isA4() {
        return a4;
    }

    public void setA4(boolean a4) {
        this.a4 = a4;
    }

    public boolean isA5() {
        return a5;
    }

    public void setA5(boolean a5) {
        this.a5 = a5;
    }

    public boolean isA6() {
        return a6;
    }

    public void setA6(boolean a6) {
        this.a6 = a6;
    }

    public boolean isA7() {
        return a7;
    }

    public void setA7(boolean a7) {
        this.a7 = a7;
    }

    public boolean isA8() {
        return a8;
    }

    public void setA8(boolean a8) {
        this.a8 = a8;
    }

    public boolean isA9() {
        return a9;
    }

    public void setA9(boolean a9) {
        this.a9 = a9;
    }

    public boolean isA10() {
        return a10;
    }

    public void setA10(boolean a10) {
        this.a10 = a10;
    }

    public boolean isA11() {
        return a11;
    }

    public void setA11(boolean a11) {
        this.a11 = a11;
    }

    public boolean isA12() {
        return a12;
    }

    public void setA12(boolean a12) {
        this.a12 = a12;
    }

    public boolean isA13() {
        return a13;
    }

    public void setA13(boolean a13) {
        this.a13 = a13;
    }

    public boolean isA14() {
        return a14;
    }

    public void setA14(boolean a14) {
        this.a14 = a14;
    }

    public boolean isA15() {
        return a15;
    }

    public void setA15(boolean a15) {
        this.a15 = a15;
    }

    public boolean isA16() {
        return a16;
    }

    public void setA16(boolean a16) {
        this.a16 = a16;
    }

    public boolean isA17() {
        return a17;
    }

    public void setA17(boolean a17) {
        this.a17 = a17;
    }

    public boolean isA18() {
        return a18;
    }

    public void setA18(boolean a18) {
        this.a18 = a18;
    }

    public boolean isA19() {
        return a19;
    }

    public void setA19(boolean a19) {
        this.a19 = a19;
    }

    public boolean isA20() {
        return a20;
    }

    public void setA20(boolean a20) {
        this.a20 = a20;
    }
    
    
    public int tehtavamaara(){
        int amount = 0;
        if(a1) amount++;
        if(a2) amount++;
        if(a3) amount++;
        if(a4) amount++;
        if(a5) amount++;
        if(a6) amount++;
        if(a7) amount++;
        if(a8) amount++;
        if(a9) amount++;
        if(a10) amount++;
        if(a11) amount++;
        if(a12) amount++;
        if(a13) amount++;
        if(a14) amount++;
        if(a15) amount++;
        if(a16) amount++;
        if(a17) amount++;
        if(a18) amount++;
        if(a19) amount++;
        if(a20) amount++;
        
        return amount;
    }
    
    public String tehdytTehtavat(){
        StringBuilder builder = new StringBuilder();
        
        if(a1) builder.append("1 ");
        if(a2) builder.append("2 ");
        if(a3) builder.append("3 ");
        if(a4) builder.append("4 ");
        if(a5) builder.append("5 ");
        if(a6) builder.append("6 ");
        if(a7) builder.append("7 ");
        if(a8) builder.append("8 ");
        if(a9) builder.append("9 ");
        if(a10) builder.append("10 ");
        if(a11) builder.append("11 ");
        if(a12) builder.append("12 ");
        if(a13) builder.append("13 ");
        if(a14) builder.append("14 ");
        if(a15) builder.append("15 ");
        if(a16) builder.append("16 ");
        if(a17) builder.append("17 ");
        if(a18) builder.append("18 ");
        if(a19) builder.append("19 ");
        if(a20) builder.append("21 ");
        
        return builder.toString();
    }

    @Override
    public String toString() {
        StringBuilder palautus = new StringBuilder();
        palautus.append("viikko "+week+": tehtyjä tehtäviä yhteensä: ");
        
        palautus.append(tehtavamaara()).append(" aikaa kului: ").append(hours)
                .append(", tehdyt tehtävät: ").append(tehdytTehtavat());
        
        return palautus.toString();
    }
    
}