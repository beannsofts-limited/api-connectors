//
// LinearRiskLimitResp.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct LinearRiskLimitResp: Codable {

    public var createdAt: String?
    public var _id: Int?
    public var isLowestRisk: Int?
    public var limit: Int64?
    public var maintainMargin: Double?
    public var section: [String]?
    public var startingMargin: Double?
    public var symbol: String?
    public var updatedAt: String?

    public init(createdAt: String?, _id: Int?, isLowestRisk: Int?, limit: Int64?, maintainMargin: Double?, section: [String]?, startingMargin: Double?, symbol: String?, updatedAt: String?) {
        self.createdAt = createdAt
        self._id = _id
        self.isLowestRisk = isLowestRisk
        self.limit = limit
        self.maintainMargin = maintainMargin
        self.section = section
        self.startingMargin = startingMargin
        self.symbol = symbol
        self.updatedAt = updatedAt
    }

    public enum CodingKeys: String, CodingKey { 
        case createdAt = "created_at"
        case _id = "id"
        case isLowestRisk = "is_lowest_risk"
        case limit
        case maintainMargin = "maintain_margin"
        case section
        case startingMargin = "starting_margin"
        case symbol
        case updatedAt = "updated_at"
    }


}

