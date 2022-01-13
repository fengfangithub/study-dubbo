package com.fengfan.sbd.test;

import com.fengfan.sbd.person.dto.PersonDTO;
import com.fengfan.sbd.person.service.PersonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by fengfan on 2021/12/7 17:47
 */
@RestController
@RequestMapping("test/testController")
public class TestController {

    @Resource
    private PersonService personService;

    @RequestMapping("queryOneTest")
    public PersonDTO queryOneTest() {
        return personService.queryOne();
    }

}
