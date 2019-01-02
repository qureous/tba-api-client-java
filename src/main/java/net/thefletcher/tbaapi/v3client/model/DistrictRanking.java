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
import java.util.ArrayList;
import java.util.List;
import net.thefletcher.tbaapi.v3client.model.DistrictRankingEventPoints;

/**
 * Rank of a team in a district.
 */
@ApiModel(description = "Rank of a team in a district.")

public class DistrictRanking {
  @SerializedName("team_key")
  private String teamKey = null;

  @SerializedName("rank")
  private Integer rank = null;

  @SerializedName("rookie_bonus")
  private Integer rookieBonus = null;

  @SerializedName("point_total")
  private Integer pointTotal = null;

  @SerializedName("event_points")
  private List<DistrictRankingEventPoints> eventPoints = null;

  public DistrictRanking teamKey(String teamKey) {
    this.teamKey = teamKey;
    return this;
  }

   /**
   * TBA team key for the team.
   * @return teamKey
  **/
  @ApiModelProperty(required = true, value = "TBA team key for the team.")
  public String getTeamKey() {
    return teamKey;
  }

  public void setTeamKey(String teamKey) {
    this.teamKey = teamKey;
  }

  public DistrictRanking rank(Integer rank) {
    this.rank = rank;
    return this;
  }

   /**
   * Numerical rank of the team, 1 being top rank.
   * @return rank
  **/
  @ApiModelProperty(required = true, value = "Numerical rank of the team, 1 being top rank.")
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }

  public DistrictRanking rookieBonus(Integer rookieBonus) {
    this.rookieBonus = rookieBonus;
    return this;
  }

   /**
   * Any points added to a team as a result of the rookie bonus.
   * @return rookieBonus
  **/
  @ApiModelProperty(value = "Any points added to a team as a result of the rookie bonus.")
  public Integer getRookieBonus() {
    return rookieBonus;
  }

  public void setRookieBonus(Integer rookieBonus) {
    this.rookieBonus = rookieBonus;
  }

  public DistrictRanking pointTotal(Integer pointTotal) {
    this.pointTotal = pointTotal;
    return this;
  }

   /**
   * Total district points for the team.
   * @return pointTotal
  **/
  @ApiModelProperty(required = true, value = "Total district points for the team.")
  public Integer getPointTotal() {
    return pointTotal;
  }

  public void setPointTotal(Integer pointTotal) {
    this.pointTotal = pointTotal;
  }

  public DistrictRanking eventPoints(List<DistrictRankingEventPoints> eventPoints) {
    this.eventPoints = eventPoints;
    return this;
  }

  public DistrictRanking addEventPointsItem(DistrictRankingEventPoints eventPointsItem) {
    if (this.eventPoints == null) {
      this.eventPoints = new ArrayList<DistrictRankingEventPoints>();
    }
    this.eventPoints.add(eventPointsItem);
    return this;
  }

   /**
   * List of events that contributed to the point total for the team.
   * @return eventPoints
  **/
  @ApiModelProperty(value = "List of events that contributed to the point total for the team.")
  public List<DistrictRankingEventPoints> getEventPoints() {
    return eventPoints;
  }

  public void setEventPoints(List<DistrictRankingEventPoints> eventPoints) {
    this.eventPoints = eventPoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistrictRanking districtRanking = (DistrictRanking) o;
    return Objects.equals(this.teamKey, districtRanking.teamKey) &&
        Objects.equals(this.rank, districtRanking.rank) &&
        Objects.equals(this.rookieBonus, districtRanking.rookieBonus) &&
        Objects.equals(this.pointTotal, districtRanking.pointTotal) &&
        Objects.equals(this.eventPoints, districtRanking.eventPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamKey, rank, rookieBonus, pointTotal, eventPoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistrictRanking {\n");
    
    sb.append("    teamKey: ").append(toIndentedString(teamKey)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    rookieBonus: ").append(toIndentedString(rookieBonus)).append("\n");
    sb.append("    pointTotal: ").append(toIndentedString(pointTotal)).append("\n");
    sb.append("    eventPoints: ").append(toIndentedString(eventPoints)).append("\n");
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

