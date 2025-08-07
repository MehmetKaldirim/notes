package com.mathdenizi.notes.services;

import com.mathdenizi.notes.dtos.UserDTO;
import com.mathdenizi.notes.models.Role;
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

    void updateAccountLockStatus(Long userId, boolean lock);

    List<Role> getAllRoles();

    void updateAccountExpiryStatus(Long userId, boolean expire);

    void updateAccountEnabledStatus(Long userId, boolean enabled);

    void updateCredentialsExpiryStatus(Long userId, boolean expire);

    void updatePassword(Long userId, String password);

    void generatePasswordResetToken(String email);

    void resetPassword(String token, String newPassword);
}
