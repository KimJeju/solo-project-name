package com.soleprojectname.soloproject.controller;


import com.soleprojectname.soloproject.entity.Member;
import com.soleprojectname.soloproject.service.MemberService;
import com.soleprojectname.soloproject.service.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/solo")
public class MemberController {


    @Autowired
    private MemberServiceImpl memberService;

    public MemberController(MemberServiceImpl memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    public ResponseEntity<Member> postMember(@RequestBody Member member){
        Member memberPost = memberService.memberPost(member);

        return new ResponseEntity<>(memberPost, HttpStatus.CREATED);
    }

    @PatchMapping("/{member-Id}")
    public ResponseEntity<Member> patchMember(@PathVariable("member_id") Long memberId,@RequestBody Member member){
       member.setMemberId(memberId);

       Member patchMember = memberService.memberPatch(member);

       return new ResponseEntity<>(patchMember,HttpStatus.OK);
    }

    @GetMapping("/{member-Id}")
    public ResponseEntity<Member> getMember(@PathVariable("member_id") Long memberId){
        Member getMember = memberService.memberSearch(memberId);

        return new ResponseEntity<>(getMember,HttpStatus.OK);
    }

    @DeleteMapping("/{member-id}")
    public ResponseEntity<Member> deleteMember(@PathVariable("member_id") Long memberId){
        memberService.memberDelete(memberId);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }




}
