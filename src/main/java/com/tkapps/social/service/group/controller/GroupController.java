package com.tkapps.social.service.group.controller;

import com.tkapps.social.service.group.model.DTO.GroupDTO;
import com.tkapps.social.service.group.model.Group;
import com.tkapps.social.service.group.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/group")
public class GroupController {

    @Autowired
    GroupService groupService;

    @GetMapping("")
    public List<Group> findAll() {
        return groupService.findAll();
    }

    @GetMapping("/{id}")
    public Group findByGroupId(@PathVariable("id") int id) { return groupService.findByGroupId(id); }

    @PostMapping("")
    public Group save(@RequestBody GroupDTO groupDTO) {
        return groupService.save(groupDTO);
    }
}
