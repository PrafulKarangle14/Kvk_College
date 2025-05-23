package com.example.demo.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.demo.customexception.UserException;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

       @Value("${admin.username}")
       private String adminUsername;

       @Value("${admin.password}")
       private String adminPassword;
      public static final Logger logger=LoggerFactory.getLogger(UserService.class);
       

       private final UserRepository userRepository;

      public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        
       }
    
      public void registerUser(String username, String password, String email) throws Exception {
         if (userRepository.existsByUsername(username)) {
        	logger.error("user name is invaild");
            throw new UserException("Username already exists");
        }

        User user = new User();
        user.setUsername(username);
        user.setPassword(password); // Ideally hash the password
        user.setEmail(email);

        userRepository.save(user);
    }

     public String loginUser(String username, String password) {
        // Check if admin
        if (adminUsername.equals(username) && adminPassword.equals(password)) {
            return "index";    // Redirect admin to admin dashboard
        }

        // Check if user exists
        User user = userRepository.findByUsername(username);
        if (user == null || !user.getPassword().equals(password)) {
        	logger.error("user name is invaild");
            throw new UserException("Invalid username or password");
        }
        if (user != null && user.getPassword().equals(password)) {
			return "kvk"; // Successful login
		}
        return "register"; // If not registered, go to registration  // Redirect user to home page
        

        // Invalid login
       // Redirect to login with error message
     }
    
    public List<User> getAllUsers()
    {
        return userRepository.findAll();
    }
    
    public User getUserByUsername(String searchUsername)
    {
        return userRepository.findByUsername(searchUsername);
    }
    

	
}

