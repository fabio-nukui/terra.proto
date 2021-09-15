//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/abci/types.proto

package tendermint.abci;

@kotlin.jvm.JvmSynthetic
inline fun snapshot(block: tendermint.abci.SnapshotKt.Dsl.() -> Unit): tendermint.abci.Types.Snapshot =
  tendermint.abci.SnapshotKt.Dsl._create(tendermint.abci.Types.Snapshot.newBuilder()).apply { block() }._build()
object SnapshotKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: tendermint.abci.Types.Snapshot.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.abci.Types.Snapshot.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.abci.Types.Snapshot = _builder.build()

    /**
     * <pre>
     * The height at which the snapshot was taken
     * </pre>
     *
     * <code>uint64 height = 1;</code>
     */
    var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <pre>
     * The height at which the snapshot was taken
     * </pre>
     *
     * <code>uint64 height = 1;</code>
     */
    fun clearHeight() {
      _builder.clearHeight()
    }

    /**
     * <pre>
     * The application-specific snapshot format
     * </pre>
     *
     * <code>uint32 format = 2;</code>
     */
    var format: kotlin.Int
      @JvmName("getFormat")
      get() = _builder.getFormat()
      @JvmName("setFormat")
      set(value) {
        _builder.setFormat(value)
      }
    /**
     * <pre>
     * The application-specific snapshot format
     * </pre>
     *
     * <code>uint32 format = 2;</code>
     */
    fun clearFormat() {
      _builder.clearFormat()
    }

    /**
     * <pre>
     * Number of chunks in the snapshot
     * </pre>
     *
     * <code>uint32 chunks = 3;</code>
     */
    var chunks: kotlin.Int
      @JvmName("getChunks")
      get() = _builder.getChunks()
      @JvmName("setChunks")
      set(value) {
        _builder.setChunks(value)
      }
    /**
     * <pre>
     * Number of chunks in the snapshot
     * </pre>
     *
     * <code>uint32 chunks = 3;</code>
     */
    fun clearChunks() {
      _builder.clearChunks()
    }

    /**
     * <pre>
     * Arbitrary snapshot hash, equal only if identical
     * </pre>
     *
     * <code>bytes hash = 4;</code>
     */
    var hash: com.google.protobuf.ByteString
      @JvmName("getHash")
      get() = _builder.getHash()
      @JvmName("setHash")
      set(value) {
        _builder.setHash(value)
      }
    /**
     * <pre>
     * Arbitrary snapshot hash, equal only if identical
     * </pre>
     *
     * <code>bytes hash = 4;</code>
     */
    fun clearHash() {
      _builder.clearHash()
    }

    /**
     * <pre>
     * Arbitrary application metadata
     * </pre>
     *
     * <code>bytes metadata = 5;</code>
     */
    var metadata: com.google.protobuf.ByteString
      @JvmName("getMetadata")
      get() = _builder.getMetadata()
      @JvmName("setMetadata")
      set(value) {
        _builder.setMetadata(value)
      }
    /**
     * <pre>
     * Arbitrary application metadata
     * </pre>
     *
     * <code>bytes metadata = 5;</code>
     */
    fun clearMetadata() {
      _builder.clearMetadata()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun tendermint.abci.Types.Snapshot.copy(block: tendermint.abci.SnapshotKt.Dsl.() -> Unit): tendermint.abci.Types.Snapshot =
  tendermint.abci.SnapshotKt.Dsl._create(this.toBuilder()).apply { block() }._build()
