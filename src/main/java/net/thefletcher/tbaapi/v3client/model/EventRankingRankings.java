/*
 * The Blue Alliance API v3
 * # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
 *
 * The version of the OpenAPI document: 3.8.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package net.thefletcher.tbaapi.v3client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import net.thefletcher.tbaapi.v3client.model.WLTRecord;

/**
 * EventRankingRankings
 */

public class EventRankingRankings {
  public static final String SERIALIZED_NAME_MATCHES_PLAYED = "matches_played";
  @SerializedName(SERIALIZED_NAME_MATCHES_PLAYED)
  private Integer matchesPlayed;

  public static final String SERIALIZED_NAME_QUAL_AVERAGE = "qual_average";
  @SerializedName(SERIALIZED_NAME_QUAL_AVERAGE)
  private Integer qualAverage;

  public static final String SERIALIZED_NAME_EXTRA_STATS = "extra_stats";
  @SerializedName(SERIALIZED_NAME_EXTRA_STATS)
  private List<BigDecimal> extraStats = null;

  public static final String SERIALIZED_NAME_SORT_ORDERS = "sort_orders";
  @SerializedName(SERIALIZED_NAME_SORT_ORDERS)
  private List<BigDecimal> sortOrders = null;

  public static final String SERIALIZED_NAME_RECORD = "record";
  @SerializedName(SERIALIZED_NAME_RECORD)
  private WLTRecord record;

  public static final String SERIALIZED_NAME_RANK = "rank";
  @SerializedName(SERIALIZED_NAME_RANK)
  private Integer rank;

  public static final String SERIALIZED_NAME_DQ = "dq";
  @SerializedName(SERIALIZED_NAME_DQ)
  private Integer dq;

  public static final String SERIALIZED_NAME_TEAM_KEY = "team_key";
  @SerializedName(SERIALIZED_NAME_TEAM_KEY)
  private String teamKey;


  public EventRankingRankings matchesPlayed(Integer matchesPlayed) {
    
    this.matchesPlayed = matchesPlayed;
    return this;
  }

   /**
   * Number of matches played by this team.
   * @return matchesPlayed
  **/
  @ApiModelProperty(required = true, value = "Number of matches played by this team.")

  public Integer getMatchesPlayed() {
    return matchesPlayed;
  }


  public void setMatchesPlayed(Integer matchesPlayed) {
    this.matchesPlayed = matchesPlayed;
  }


  public EventRankingRankings qualAverage(Integer qualAverage) {
    
    this.qualAverage = qualAverage;
    return this;
  }

   /**
   * The average match score during qualifications. Year specific. May be null if not relevant for a given year.
   * @return qualAverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The average match score during qualifications. Year specific. May be null if not relevant for a given year.")

  public Integer getQualAverage() {
    return qualAverage;
  }


  public void setQualAverage(Integer qualAverage) {
    this.qualAverage = qualAverage;
  }


  public EventRankingRankings extraStats(List<BigDecimal> extraStats) {
    
    this.extraStats = extraStats;
    return this;
  }

  public EventRankingRankings addExtraStatsItem(BigDecimal extraStatsItem) {
    if (this.extraStats == null) {
      this.extraStats = new ArrayList<BigDecimal>();
    }
    this.extraStats.add(extraStatsItem);
    return this;
  }

   /**
   * Additional special data on the team&#39;s performance calculated by TBA.
   * @return extraStats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional special data on the team's performance calculated by TBA.")

  public List<BigDecimal> getExtraStats() {
    return extraStats;
  }


  public void setExtraStats(List<BigDecimal> extraStats) {
    this.extraStats = extraStats;
  }


  public EventRankingRankings sortOrders(List<BigDecimal> sortOrders) {
    
    this.sortOrders = sortOrders;
    return this;
  }

  public EventRankingRankings addSortOrdersItem(BigDecimal sortOrdersItem) {
    if (this.sortOrders == null) {
      this.sortOrders = new ArrayList<BigDecimal>();
    }
    this.sortOrders.add(sortOrdersItem);
    return this;
  }

   /**
   * Additional year-specific information, may be null. See parent &#x60;sort_order_info&#x60; for details.
   * @return sortOrders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional year-specific information, may be null. See parent `sort_order_info` for details.")

  public List<BigDecimal> getSortOrders() {
    return sortOrders;
  }


  public void setSortOrders(List<BigDecimal> sortOrders) {
    this.sortOrders = sortOrders;
  }


  public EventRankingRankings record(WLTRecord record) {
    
    this.record = record;
    return this;
  }

   /**
   * Get record
   * @return record
  **/
  @ApiModelProperty(required = true, value = "")

  public WLTRecord getRecord() {
    return record;
  }


  public void setRecord(WLTRecord record) {
    this.record = record;
  }


  public EventRankingRankings rank(Integer rank) {
    
    this.rank = rank;
    return this;
  }

   /**
   * The team&#39;s rank at the event as provided by FIRST.
   * @return rank
  **/
  @ApiModelProperty(required = true, value = "The team's rank at the event as provided by FIRST.")

  public Integer getRank() {
    return rank;
  }


  public void setRank(Integer rank) {
    this.rank = rank;
  }


  public EventRankingRankings dq(Integer dq) {
    
    this.dq = dq;
    return this;
  }

   /**
   * Number of times disqualified.
   * @return dq
  **/
  @ApiModelProperty(required = true, value = "Number of times disqualified.")

  public Integer getDq() {
    return dq;
  }


  public void setDq(Integer dq) {
    this.dq = dq;
  }


  public EventRankingRankings teamKey(String teamKey) {
    
    this.teamKey = teamKey;
    return this;
  }

   /**
   * The team with this rank.
   * @return teamKey
  **/
  @ApiModelProperty(required = true, value = "The team with this rank.")

  public String getTeamKey() {
    return teamKey;
  }


  public void setTeamKey(String teamKey) {
    this.teamKey = teamKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventRankingRankings eventRankingRankings = (EventRankingRankings) o;
    return Objects.equals(this.matchesPlayed, eventRankingRankings.matchesPlayed) &&
        Objects.equals(this.qualAverage, eventRankingRankings.qualAverage) &&
        Objects.equals(this.extraStats, eventRankingRankings.extraStats) &&
        Objects.equals(this.sortOrders, eventRankingRankings.sortOrders) &&
        Objects.equals(this.record, eventRankingRankings.record) &&
        Objects.equals(this.rank, eventRankingRankings.rank) &&
        Objects.equals(this.dq, eventRankingRankings.dq) &&
        Objects.equals(this.teamKey, eventRankingRankings.teamKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchesPlayed, qualAverage, extraStats, sortOrders, record, rank, dq, teamKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventRankingRankings {\n");
    sb.append("    matchesPlayed: ").append(toIndentedString(matchesPlayed)).append("\n");
    sb.append("    qualAverage: ").append(toIndentedString(qualAverage)).append("\n");
    sb.append("    extraStats: ").append(toIndentedString(extraStats)).append("\n");
    sb.append("    sortOrders: ").append(toIndentedString(sortOrders)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    dq: ").append(toIndentedString(dq)).append("\n");
    sb.append("    teamKey: ").append(toIndentedString(teamKey)).append("\n");
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

