package com.tkapps.social.service.group.service;

import com.tkapps.social.service.group.VO.ResponseTemplateVO;
import com.tkapps.social.service.group.VO.User;
import com.tkapps.social.service.group.model.DTO.MessageGroupDTO;
import com.tkapps.social.service.group.model.MessageGroup;
import com.tkapps.social.service.group.repo.GroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class GroupService {

    @Autowired
    private GroupRepo groupRepo;

    @Autowired
    private RestTemplate restTemplate;

    public MessageGroup save(MessageGroupDTO groupDTO) {
        MessageGroup group = new MessageGroup(0, groupDTO.getGroupName(), groupDTO.getRecipientId(), groupDTO.getSenderId());
        return groupRepo.save(group);
    }

    public List<MessageGroup> findAll() {
        return groupRepo.findAll();
    }

    public MessageGroup findByGroupId(int id) { return groupRepo.findByGroupId(id); }

    public ResponseTemplateVO getGroupWithUsers(int groupId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        MessageGroup group = groupRepo.findByGroupId(groupId);
        int recipientId = group.getRecipientId();
        int senderId = group.getSenderId();

        System.out.println("recipientId: " + recipientId);
        System.out.println("senderId: " + senderId);

        User recipient = restTemplate.getForObject("https://user-service-tk.herokuapp.com/users/"+recipientId,User.class);
        User sender = restTemplate.getForObject("https://user-service-tk.herokuapp.com/users/"+senderId,User.class);

        vo.setMessageGroup(group);
        vo.setRecipient(recipient);
        vo.setSender(sender);

        return vo;
    }
}
