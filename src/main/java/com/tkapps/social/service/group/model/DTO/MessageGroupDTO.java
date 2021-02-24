package com.tkapps.social.service.group.model.DTO;

import com.tkapps.social.service.group.VO.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageGroupDTO {
    private String groupName;
    private Set<User> users;
}
