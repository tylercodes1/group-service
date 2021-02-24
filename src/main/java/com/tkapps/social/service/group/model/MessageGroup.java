package com.tkapps.social.service.group.model;

import com.tkapps.social.service.group.VO.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
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
//            (cascade = {CascadeType.ALL}) for later
    @JoinTable(
        name = "group_users",
        joinColumns = {
                @JoinColumn(name = "group_id")
        },
        inverseJoinColumns = {
                @JoinColumn(name = "project_id")
        }
    )
    private Set<User> users = new HashSet<User>();
}
