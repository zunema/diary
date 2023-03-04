package com.yuya.diary.dto;

import lombok.Data;

@Data
public class NewPostDto {

  /** 出来事 */
  private String event;

  /** 投稿日時 */
  private String createDatetime;

  /** 気分 */
  private String feeling;

  /** 感情 */
  private String emotions;

  /** やったこと */
  private String deed;

  /** 明晰夢フラグ */
  private Boolean lucidDream;

  /** 起床 */
  private String awake;

  /** ベッドにいる */
  private String inBed;

  /** 不明な睡眠 */
  private String asleepUnspesified;

  /** 浅い睡眠 */
  private String asleepCore;

  /** 熟睡中 */
  private String asleepDeep;

  /** レム睡眠 */
  private String asleepRem;

  /** 睡眠時間 */
  private String asleepTime;

  /** 気づいたこと */
  private String noticed;

  /** 食べたもの */
  private String ateToday;
}
