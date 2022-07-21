package com.sts.curse.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.sts.curse.entities.User;

public interface UserRepository extends JpaRepositoryImplementation<User, Long> {

}
