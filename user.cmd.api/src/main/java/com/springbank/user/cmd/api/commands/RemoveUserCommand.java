package com.springbank.user.cmd.api.commands;

import com.springbank.user.core.models.User;
import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

/**
 * @author caci
 * @since 29.06.2022
 */

@Data
public class RemoveUserCommand {
    @TargetAggregateIdentifier
    private String id;
}
