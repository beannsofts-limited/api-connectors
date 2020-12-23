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



#include "OderBookRes.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

OderBookRes::OderBookRes()
{
    m_Symbol = utility::conversions::to_string_t("");
    m_SymbolIsSet = false;
    m_Price = utility::conversions::to_string_t("");
    m_PriceIsSet = false;
    m_Size = 0.0;
    m_SizeIsSet = false;
    m_Side = utility::conversions::to_string_t("");
    m_SideIsSet = false;
}

OderBookRes::~OderBookRes()
{
}

void OderBookRes::validate()
{
    // TODO: implement validation
}

web::json::value OderBookRes::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_SymbolIsSet)
    {
        val[utility::conversions::to_string_t("symbol")] = ModelBase::toJson(m_Symbol);
    }
    if(m_PriceIsSet)
    {
        val[utility::conversions::to_string_t("price")] = ModelBase::toJson(m_Price);
    }
    if(m_SizeIsSet)
    {
        val[utility::conversions::to_string_t("size")] = ModelBase::toJson(m_Size);
    }
    if(m_SideIsSet)
    {
        val[utility::conversions::to_string_t("side")] = ModelBase::toJson(m_Side);
    }

    return val;
}

void OderBookRes::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("symbol")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("symbol")];
        if(!fieldValue.is_null())
        {
            setSymbol(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("price")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("price")];
        if(!fieldValue.is_null())
        {
            setPrice(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("size")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("size")];
        if(!fieldValue.is_null())
        {
            setSize(ModelBase::doubleFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("side")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("side")];
        if(!fieldValue.is_null())
        {
            setSide(ModelBase::stringFromJson(fieldValue));
        }
    }
}

void OderBookRes::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_SymbolIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("symbol"), m_Symbol));
        
    }
    if(m_PriceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("price"), m_Price));
        
    }
    if(m_SizeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("size"), m_Size));
    }
    if(m_SideIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("side"), m_Side));
        
    }
}

void OderBookRes::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("symbol")))
    {
        setSymbol(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("symbol"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("price")))
    {
        setPrice(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("price"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("size")))
    {
        setSize(ModelBase::doubleFromHttpContent(multipart->getContent(utility::conversions::to_string_t("size"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("side")))
    {
        setSide(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("side"))));
    }
}

utility::string_t OderBookRes::getSymbol() const
{
    return m_Symbol;
}


void OderBookRes::setSymbol(utility::string_t value)
{
    m_Symbol = value;
    m_SymbolIsSet = true;
}
bool OderBookRes::symbolIsSet() const
{
    return m_SymbolIsSet;
}

void OderBookRes::unsetSymbol()
{
    m_SymbolIsSet = false;
}

utility::string_t OderBookRes::getPrice() const
{
    return m_Price;
}


void OderBookRes::setPrice(utility::string_t value)
{
    m_Price = value;
    m_PriceIsSet = true;
}
bool OderBookRes::priceIsSet() const
{
    return m_PriceIsSet;
}

void OderBookRes::unsetPrice()
{
    m_PriceIsSet = false;
}

double OderBookRes::getSize() const
{
    return m_Size;
}


void OderBookRes::setSize(double value)
{
    m_Size = value;
    m_SizeIsSet = true;
}
bool OderBookRes::sizeIsSet() const
{
    return m_SizeIsSet;
}

void OderBookRes::unsetSize()
{
    m_SizeIsSet = false;
}

utility::string_t OderBookRes::getSide() const
{
    return m_Side;
}


void OderBookRes::setSide(utility::string_t value)
{
    m_Side = value;
    m_SideIsSet = true;
}
bool OderBookRes::sideIsSet() const
{
    return m_SideIsSet;
}

void OderBookRes::unsetSide()
{
    m_SideIsSet = false;
}

}
}
}
}

