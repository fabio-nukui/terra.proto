//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: terra/oracle/v1beta1/tx.proto

package terra.oracle.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun msgDelegateFeedConsent(block: terra.oracle.v1beta1.MsgDelegateFeedConsentKt.Dsl.() -> Unit): terra.oracle.v1beta1.Tx.MsgDelegateFeedConsent =
  terra.oracle.v1beta1.MsgDelegateFeedConsentKt.Dsl._create(terra.oracle.v1beta1.Tx.MsgDelegateFeedConsent.newBuilder()).apply { block() }._build()
object MsgDelegateFeedConsentKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: terra.oracle.v1beta1.Tx.MsgDelegateFeedConsent.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: terra.oracle.v1beta1.Tx.MsgDelegateFeedConsent.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): terra.oracle.v1beta1.Tx.MsgDelegateFeedConsent = _builder.build()

    /**
     * <code>string operator = 1 [(.gogoproto.moretags) = "yaml:&#92;"operator&#92;""];</code>
     */
    var operator: kotlin.String
      @JvmName("getOperator")
      get() = _builder.getOperator()
      @JvmName("setOperator")
      set(value) {
        _builder.setOperator(value)
      }
    /**
     * <code>string operator = 1 [(.gogoproto.moretags) = "yaml:&#92;"operator&#92;""];</code>
     */
    fun clearOperator() {
      _builder.clearOperator()
    }

    /**
     * <code>string delegate = 2 [(.gogoproto.moretags) = "yaml:&#92;"delegate&#92;""];</code>
     */
    var delegate: kotlin.String
      @JvmName("getDelegate")
      get() = _builder.getDelegate()
      @JvmName("setDelegate")
      set(value) {
        _builder.setDelegate(value)
      }
    /**
     * <code>string delegate = 2 [(.gogoproto.moretags) = "yaml:&#92;"delegate&#92;""];</code>
     */
    fun clearDelegate() {
      _builder.clearDelegate()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun terra.oracle.v1beta1.Tx.MsgDelegateFeedConsent.copy(block: terra.oracle.v1beta1.MsgDelegateFeedConsentKt.Dsl.() -> Unit): terra.oracle.v1beta1.Tx.MsgDelegateFeedConsent =
  terra.oracle.v1beta1.MsgDelegateFeedConsentKt.Dsl._create(this.toBuilder()).apply { block() }._build()
