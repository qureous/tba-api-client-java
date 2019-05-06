/*
 * The Blue Alliance API v3
 * # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
 *
 * OpenAPI spec version: 3.04.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package net.thefletcher.tbaapi.v3client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import net.thefletcher.tbaapi.v3client.model.TeamEventStatusAlliance;
import net.thefletcher.tbaapi.v3client.model.TeamEventStatusPlayoff;
import net.thefletcher.tbaapi.v3client.model.TeamEventStatusRank;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for TeamEventStatus
 */
public class TeamEventStatusTest {
    private final TeamEventStatus model = new TeamEventStatus();

    /**
     * Model tests for TeamEventStatus
     */
    @Test
    public void testTeamEventStatus() {
        // TODO: test TeamEventStatus
    }

    /**
     * Test the property 'qual'
     */
    @Test
    public void qualTest() {
        // TODO: test qual
    }

    /**
     * Test the property 'alliance'
     */
    @Test
    public void allianceTest() {
        // TODO: test alliance
    }

    /**
     * Test the property 'playoff'
     */
    @Test
    public void playoffTest() {
        // TODO: test playoff
    }

    /**
     * Test the property 'allianceStatusStr'
     */
    @Test
    public void allianceStatusStrTest() {
        // TODO: test allianceStatusStr
    }

    /**
     * Test the property 'playoffStatusStr'
     */
    @Test
    public void playoffStatusStrTest() {
        // TODO: test playoffStatusStr
    }

    /**
     * Test the property 'overallStatusStr'
     */
    @Test
    public void overallStatusStrTest() {
        // TODO: test overallStatusStr
    }

    /**
     * Test the property 'nextMatchKey'
     */
    @Test
    public void nextMatchKeyTest() {
        // TODO: test nextMatchKey
    }

    /**
     * Test the property 'lastMatchKey'
     */
    @Test
    public void lastMatchKeyTest() {
        // TODO: test lastMatchKey
    }

}
