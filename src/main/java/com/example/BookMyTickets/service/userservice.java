package com.example.BookMyTickets.service;



import com.example.BookMyTickets.RequestDTO.adduserDTO;
import com.example.BookMyTickets.models.Users;
import com.example.BookMyTickets.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userservice {

    @Autowired
    private userRepository userrepo;

    public String add_user(adduserDTO user)
    {
        Users user_en = Users.builder().age(user.getAge()).name(user.getName()).emailId(user.getEmailID()).build();
        userrepo.save(user_en);
        return "user with "+user_en.getName()+"is saved successfully";
    }
}
