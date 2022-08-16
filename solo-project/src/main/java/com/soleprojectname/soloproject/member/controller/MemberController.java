package com.soleprojectname.soloproject.member.controller;


import com.soleprojectname.soloproject.member.dto.MemberDto;
import com.soleprojectname.soloproject.member.entity.Member;
import com.soleprojectname.soloproject.member.mapper.MemberMapper;
import com.soleprojectname.soloproject.member.service.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/solo")
public class MemberController {


    @Autowired
    private MemberServiceImpl memberService;

    @Autowired
    private MemberMapper mapper;

    public MemberController(MemberServiceImpl memberService, MemberMapper mapper) {
        this.memberService = memberService;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity postMember(@RequestBody MemberDto.Post member){
        Member memberPost = mapper.memberPostDtoToMember(member);
        System.out.println(memberPost);

        Member postMember = memberService.memberPost(memberPost);
        MemberDto.Response response = mapper.memberToMemberResponseDto(postMember);

        return new ResponseEntity<>(response, HttpStatus.CREATED);

    }

    @PatchMapping("/{member_id}")
    public ResponseEntity<Member> patchMember(@PathVariable("member_id") Long memberId,@RequestBody MemberDto.Patch requestBody){
       requestBody.setMemberId(memberId);

       Member patchMember = memberService.memberPatch(mapper.memberPatchDtoTOMember(requestBody));

       return new ResponseEntity<>(patchMember,HttpStatus.OK);
    }

    @GetMapping("/{member_id}")
    public ResponseEntity<Member> getMember(@PathVariable("member_id") Long memberId){
        Member getMember = memberService.memberSearch(memberId);

        return new ResponseEntity<>(getMember,HttpStatus.OK);
    }

    @DeleteMapping("/{member_id}")
    public ResponseEntity<Member> deleteMember(@PathVariable("member_id") Long memberId){
        memberService.memberDelete(memberId);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }




}
