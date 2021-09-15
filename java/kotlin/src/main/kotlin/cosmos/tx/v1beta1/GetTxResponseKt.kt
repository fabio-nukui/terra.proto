//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/tx/v1beta1/service.proto

package cosmos.tx.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun getTxResponse(block: cosmos.tx.v1beta1.GetTxResponseKt.Dsl.() -> Unit): cosmos.tx.v1beta1.ServiceOuterClass.GetTxResponse =
  cosmos.tx.v1beta1.GetTxResponseKt.Dsl._create(cosmos.tx.v1beta1.ServiceOuterClass.GetTxResponse.newBuilder()).apply { block() }._build()
object GetTxResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: cosmos.tx.v1beta1.ServiceOuterClass.GetTxResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.tx.v1beta1.ServiceOuterClass.GetTxResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.tx.v1beta1.ServiceOuterClass.GetTxResponse = _builder.build()

    /**
     * <pre>
     * tx is the queried transaction.
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.Tx tx = 1;</code>
     */
    var tx: cosmos.tx.v1beta1.TxOuterClass.Tx
      @JvmName("getTx")
      get() = _builder.getTx()
      @JvmName("setTx")
      set(value) {
        _builder.setTx(value)
      }
    /**
     * <pre>
     * tx is the queried transaction.
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.Tx tx = 1;</code>
     */
    fun clearTx() {
      _builder.clearTx()
    }
    /**
     * <pre>
     * tx is the queried transaction.
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.Tx tx = 1;</code>
     * @return Whether the tx field is set.
     */
    fun hasTx(): kotlin.Boolean {
      return _builder.hasTx()
    }

    /**
     * <pre>
     * tx_response is the queried TxResponses.
     * </pre>
     *
     * <code>.cosmos.base.abci.v1beta1.TxResponse tx_response = 2;</code>
     */
    var txResponse: cosmos.base.abci.v1beta1.Abci.TxResponse
      @JvmName("getTxResponse")
      get() = _builder.getTxResponse()
      @JvmName("setTxResponse")
      set(value) {
        _builder.setTxResponse(value)
      }
    /**
     * <pre>
     * tx_response is the queried TxResponses.
     * </pre>
     *
     * <code>.cosmos.base.abci.v1beta1.TxResponse tx_response = 2;</code>
     */
    fun clearTxResponse() {
      _builder.clearTxResponse()
    }
    /**
     * <pre>
     * tx_response is the queried TxResponses.
     * </pre>
     *
     * <code>.cosmos.base.abci.v1beta1.TxResponse tx_response = 2;</code>
     * @return Whether the txResponse field is set.
     */
    fun hasTxResponse(): kotlin.Boolean {
      return _builder.hasTxResponse()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun cosmos.tx.v1beta1.ServiceOuterClass.GetTxResponse.copy(block: cosmos.tx.v1beta1.GetTxResponseKt.Dsl.() -> Unit): cosmos.tx.v1beta1.ServiceOuterClass.GetTxResponse =
  cosmos.tx.v1beta1.GetTxResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
