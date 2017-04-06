package ohtu;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.http.client.fluent.Request;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.work(args);
    }
    
    public void work(String[] args){
        String studentNr = "012345678";
        
        
        if ( args.length>0) {
            studentNr = args[0];
        }

        String studentUrl = "http://ohtustats2017.herokuapp.com/students/"+studentNr+"/submissions";
        String courseUrl = "https://ohtustats2017.herokuapp.com/courses/1.json";

        Submission[] subs = (Submission[]) fetch(studentUrl, Submission[].class);
        Course course = (Course) fetch(courseUrl, Course.class);
        
        tulostaKurssinTiedot(course);
        tulostaOpiskelijanTiedot(subs, studentNr);
    }
    
    private Object fetch(String url, Class made){
        String bodyText = getBodyText(url);
        return unpack(bodyText, made);
    }
    
    private String getBodyText(String url){
        String bodyText;
        
        try{
            bodyText = Request.Get(url).execute().returnContent().asString();
        }catch(Exception e){
            bodyText = "";
        }
        
        return bodyText;
    }
    
    private Object unpack(String bodyText, Class clas){
        Gson mapper = new Gson();
        Object object = mapper.fromJson(bodyText, clas);
        
        return object;
    }
    
    private void tulostaOpiskelijanTiedot(Submission[] subs, String studentNr){
        System.out.println("opiskelijanumero: "+studentNr+"\n");
        int tehdytTehtavat = 0;
        int kaytettyAika = 0;
        
        for (Submission submission : subs) {
            System.out.println(submission);
            tehdytTehtavat += submission.tehtavamaara();
            kaytettyAika += submission.getHours();
        }
        
        System.out.println("\nyhteensä: "+tehdytTehtavat+" tehtävää "+kaytettyAika+" tuntia");
    }
    
    private void tulostaKurssinTiedot(Course course){
        System.out.println("Kurssi: "+course+"\n");   
    }
}
