package ru.aston.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.aston.model.User;

import java.io.FileWriter;
import java.io.IOException;

@Service
public class UserService {

    @Value("${user.data.path}")
    private String userDataPath;

    public User registerUser(User user) {
        User result;
        try {
            String newUser = user.getUsername() + ":" + user.getPassword() + "\n";
            FileWriter writer =  new FileWriter(userDataPath, true);
            writer.write(newUser);
            writer.flush();
            writer.close();
            result = user;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
