package com.tkapps.social.service.group.model.DTO;

import com.tkapps.social.service.group.model.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageGroupDTO {
    private String groupName;
    private List<Users> users;
}
