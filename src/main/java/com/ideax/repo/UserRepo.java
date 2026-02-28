package com.ideax.repo;

import com.ideax.dto.UserDto;
import org.jdbi.v3.core.Jdbi;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepo{

    private final Jdbi jdbi;

    public UserRepo(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    public void save(String email, String password) {
        jdbi.useHandle(handle ->
                handle.execute(
                        "INSERT INTO users(email, password) VALUES (?, ?)",
                        email, password
                )
        );
    }

    public Optional<UserDto> findByEmail(String email) {
        return jdbi.withHandle(handle ->
                handle.createQuery("SELECT * FROM users WHERE email = ?")
                        .bind(0, email)
                        .mapToBean(UserDto.class)
                        .findOne()
        );
    }
}
