package com.talentful.repos;

import com.talentful.models.User;

public class UserRepo extends AbstractRepo<User> {

    public UserRepo() {
        super();
        // the following adds an "admin" user with password "adminpassword"
        save(new User("admin", "6uiJztoUUrNFVbK1K58F0ooejtjV3IxiNiuQ7kl0avG5m/U8s+WDI9KcHcxbEgPkX4JNENh7GmO51u7Fmi9nQA=="));
    }
}
