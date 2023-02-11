package com.yuya.diary.service;

import org.springframework.stereotype.Service;
import com.yuya.diary.entity.Diary;
import java.util.ArrayList;

@Service
public interface DiaryService {

    String greet(int i); // 挨拶を返す

    ArrayList<Diary> getAll(); // 全てのMemberを返す
}
