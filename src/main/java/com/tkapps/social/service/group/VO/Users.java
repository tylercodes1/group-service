package com.tkapps.social.service.group.VO;

import com.tkapps.social.service.group.model.MessageGroup;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    @ManyToMany(mappedBy = "users")
    private Set<MessageGroup> messageGroups = new HashSet<MessageGroup>();
}
