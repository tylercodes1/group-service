package com.tkapps.social.service.group.controller;

import com.tkapps.social.service.group.model.DTO.MessageGroupDTO;
import com.tkapps.social.service.group.model.MessageGroup;
import com.tkapps.social.service.group.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/group")
public class GroupController {

    @Autowired
    GroupService groupService;

    @GetMapping("")
    public List<MessageGroup> findAll() {
        return groupService.findAll();
    }

    @GetMapping("/{id}")
    public MessageGroup findByGroupId(@PathVariable("id") int id) {
        return groupService.findByGroupId(id);
    }

//    @GetMapping("/groupusers/{id}")
//    public RestTemplateVO getUserWithMessageGroup(@PathVariable("id") int id) { return groupService.findUserMessageGroupById(id); }

    @PostMapping("")
    public MessageGroup save(@RequestBody MessageGroupDTO groupDTO) {
        return groupService.save(groupDTO);
    }


}
