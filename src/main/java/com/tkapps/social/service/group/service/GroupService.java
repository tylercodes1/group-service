package com.tkapps.social.service.group.service;

import com.tkapps.social.service.group.model.DTO.MessageGroupDTO;
import com.tkapps.social.service.group.model.MessageGroup;
import com.tkapps.social.service.group.repo.GroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {

    @Autowired
    private GroupRepo groupRepo;

    public MessageGroup save(MessageGroupDTO groupDTO) {
        MessageGroup group = new MessageGroup(0, groupDTO.getGroupName(), groupDTO.getRecipientId(), groupDTO.getSenderId());
        return groupRepo.save(group);
    }

    public List<MessageGroup> findAll() {
        return groupRepo.findAll();
    }

    public MessageGroup findByGroupId(int id) { return groupRepo.findByGroupId(id); }
}
