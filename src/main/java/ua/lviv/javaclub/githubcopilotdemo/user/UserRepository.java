package ua.lviv.javaclub.githubcopilotdemo.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Repository for User entity.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    /**
     * Find of all users.
     *
     * @return list of users
     */
    List<User> findAllBy();

    /**
     * Find of all users ids.
     *
     * @return list of users ids
     */
    List<Long> findAllIdsBy();
}
