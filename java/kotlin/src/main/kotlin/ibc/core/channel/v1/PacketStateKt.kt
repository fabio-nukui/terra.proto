//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/channel/v1/channel.proto

package ibc.core.channel.v1;

@kotlin.jvm.JvmSynthetic
inline fun packetState(block: ibc.core.channel.v1.PacketStateKt.Dsl.() -> Unit): ibc.core.channel.v1.ChannelOuterClass.PacketState =
  ibc.core.channel.v1.PacketStateKt.Dsl._create(ibc.core.channel.v1.ChannelOuterClass.PacketState.newBuilder()).apply { block() }._build()
object PacketStateKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: ibc.core.channel.v1.ChannelOuterClass.PacketState.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.channel.v1.ChannelOuterClass.PacketState.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.channel.v1.ChannelOuterClass.PacketState = _builder.build()

    /**
     * <pre>
     * channel port identifier.
     * </pre>
     *
     * <code>string port_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
     */
    var portId: kotlin.String
      @JvmName("getPortId")
      get() = _builder.getPortId()
      @JvmName("setPortId")
      set(value) {
        _builder.setPortId(value)
      }
    /**
     * <pre>
     * channel port identifier.
     * </pre>
     *
     * <code>string port_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
     */
    fun clearPortId() {
      _builder.clearPortId()
    }

    /**
     * <pre>
     * channel unique identifier.
     * </pre>
     *
     * <code>string channel_id = 2 [(.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
     */
    var channelId: kotlin.String
      @JvmName("getChannelId")
      get() = _builder.getChannelId()
      @JvmName("setChannelId")
      set(value) {
        _builder.setChannelId(value)
      }
    /**
     * <pre>
     * channel unique identifier.
     * </pre>
     *
     * <code>string channel_id = 2 [(.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
     */
    fun clearChannelId() {
      _builder.clearChannelId()
    }

    /**
     * <pre>
     * packet sequence.
     * </pre>
     *
     * <code>uint64 sequence = 3;</code>
     */
    var sequence: kotlin.Long
      @JvmName("getSequence")
      get() = _builder.getSequence()
      @JvmName("setSequence")
      set(value) {
        _builder.setSequence(value)
      }
    /**
     * <pre>
     * packet sequence.
     * </pre>
     *
     * <code>uint64 sequence = 3;</code>
     */
    fun clearSequence() {
      _builder.clearSequence()
    }

    /**
     * <pre>
     * embedded data that represents packet state.
     * </pre>
     *
     * <code>bytes data = 4;</code>
     */
    var data: com.google.protobuf.ByteString
      @JvmName("getData")
      get() = _builder.getData()
      @JvmName("setData")
      set(value) {
        _builder.setData(value)
      }
    /**
     * <pre>
     * embedded data that represents packet state.
     * </pre>
     *
     * <code>bytes data = 4;</code>
     */
    fun clearData() {
      _builder.clearData()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun ibc.core.channel.v1.ChannelOuterClass.PacketState.copy(block: ibc.core.channel.v1.PacketStateKt.Dsl.() -> Unit): ibc.core.channel.v1.ChannelOuterClass.PacketState =
  ibc.core.channel.v1.PacketStateKt.Dsl._create(this.toBuilder()).apply { block() }._build()
