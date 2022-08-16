package com.soleprojectname.soloproject.member.mapper;

import com.soleprojectname.soloproject.member.dto.MemberDto;
import com.soleprojectname.soloproject.member.entity.Member;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-16T15:54:22+0900",
    comments = "version: 1.5.1.Final, compiler: javac, environment: Java 11.0.15 (Azul Systems, Inc.)"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Override
    public Member memberPostDtoToMember(MemberDto.Post post) {
        if ( post == null ) {
            return null;
        }

        String name = null;
        String password = null;
        Member.Sex sex = null;
        String company_name = null;

        name = post.getName();
        password = post.getPassword();
        sex = post.getSex();
        company_name = post.getCompany_name();

        Long memberId = null;

        Member member = new Member( memberId, name, password, sex, company_name );

        return member;
    }

    @Override
    public Member memberPatchDtoTOMember(MemberDto.Patch patch) {
        if ( patch == null ) {
            return null;
        }

        Long memberId = null;
        String name = null;
        String password = null;
        Member.Sex sex = null;
        String company_name = null;

        memberId = patch.getMemberId();
        name = patch.getName();
        password = patch.getPassword();
        sex = patch.getSex();
        company_name = patch.getCompany_name();

        Member member = new Member( memberId, name, password, sex, company_name );

        return member;
    }

    @Override
    public MemberDto.Response memberToMemberResponseDto(Member member) {
        if ( member == null ) {
            return null;
        }

        MemberDto.Response response = new MemberDto.Response();

        return response;
    }
}
