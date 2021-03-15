package com.tkapps.social.service.group.model;

import com.tkapps.social.service.group.model.MessageGroup;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    @ManyToMany(mappedBy = "users")
    private List<MessageGroup> messageGroups;
}
