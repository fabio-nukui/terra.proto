//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/reflection/v2alpha1/reflection.proto

package cosmos.base.reflection.v2alpha1;

@kotlin.jvm.JvmSynthetic
inline fun getTxDescriptorResponse(block: cosmos.base.reflection.v2alpha1.GetTxDescriptorResponseKt.Dsl.() -> Unit): cosmos.base.reflection.v2alpha1.Reflection.GetTxDescriptorResponse =
  cosmos.base.reflection.v2alpha1.GetTxDescriptorResponseKt.Dsl._create(cosmos.base.reflection.v2alpha1.Reflection.GetTxDescriptorResponse.newBuilder()).apply { block() }._build()
object GetTxDescriptorResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: cosmos.base.reflection.v2alpha1.Reflection.GetTxDescriptorResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.reflection.v2alpha1.Reflection.GetTxDescriptorResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.reflection.v2alpha1.Reflection.GetTxDescriptorResponse = _builder.build()

    /**
     * <pre>
     * tx provides information on msgs that can be forwarded to the application
     * alongside the accepted transaction protobuf type
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.TxDescriptor tx = 1;</code>
     */
    var tx: cosmos.base.reflection.v2alpha1.Reflection.TxDescriptor
      @JvmName("getTx")
      get() = _builder.getTx()
      @JvmName("setTx")
      set(value) {
        _builder.setTx(value)
      }
    /**
     * <pre>
     * tx provides information on msgs that can be forwarded to the application
     * alongside the accepted transaction protobuf type
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.TxDescriptor tx = 1;</code>
     */
    fun clearTx() {
      _builder.clearTx()
    }
    /**
     * <pre>
     * tx provides information on msgs that can be forwarded to the application
     * alongside the accepted transaction protobuf type
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.TxDescriptor tx = 1;</code>
     * @return Whether the tx field is set.
     */
    fun hasTx(): kotlin.Boolean {
      return _builder.hasTx()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun cosmos.base.reflection.v2alpha1.Reflection.GetTxDescriptorResponse.copy(block: cosmos.base.reflection.v2alpha1.GetTxDescriptorResponseKt.Dsl.() -> Unit): cosmos.base.reflection.v2alpha1.Reflection.GetTxDescriptorResponse =
  cosmos.base.reflection.v2alpha1.GetTxDescriptorResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()