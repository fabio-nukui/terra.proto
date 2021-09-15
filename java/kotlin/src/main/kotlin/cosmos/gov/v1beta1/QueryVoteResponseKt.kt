//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/gov/v1beta1/query.proto

package cosmos.gov.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun queryVoteResponse(block: cosmos.gov.v1beta1.QueryVoteResponseKt.Dsl.() -> Unit): cosmos.gov.v1beta1.QueryOuterClass.QueryVoteResponse =
  cosmos.gov.v1beta1.QueryVoteResponseKt.Dsl._create(cosmos.gov.v1beta1.QueryOuterClass.QueryVoteResponse.newBuilder()).apply { block() }._build()
object QueryVoteResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: cosmos.gov.v1beta1.QueryOuterClass.QueryVoteResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.gov.v1beta1.QueryOuterClass.QueryVoteResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.gov.v1beta1.QueryOuterClass.QueryVoteResponse = _builder.build()

    /**
     * <pre>
     * vote defined the queried vote.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.Vote vote = 1 [(.gogoproto.nullable) = false];</code>
     */
    var vote: cosmos.gov.v1beta1.Gov.Vote
      @JvmName("getVote")
      get() = _builder.getVote()
      @JvmName("setVote")
      set(value) {
        _builder.setVote(value)
      }
    /**
     * <pre>
     * vote defined the queried vote.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.Vote vote = 1 [(.gogoproto.nullable) = false];</code>
     */
    fun clearVote() {
      _builder.clearVote()
    }
    /**
     * <pre>
     * vote defined the queried vote.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.Vote vote = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the vote field is set.
     */
    fun hasVote(): kotlin.Boolean {
      return _builder.hasVote()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun cosmos.gov.v1beta1.QueryOuterClass.QueryVoteResponse.copy(block: cosmos.gov.v1beta1.QueryVoteResponseKt.Dsl.() -> Unit): cosmos.gov.v1beta1.QueryOuterClass.QueryVoteResponse =
  cosmos.gov.v1beta1.QueryVoteResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
