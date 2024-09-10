package com.varchar6.petcast.servicemember.domain.member.command.application.vo.request;

import com.varchar6.petcast.servicemember.domain.member.command.domain.aggregate.Gender;
import lombok.Data;

import java.util.Objects;

@Data
public class ProfileUpdateReqVO {

    private String introduction;

    private String petName;
    private int age;
    private Gender gender;
}
