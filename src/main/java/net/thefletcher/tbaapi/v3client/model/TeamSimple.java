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
 * TeamSimple
 */

public class TeamSimple {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_TEAM_NUMBER = "team_number";
  @SerializedName(SERIALIZED_NAME_TEAM_NUMBER)
  private Integer teamNumber;

  public static final String SERIALIZED_NAME_NICKNAME = "nickname";
  @SerializedName(SERIALIZED_NAME_NICKNAME)
  private String nickname;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE_PROV = "state_prov";
  @SerializedName(SERIALIZED_NAME_STATE_PROV)
  private String stateProv;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;


  public TeamSimple key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * TBA team key with the format &#x60;frcXXXX&#x60; with &#x60;XXXX&#x60; representing the team number.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "TBA team key with the format `frcXXXX` with `XXXX` representing the team number.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public TeamSimple teamNumber(Integer teamNumber) {
    
    this.teamNumber = teamNumber;
    return this;
  }

   /**
   * Official team number issued by FIRST.
   * @return teamNumber
  **/
  @ApiModelProperty(required = true, value = "Official team number issued by FIRST.")

  public Integer getTeamNumber() {
    return teamNumber;
  }


  public void setTeamNumber(Integer teamNumber) {
    this.teamNumber = teamNumber;
  }


  public TeamSimple nickname(String nickname) {
    
    this.nickname = nickname;
    return this;
  }

   /**
   * Team nickname provided by FIRST.
   * @return nickname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Team nickname provided by FIRST.")

  public String getNickname() {
    return nickname;
  }


  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public TeamSimple name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Official long name registered with FIRST.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Official long name registered with FIRST.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TeamSimple city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City of team derived from parsing the address registered with FIRST.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "City of team derived from parsing the address registered with FIRST.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public TeamSimple stateProv(String stateProv) {
    
    this.stateProv = stateProv;
    return this;
  }

   /**
   * State of team derived from parsing the address registered with FIRST.
   * @return stateProv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State of team derived from parsing the address registered with FIRST.")

  public String getStateProv() {
    return stateProv;
  }


  public void setStateProv(String stateProv) {
    this.stateProv = stateProv;
  }


  public TeamSimple country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Country of team derived from parsing the address registered with FIRST.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country of team derived from parsing the address registered with FIRST.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamSimple teamSimple = (TeamSimple) o;
    return Objects.equals(this.key, teamSimple.key) &&
        Objects.equals(this.teamNumber, teamSimple.teamNumber) &&
        Objects.equals(this.nickname, teamSimple.nickname) &&
        Objects.equals(this.name, teamSimple.name) &&
        Objects.equals(this.city, teamSimple.city) &&
        Objects.equals(this.stateProv, teamSimple.stateProv) &&
        Objects.equals(this.country, teamSimple.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, teamNumber, nickname, name, city, stateProv, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamSimple {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    teamNumber: ").append(toIndentedString(teamNumber)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateProv: ").append(toIndentedString(stateProv)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

