/*
 * The Blue Alliance API v3
 * # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
 *
 * The version of the OpenAPI document: 3.5
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
import java.util.ArrayList;
import java.util.List;
import net.thefletcher.tbaapi.v3client.model.TeamEventStatusRankRanking;
import net.thefletcher.tbaapi.v3client.model.TeamEventStatusRankSortOrderInfo;

/**
 * TeamEventStatusRank
 */

public class TeamEventStatusRank {
  public static final String SERIALIZED_NAME_NUM_TEAMS = "num_teams";
  @SerializedName(SERIALIZED_NAME_NUM_TEAMS)
  private Integer numTeams;

  public static final String SERIALIZED_NAME_RANKING = "ranking";
  @SerializedName(SERIALIZED_NAME_RANKING)
  private TeamEventStatusRankRanking ranking = null;

  public static final String SERIALIZED_NAME_SORT_ORDER_INFO = "sort_order_info";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER_INFO)
  private List<TeamEventStatusRankSortOrderInfo> sortOrderInfo = new ArrayList<TeamEventStatusRankSortOrderInfo>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public TeamEventStatusRank numTeams(Integer numTeams) {
    this.numTeams = numTeams;
    return this;
  }

   /**
   * Number of teams ranked.
   * @return numTeams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of teams ranked.")
  public Integer getNumTeams() {
    return numTeams;
  }

  public void setNumTeams(Integer numTeams) {
    this.numTeams = numTeams;
  }

  public TeamEventStatusRank ranking(TeamEventStatusRankRanking ranking) {
    this.ranking = ranking;
    return this;
  }

   /**
   * Get ranking
   * @return ranking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public TeamEventStatusRankRanking getRanking() {
    return ranking;
  }

  public void setRanking(TeamEventStatusRankRanking ranking) {
    this.ranking = ranking;
  }

  public TeamEventStatusRank sortOrderInfo(List<TeamEventStatusRankSortOrderInfo> sortOrderInfo) {
    this.sortOrderInfo = sortOrderInfo;
    return this;
  }

  public TeamEventStatusRank addSortOrderInfoItem(TeamEventStatusRankSortOrderInfo sortOrderInfoItem) {
    if (this.sortOrderInfo == null) {
      this.sortOrderInfo = new ArrayList<TeamEventStatusRankSortOrderInfo>();
    }
    this.sortOrderInfo.add(sortOrderInfoItem);
    return this;
  }

   /**
   * Ordered list of names corresponding to the elements of the &#x60;sort_orders&#x60; array.
   * @return sortOrderInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ordered list of names corresponding to the elements of the `sort_orders` array.")
  public List<TeamEventStatusRankSortOrderInfo> getSortOrderInfo() {
    return sortOrderInfo;
  }

  public void setSortOrderInfo(List<TeamEventStatusRankSortOrderInfo> sortOrderInfo) {
    this.sortOrderInfo = sortOrderInfo;
  }

  public TeamEventStatusRank status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamEventStatusRank teamEventStatusRank = (TeamEventStatusRank) o;
    return Objects.equals(this.numTeams, teamEventStatusRank.numTeams) &&
        Objects.equals(this.ranking, teamEventStatusRank.ranking) &&
        Objects.equals(this.sortOrderInfo, teamEventStatusRank.sortOrderInfo) &&
        Objects.equals(this.status, teamEventStatusRank.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numTeams, ranking, sortOrderInfo, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamEventStatusRank {\n");
    sb.append("    numTeams: ").append(toIndentedString(numTeams)).append("\n");
    sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
    sb.append("    sortOrderInfo: ").append(toIndentedString(sortOrderInfo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

