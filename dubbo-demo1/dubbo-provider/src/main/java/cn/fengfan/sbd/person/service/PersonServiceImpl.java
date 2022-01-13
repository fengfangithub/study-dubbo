package cn.fengfan.sbd.person.service;

import cn.fengfan.sbd.person.dto.PersonDTO;
import org.springframework.stereotype.Service;

/**
 * Created by fengfan on 2021/12/6 16:36
 */
@Service
public class PersonServiceImpl implements PersonService {

    public PersonDTO queryOne() {
        return new PersonDTO("张三", "男");
    }
}
