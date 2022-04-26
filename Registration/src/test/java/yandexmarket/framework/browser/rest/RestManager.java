package yandexmarket.framework.browser.rest;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import yandexmarket.Utils.ConfigFileReader;
import yandexmarket.project.poje.MyPost;

import java.util.ArrayList;
import java.util.List;


public class RestManager {
    private static ConfigFileReader configFileReader = ConfigFileReader.configFileReader;
    private static String POSTS = "posts";
    private static String ID = "id";



    public static String getURL(String endPoint) {
        return String.format("%s/%s", configFileReader.getApplicationUrl(), endPoint);
    }

    public static HttpResponse<JsonNode> getAllPosts() {
        return Unirest.get(getURL(POSTS)).asJson();
    }

    public static HttpResponse<JsonNode> getPostById(int id) {
        return Unirest.get(String.format("%s/%d", getURL(POSTS), id)).asJson();
    }

    public static void main(String[] args) {
        JSONArray arrJson = getAllPosts().getBody().getArray();
        List<MyPost> myPosts = new ArrayList<>();
        for (int i = 0; i < arrJson.length(); i++) {
            arrJson.getJSONObject(0).toString();
        }
    }
}
        /*String url = "https://jsonplaceholder.typicode.com/posts";
        HttpResponse<JsonNode> response = Unirest.get(url).asJson();
        System.out.println(response.getStatus());
        System.out.println(response.getBody().toPrettyString());
        JSONArray array = response.getBody().getArray();
        for (int i = 0; i < array.length(); i++) {
            System.out.println(array.get(i).toString());
        }
        System.out.println(getPostById(20).getBody().toPrettyString());
    }

}*/