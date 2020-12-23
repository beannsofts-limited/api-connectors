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


class V2OrderRes(object):
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
        'user_id': 'float',
        'order_status': 'str',
        'symbol': 'str',
        'side': 'str',
        'order_type': 'str',
        'price': 'str',
        'qty': 'str',
        'time_in_force': 'str',
        'order_link_id': 'str',
        'order_id': 'str',
        'created_at': 'str',
        'updated_at': 'str',
        'leaves_qty': 'str',
        'leaves_value': 'str',
        'cum_exec_qty': 'str',
        'cum_exec_value': 'str',
        'cum_exec_fee': 'str',
        'reject_reason': 'str'
    }

    attribute_map = {
        'user_id': 'user_id',
        'order_status': 'order_status',
        'symbol': 'symbol',
        'side': 'side',
        'order_type': 'order_type',
        'price': 'price',
        'qty': 'qty',
        'time_in_force': 'time_in_force',
        'order_link_id': 'order_link_id',
        'order_id': 'order_id',
        'created_at': 'created_at',
        'updated_at': 'updated_at',
        'leaves_qty': 'leaves_qty',
        'leaves_value': 'leaves_value',
        'cum_exec_qty': 'cum_exec_qty',
        'cum_exec_value': 'cum_exec_value',
        'cum_exec_fee': 'cum_exec_fee',
        'reject_reason': 'reject_reason'
    }

    def __init__(self, user_id=None, order_status=None, symbol=None, side=None, order_type=None, price=None, qty=None, time_in_force=None, order_link_id=None, order_id=None, created_at=None, updated_at=None, leaves_qty=None, leaves_value=None, cum_exec_qty=None, cum_exec_value=None, cum_exec_fee=None, reject_reason=None):  # noqa: E501
        """V2OrderRes - a model defined in Swagger"""  # noqa: E501

        self._user_id = None
        self._order_status = None
        self._symbol = None
        self._side = None
        self._order_type = None
        self._price = None
        self._qty = None
        self._time_in_force = None
        self._order_link_id = None
        self._order_id = None
        self._created_at = None
        self._updated_at = None
        self._leaves_qty = None
        self._leaves_value = None
        self._cum_exec_qty = None
        self._cum_exec_value = None
        self._cum_exec_fee = None
        self._reject_reason = None
        self.discriminator = None

        if user_id is not None:
            self.user_id = user_id
        if order_status is not None:
            self.order_status = order_status
        if symbol is not None:
            self.symbol = symbol
        if side is not None:
            self.side = side
        if order_type is not None:
            self.order_type = order_type
        if price is not None:
            self.price = price
        if qty is not None:
            self.qty = qty
        if time_in_force is not None:
            self.time_in_force = time_in_force
        if order_link_id is not None:
            self.order_link_id = order_link_id
        if order_id is not None:
            self.order_id = order_id
        if created_at is not None:
            self.created_at = created_at
        if updated_at is not None:
            self.updated_at = updated_at
        if leaves_qty is not None:
            self.leaves_qty = leaves_qty
        if leaves_value is not None:
            self.leaves_value = leaves_value
        if cum_exec_qty is not None:
            self.cum_exec_qty = cum_exec_qty
        if cum_exec_value is not None:
            self.cum_exec_value = cum_exec_value
        if cum_exec_fee is not None:
            self.cum_exec_fee = cum_exec_fee
        if reject_reason is not None:
            self.reject_reason = reject_reason

    @property
    def user_id(self):
        """Gets the user_id of this V2OrderRes.  # noqa: E501


        :return: The user_id of this V2OrderRes.  # noqa: E501
        :rtype: float
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id):
        """Sets the user_id of this V2OrderRes.


        :param user_id: The user_id of this V2OrderRes.  # noqa: E501
        :type: float
        """

        self._user_id = user_id

    @property
    def order_status(self):
        """Gets the order_status of this V2OrderRes.  # noqa: E501


        :return: The order_status of this V2OrderRes.  # noqa: E501
        :rtype: str
        """
        return self._order_status

    @order_status.setter
    def order_status(self, order_status):
        """Sets the order_status of this V2OrderRes.


        :param order_status: The order_status of this V2OrderRes.  # noqa: E501
        :type: str
        """

        self._order_status = order_status

    @property
    def symbol(self):
        """Gets the symbol of this V2OrderRes.  # noqa: E501


        :return: The symbol of this V2OrderRes.  # noqa: E501
        :rtype: str
        """
        return self._symbol

    @symbol.setter
    def symbol(self, symbol):
        """Sets the symbol of this V2OrderRes.


        :param symbol: The symbol of this V2OrderRes.  # noqa: E501
        :type: str
        """

        self._symbol = symbol

    @property
    def side(self):
        """Gets the side of this V2OrderRes.  # noqa: E501


        :return: The side of this V2OrderRes.  # noqa: E501
        :rtype: str
        """
        return self._side

    @side.setter
    def side(self, side):
        """Sets the side of this V2OrderRes.


        :param side: The side of this V2OrderRes.  # noqa: E501
        :type: str
        """

        self._side = side

    @property
    def order_type(self):
        """Gets the order_type of this V2OrderRes.  # noqa: E501


        :return: The order_type of this V2OrderRes.  # noqa: E501
        :rtype: str
        """
        return self._order_type

    @order_type.setter
    def order_type(self, order_type):
        """Sets the order_type of this V2OrderRes.


        :param order_type: The order_type of this V2OrderRes.  # noqa: E501
        :type: str
        """

        self._order_type = order_type

    @property
    def price(self):
        """Gets the price of this V2OrderRes.  # noqa: E501


        :return: The price of this V2OrderRes.  # noqa: E501
        :rtype: str
        """
        return self._price

    @price.setter
    def price(self, price):
        """Sets the price of this V2OrderRes.


        :param price: The price of this V2OrderRes.  # noqa: E501
        :type: str
        """

        self._price = price

    @property
    def qty(self):
        """Gets the qty of this V2OrderRes.  # noqa: E501


        :return: The qty of this V2OrderRes.  # noqa: E501
        :rtype: str
        """
        return self._qty

    @qty.setter
    def qty(self, qty):
        """Sets the qty of this V2OrderRes.


        :param qty: The qty of this V2OrderRes.  # noqa: E501
        :type: str
        """

        self._qty = qty

    @property
    def time_in_force(self):
        """Gets the time_in_force of this V2OrderRes.  # noqa: E501


        :return: The time_in_force of this V2OrderRes.  # noqa: E501
        :rtype: str
        """
        return self._time_in_force

    @time_in_force.setter
    def time_in_force(self, time_in_force):
        """Sets the time_in_force of this V2OrderRes.


        :param time_in_force: The time_in_force of this V2OrderRes.  # noqa: E501
        :type: str
        """

        self._time_in_force = time_in_force

    @property
    def order_link_id(self):
        """Gets the order_link_id of this V2OrderRes.  # noqa: E501


        :return: The order_link_id of this V2OrderRes.  # noqa: E501
        :rtype: str
        """
        return self._order_link_id

    @order_link_id.setter
    def order_link_id(self, order_link_id):
        """Sets the order_link_id of this V2OrderRes.


        :param order_link_id: The order_link_id of this V2OrderRes.  # noqa: E501
        :type: str
        """

        self._order_link_id = order_link_id

    @property
    def order_id(self):
        """Gets the order_id of this V2OrderRes.  # noqa: E501


        :return: The order_id of this V2OrderRes.  # noqa: E501
        :rtype: str
        """
        return self._order_id

    @order_id.setter
    def order_id(self, order_id):
        """Sets the order_id of this V2OrderRes.


        :param order_id: The order_id of this V2OrderRes.  # noqa: E501
        :type: str
        """

        self._order_id = order_id

    @property
    def created_at(self):
        """Gets the created_at of this V2OrderRes.  # noqa: E501


        :return: The created_at of this V2OrderRes.  # noqa: E501
        :rtype: str
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at):
        """Sets the created_at of this V2OrderRes.


        :param created_at: The created_at of this V2OrderRes.  # noqa: E501
        :type: str
        """

        self._created_at = created_at

    @property
    def updated_at(self):
        """Gets the updated_at of this V2OrderRes.  # noqa: E501


        :return: The updated_at of this V2OrderRes.  # noqa: E501
        :rtype: str
        """
        return self._updated_at

    @updated_at.setter
    def updated_at(self, updated_at):
        """Sets the updated_at of this V2OrderRes.


        :param updated_at: The updated_at of this V2OrderRes.  # noqa: E501
        :type: str
        """

        self._updated_at = updated_at

    @property
    def leaves_qty(self):
        """Gets the leaves_qty of this V2OrderRes.  # noqa: E501


        :return: The leaves_qty of this V2OrderRes.  # noqa: E501
        :rtype: str
        """
        return self._leaves_qty

    @leaves_qty.setter
    def leaves_qty(self, leaves_qty):
        """Sets the leaves_qty of this V2OrderRes.


        :param leaves_qty: The leaves_qty of this V2OrderRes.  # noqa: E501
        :type: str
        """

        self._leaves_qty = leaves_qty

    @property
    def leaves_value(self):
        """Gets the leaves_value of this V2OrderRes.  # noqa: E501


        :return: The leaves_value of this V2OrderRes.  # noqa: E501
        :rtype: str
        """
        return self._leaves_value

    @leaves_value.setter
    def leaves_value(self, leaves_value):
        """Sets the leaves_value of this V2OrderRes.


        :param leaves_value: The leaves_value of this V2OrderRes.  # noqa: E501
        :type: str
        """

        self._leaves_value = leaves_value

    @property
    def cum_exec_qty(self):
        """Gets the cum_exec_qty of this V2OrderRes.  # noqa: E501


        :return: The cum_exec_qty of this V2OrderRes.  # noqa: E501
        :rtype: str
        """
        return self._cum_exec_qty

    @cum_exec_qty.setter
    def cum_exec_qty(self, cum_exec_qty):
        """Sets the cum_exec_qty of this V2OrderRes.


        :param cum_exec_qty: The cum_exec_qty of this V2OrderRes.  # noqa: E501
        :type: str
        """

        self._cum_exec_qty = cum_exec_qty

    @property
    def cum_exec_value(self):
        """Gets the cum_exec_value of this V2OrderRes.  # noqa: E501


        :return: The cum_exec_value of this V2OrderRes.  # noqa: E501
        :rtype: str
        """
        return self._cum_exec_value

    @cum_exec_value.setter
    def cum_exec_value(self, cum_exec_value):
        """Sets the cum_exec_value of this V2OrderRes.


        :param cum_exec_value: The cum_exec_value of this V2OrderRes.  # noqa: E501
        :type: str
        """

        self._cum_exec_value = cum_exec_value

    @property
    def cum_exec_fee(self):
        """Gets the cum_exec_fee of this V2OrderRes.  # noqa: E501


        :return: The cum_exec_fee of this V2OrderRes.  # noqa: E501
        :rtype: str
        """
        return self._cum_exec_fee

    @cum_exec_fee.setter
    def cum_exec_fee(self, cum_exec_fee):
        """Sets the cum_exec_fee of this V2OrderRes.


        :param cum_exec_fee: The cum_exec_fee of this V2OrderRes.  # noqa: E501
        :type: str
        """

        self._cum_exec_fee = cum_exec_fee

    @property
    def reject_reason(self):
        """Gets the reject_reason of this V2OrderRes.  # noqa: E501


        :return: The reject_reason of this V2OrderRes.  # noqa: E501
        :rtype: str
        """
        return self._reject_reason

    @reject_reason.setter
    def reject_reason(self, reject_reason):
        """Sets the reject_reason of this V2OrderRes.


        :param reject_reason: The reject_reason of this V2OrderRes.  # noqa: E501
        :type: str
        """

        self._reject_reason = reject_reason

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
        if issubclass(V2OrderRes, dict):
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
        if not isinstance(other, V2OrderRes):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
