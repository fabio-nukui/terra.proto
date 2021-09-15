//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: terra/wasm/v1beta1/tx.proto

package terra.wasm.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun msgMigrateContract(block: terra.wasm.v1beta1.MsgMigrateContractKt.Dsl.() -> Unit): terra.wasm.v1beta1.Tx.MsgMigrateContract =
  terra.wasm.v1beta1.MsgMigrateContractKt.Dsl._create(terra.wasm.v1beta1.Tx.MsgMigrateContract.newBuilder()).apply { block() }._build()
object MsgMigrateContractKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: terra.wasm.v1beta1.Tx.MsgMigrateContract.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: terra.wasm.v1beta1.Tx.MsgMigrateContract.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): terra.wasm.v1beta1.Tx.MsgMigrateContract = _builder.build()

    /**
     * <pre>
     * Admin is the current contract admin
     * </pre>
     *
     * <code>string admin = 1 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     */
    var admin: kotlin.String
      @JvmName("getAdmin")
      get() = _builder.getAdmin()
      @JvmName("setAdmin")
      set(value) {
        _builder.setAdmin(value)
      }
    /**
     * <pre>
     * Admin is the current contract admin
     * </pre>
     *
     * <code>string admin = 1 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     */
    fun clearAdmin() {
      _builder.clearAdmin()
    }

    /**
     * <pre>
     * Contract is the address of the smart contract
     * </pre>
     *
     * <code>string contract = 2 [(.gogoproto.moretags) = "yaml:&#92;"contract&#92;""];</code>
     */
    var contract: kotlin.String
      @JvmName("getContract")
      get() = _builder.getContract()
      @JvmName("setContract")
      set(value) {
        _builder.setContract(value)
      }
    /**
     * <pre>
     * Contract is the address of the smart contract
     * </pre>
     *
     * <code>string contract = 2 [(.gogoproto.moretags) = "yaml:&#92;"contract&#92;""];</code>
     */
    fun clearContract() {
      _builder.clearContract()
    }

    /**
     * <pre>
     * NewCodeID references the new WASM code
     * </pre>
     *
     * <code>uint64 new_code_id = 3 [(.gogoproto.customname) = "NewCodeID", (.gogoproto.moretags) = "yaml:&#92;"new_code_id&#92;""];</code>
     */
    var newCodeId: kotlin.Long
      @JvmName("getNewCodeId")
      get() = _builder.getNewCodeId()
      @JvmName("setNewCodeId")
      set(value) {
        _builder.setNewCodeId(value)
      }
    /**
     * <pre>
     * NewCodeID references the new WASM code
     * </pre>
     *
     * <code>uint64 new_code_id = 3 [(.gogoproto.customname) = "NewCodeID", (.gogoproto.moretags) = "yaml:&#92;"new_code_id&#92;""];</code>
     */
    fun clearNewCodeId() {
      _builder.clearNewCodeId()
    }

    /**
     * <pre>
     * MigrateMsg is json encoded message to be passed to the contract on migration
     * </pre>
     *
     * <code>bytes migrate_msg = 4 [(.gogoproto.moretags) = "yaml:&#92;"migrate_msg&#92;"", (.gogoproto.casttype) = "encoding/json.RawMessage"];</code>
     */
    var migrateMsg: com.google.protobuf.ByteString
      @JvmName("getMigrateMsg")
      get() = _builder.getMigrateMsg()
      @JvmName("setMigrateMsg")
      set(value) {
        _builder.setMigrateMsg(value)
      }
    /**
     * <pre>
     * MigrateMsg is json encoded message to be passed to the contract on migration
     * </pre>
     *
     * <code>bytes migrate_msg = 4 [(.gogoproto.moretags) = "yaml:&#92;"migrate_msg&#92;"", (.gogoproto.casttype) = "encoding/json.RawMessage"];</code>
     */
    fun clearMigrateMsg() {
      _builder.clearMigrateMsg()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun terra.wasm.v1beta1.Tx.MsgMigrateContract.copy(block: terra.wasm.v1beta1.MsgMigrateContractKt.Dsl.() -> Unit): terra.wasm.v1beta1.Tx.MsgMigrateContract =
  terra.wasm.v1beta1.MsgMigrateContractKt.Dsl._create(this.toBuilder()).apply { block() }._build()
