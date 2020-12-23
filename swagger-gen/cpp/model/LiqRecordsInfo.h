/**
 * Bybit API
 * ## REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  
 *
 * OpenAPI spec version: 0.2.10
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator 2.4.8.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/*
 * LiqRecordsInfo.h
 *
 * 
 */

#ifndef IO_SWAGGER_CLIENT_MODEL_LiqRecordsInfo_H_
#define IO_SWAGGER_CLIENT_MODEL_LiqRecordsInfo_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  LiqRecordsInfo
    : public ModelBase
{
public:
    LiqRecordsInfo();
    virtual ~LiqRecordsInfo();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// LiqRecordsInfo members

    /// <summary>
    /// 
    /// </summary>
    int32_t getId() const;
    bool idIsSet() const;
    void unsetId();
    void setId(int32_t value);
    /// <summary>
    /// 
    /// </summary>
    int32_t getQty() const;
    bool qtyIsSet() const;
    void unsetQty();
    void setQty(int32_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getSide() const;
    bool sideIsSet() const;
    void unsetSide();
    void setSide(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    int32_t getTime() const;
    bool timeIsSet() const;
    void unsetTime();
    void setTime(int32_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getSymbol() const;
    bool symbolIsSet() const;
    void unsetSymbol();
    void setSymbol(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    int32_t getPrice() const;
    bool priceIsSet() const;
    void unsetPrice();
    void setPrice(int32_t value);

protected:
    int32_t m_Id;
    bool m_IdIsSet;
    int32_t m_Qty;
    bool m_QtyIsSet;
    utility::string_t m_Side;
    bool m_SideIsSet;
    int32_t m_Time;
    bool m_TimeIsSet;
    utility::string_t m_Symbol;
    bool m_SymbolIsSet;
    int32_t m_Price;
    bool m_PriceIsSet;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_MODEL_LiqRecordsInfo_H_ */
