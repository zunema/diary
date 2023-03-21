package com.yuya.diary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.yuya.diary.dto.NewPostDto;

import com.yuya.diary.entity.Post;
import java.util.List;

import com.yuya.diary.repository.PostRepository;

@Controller
@RequestMapping("/diary")
public class diaryController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/index")
    public String index(Model model) {
        List<Post> diaryList = postRepository.findAll();
        model.addAttribute("diaryList", diaryList);
        return "diary/index";
    }

    /**
     * 新規投稿(仮)
     * 
     * @param newPostDto 入力データ
     * @param model      Model
     * @return 新規投稿一覧画面
     */
    @RequestMapping(value = "/newPost", method = RequestMethod.POST)
    public String newPost(@ModelAttribute NewPostDto newPostDto, Model model) {
        newPostDto.getEvent();
        return "redirect:/diary/index";
    }

    /**
     * 新規投稿ページ
     * @param id
     * @return
     */
    @GetMapping(value = "/create")
    public String create(Model model){
        return "diary/create";
    }

    /**
     * 削除
     * 
     * @param id 削除id
     * @return 新規投稿一覧画面
     */
    @PostMapping("delete")
    public String delete(@RequestParam Integer id) {
        postRepository.deleteById(id);
        return "redirect:/diary/index";
    }

}
