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



#include "LinearPrevFundingRateResp.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

LinearPrevFundingRateResp::LinearPrevFundingRateResp()
{
    m_Funding_rate = 0.0;
    m_Funding_rateIsSet = false;
    m_Funding_rate_timestamp = utility::conversions::to_string_t("");
    m_Funding_rate_timestampIsSet = false;
    m_Symbol = utility::conversions::to_string_t("");
    m_SymbolIsSet = false;
}

LinearPrevFundingRateResp::~LinearPrevFundingRateResp()
{
}

void LinearPrevFundingRateResp::validate()
{
    // TODO: implement validation
}

web::json::value LinearPrevFundingRateResp::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_Funding_rateIsSet)
    {
        val[utility::conversions::to_string_t("funding_rate")] = ModelBase::toJson(m_Funding_rate);
    }
    if(m_Funding_rate_timestampIsSet)
    {
        val[utility::conversions::to_string_t("funding_rate_timestamp")] = ModelBase::toJson(m_Funding_rate_timestamp);
    }
    if(m_SymbolIsSet)
    {
        val[utility::conversions::to_string_t("symbol")] = ModelBase::toJson(m_Symbol);
    }

    return val;
}

void LinearPrevFundingRateResp::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("funding_rate")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("funding_rate")];
        if(!fieldValue.is_null())
        {
            setFundingRate(ModelBase::doubleFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("funding_rate_timestamp")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("funding_rate_timestamp")];
        if(!fieldValue.is_null())
        {
            setFundingRateTimestamp(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("symbol")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("symbol")];
        if(!fieldValue.is_null())
        {
            setSymbol(ModelBase::stringFromJson(fieldValue));
        }
    }
}

void LinearPrevFundingRateResp::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_Funding_rateIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("funding_rate"), m_Funding_rate));
    }
    if(m_Funding_rate_timestampIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("funding_rate_timestamp"), m_Funding_rate_timestamp));
        
    }
    if(m_SymbolIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("symbol"), m_Symbol));
        
    }
}

void LinearPrevFundingRateResp::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("funding_rate")))
    {
        setFundingRate(ModelBase::doubleFromHttpContent(multipart->getContent(utility::conversions::to_string_t("funding_rate"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("funding_rate_timestamp")))
    {
        setFundingRateTimestamp(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("funding_rate_timestamp"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("symbol")))
    {
        setSymbol(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("symbol"))));
    }
}

double LinearPrevFundingRateResp::getFundingRate() const
{
    return m_Funding_rate;
}


void LinearPrevFundingRateResp::setFundingRate(double value)
{
    m_Funding_rate = value;
    m_Funding_rateIsSet = true;
}
bool LinearPrevFundingRateResp::fundingRateIsSet() const
{
    return m_Funding_rateIsSet;
}

void LinearPrevFundingRateResp::unsetFunding_rate()
{
    m_Funding_rateIsSet = false;
}

utility::string_t LinearPrevFundingRateResp::getFundingRateTimestamp() const
{
    return m_Funding_rate_timestamp;
}


void LinearPrevFundingRateResp::setFundingRateTimestamp(utility::string_t value)
{
    m_Funding_rate_timestamp = value;
    m_Funding_rate_timestampIsSet = true;
}
bool LinearPrevFundingRateResp::fundingRateTimestampIsSet() const
{
    return m_Funding_rate_timestampIsSet;
}

void LinearPrevFundingRateResp::unsetFunding_rate_timestamp()
{
    m_Funding_rate_timestampIsSet = false;
}

utility::string_t LinearPrevFundingRateResp::getSymbol() const
{
    return m_Symbol;
}


void LinearPrevFundingRateResp::setSymbol(utility::string_t value)
{
    m_Symbol = value;
    m_SymbolIsSet = true;
}
bool LinearPrevFundingRateResp::symbolIsSet() const
{
    return m_SymbolIsSet;
}

void LinearPrevFundingRateResp::unsetSymbol()
{
    m_SymbolIsSet = false;
}

}
}
}
}

