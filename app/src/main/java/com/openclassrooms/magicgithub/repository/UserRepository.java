package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // TODO: modifié
        return apiService.getUsers();
    }

    public void generateRandomUser() {
        // TODO: modifié
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        // TODO: modifié
        apiService.deleteUser(user);
    }
}
