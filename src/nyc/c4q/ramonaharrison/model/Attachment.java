package nyc.c4q.ramonaharrison.model;

import org.json.simple.JSONObject;



public class Attachment {



    public Attachment(JSONObject json) {



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
    public ArrayList<Fields> getfields(){
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
