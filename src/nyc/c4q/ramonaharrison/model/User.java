package nyc.c4q.ramonaharrison.model;

import org.json.simple.JSONObject;
import sun.java2d.cmm.Profile;

/**
 * Created by Ramona Harrison
 * on 8/26/16
 *
 * A class representing a user.
 * See https://api.slack.com/types/user
 *
 */

public class User {

    // TODO: implement private fields for each of the following user JSON keys:
    private String id; // "id"
    private String name; // "name"
    private boolean deleted; // "deleted"
    private String color; // "color"
    private Profile profile; // "profile" *****
    private boolean is_admin;// "is_admin"
    private boolean is_owner; // "is_owner"
    private boolean  is_primary_owner; // "is_primary_owner"
    private boolean is_restricted; // "is_restricted"
    private boolean is_ultra_restricted;// "is_ultra_restricted"
    private boolean has_2fa; // "has_2fa"
    private String two_factor_type; // "two_factor_type" ********
    private boolean has_files;
    //The two_factor_type field is either app or sms. It will only be present if has_2fa is true.
    // "has_files"

    public User(JSONObject json) {
        // TODO: parse a user from the incoming json
        if (json.get("id") != null) {
            this.id = (String) json.get("id");
        }
    }

    // TODO add getters to access private fields


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public String getColor() {
        return color;
    }

    public boolean isIs_admin() {
        return is_admin;
    }

    public boolean isIs_owner() {
        return is_owner;
    }

    public boolean isIs_primary_owner() {
        return is_primary_owner;
    }

    public boolean isIs_restricted() {
        return is_restricted;
    }

    public boolean isIs_ultra_restricted() {
        return is_ultra_restricted;
    }

    public boolean isHas_2fa() {
        return has_2fa;
    }

    public String getTwo_factor_type() {
        return two_factor_type;
    }

    public boolean isHas_files() {
        return has_files;
    }
}
