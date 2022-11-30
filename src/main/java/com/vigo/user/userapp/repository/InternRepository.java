package com.vigo.user.userapp.repository;

import com.vigo.user.userapp.model.entity.Intern;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author : Obia Ugochukwu Vigo
 * email : ugochukwu.obia@teamapt.com
 * date : 01/12/2022
 **/
public interface InternRepository extends MongoRepository<Intern, Long> {
}
