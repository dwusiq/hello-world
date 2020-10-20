
/**
 * Copyright 2014-2020  the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.wusiq;

import com.wusiq.dao.entity.TbMessage;
import com.wusiq.dao.entity.TbMessageExample;
import com.wusiq.dao.mapper.TbMessageMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "hello")
public class HelloController {

    @Autowired
    private TbMessageMapper messageMapper;

    @Value("${spring.datasource.url}")
    private String dbUrl;

    /**
     * 获取验证码
     */
    @GetMapping
    public String hello() throws Exception {
        log.info("start exec method[hello]");
        return "hello";
    }

    @GetMapping(value = "/dbUrl")
    public String getDbUrl() {
        log.info("start exec method[getDbUrl]");
        return dbUrl;
    }

    @GetMapping(value = "/messageList")
    public List<TbMessage> messageList() {
        log.info("start exec method[messageList]");
        TbMessageExample example = new TbMessageExample();
        return messageMapper.selectByExample(example);
    }

}
