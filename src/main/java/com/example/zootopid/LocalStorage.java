package com.example.zootopid;

import com.zootopid.client.User;

public class LocalStorage {
    private static final LocalStorage instance = new LocalStorage();

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static LocalStorage getInstance() {
        return instance;
    }
}
