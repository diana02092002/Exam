package yandexmarket.Utils;

import com.google.gson.Gson;
import kong.unirest.JsonNode;
import org.apache.commons.io.FileUtils;
import yandexmarket.project.poje.MyPost;

import java.io.File;
import java.io.IOException;

public class JsonUtils {

    private static Gson gson = new Gson();
    public static MyPost getMyPostByJsonText(String jsonText){
      return gson.fromJson(jsonText,MyPost.class) ;
    }
    public static String getExpectedJSONObject() throws IOException {
        String path = JsonUtils.class.getClassLoader().getResource("my_post.json").getFile();
        JsonNode node = new JsonNode(FileUtils.readFileToString(new File(path)));
        return node.getObject().toString();
    }

}
