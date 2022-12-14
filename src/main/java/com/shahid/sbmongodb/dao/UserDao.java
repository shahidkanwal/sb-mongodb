package com.shahid.sbmongodb.dao;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.shahid.sbmongodb.model.User;


public interface UserDao extends MongoRepository<User,Integer>{

}
