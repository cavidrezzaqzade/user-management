package com.springbank.user.core.events;

import com.springbank.user.core.models.User;
import lombok.Builder;
import lombok.Data;

/**
 * @author caci
 * @since 29.06.2022
 */

@Data
@Builder
public class UserUpdatedEvent {
    private String id;
    private User user;
}
