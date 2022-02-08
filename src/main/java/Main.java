import io.javalin.Javalin;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {

    static String getDate(){

        Date date = new Date();
      
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        return formatter.format(date);
    }

    static String getPlanet(){
      String planet = "Earth.";
      return planet;
    }

    public static void main(String[] args) {

        Javalin app = Javalin.create().start(4100);

        app.get("/", ctx -> ctx.result("The time is " + getDate()));

    }
}
