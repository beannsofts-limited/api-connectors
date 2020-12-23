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

# Unit tests for SwaggerClient::CommonApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'CommonApi' do
  before do
    # run before each test
    @instance = SwaggerClient::CommonApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of CommonApi' do
    it 'should create an instance of CommonApi' do
      expect(@instance).to be_instance_of(SwaggerClient::CommonApi)
    end
  end

  # unit tests for common_announcements
  # Get Bybit OpenAPI announcements in the last 30 days in reverse order.
  # @param [Hash] opts the optional parameters
  # @return [Object]
  describe 'common_announcements test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for common_get_lcp
  # Query LCP info.
  # @param symbol Contract type
  # @param [Hash] opts the optional parameters
  # @return [Object]
  describe 'common_get_lcp test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for common_get_time
  # Get bybit server time.
  # @param [Hash] opts the optional parameters
  # @return [Object]
  describe 'common_get_time test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
