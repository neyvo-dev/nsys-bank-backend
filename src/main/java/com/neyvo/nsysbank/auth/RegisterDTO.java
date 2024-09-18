package com.neyvo.nsysbank.auth;

import com.neyvo.nsysbank.user.UserRole;

public record RegisterDTO(
    String login,
    String password,
    UserRole role
) {

}
