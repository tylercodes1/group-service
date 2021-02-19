package com.tkapps.social.service.group.repo;

import com.tkapps.social.service.group.model.MessageGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepo extends JpaRepository<MessageGroup, Integer> {
    MessageGroup findByGroupId(int id);
}
