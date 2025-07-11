package com.mathdenizi.notes.services;

import com.mathdenizi.notes.dtos.UserDTO;
import com.mathdenizi.notes.models.User;

import java.util.List;

/**
 * Created by mathdenizi
 * Date: 29.06.25
 */
public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);

    User findByUsername(String username);
}
