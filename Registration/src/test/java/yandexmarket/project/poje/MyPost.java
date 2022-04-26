package yandexmarket.project.poje;

import com.google.gson.Gson;

public class MyPost {private int userID;
    private int ID;
    private String title;
    private String body;

    public MyPost(int userID, int ID, String title, String body) {
        this.userID = userID;
        this.ID = ID;
        this.title = title;
        this.body = body;
    }

    public int getUserID(){
        return userID;
    }
    public int getID(){
        return ID;
    }
    public String getTitle(){
        return title;
    }
    public String getBody(){
        return body;
    }

    public static void main(String[] args) {
        Gson gson = new Gson();
        String jsonText = " {\n" +
                "    \"userId\": 1,\n" +
                "    \"id\": 2,\n" +
                "    \"title\": \"qui est esse\",\n" +
                "    \"body\": \"est rerum tempore vitae\\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\\nqui aperiam non debitis possimus qui neque nisi nulla\"\n" +
                "  },";
        MyPost myPost = gson.fromJson(jsonText,MyPost.class);

    }



}
