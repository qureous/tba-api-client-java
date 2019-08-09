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
import net.thefletcher.tbaapi.v3client.model.MatchScoreBreakdown2019Alliance;

/**
 * See the 2019 FMS API documentation for a description of each value. https://frcevents2.docs.apiary.io/#reference/match-results/score-details
 */
@ApiModel(description = "See the 2019 FMS API documentation for a description of each value. https://frcevents2.docs.apiary.io/#reference/match-results/score-details")

public class MatchScoreBreakdown2019 {
  public static final String SERIALIZED_NAME_BLUE = "blue";
  @SerializedName(SERIALIZED_NAME_BLUE)
  private MatchScoreBreakdown2019Alliance blue = null;

  public static final String SERIALIZED_NAME_RED = "red";
  @SerializedName(SERIALIZED_NAME_RED)
  private MatchScoreBreakdown2019Alliance red = null;

  public MatchScoreBreakdown2019 blue(MatchScoreBreakdown2019Alliance blue) {
    this.blue = blue;
    return this;
  }

   /**
   * Get blue
   * @return blue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public MatchScoreBreakdown2019Alliance getBlue() {
    return blue;
  }

  public void setBlue(MatchScoreBreakdown2019Alliance blue) {
    this.blue = blue;
  }

  public MatchScoreBreakdown2019 red(MatchScoreBreakdown2019Alliance red) {
    this.red = red;
    return this;
  }

   /**
   * Get red
   * @return red
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public MatchScoreBreakdown2019Alliance getRed() {
    return red;
  }

  public void setRed(MatchScoreBreakdown2019Alliance red) {
    this.red = red;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchScoreBreakdown2019 matchScoreBreakdown2019 = (MatchScoreBreakdown2019) o;
    return Objects.equals(this.blue, matchScoreBreakdown2019.blue) &&
        Objects.equals(this.red, matchScoreBreakdown2019.red);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blue, red);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchScoreBreakdown2019 {\n");
    sb.append("    blue: ").append(toIndentedString(blue)).append("\n");
    sb.append("    red: ").append(toIndentedString(red)).append("\n");
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

