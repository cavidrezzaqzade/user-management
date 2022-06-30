package com.springbank.user.query.api.repositories;

import com.springbank.user.core.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author caci
 * @since 29.06.2022
 */

public interface UserRepository extends MongoRepository<User, String> {
}
