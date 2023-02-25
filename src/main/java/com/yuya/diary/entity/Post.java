package com.yuya.diary.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /* 出来事 */
    @Column(name = "event")
    private String event;

    /* 投稿日時 */
    @Column(name = "create_datetime", nullable = false)
    private LocalDateTime createDatetime;

    /* 気分 */
    @Column(name = "feeling")
    private String feeling;

    /* 感情 */
    @Column(name = "emotions")
    private String emotions;

    /* やったこと */
    @Column(name = "deed")
    private String deed;

    /* 明晰夢フラグ */
    @Column(name = "lucid_dream_flg")
    private Boolean lucidDream;

    /* 起床 */
    @Column(name = "awake")
    private String awake;

    /* ベッドにいる */
    @Column(name = "inBed")
    private String inBed;

    /* 不明な睡眠 */
    @Column(name = "asleep_unspesified")
    private String asleepUnspesified;

    /* 浅い睡眠 */
    @Column(name = "asleep_core")
    private String asleepCore;

    /* 熟睡中 */
    @Column(name = "asleep_deep")
    private String asleepDeep;

    /* レム睡眠 */
    @Column(name = "asleep_rem")
    private String asleepRem;

    /* 睡眠時間 */
    @Column(name = "asleep_time")
    private String asleepTime;

    /* 気づいたこと */
    @Column(name = "noticed")
    private String noticed;

    /* 食べたもの */
    @Column(name = "ate_today")
    private String ateToday;
}
