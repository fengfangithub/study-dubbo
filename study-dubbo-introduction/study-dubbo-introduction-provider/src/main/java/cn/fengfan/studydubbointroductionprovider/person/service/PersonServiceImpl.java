package cn.fengfan.studydubbointroductionprovider.person.service;

import cn.fengfan.studydubbointroductionapi.person.dto.PersonDTO;
import cn.fengfan.studydubbointroductionapi.person.service.PersonService;
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
