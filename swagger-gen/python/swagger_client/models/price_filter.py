# coding: utf-8

"""
    Bybit API

    ## REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]    # noqa: E501

    OpenAPI spec version: 0.2.10
    Contact: support@bybit.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class PriceFilter(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'min_price': 'str',
        'max_price': 'str',
        'tick_size': 'str'
    }

    attribute_map = {
        'min_price': 'min_price',
        'max_price': 'max_price',
        'tick_size': 'tick_size'
    }

    def __init__(self, min_price=None, max_price=None, tick_size=None):  # noqa: E501
        """PriceFilter - a model defined in Swagger"""  # noqa: E501

        self._min_price = None
        self._max_price = None
        self._tick_size = None
        self.discriminator = None

        if min_price is not None:
            self.min_price = min_price
        if max_price is not None:
            self.max_price = max_price
        if tick_size is not None:
            self.tick_size = tick_size

    @property
    def min_price(self):
        """Gets the min_price of this PriceFilter.  # noqa: E501


        :return: The min_price of this PriceFilter.  # noqa: E501
        :rtype: str
        """
        return self._min_price

    @min_price.setter
    def min_price(self, min_price):
        """Sets the min_price of this PriceFilter.


        :param min_price: The min_price of this PriceFilter.  # noqa: E501
        :type: str
        """

        self._min_price = min_price

    @property
    def max_price(self):
        """Gets the max_price of this PriceFilter.  # noqa: E501


        :return: The max_price of this PriceFilter.  # noqa: E501
        :rtype: str
        """
        return self._max_price

    @max_price.setter
    def max_price(self, max_price):
        """Sets the max_price of this PriceFilter.


        :param max_price: The max_price of this PriceFilter.  # noqa: E501
        :type: str
        """

        self._max_price = max_price

    @property
    def tick_size(self):
        """Gets the tick_size of this PriceFilter.  # noqa: E501


        :return: The tick_size of this PriceFilter.  # noqa: E501
        :rtype: str
        """
        return self._tick_size

    @tick_size.setter
    def tick_size(self, tick_size):
        """Sets the tick_size of this PriceFilter.


        :param tick_size: The tick_size of this PriceFilter.  # noqa: E501
        :type: str
        """

        self._tick_size = tick_size

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(PriceFilter, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, PriceFilter):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
