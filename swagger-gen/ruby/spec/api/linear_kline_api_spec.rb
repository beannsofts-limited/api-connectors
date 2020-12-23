=begin
#Bybit API

### REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  

OpenAPI spec version: 0.2.10
Contact: support@bybit.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.8

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::LinearKlineApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'LinearKlineApi' do
  before do
    # run before each test
    @instance = SwaggerClient::LinearKlineApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of LinearKlineApi' do
    it 'should create an instance of LinearKlineApi' do
      expect(@instance).to be_instance_of(SwaggerClient::LinearKlineApi)
    end
  end

  # unit tests for linear_kline_get
  # Get kline
  # This will get kline
  # @param symbol Contract type.
  # @param interval Kline interval.
  # @param from from timestamp.
  # @param [Hash] opts the optional parameters
  # @option opts [Float] :limit Contract type.
  # @return [Object]
  describe 'linear_kline_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for linear_kline_mark_price
  # Get kline
  # This will get mark price kline
  # @param symbol Contract type.
  # @param interval Kline interval.
  # @param from from timestamp.
  # @param [Hash] opts the optional parameters
  # @option opts [Float] :limit Contract type.
  # @return [Object]
  describe 'linear_kline_mark_price test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
