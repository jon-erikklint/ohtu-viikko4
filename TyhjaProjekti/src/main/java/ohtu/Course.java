package ohtu;

public class Course {
    
    private String name;
    private String term;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }
    
    @Override
    public String toString(){
        return name+", "+term;
    }
}
