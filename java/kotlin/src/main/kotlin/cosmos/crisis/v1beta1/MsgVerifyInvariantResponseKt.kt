//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/crisis/v1beta1/tx.proto

package cosmos.crisis.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun msgVerifyInvariantResponse(block: cosmos.crisis.v1beta1.MsgVerifyInvariantResponseKt.Dsl.() -> Unit): cosmos.crisis.v1beta1.Tx.MsgVerifyInvariantResponse =
  cosmos.crisis.v1beta1.MsgVerifyInvariantResponseKt.Dsl._create(cosmos.crisis.v1beta1.Tx.MsgVerifyInvariantResponse.newBuilder()).apply { block() }._build()
object MsgVerifyInvariantResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: cosmos.crisis.v1beta1.Tx.MsgVerifyInvariantResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.crisis.v1beta1.Tx.MsgVerifyInvariantResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.crisis.v1beta1.Tx.MsgVerifyInvariantResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
inline fun cosmos.crisis.v1beta1.Tx.MsgVerifyInvariantResponse.copy(block: cosmos.crisis.v1beta1.MsgVerifyInvariantResponseKt.Dsl.() -> Unit): cosmos.crisis.v1beta1.Tx.MsgVerifyInvariantResponse =
  cosmos.crisis.v1beta1.MsgVerifyInvariantResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()