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
 * LinearMarketApi.h
 *
 * 
 */

#ifndef IO_SWAGGER_CLIENT_API_LinearMarketApi_H_
#define IO_SWAGGER_CLIENT_API_LinearMarketApi_H_


#include "../ApiClient.h"

#include "Object.h"
#include <cpprest/details/basic_types.h>

#include <boost/optional.hpp>

namespace io {
namespace swagger {
namespace client {
namespace api {

using namespace io::swagger::client::model;

class  LinearMarketApi
{
public:
    LinearMarketApi( std::shared_ptr<ApiClient> apiClient );
    virtual ~LinearMarketApi();
    /// <summary>
    /// Get recent trades
    /// </summary>
    /// <remarks>
    /// This will get recent trades
    /// </remarks>
    /// <param name="symbol">Contract type.</param>
    /// <param name="limit">Contract type. (optional)</param>
    pplx::task<std::shared_ptr<Object>> linearMarket_trading(
        utility::string_t symbol,
        boost::optional<utility::string_t> limit
    );

protected:
    std::shared_ptr<ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_API_LinearMarketApi_H_ */

