package com.yuya.diary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yuya.diary.entity.Diary;

public interface DiaryRepository extends JpaRepository<Diary, Integer> {
    
}
