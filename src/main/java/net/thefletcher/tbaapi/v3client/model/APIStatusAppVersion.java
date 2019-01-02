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
 * APIStatusAppVersion
 */

public class APIStatusAppVersion {
  @SerializedName("min_app_version")
  private Integer minAppVersion = null;

  @SerializedName("latest_app_version")
  private Integer latestAppVersion = null;

  public APIStatusAppVersion minAppVersion(Integer minAppVersion) {
    this.minAppVersion = minAppVersion;
    return this;
  }

   /**
   * Internal use - Minimum application version required to correctly connect and process data.
   * @return minAppVersion
  **/
  @ApiModelProperty(required = true, value = "Internal use - Minimum application version required to correctly connect and process data.")
  public Integer getMinAppVersion() {
    return minAppVersion;
  }

  public void setMinAppVersion(Integer minAppVersion) {
    this.minAppVersion = minAppVersion;
  }

  public APIStatusAppVersion latestAppVersion(Integer latestAppVersion) {
    this.latestAppVersion = latestAppVersion;
    return this;
  }

   /**
   * Internal use - Latest application version available.
   * @return latestAppVersion
  **/
  @ApiModelProperty(required = true, value = "Internal use - Latest application version available.")
  public Integer getLatestAppVersion() {
    return latestAppVersion;
  }

  public void setLatestAppVersion(Integer latestAppVersion) {
    this.latestAppVersion = latestAppVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIStatusAppVersion apIStatusAppVersion = (APIStatusAppVersion) o;
    return Objects.equals(this.minAppVersion, apIStatusAppVersion.minAppVersion) &&
        Objects.equals(this.latestAppVersion, apIStatusAppVersion.latestAppVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minAppVersion, latestAppVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIStatusAppVersion {\n");
    
    sb.append("    minAppVersion: ").append(toIndentedString(minAppVersion)).append("\n");
    sb.append("    latestAppVersion: ").append(toIndentedString(latestAppVersion)).append("\n");
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

