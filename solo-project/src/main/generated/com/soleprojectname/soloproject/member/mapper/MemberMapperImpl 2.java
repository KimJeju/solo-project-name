package com.soleprojectname.soloproject.member.mapper;

import com.soleprojectname.soloproject.member.dto.MemberDto;
import com.soleprojectname.soloproject.member.entity.Member;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-16T15:28:06+0900",
    comments = "version: 1.5.1.Final, compiler: javac, environment: Java 11.0.15 (Azul Systems, Inc.)"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Override
    public Member memberPostDtoToMember(MemberDto.Post post) {
        if ( post == null ) {
            return null;
        }

        Member member = new Member();

        member.setName( post.getName() );
        member.setPassword( post.getPassword() );
        member.setSex( post.getSex() );
        member.setCompany_name( post.getCompany_name() );

        return member;
    }

    @Override
    public Member memberPatchDtoTOMember(MemberDto.Patch patch) {
        if ( patch == null ) {
            return null;
        }

        Member member = new Member();

        member.setMemberId( patch.getMemberId() );
        member.setName( patch.getName() );
        member.setPassword( patch.getPassword() );
        member.setSex( patch.getSex() );
        member.setCompany_name( patch.getCompany_name() );

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
