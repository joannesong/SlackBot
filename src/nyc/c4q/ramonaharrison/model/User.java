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
    private boolean two_factor_type; // "two_factor_type" ********

    //The two_factor_type field is either app or sms. It will only be present if has_2fa is true.
    // "has_files"

    public User(JSONObject json) {
        // TODO: parse a user from the incoming json
        if (json.get("id") != null) {
            this.id = (String) json.get("id");
        }

        if (json.get("name") != null) {
            this.name = (String) json.get("name");
        }

        if (json.get("deleted") != null) {
            this.deleted = (Boolean) json.get("deleted");
        }

        if (json.get("color") != null) {
            this.color = (String) json.get("color");
        }

//        if (json.get("profile") != null) {
//            this.profile = new Profile((JSONObject) json.get("profile"));
//        }

        if (json.get("is_admin") != null) {
            this.is_admin = (Boolean) json.get("is_admin");
        }

        if (json.get("is_owner") != null) {
            this.is_owner = (Boolean) json.get("is_owner");
        }

        if (json.get("is_primary_owner") != null) {
            this.is_primary_owner = (Boolean) json.get("is_primary_owner");
        }

        if (json.get("is_restricted") != null) {
            this.is_restricted = (Boolean) json.get("is_restricted");
        }

        if (json.get("is_ultra_restricted") != null) {
            this.is_ultra_restricted = (Boolean) json.get("is_ultra_restricted");
        }

        if (json.get("has_2fa") != null) {
            this.has_2fa = (Boolean) json.get("has_2fa");
        }

        if (json.get("two_factor_type") != null) {
            this.two_factor_type = (Boolean) json.get("two_factor_type");
        }

    }

    public class Profile{

    }
    // TODO add getters to access private fields
}
