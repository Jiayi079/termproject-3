import com.google.gson.*;

import java.io.IOException;
import java.nio.file.*;

class MyDto {
    public String a;
    public String b;

    public MyDto(String a, String b) {
        this.a = a;
        this.b = b;
    }
}

public class GsonTest {
    public static void main(String[] args) throws IOException {
//        Gson gson = new Gson();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        // Java Object -> Json String
        MyDto myDto = new MyDto("Hello", "World");
        String jsonString = gson.toJson(myDto);
        System.out.println(jsonString);

        // Read in a Json file -> Java Object
        String fileContents = new String(Files.readAllBytes(Paths.get("src/myDto.json")));
        MyDto myNewDto = gson.fromJson(fileContents, MyDto.class);
        System.out.println(myNewDto.a);
        System.out.println(myNewDto.b);
    }
}
