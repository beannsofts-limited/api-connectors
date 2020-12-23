<?php
/**
 * FundingRecords
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Bybit API
 *
 * ## REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]
 *
 * OpenAPI spec version: 0.2.10
 * Contact: support@bybit.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.8
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;
use \Swagger\Client\ObjectSerializer;

/**
 * FundingRecords Class Doc Comment
 *
 * @category Class
 * @description Get funding record response
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class FundingRecords implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'FundingRecords';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'id' => 'float',
        'user_id' => 'float',
        'coin' => 'string',
        'wallet_id' => 'float',
        'type' => 'string',
        'amount' => 'string',
        'tx_id' => 'string',
        'address' => 'string',
        'wallet_balance' => 'string',
        'exec_time' => 'string',
        'cross_seq' => 'float'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'id' => 'int32',
        'user_id' => 'int32',
        'coin' => null,
        'wallet_id' => 'int32',
        'type' => null,
        'amount' => null,
        'tx_id' => null,
        'address' => null,
        'wallet_balance' => null,
        'exec_time' => null,
        'cross_seq' => 'int64'
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'id' => 'id',
        'user_id' => 'user_id',
        'coin' => 'coin',
        'wallet_id' => 'wallet_id',
        'type' => 'type',
        'amount' => 'amount',
        'tx_id' => 'tx_id',
        'address' => 'address',
        'wallet_balance' => 'wallet_balance',
        'exec_time' => 'exec_time',
        'cross_seq' => 'cross_seq'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'id' => 'setId',
        'user_id' => 'setUserId',
        'coin' => 'setCoin',
        'wallet_id' => 'setWalletId',
        'type' => 'setType',
        'amount' => 'setAmount',
        'tx_id' => 'setTxId',
        'address' => 'setAddress',
        'wallet_balance' => 'setWalletBalance',
        'exec_time' => 'setExecTime',
        'cross_seq' => 'setCrossSeq'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'id' => 'getId',
        'user_id' => 'getUserId',
        'coin' => 'getCoin',
        'wallet_id' => 'getWalletId',
        'type' => 'getType',
        'amount' => 'getAmount',
        'tx_id' => 'getTxId',
        'address' => 'getAddress',
        'wallet_balance' => 'getWalletBalance',
        'exec_time' => 'getExecTime',
        'cross_seq' => 'getCrossSeq'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$swaggerModelName;
    }

    

    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['user_id'] = isset($data['user_id']) ? $data['user_id'] : null;
        $this->container['coin'] = isset($data['coin']) ? $data['coin'] : null;
        $this->container['wallet_id'] = isset($data['wallet_id']) ? $data['wallet_id'] : null;
        $this->container['type'] = isset($data['type']) ? $data['type'] : null;
        $this->container['amount'] = isset($data['amount']) ? $data['amount'] : null;
        $this->container['tx_id'] = isset($data['tx_id']) ? $data['tx_id'] : null;
        $this->container['address'] = isset($data['address']) ? $data['address'] : null;
        $this->container['wallet_balance'] = isset($data['wallet_balance']) ? $data['wallet_balance'] : null;
        $this->container['exec_time'] = isset($data['exec_time']) ? $data['exec_time'] : null;
        $this->container['cross_seq'] = isset($data['cross_seq']) ? $data['cross_seq'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets id
     *
     * @return float
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param float $id id
     *
     * @return $this
     */
    public function setId($id)
    {
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets user_id
     *
     * @return float
     */
    public function getUserId()
    {
        return $this->container['user_id'];
    }

    /**
     * Sets user_id
     *
     * @param float $user_id user_id
     *
     * @return $this
     */
    public function setUserId($user_id)
    {
        $this->container['user_id'] = $user_id;

        return $this;
    }

    /**
     * Gets coin
     *
     * @return string
     */
    public function getCoin()
    {
        return $this->container['coin'];
    }

    /**
     * Sets coin
     *
     * @param string $coin coin
     *
     * @return $this
     */
    public function setCoin($coin)
    {
        $this->container['coin'] = $coin;

        return $this;
    }

    /**
     * Gets wallet_id
     *
     * @return float
     */
    public function getWalletId()
    {
        return $this->container['wallet_id'];
    }

    /**
     * Sets wallet_id
     *
     * @param float $wallet_id wallet_id
     *
     * @return $this
     */
    public function setWalletId($wallet_id)
    {
        $this->container['wallet_id'] = $wallet_id;

        return $this;
    }

    /**
     * Gets type
     *
     * @return string
     */
    public function getType()
    {
        return $this->container['type'];
    }

    /**
     * Sets type
     *
     * @param string $type type
     *
     * @return $this
     */
    public function setType($type)
    {
        $this->container['type'] = $type;

        return $this;
    }

    /**
     * Gets amount
     *
     * @return string
     */
    public function getAmount()
    {
        return $this->container['amount'];
    }

    /**
     * Sets amount
     *
     * @param string $amount amount
     *
     * @return $this
     */
    public function setAmount($amount)
    {
        $this->container['amount'] = $amount;

        return $this;
    }

    /**
     * Gets tx_id
     *
     * @return string
     */
    public function getTxId()
    {
        return $this->container['tx_id'];
    }

    /**
     * Sets tx_id
     *
     * @param string $tx_id tx_id
     *
     * @return $this
     */
    public function setTxId($tx_id)
    {
        $this->container['tx_id'] = $tx_id;

        return $this;
    }

    /**
     * Gets address
     *
     * @return string
     */
    public function getAddress()
    {
        return $this->container['address'];
    }

    /**
     * Sets address
     *
     * @param string $address address
     *
     * @return $this
     */
    public function setAddress($address)
    {
        $this->container['address'] = $address;

        return $this;
    }

    /**
     * Gets wallet_balance
     *
     * @return string
     */
    public function getWalletBalance()
    {
        return $this->container['wallet_balance'];
    }

    /**
     * Sets wallet_balance
     *
     * @param string $wallet_balance wallet_balance
     *
     * @return $this
     */
    public function setWalletBalance($wallet_balance)
    {
        $this->container['wallet_balance'] = $wallet_balance;

        return $this;
    }

    /**
     * Gets exec_time
     *
     * @return string
     */
    public function getExecTime()
    {
        return $this->container['exec_time'];
    }

    /**
     * Sets exec_time
     *
     * @param string $exec_time exec_time
     *
     * @return $this
     */
    public function setExecTime($exec_time)
    {
        $this->container['exec_time'] = $exec_time;

        return $this;
    }

    /**
     * Gets cross_seq
     *
     * @return float
     */
    public function getCrossSeq()
    {
        return $this->container['cross_seq'];
    }

    /**
     * Sets cross_seq
     *
     * @param float $cross_seq cross_seq
     *
     * @return $this
     */
    public function setCrossSeq($cross_seq)
    {
        $this->container['cross_seq'] = $cross_seq;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(
                ObjectSerializer::sanitizeForSerialization($this),
                JSON_PRETTY_PRINT
            );
        }

        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


