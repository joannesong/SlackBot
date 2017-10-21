package nyc.c4q.ramonaharrison.model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;


public class Attachments {

    // TODO: implement private fields for each of the following attachment JSON keys:
    private String fallback;
    private String color;
    private String pretext;
    private String author_name;
    private String author_link;
    private String author_icon;
    private String title;
    private String title_link;
    private String text;
    private ArrayList<Field> fields;
    private String image_url;
    private String thumb_url;
    private String footer;
    private String footer_icon;
    private long ts;

    public Attachments(JSONObject json) {
        // TODO: parse an attachment from the incoming json
        if (json.get("fallback") != null) {
            this.fallback = (String) json.get("fallback");
        }
        if (json.get("color") != null) {
            this.color = (String) json.get("color");
        }
        if (json.get("pretext") != null) {
            this.pretext = (String) json.get("pretext");
        }
        if (json.get("author_name") != null) {
            this.author_name = (String) json.get("author_name");
        }
        if (json.get("author_link") != null) {
            this.author_link = (String) json.get("author_link");
        }
        if (json.get("author_icon") != null) {
            this.author_icon = (String) json.get("author_icon");
        }
        if (json.get("title") != null) {
            this.title = (String) json.get("title");
        }
        if (json.get("title_link") != null) {
            this.title_link = (String) json.get("title_link");
        }
        if (json.get("text") != null) {
            this.text = (String) json.get("text");
        }
        if (json.containsKey("fields")) {
            JSONArray jsonFields = (JSONArray) json.get("fields"); //casting this object to a JSON array
            this.fields = new ArrayList<Field>();
            for (int i = 0; i < jsonFields.size(); i++) {
                Field field = new Field((JSONObject) jsonFields.get(i));
                this.fields.add(field);
            }
            if (json.get("image_url") != null) {
                this.image_url = (String) json.get("image_url");
            }
            if (json.get("thumb_url") != null) {
                this.thumb_url = (String) json.get("thumb_url");
            }
            if (json.get("footer") != null) {
                this.footer = (String) json.get("footer");
            }
            if (json.get("footer_icon") != null) {
                this.footer_icon = (String) json.get("footer_icon");
            }
            if (json.get("ts") != null) {
                this.ts = (long) json.get("ts");
            }
        }

    }
    public String getfallback(){
        return fallback;
    }
    public String getcolor(){
        return color;
    }
    public String getpretext(){
        return pretext;
    }
    public String getauthod_name(){
        return author_name;
    }
    public String getauthor_link(){
        return author_link;
    }
    public String getauthor_icon(){
        return author_icon;
    }
    public String gettitle(){
        return title;
    }
    public String gettext(){
        return text;
    }
    public ArrayList<Field> getfields(){
        return fields;
    }
    public String getimage_url(){
        return image_url;
    }
    public String getthumb_url(){
        return thumb_url;
    }
    public String getfooter(){
        return footer;
    }
    public String getfooter_icon(){
        return footer_icon;
    }
    public Long getts(){
        return ts;
    }
}