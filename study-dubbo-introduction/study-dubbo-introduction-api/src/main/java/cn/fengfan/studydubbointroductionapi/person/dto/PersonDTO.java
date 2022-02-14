package cn.fengfan.studydubbointroductionapi.person.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by fengfan on 2021/12/6 16:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO implements Serializable {
    private static final long serialVersionUID = -1995065065585230743L;
    private String name;
    private String sex;
}
