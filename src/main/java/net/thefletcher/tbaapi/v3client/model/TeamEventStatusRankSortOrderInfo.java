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

/**
 * TeamEventStatusRankSortOrderInfo
 */

public class TeamEventStatusRankSortOrderInfo {
  public static final String SERIALIZED_NAME_PRECISION = "precision";
  @SerializedName(SERIALIZED_NAME_PRECISION)
  private Integer precision;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public TeamEventStatusRankSortOrderInfo precision(Integer precision) {
    this.precision = precision;
    return this;
  }

   /**
   * The number of digits of precision used for this value, eg &#x60;2&#x60; would correspond to a value of &#x60;101.11&#x60; while &#x60;0&#x60; would correspond to &#x60;101&#x60;.
   * @return precision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of digits of precision used for this value, eg `2` would correspond to a value of `101.11` while `0` would correspond to `101`.")
  public Integer getPrecision() {
    return precision;
  }

  public void setPrecision(Integer precision) {
    this.precision = precision;
  }

  public TeamEventStatusRankSortOrderInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The descriptive name of the value used to sort the ranking.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The descriptive name of the value used to sort the ranking.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamEventStatusRankSortOrderInfo teamEventStatusRankSortOrderInfo = (TeamEventStatusRankSortOrderInfo) o;
    return Objects.equals(this.precision, teamEventStatusRankSortOrderInfo.precision) &&
        Objects.equals(this.name, teamEventStatusRankSortOrderInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(precision, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamEventStatusRankSortOrderInfo {\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

