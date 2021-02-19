package com.tkapps.social.service.group.service;

import com.tkapps.social.service.group.model.DTO.GroupDTO;
import com.tkapps.social.service.group.model.Group;
import com.tkapps.social.service.group.repo.GroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {

    @Autowired
    private GroupRepo groupRepo;

    public Group save(GroupDTO groupDTO) {
        Group group = new Group(0, groupDTO.getGroupName());
        return groupRepo.save(group);
    }

    public List<Group> findAll() {
        return groupRepo.findAll();
    }

    public Group findByGroupId(int id) { return groupRepo.findByGroupId(id); }
}
