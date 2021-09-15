//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package cosmos.staking.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun queryRedelegationsResponse(block: cosmos.staking.v1beta1.QueryRedelegationsResponseKt.Dsl.() -> Unit): cosmos.staking.v1beta1.QueryOuterClass.QueryRedelegationsResponse =
  cosmos.staking.v1beta1.QueryRedelegationsResponseKt.Dsl._create(cosmos.staking.v1beta1.QueryOuterClass.QueryRedelegationsResponse.newBuilder()).apply { block() }._build()
object QueryRedelegationsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: cosmos.staking.v1beta1.QueryOuterClass.QueryRedelegationsResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.staking.v1beta1.QueryOuterClass.QueryRedelegationsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.staking.v1beta1.QueryOuterClass.QueryRedelegationsResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class RedelegationResponsesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [(.gogoproto.nullable) = false];</code>
     */
     val redelegationResponses: com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.RedelegationResponse, RedelegationResponsesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getRedelegationResponsesList()
      )
    /**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [(.gogoproto.nullable) = false];</code>
     * @param value The redelegationResponses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addRedelegationResponses")
    fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.RedelegationResponse, RedelegationResponsesProxy>.add(value: cosmos.staking.v1beta1.Staking.RedelegationResponse) {
      _builder.addRedelegationResponses(value)
    }/**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [(.gogoproto.nullable) = false];</code>
     * @param value The redelegationResponses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignRedelegationResponses")
    inline operator fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.RedelegationResponse, RedelegationResponsesProxy>.plusAssign(value: cosmos.staking.v1beta1.Staking.RedelegationResponse) {
      add(value)
    }/**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [(.gogoproto.nullable) = false];</code>
     * @param values The redelegationResponses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllRedelegationResponses")
    fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.RedelegationResponse, RedelegationResponsesProxy>.addAll(values: kotlin.collections.Iterable<cosmos.staking.v1beta1.Staking.RedelegationResponse>) {
      _builder.addAllRedelegationResponses(values)
    }/**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [(.gogoproto.nullable) = false];</code>
     * @param values The redelegationResponses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllRedelegationResponses")
    inline operator fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.RedelegationResponse, RedelegationResponsesProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.staking.v1beta1.Staking.RedelegationResponse>) {
      addAll(values)
    }/**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [(.gogoproto.nullable) = false];</code>
     * @param index The index to set the value at.
     * @param value The redelegationResponses to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setRedelegationResponses")
    operator fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.RedelegationResponse, RedelegationResponsesProxy>.set(index: kotlin.Int, value: cosmos.staking.v1beta1.Staking.RedelegationResponse) {
      _builder.setRedelegationResponses(index, value)
    }/**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [(.gogoproto.nullable) = false];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearRedelegationResponses")
    fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.RedelegationResponse, RedelegationResponsesProxy>.clear() {
      _builder.clearRedelegationResponses()
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    var pagination: cosmos.base.query.v1beta1.Pagination.PageResponse
      @JvmName("getPagination")
      get() = _builder.getPagination()
      @JvmName("setPagination")
      set(value) {
        _builder.setPagination(value)
      }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     * @return Whether the pagination field is set.
     */
    fun hasPagination(): kotlin.Boolean {
      return _builder.hasPagination()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun cosmos.staking.v1beta1.QueryOuterClass.QueryRedelegationsResponse.copy(block: cosmos.staking.v1beta1.QueryRedelegationsResponseKt.Dsl.() -> Unit): cosmos.staking.v1beta1.QueryOuterClass.QueryRedelegationsResponse =
  cosmos.staking.v1beta1.QueryRedelegationsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
