/*
 * The Blue Alliance API v3
 * # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
 *
 * OpenAPI spec version: 3.04.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.thefletcher.tbaapi.v3client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Timeseries data for the 2018 game *FIRST* POWER UP. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This model is currently under active development and may change at any time, including in breaking ways.
 */
@ApiModel(description = "Timeseries data for the 2018 game *FIRST* POWER UP. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This model is currently under active development and may change at any time, including in breaking ways.")

public class MatchTimeseries2018 {
  @SerializedName("event_key")
  private String eventKey = null;

  @SerializedName("match_id")
  private String matchId = null;

  @SerializedName("mode")
  private String mode = null;

  @SerializedName("play")
  private Integer play = null;

  @SerializedName("time_remaining")
  private Integer timeRemaining = null;

  @SerializedName("blue_auto_quest")
  private Integer blueAutoQuest = null;

  @SerializedName("blue_boost_count")
  private Integer blueBoostCount = null;

  @SerializedName("blue_boost_played")
  private Integer blueBoostPlayed = null;

  @SerializedName("blue_current_powerup")
  private String blueCurrentPowerup = null;

  @SerializedName("blue_face_the_boss")
  private Integer blueFaceTheBoss = null;

  @SerializedName("blue_force_count")
  private Integer blueForceCount = null;

  @SerializedName("blue_force_played")
  private Integer blueForcePlayed = null;

  @SerializedName("blue_levitate_count")
  private Integer blueLevitateCount = null;

  @SerializedName("blue_levitate_played")
  private Integer blueLevitatePlayed = null;

  @SerializedName("blue_powerup_time_remaining")
  private String bluePowerupTimeRemaining = null;

  @SerializedName("blue_scale_owned")
  private Integer blueScaleOwned = null;

  @SerializedName("blue_score")
  private Integer blueScore = null;

  @SerializedName("blue_switch_owned")
  private Integer blueSwitchOwned = null;

  @SerializedName("red_auto_quest")
  private Integer redAutoQuest = null;

  @SerializedName("red_boost_count")
  private Integer redBoostCount = null;

  @SerializedName("red_boost_played")
  private Integer redBoostPlayed = null;

  @SerializedName("red_current_powerup")
  private String redCurrentPowerup = null;

  @SerializedName("red_face_the_boss")
  private Integer redFaceTheBoss = null;

  @SerializedName("red_force_count")
  private Integer redForceCount = null;

  @SerializedName("red_force_played")
  private Integer redForcePlayed = null;

  @SerializedName("red_levitate_count")
  private Integer redLevitateCount = null;

  @SerializedName("red_levitate_played")
  private Integer redLevitatePlayed = null;

  @SerializedName("red_powerup_time_remaining")
  private String redPowerupTimeRemaining = null;

  @SerializedName("red_scale_owned")
  private Integer redScaleOwned = null;

  @SerializedName("red_score")
  private Integer redScore = null;

  @SerializedName("red_switch_owned")
  private Integer redSwitchOwned = null;

  public MatchTimeseries2018 eventKey(String eventKey) {
    this.eventKey = eventKey;
    return this;
  }

   /**
   * TBA event key with the format yyyy[EVENT_CODE], where yyyy is the year, and EVENT_CODE is the event code of the event.
   * @return eventKey
  **/
  @ApiModelProperty(value = "TBA event key with the format yyyy[EVENT_CODE], where yyyy is the year, and EVENT_CODE is the event code of the event.")
  public String getEventKey() {
    return eventKey;
  }

  public void setEventKey(String eventKey) {
    this.eventKey = eventKey;
  }

  public MatchTimeseries2018 matchId(String matchId) {
    this.matchId = matchId;
    return this;
  }

   /**
   * Match ID consisting of the level, match number, and set number, eg &#x60;qm45&#x60; or &#x60;f1m1&#x60;.
   * @return matchId
  **/
  @ApiModelProperty(value = "Match ID consisting of the level, match number, and set number, eg `qm45` or `f1m1`.")
  public String getMatchId() {
    return matchId;
  }

  public void setMatchId(String matchId) {
    this.matchId = matchId;
  }

  public MatchTimeseries2018 mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Current mode of play, can be &#x60;pre_match&#x60;, &#x60;auto&#x60;, &#x60;telop&#x60;, or &#x60;post_match&#x60;.
   * @return mode
  **/
  @ApiModelProperty(value = "Current mode of play, can be `pre_match`, `auto`, `telop`, or `post_match`.")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public MatchTimeseries2018 play(Integer play) {
    this.play = play;
    return this;
  }

   /**
   * Get play
   * @return play
  **/
  @ApiModelProperty(value = "")
  public Integer getPlay() {
    return play;
  }

  public void setPlay(Integer play) {
    this.play = play;
  }

  public MatchTimeseries2018 timeRemaining(Integer timeRemaining) {
    this.timeRemaining = timeRemaining;
    return this;
  }

   /**
   * Amount of time remaining in the match, only valid during &#x60;auto&#x60; and &#x60;teleop&#x60; modes.
   * @return timeRemaining
  **/
  @ApiModelProperty(value = "Amount of time remaining in the match, only valid during `auto` and `teleop` modes.")
  public Integer getTimeRemaining() {
    return timeRemaining;
  }

  public void setTimeRemaining(Integer timeRemaining) {
    this.timeRemaining = timeRemaining;
  }

  public MatchTimeseries2018 blueAutoQuest(Integer blueAutoQuest) {
    this.blueAutoQuest = blueAutoQuest;
    return this;
  }

   /**
   * 1 if the blue alliance is credited with the AUTO QUEST, 0 if not.
   * @return blueAutoQuest
  **/
  @ApiModelProperty(value = "1 if the blue alliance is credited with the AUTO QUEST, 0 if not.")
  public Integer getBlueAutoQuest() {
    return blueAutoQuest;
  }

  public void setBlueAutoQuest(Integer blueAutoQuest) {
    this.blueAutoQuest = blueAutoQuest;
  }

  public MatchTimeseries2018 blueBoostCount(Integer blueBoostCount) {
    this.blueBoostCount = blueBoostCount;
    return this;
  }

   /**
   * Number of POWER CUBES in the BOOST section of the blue alliance VAULT.
   * @return blueBoostCount
  **/
  @ApiModelProperty(value = "Number of POWER CUBES in the BOOST section of the blue alliance VAULT.")
  public Integer getBlueBoostCount() {
    return blueBoostCount;
  }

  public void setBlueBoostCount(Integer blueBoostCount) {
    this.blueBoostCount = blueBoostCount;
  }

  public MatchTimeseries2018 blueBoostPlayed(Integer blueBoostPlayed) {
    this.blueBoostPlayed = blueBoostPlayed;
    return this;
  }

   /**
   * Returns 1 if the blue alliance BOOST was played, or 0 if not played.
   * @return blueBoostPlayed
  **/
  @ApiModelProperty(value = "Returns 1 if the blue alliance BOOST was played, or 0 if not played.")
  public Integer getBlueBoostPlayed() {
    return blueBoostPlayed;
  }

  public void setBlueBoostPlayed(Integer blueBoostPlayed) {
    this.blueBoostPlayed = blueBoostPlayed;
  }

  public MatchTimeseries2018 blueCurrentPowerup(String blueCurrentPowerup) {
    this.blueCurrentPowerup = blueCurrentPowerup;
    return this;
  }

   /**
   * Name of the current blue alliance POWER UP being played, or &#x60;null&#x60;.
   * @return blueCurrentPowerup
  **/
  @ApiModelProperty(value = "Name of the current blue alliance POWER UP being played, or `null`.")
  public String getBlueCurrentPowerup() {
    return blueCurrentPowerup;
  }

  public void setBlueCurrentPowerup(String blueCurrentPowerup) {
    this.blueCurrentPowerup = blueCurrentPowerup;
  }

  public MatchTimeseries2018 blueFaceTheBoss(Integer blueFaceTheBoss) {
    this.blueFaceTheBoss = blueFaceTheBoss;
    return this;
  }

   /**
   * 1 if the blue alliance is credited with FACING THE BOSS, 0 if not.
   * @return blueFaceTheBoss
  **/
  @ApiModelProperty(value = "1 if the blue alliance is credited with FACING THE BOSS, 0 if not.")
  public Integer getBlueFaceTheBoss() {
    return blueFaceTheBoss;
  }

  public void setBlueFaceTheBoss(Integer blueFaceTheBoss) {
    this.blueFaceTheBoss = blueFaceTheBoss;
  }

  public MatchTimeseries2018 blueForceCount(Integer blueForceCount) {
    this.blueForceCount = blueForceCount;
    return this;
  }

   /**
   * Number of POWER CUBES in the FORCE section of the blue alliance VAULT.
   * @return blueForceCount
  **/
  @ApiModelProperty(value = "Number of POWER CUBES in the FORCE section of the blue alliance VAULT.")
  public Integer getBlueForceCount() {
    return blueForceCount;
  }

  public void setBlueForceCount(Integer blueForceCount) {
    this.blueForceCount = blueForceCount;
  }

  public MatchTimeseries2018 blueForcePlayed(Integer blueForcePlayed) {
    this.blueForcePlayed = blueForcePlayed;
    return this;
  }

   /**
   * Returns 1 if the blue alliance FORCE was played, or 0 if not played.
   * @return blueForcePlayed
  **/
  @ApiModelProperty(value = "Returns 1 if the blue alliance FORCE was played, or 0 if not played.")
  public Integer getBlueForcePlayed() {
    return blueForcePlayed;
  }

  public void setBlueForcePlayed(Integer blueForcePlayed) {
    this.blueForcePlayed = blueForcePlayed;
  }

  public MatchTimeseries2018 blueLevitateCount(Integer blueLevitateCount) {
    this.blueLevitateCount = blueLevitateCount;
    return this;
  }

   /**
   * Number of POWER CUBES in the LEVITATE section of the blue alliance VAULT.
   * @return blueLevitateCount
  **/
  @ApiModelProperty(value = "Number of POWER CUBES in the LEVITATE section of the blue alliance VAULT.")
  public Integer getBlueLevitateCount() {
    return blueLevitateCount;
  }

  public void setBlueLevitateCount(Integer blueLevitateCount) {
    this.blueLevitateCount = blueLevitateCount;
  }

  public MatchTimeseries2018 blueLevitatePlayed(Integer blueLevitatePlayed) {
    this.blueLevitatePlayed = blueLevitatePlayed;
    return this;
  }

   /**
   * Returns 1 if the blue alliance LEVITATE was played, or 0 if not played.
   * @return blueLevitatePlayed
  **/
  @ApiModelProperty(value = "Returns 1 if the blue alliance LEVITATE was played, or 0 if not played.")
  public Integer getBlueLevitatePlayed() {
    return blueLevitatePlayed;
  }

  public void setBlueLevitatePlayed(Integer blueLevitatePlayed) {
    this.blueLevitatePlayed = blueLevitatePlayed;
  }

  public MatchTimeseries2018 bluePowerupTimeRemaining(String bluePowerupTimeRemaining) {
    this.bluePowerupTimeRemaining = bluePowerupTimeRemaining;
    return this;
  }

   /**
   * Number of seconds remaining in the blue alliance POWER UP time, or 0 if none is active.
   * @return bluePowerupTimeRemaining
  **/
  @ApiModelProperty(value = "Number of seconds remaining in the blue alliance POWER UP time, or 0 if none is active.")
  public String getBluePowerupTimeRemaining() {
    return bluePowerupTimeRemaining;
  }

  public void setBluePowerupTimeRemaining(String bluePowerupTimeRemaining) {
    this.bluePowerupTimeRemaining = bluePowerupTimeRemaining;
  }

  public MatchTimeseries2018 blueScaleOwned(Integer blueScaleOwned) {
    this.blueScaleOwned = blueScaleOwned;
    return this;
  }

   /**
   * 1 if the blue alliance owns the SCALE, 0 if not.
   * @return blueScaleOwned
  **/
  @ApiModelProperty(value = "1 if the blue alliance owns the SCALE, 0 if not.")
  public Integer getBlueScaleOwned() {
    return blueScaleOwned;
  }

  public void setBlueScaleOwned(Integer blueScaleOwned) {
    this.blueScaleOwned = blueScaleOwned;
  }

  public MatchTimeseries2018 blueScore(Integer blueScore) {
    this.blueScore = blueScore;
    return this;
  }

   /**
   * Current score for the blue alliance.
   * @return blueScore
  **/
  @ApiModelProperty(value = "Current score for the blue alliance.")
  public Integer getBlueScore() {
    return blueScore;
  }

  public void setBlueScore(Integer blueScore) {
    this.blueScore = blueScore;
  }

  public MatchTimeseries2018 blueSwitchOwned(Integer blueSwitchOwned) {
    this.blueSwitchOwned = blueSwitchOwned;
    return this;
  }

   /**
   * 1 if the blue alliance owns their SWITCH, 0 if not.
   * @return blueSwitchOwned
  **/
  @ApiModelProperty(value = "1 if the blue alliance owns their SWITCH, 0 if not.")
  public Integer getBlueSwitchOwned() {
    return blueSwitchOwned;
  }

  public void setBlueSwitchOwned(Integer blueSwitchOwned) {
    this.blueSwitchOwned = blueSwitchOwned;
  }

  public MatchTimeseries2018 redAutoQuest(Integer redAutoQuest) {
    this.redAutoQuest = redAutoQuest;
    return this;
  }

   /**
   * 1 if the red alliance is credited with the AUTO QUEST, 0 if not.
   * @return redAutoQuest
  **/
  @ApiModelProperty(value = "1 if the red alliance is credited with the AUTO QUEST, 0 if not.")
  public Integer getRedAutoQuest() {
    return redAutoQuest;
  }

  public void setRedAutoQuest(Integer redAutoQuest) {
    this.redAutoQuest = redAutoQuest;
  }

  public MatchTimeseries2018 redBoostCount(Integer redBoostCount) {
    this.redBoostCount = redBoostCount;
    return this;
  }

   /**
   * Number of POWER CUBES in the BOOST section of the red alliance VAULT.
   * @return redBoostCount
  **/
  @ApiModelProperty(value = "Number of POWER CUBES in the BOOST section of the red alliance VAULT.")
  public Integer getRedBoostCount() {
    return redBoostCount;
  }

  public void setRedBoostCount(Integer redBoostCount) {
    this.redBoostCount = redBoostCount;
  }

  public MatchTimeseries2018 redBoostPlayed(Integer redBoostPlayed) {
    this.redBoostPlayed = redBoostPlayed;
    return this;
  }

   /**
   * Returns 1 if the red alliance BOOST was played, or 0 if not played.
   * @return redBoostPlayed
  **/
  @ApiModelProperty(value = "Returns 1 if the red alliance BOOST was played, or 0 if not played.")
  public Integer getRedBoostPlayed() {
    return redBoostPlayed;
  }

  public void setRedBoostPlayed(Integer redBoostPlayed) {
    this.redBoostPlayed = redBoostPlayed;
  }

  public MatchTimeseries2018 redCurrentPowerup(String redCurrentPowerup) {
    this.redCurrentPowerup = redCurrentPowerup;
    return this;
  }

   /**
   * Name of the current red alliance POWER UP being played, or &#x60;null&#x60;.
   * @return redCurrentPowerup
  **/
  @ApiModelProperty(value = "Name of the current red alliance POWER UP being played, or `null`.")
  public String getRedCurrentPowerup() {
    return redCurrentPowerup;
  }

  public void setRedCurrentPowerup(String redCurrentPowerup) {
    this.redCurrentPowerup = redCurrentPowerup;
  }

  public MatchTimeseries2018 redFaceTheBoss(Integer redFaceTheBoss) {
    this.redFaceTheBoss = redFaceTheBoss;
    return this;
  }

   /**
   * 1 if the red alliance is credited with FACING THE BOSS, 0 if not.
   * @return redFaceTheBoss
  **/
  @ApiModelProperty(value = "1 if the red alliance is credited with FACING THE BOSS, 0 if not.")
  public Integer getRedFaceTheBoss() {
    return redFaceTheBoss;
  }

  public void setRedFaceTheBoss(Integer redFaceTheBoss) {
    this.redFaceTheBoss = redFaceTheBoss;
  }

  public MatchTimeseries2018 redForceCount(Integer redForceCount) {
    this.redForceCount = redForceCount;
    return this;
  }

   /**
   * Number of POWER CUBES in the FORCE section of the red alliance VAULT.
   * @return redForceCount
  **/
  @ApiModelProperty(value = "Number of POWER CUBES in the FORCE section of the red alliance VAULT.")
  public Integer getRedForceCount() {
    return redForceCount;
  }

  public void setRedForceCount(Integer redForceCount) {
    this.redForceCount = redForceCount;
  }

  public MatchTimeseries2018 redForcePlayed(Integer redForcePlayed) {
    this.redForcePlayed = redForcePlayed;
    return this;
  }

   /**
   * Returns 1 if the red alliance FORCE was played, or 0 if not played.
   * @return redForcePlayed
  **/
  @ApiModelProperty(value = "Returns 1 if the red alliance FORCE was played, or 0 if not played.")
  public Integer getRedForcePlayed() {
    return redForcePlayed;
  }

  public void setRedForcePlayed(Integer redForcePlayed) {
    this.redForcePlayed = redForcePlayed;
  }

  public MatchTimeseries2018 redLevitateCount(Integer redLevitateCount) {
    this.redLevitateCount = redLevitateCount;
    return this;
  }

   /**
   * Number of POWER CUBES in the LEVITATE section of the red alliance VAULT.
   * @return redLevitateCount
  **/
  @ApiModelProperty(value = "Number of POWER CUBES in the LEVITATE section of the red alliance VAULT.")
  public Integer getRedLevitateCount() {
    return redLevitateCount;
  }

  public void setRedLevitateCount(Integer redLevitateCount) {
    this.redLevitateCount = redLevitateCount;
  }

  public MatchTimeseries2018 redLevitatePlayed(Integer redLevitatePlayed) {
    this.redLevitatePlayed = redLevitatePlayed;
    return this;
  }

   /**
   * Returns 1 if the red alliance LEVITATE was played, or 0 if not played.
   * @return redLevitatePlayed
  **/
  @ApiModelProperty(value = "Returns 1 if the red alliance LEVITATE was played, or 0 if not played.")
  public Integer getRedLevitatePlayed() {
    return redLevitatePlayed;
  }

  public void setRedLevitatePlayed(Integer redLevitatePlayed) {
    this.redLevitatePlayed = redLevitatePlayed;
  }

  public MatchTimeseries2018 redPowerupTimeRemaining(String redPowerupTimeRemaining) {
    this.redPowerupTimeRemaining = redPowerupTimeRemaining;
    return this;
  }

   /**
   * Number of seconds remaining in the red alliance POWER UP time, or 0 if none is active.
   * @return redPowerupTimeRemaining
  **/
  @ApiModelProperty(value = "Number of seconds remaining in the red alliance POWER UP time, or 0 if none is active.")
  public String getRedPowerupTimeRemaining() {
    return redPowerupTimeRemaining;
  }

  public void setRedPowerupTimeRemaining(String redPowerupTimeRemaining) {
    this.redPowerupTimeRemaining = redPowerupTimeRemaining;
  }

  public MatchTimeseries2018 redScaleOwned(Integer redScaleOwned) {
    this.redScaleOwned = redScaleOwned;
    return this;
  }

   /**
   * 1 if the red alliance owns the SCALE, 0 if not.
   * @return redScaleOwned
  **/
  @ApiModelProperty(value = "1 if the red alliance owns the SCALE, 0 if not.")
  public Integer getRedScaleOwned() {
    return redScaleOwned;
  }

  public void setRedScaleOwned(Integer redScaleOwned) {
    this.redScaleOwned = redScaleOwned;
  }

  public MatchTimeseries2018 redScore(Integer redScore) {
    this.redScore = redScore;
    return this;
  }

   /**
   * Current score for the red alliance.
   * @return redScore
  **/
  @ApiModelProperty(value = "Current score for the red alliance.")
  public Integer getRedScore() {
    return redScore;
  }

  public void setRedScore(Integer redScore) {
    this.redScore = redScore;
  }

  public MatchTimeseries2018 redSwitchOwned(Integer redSwitchOwned) {
    this.redSwitchOwned = redSwitchOwned;
    return this;
  }

   /**
   * 1 if the red alliance owns their SWITCH, 0 if not.
   * @return redSwitchOwned
  **/
  @ApiModelProperty(value = "1 if the red alliance owns their SWITCH, 0 if not.")
  public Integer getRedSwitchOwned() {
    return redSwitchOwned;
  }

  public void setRedSwitchOwned(Integer redSwitchOwned) {
    this.redSwitchOwned = redSwitchOwned;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchTimeseries2018 matchTimeseries2018 = (MatchTimeseries2018) o;
    return Objects.equals(this.eventKey, matchTimeseries2018.eventKey) &&
        Objects.equals(this.matchId, matchTimeseries2018.matchId) &&
        Objects.equals(this.mode, matchTimeseries2018.mode) &&
        Objects.equals(this.play, matchTimeseries2018.play) &&
        Objects.equals(this.timeRemaining, matchTimeseries2018.timeRemaining) &&
        Objects.equals(this.blueAutoQuest, matchTimeseries2018.blueAutoQuest) &&
        Objects.equals(this.blueBoostCount, matchTimeseries2018.blueBoostCount) &&
        Objects.equals(this.blueBoostPlayed, matchTimeseries2018.blueBoostPlayed) &&
        Objects.equals(this.blueCurrentPowerup, matchTimeseries2018.blueCurrentPowerup) &&
        Objects.equals(this.blueFaceTheBoss, matchTimeseries2018.blueFaceTheBoss) &&
        Objects.equals(this.blueForceCount, matchTimeseries2018.blueForceCount) &&
        Objects.equals(this.blueForcePlayed, matchTimeseries2018.blueForcePlayed) &&
        Objects.equals(this.blueLevitateCount, matchTimeseries2018.blueLevitateCount) &&
        Objects.equals(this.blueLevitatePlayed, matchTimeseries2018.blueLevitatePlayed) &&
        Objects.equals(this.bluePowerupTimeRemaining, matchTimeseries2018.bluePowerupTimeRemaining) &&
        Objects.equals(this.blueScaleOwned, matchTimeseries2018.blueScaleOwned) &&
        Objects.equals(this.blueScore, matchTimeseries2018.blueScore) &&
        Objects.equals(this.blueSwitchOwned, matchTimeseries2018.blueSwitchOwned) &&
        Objects.equals(this.redAutoQuest, matchTimeseries2018.redAutoQuest) &&
        Objects.equals(this.redBoostCount, matchTimeseries2018.redBoostCount) &&
        Objects.equals(this.redBoostPlayed, matchTimeseries2018.redBoostPlayed) &&
        Objects.equals(this.redCurrentPowerup, matchTimeseries2018.redCurrentPowerup) &&
        Objects.equals(this.redFaceTheBoss, matchTimeseries2018.redFaceTheBoss) &&
        Objects.equals(this.redForceCount, matchTimeseries2018.redForceCount) &&
        Objects.equals(this.redForcePlayed, matchTimeseries2018.redForcePlayed) &&
        Objects.equals(this.redLevitateCount, matchTimeseries2018.redLevitateCount) &&
        Objects.equals(this.redLevitatePlayed, matchTimeseries2018.redLevitatePlayed) &&
        Objects.equals(this.redPowerupTimeRemaining, matchTimeseries2018.redPowerupTimeRemaining) &&
        Objects.equals(this.redScaleOwned, matchTimeseries2018.redScaleOwned) &&
        Objects.equals(this.redScore, matchTimeseries2018.redScore) &&
        Objects.equals(this.redSwitchOwned, matchTimeseries2018.redSwitchOwned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventKey, matchId, mode, play, timeRemaining, blueAutoQuest, blueBoostCount, blueBoostPlayed, blueCurrentPowerup, blueFaceTheBoss, blueForceCount, blueForcePlayed, blueLevitateCount, blueLevitatePlayed, bluePowerupTimeRemaining, blueScaleOwned, blueScore, blueSwitchOwned, redAutoQuest, redBoostCount, redBoostPlayed, redCurrentPowerup, redFaceTheBoss, redForceCount, redForcePlayed, redLevitateCount, redLevitatePlayed, redPowerupTimeRemaining, redScaleOwned, redScore, redSwitchOwned);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchTimeseries2018 {\n");
    
    sb.append("    eventKey: ").append(toIndentedString(eventKey)).append("\n");
    sb.append("    matchId: ").append(toIndentedString(matchId)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    play: ").append(toIndentedString(play)).append("\n");
    sb.append("    timeRemaining: ").append(toIndentedString(timeRemaining)).append("\n");
    sb.append("    blueAutoQuest: ").append(toIndentedString(blueAutoQuest)).append("\n");
    sb.append("    blueBoostCount: ").append(toIndentedString(blueBoostCount)).append("\n");
    sb.append("    blueBoostPlayed: ").append(toIndentedString(blueBoostPlayed)).append("\n");
    sb.append("    blueCurrentPowerup: ").append(toIndentedString(blueCurrentPowerup)).append("\n");
    sb.append("    blueFaceTheBoss: ").append(toIndentedString(blueFaceTheBoss)).append("\n");
    sb.append("    blueForceCount: ").append(toIndentedString(blueForceCount)).append("\n");
    sb.append("    blueForcePlayed: ").append(toIndentedString(blueForcePlayed)).append("\n");
    sb.append("    blueLevitateCount: ").append(toIndentedString(blueLevitateCount)).append("\n");
    sb.append("    blueLevitatePlayed: ").append(toIndentedString(blueLevitatePlayed)).append("\n");
    sb.append("    bluePowerupTimeRemaining: ").append(toIndentedString(bluePowerupTimeRemaining)).append("\n");
    sb.append("    blueScaleOwned: ").append(toIndentedString(blueScaleOwned)).append("\n");
    sb.append("    blueScore: ").append(toIndentedString(blueScore)).append("\n");
    sb.append("    blueSwitchOwned: ").append(toIndentedString(blueSwitchOwned)).append("\n");
    sb.append("    redAutoQuest: ").append(toIndentedString(redAutoQuest)).append("\n");
    sb.append("    redBoostCount: ").append(toIndentedString(redBoostCount)).append("\n");
    sb.append("    redBoostPlayed: ").append(toIndentedString(redBoostPlayed)).append("\n");
    sb.append("    redCurrentPowerup: ").append(toIndentedString(redCurrentPowerup)).append("\n");
    sb.append("    redFaceTheBoss: ").append(toIndentedString(redFaceTheBoss)).append("\n");
    sb.append("    redForceCount: ").append(toIndentedString(redForceCount)).append("\n");
    sb.append("    redForcePlayed: ").append(toIndentedString(redForcePlayed)).append("\n");
    sb.append("    redLevitateCount: ").append(toIndentedString(redLevitateCount)).append("\n");
    sb.append("    redLevitatePlayed: ").append(toIndentedString(redLevitatePlayed)).append("\n");
    sb.append("    redPowerupTimeRemaining: ").append(toIndentedString(redPowerupTimeRemaining)).append("\n");
    sb.append("    redScaleOwned: ").append(toIndentedString(redScaleOwned)).append("\n");
    sb.append("    redScore: ").append(toIndentedString(redScore)).append("\n");
    sb.append("    redSwitchOwned: ").append(toIndentedString(redSwitchOwned)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

