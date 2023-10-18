package com.ms.user.repositories;

import com.ms.user.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


/**Assim, poderemos utilizar todos os beneficios que o JPA Spring
 * nos proporcionam.
 * */
public interface UserRepository extends JpaRepository<UserModel, UUID> {
}
