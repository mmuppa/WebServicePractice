package edu.uw.tacoma.mmuppa.webservicepractice;

import java.util.*;

/**
 * Created by mmuppa on 10/23/15.
 */
public class User {

    /**
     * An array of user items.
     */
    public static List<UserInfo> ITEMS = new ArrayList<UserInfo>();

    /**
     * A map of user items, by email.
     */
    public static Map<String, UserInfo> ITEM_MAP = new HashMap<String, UserInfo>();


    private static void addItem(UserInfo item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.email, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class UserInfo {
        public String email;
        public String pwd;

        public UserInfo(String email, String pwd) {
            this.email = email;
            this.pwd = pwd;
        }

        @Override
        public String toString() {
            return email;
        }
    }
}

