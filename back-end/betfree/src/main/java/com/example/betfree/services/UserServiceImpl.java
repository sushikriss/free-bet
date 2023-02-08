package com.example.betfree.services;

import com.example.betfree.entities.User;
import com.example.betfree.repository.UserRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private SessionFactory sessionFactory;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserById(Long id) {
//        Session session = sessionFactory.openSession();
//        try {
//            Transaction transaction = session.beginTransaction();
//            return session.get(User.class, id);
//        }
//        finally {
//            session.close();
//        }
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {
    }
}
