package cn.fengfan.studydubbointroductionapi.person.service;

import cn.fengfan.studydubbointroductionapi.person.dto.PersonDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by fengfan on 2021/12/6 16:24
 */
@FeignClient(name = "study-springboot-dubbo", path = "/study/person")
public interface PersonService {

    @PostMapping("/api/person/queryOne")
    PersonDTO queryOne();

}
