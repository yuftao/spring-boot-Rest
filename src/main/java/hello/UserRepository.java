package hello;

import org.springframework.data.repository.CrudRepository;

import hello.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

// This is the repository interface, this will be automatically implemented
// by Spring in a bean with the same name with changing case The bean name will be userRepository
public interface UserRepository extends CrudRepository<User, Long> {

}
