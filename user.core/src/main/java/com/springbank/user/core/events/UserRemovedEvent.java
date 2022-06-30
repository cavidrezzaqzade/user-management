package com.springbank.user.core.events;

import com.springbank.user.core.models.User;
import lombok.Builder;
import lombok.Data;

/**
 * @author caci
 * @since 29.06.2022
 */

@Data
public class UserRemovedEvent {
    private String id;
}
