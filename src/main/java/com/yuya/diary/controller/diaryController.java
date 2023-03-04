package com.yuya.diary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yuya.diary.entity.Post;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
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

    // 指定されたidの日記を削除する
    @PostMapping("delete")
    public String delete(@RequestParam Integer id) {
        postRepository.deleteById(id);
        return "redirect:/diary/index";
    }

}
