package com.tkapps.social.service.group.VO;

import com.tkapps.social.service.group.model.DTO.MessageGroupDTO;
import com.tkapps.social.service.group.model.MessageGroup;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {

    private User recipient;
    private User sender;
    private MessageGroup messageGroup;
}
