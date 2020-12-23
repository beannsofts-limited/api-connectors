//
// LinearClosePnlRecordsResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Linear Positions Result Base */

public struct LinearClosePnlRecordsResponse: Codable {

    public var retCode: Double?
    public var retMsg: String?
    public var extCode: String?
    public var extInfo: String?
    public var result: [LinearClosedPnlRecordResult]?
    public var timeNow: String?

    public init(retCode: Double?, retMsg: String?, extCode: String?, extInfo: String?, result: [LinearClosedPnlRecordResult]?, timeNow: String?) {
        self.retCode = retCode
        self.retMsg = retMsg
        self.extCode = extCode
        self.extInfo = extInfo
        self.result = result
        self.timeNow = timeNow
    }

    public enum CodingKeys: String, CodingKey { 
        case retCode = "ret_code"
        case retMsg = "ret_msg"
        case extCode = "ext_code"
        case extInfo = "ext_info"
        case result
        case timeNow = "time_now"
    }


}

