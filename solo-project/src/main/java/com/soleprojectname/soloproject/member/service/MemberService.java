package com.soleprojectname.soloproject.member.service;

import com.soleprojectname.soloproject.member.entity.Member;

import java.util.List;


public interface MemberService {


    Member memberPost(Member member);

    Member memberPatch(Member member);

    Member memberSearch(Long memberId);



    void memberDelete(Long memberId);
}
