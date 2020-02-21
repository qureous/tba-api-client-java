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

/**
 * An &#x60;Award_Recipient&#x60; object represents the team and/or person who received an award at an event.
 */
@ApiModel(description = "An `Award_Recipient` object represents the team and/or person who received an award at an event.")

public class AwardRecipient {
  public static final String SERIALIZED_NAME_TEAM_KEY = "team_key";
  @SerializedName(SERIALIZED_NAME_TEAM_KEY)
  private String teamKey;

  public static final String SERIALIZED_NAME_AWARDEE = "awardee";
  @SerializedName(SERIALIZED_NAME_AWARDEE)
  private String awardee;


  public AwardRecipient teamKey(String teamKey) {
    
    this.teamKey = teamKey;
    return this;
  }

   /**
   * The TBA team key for the team that was given the award. May be null.
   * @return teamKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The TBA team key for the team that was given the award. May be null.")

  public String getTeamKey() {
    return teamKey;
  }


  public void setTeamKey(String teamKey) {
    this.teamKey = teamKey;
  }


  public AwardRecipient awardee(String awardee) {
    
    this.awardee = awardee;
    return this;
  }

   /**
   * The name of the individual given the award. May be null.
   * @return awardee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the individual given the award. May be null.")

  public String getAwardee() {
    return awardee;
  }


  public void setAwardee(String awardee) {
    this.awardee = awardee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwardRecipient awardRecipient = (AwardRecipient) o;
    return Objects.equals(this.teamKey, awardRecipient.teamKey) &&
        Objects.equals(this.awardee, awardRecipient.awardee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamKey, awardee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwardRecipient {\n");
    sb.append("    teamKey: ").append(toIndentedString(teamKey)).append("\n");
    sb.append("    awardee: ").append(toIndentedString(awardee)).append("\n");
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

