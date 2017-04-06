package ohtu;

public class Submission {
    private String student_number;
    private int week;
    private int hours;
    
    private boolean[] excercises = new boolean[21];
    private boolean a1;

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
    
    private void setExcercise(int i, boolean done){
        excercises[i] = done;
    }
    
    private boolean getExcercise(int i){
        return excercises[i];
    }
    
    public boolean getA1(){
        return getExcercise(0);
    }
    
    public boolean getA2(){
        return getExcercise(1);
    }
    
    public boolean getA3(){
        return getExcercise(2);
    }
    
    public boolean getA4(){
        return getExcercise(3);
    }
    
    public boolean getA5(){
        return getExcercise(4);
    }
    
    public boolean getA6(){
        return getExcercise(5);
    }
    
    public boolean getA7(){
        return getExcercise(6);
    }
    
    public boolean getA8(){
        return getExcercise(7);
    }
    
    public boolean getA9(){
        return getExcercise(8);
    }
    
    public boolean getA10(){
        return getExcercise(9);
    }
    
    public boolean getA11(){
        return getExcercise(10);
    }
    
    public boolean getA12(){
        return getExcercise(11);
    }
    
    public boolean getA13(){
        return getExcercise(12);
    }
    
    public boolean getA14(){
        return getExcercise(13);
    }
    
    public boolean getA15(){
        return getExcercise(14);
    }
    
    public boolean getA16(){
        return getExcercise(15);
    }
    
    public boolean getA17(){
        return getExcercise(16);
    }
    
    public boolean getA18(){
        return getExcercise(17);
    }
    
    public boolean getA19(){
        return getExcercise(18);
    }
    
    public boolean getA20(){
        return getExcercise(19);
    }
    
    public boolean getA21(){
        return getExcercise(20);
    }
    
    public void setA1(boolean done){
        System.out.println("sad :(");
        setExcercise(0, done);
    }
    
    public void setA2(boolean done){
        setExcercise(1, done);
    }
    
    public void setA3(boolean done){
        setExcercise(2, done);
    }
    
    public void setA4(boolean done){
        setExcercise(3, done);
    }
    
    public void setA5(boolean done){
        setExcercise(4, done);
    }
    
    public void setA6(boolean done){
        setExcercise(5, done);
    }
    
    public void setA7(boolean done){
        setExcercise(6, done);
    }
    
    public void setA8(boolean done){
        setExcercise(7, done);
    }
    
    public void setA9(boolean done){
        setExcercise(8, done);
    }
    
    public void setA10(boolean done){
        setExcercise(9, done);
    }
    
    public void setA11(boolean done){
        setExcercise(10, done);
    }
    
    public void setA12(boolean done){
        setExcercise(11, done);
    }
    
    public void setA13(boolean done){
        setExcercise(12, done);
    }
    
    public void setA14(boolean done){
        setExcercise(13, done);
    }
    
    public void setA15(boolean done){
        setExcercise(14, done);
    }
    
    public void setA16(boolean done){
        setExcercise(15, done);
    }
    
    public void setA17(boolean done){
        setExcercise(16, done);
    }
    
    public void setA18(boolean done){
        setExcercise(17, done);
    }
    
    public void setA19(boolean done){
        setExcercise(18, done);
    }
    
    public void setA20(boolean done){
        setExcercise(19, done);
    }
    
    public void setA21(boolean done){
        setExcercise(20, done);
    }

    @Override
    public String toString() {
        StringBuilder palautus = new StringBuilder();
        palautus.append("viikko "+week+": tehtyjä tehtäviä yhteensä: ");
        
        int doneAmount = 0;
        StringBuilder done = new StringBuilder();
        
        for (int i = 0; i < excercises.length; i++) {
            System.out.println(excercises[i]);
            
            if(excercises[i]){
                doneAmount++;
                done.append(i).append(" ");
            }
        }
        
        palautus.append(doneAmount).append(" aikaa kului: ").append(hours)
                .append(", tehdyt tehtävät: ").append(done);
        
        return palautus.toString();
    }
    
}