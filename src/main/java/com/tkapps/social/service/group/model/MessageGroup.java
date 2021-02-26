package com.tkapps.social.service.group.model;

import com.tkapps.social.service.group.VO.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int groupId;
    private String groupName;

    @ManyToMany
    @JoinTable(
        name = "group_users",
        joinColumns = {
                @JoinColumn(name = "group_id")
        },
        inverseJoinColumns = {
                @JoinColumn(name = "user_id")
        }
    )
    private Set<Users> users = new HashSet<Users>();
}
