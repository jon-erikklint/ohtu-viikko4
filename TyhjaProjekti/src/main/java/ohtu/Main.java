package ohtu;

import com.google.gson.Gson;
import org.apache.http.client.fluent.Request;

public class Main {

    public static void main(String[] args) {
        String studentNr = "012345678";
        
        
        if ( args.length>0) {
            studentNr = args[0];
        }

        String url = "http://ohtustats2017.herokuapp.com/students/"+studentNr+"/submissions";

        String bodyText;
        
        try{
            bodyText = Request.Get(url).execute().returnContent().asString();
        }catch(Exception e){
            bodyText = "";
        }
         

        System.out.println("json-muotoinen data:");
        System.out.println( bodyText );

        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);
        
        System.out.println("Oliot:");
        for (Submission submission : subs) {
            System.out.println(submission);
        }
        
    }
}
