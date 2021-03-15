package com.tkapps.social.service.group.model.DTO;

import com.tkapps.social.service.group.model.MessageGroup;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersDTO {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private List<MessageGroup> messageGroups;
}
