package com.soleprojectname.soloproject.member.controller;


import com.google.gson.Gson;
import com.soleprojectname.soloproject.company.Company;
import com.soleprojectname.soloproject.member.dto.MemberDto;
import com.soleprojectname.soloproject.member.entity.Member;
import com.soleprojectname.soloproject.member.mapper.MemberMapper;
import com.soleprojectname.soloproject.member.service.MemberServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.jpa.mapping.JpaMetamodelMappingContext;
import org.springframework.http.MediaType;
import org.springframework.restdocs.payload.JsonFieldType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.patch;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.post;
import static org.springframework.restdocs.payload.PayloadDocumentation.*;
import static org.springframework.restdocs.request.RequestDocumentation.parameterWithName;
import static org.springframework.restdocs.request.RequestDocumentation.pathParameters;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MemberController.class)
@MockBean(JpaMetamodelMappingContext.class)
@AutoConfigureRestDocs
class MemberControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Autowired
    private Gson gson;

    @MockBean
    private MemberServiceImpl memberService;

    @MockBean
    private MemberMapper mapper;



    @Test
    void postMember() throws Exception{

        //given
        MemberDto.Post post = new MemberDto.Post("가깅","1234", Member.Sex.SEX_F,"더작은센터",new Company());
        String content = gson.toJson(post);

        MemberDto.Response response =
                new MemberDto.Response(1L,"가깅","1234",Member.Sex.SEX_F,"더작은센터",new Company());

        given(mapper.memberPostDtoToMember(Mockito.any(MemberDto.Post.class))).willReturn(new Member());
        given(memberService.memberPost(Mockito.any(Member.class))).willReturn(new Member());
        given(mapper.memberToMemberResponseDto(Mockito.any(Member.class))).willReturn(new MemberDto.Response());
    }

    @Test
    void patchMember() {
    }

    @Test
    void getMember() {
    }

    @Test
    void deleteMember() {
    }
}