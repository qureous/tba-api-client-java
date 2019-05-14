//
// MatchScoreBreakdown2015Alliance.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct MatchScoreBreakdown2015Alliance: Codable {

    public var autoPoints: Int?
    public var teleopPoints: Int?
    public var containerPoints: Int?
    public var totePoints: Int?
    public var litterPoints: Int?
    public var foulPoints: Int?
    public var adjustPoints: Int?
    public var totalPoints: Int?
    public var foulCount: Int?
    public var toteCountFar: Int?
    public var toteCountNear: Int?
    public var toteSet: Bool?
    public var toteStack: Bool?
    public var containerCountLevel1: Int?
    public var containerCountLevel2: Int?
    public var containerCountLevel3: Int?
    public var containerCountLevel4: Int?
    public var containerCountLevel5: Int?
    public var containerCountLevel6: Int?
    public var containerSet: Bool?
    public var litterCountContainer: Int?
    public var litterCountLandfill: Int?
    public var litterCountUnprocessed: Int?
    public var robotSet: Bool?

    public init(autoPoints: Int?, teleopPoints: Int?, containerPoints: Int?, totePoints: Int?, litterPoints: Int?, foulPoints: Int?, adjustPoints: Int?, totalPoints: Int?, foulCount: Int?, toteCountFar: Int?, toteCountNear: Int?, toteSet: Bool?, toteStack: Bool?, containerCountLevel1: Int?, containerCountLevel2: Int?, containerCountLevel3: Int?, containerCountLevel4: Int?, containerCountLevel5: Int?, containerCountLevel6: Int?, containerSet: Bool?, litterCountContainer: Int?, litterCountLandfill: Int?, litterCountUnprocessed: Int?, robotSet: Bool?) {
        self.autoPoints = autoPoints
        self.teleopPoints = teleopPoints
        self.containerPoints = containerPoints
        self.totePoints = totePoints
        self.litterPoints = litterPoints
        self.foulPoints = foulPoints
        self.adjustPoints = adjustPoints
        self.totalPoints = totalPoints
        self.foulCount = foulCount
        self.toteCountFar = toteCountFar
        self.toteCountNear = toteCountNear
        self.toteSet = toteSet
        self.toteStack = toteStack
        self.containerCountLevel1 = containerCountLevel1
        self.containerCountLevel2 = containerCountLevel2
        self.containerCountLevel3 = containerCountLevel3
        self.containerCountLevel4 = containerCountLevel4
        self.containerCountLevel5 = containerCountLevel5
        self.containerCountLevel6 = containerCountLevel6
        self.containerSet = containerSet
        self.litterCountContainer = litterCountContainer
        self.litterCountLandfill = litterCountLandfill
        self.litterCountUnprocessed = litterCountUnprocessed
        self.robotSet = robotSet
    }

    public enum CodingKeys: String, CodingKey { 
        case autoPoints = "auto_points"
        case teleopPoints = "teleop_points"
        case containerPoints = "container_points"
        case totePoints = "tote_points"
        case litterPoints = "litter_points"
        case foulPoints = "foul_points"
        case adjustPoints = "adjust_points"
        case totalPoints = "total_points"
        case foulCount = "foul_count"
        case toteCountFar = "tote_count_far"
        case toteCountNear = "tote_count_near"
        case toteSet = "tote_set"
        case toteStack = "tote_stack"
        case containerCountLevel1 = "container_count_level1"
        case containerCountLevel2 = "container_count_level2"
        case containerCountLevel3 = "container_count_level3"
        case containerCountLevel4 = "container_count_level4"
        case containerCountLevel5 = "container_count_level5"
        case containerCountLevel6 = "container_count_level6"
        case containerSet = "container_set"
        case litterCountContainer = "litter_count_container"
        case litterCountLandfill = "litter_count_landfill"
        case litterCountUnprocessed = "litter_count_unprocessed"
        case robotSet = "robot_set"
    }


}

