//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: confio/proofs.proto

package ics23;

@kotlin.jvm.JvmSynthetic
inline fun proofSpec(block: ics23.ProofSpecKt.Dsl.() -> Unit): ics23.Proofs.ProofSpec =
  ics23.ProofSpecKt.Dsl._create(ics23.Proofs.ProofSpec.newBuilder()).apply { block() }._build()
object ProofSpecKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: ics23.Proofs.ProofSpec.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ics23.Proofs.ProofSpec.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ics23.Proofs.ProofSpec = _builder.build()

    /**
     * <pre>
     * any field in the ExistenceProof must be the same as in this spec.
     * except Prefix, which is just the first bytes of prefix (spec can be longer) 
     * </pre>
     *
     * <code>.ics23.LeafOp leaf_spec = 1;</code>
     */
    var leafSpec: ics23.Proofs.LeafOp
      @JvmName("getLeafSpec")
      get() = _builder.getLeafSpec()
      @JvmName("setLeafSpec")
      set(value) {
        _builder.setLeafSpec(value)
      }
    /**
     * <pre>
     * any field in the ExistenceProof must be the same as in this spec.
     * except Prefix, which is just the first bytes of prefix (spec can be longer) 
     * </pre>
     *
     * <code>.ics23.LeafOp leaf_spec = 1;</code>
     */
    fun clearLeafSpec() {
      _builder.clearLeafSpec()
    }
    /**
     * <pre>
     * any field in the ExistenceProof must be the same as in this spec.
     * except Prefix, which is just the first bytes of prefix (spec can be longer) 
     * </pre>
     *
     * <code>.ics23.LeafOp leaf_spec = 1;</code>
     * @return Whether the leafSpec field is set.
     */
    fun hasLeafSpec(): kotlin.Boolean {
      return _builder.hasLeafSpec()
    }

    /**
     * <code>.ics23.InnerSpec inner_spec = 2;</code>
     */
    var innerSpec: ics23.Proofs.InnerSpec
      @JvmName("getInnerSpec")
      get() = _builder.getInnerSpec()
      @JvmName("setInnerSpec")
      set(value) {
        _builder.setInnerSpec(value)
      }
    /**
     * <code>.ics23.InnerSpec inner_spec = 2;</code>
     */
    fun clearInnerSpec() {
      _builder.clearInnerSpec()
    }
    /**
     * <code>.ics23.InnerSpec inner_spec = 2;</code>
     * @return Whether the innerSpec field is set.
     */
    fun hasInnerSpec(): kotlin.Boolean {
      return _builder.hasInnerSpec()
    }

    /**
     * <pre>
     * max_depth (if &gt; 0) is the maximum number of InnerOps allowed (mainly for fixed-depth tries)
     * </pre>
     *
     * <code>int32 max_depth = 3;</code>
     */
    var maxDepth: kotlin.Int
      @JvmName("getMaxDepth")
      get() = _builder.getMaxDepth()
      @JvmName("setMaxDepth")
      set(value) {
        _builder.setMaxDepth(value)
      }
    /**
     * <pre>
     * max_depth (if &gt; 0) is the maximum number of InnerOps allowed (mainly for fixed-depth tries)
     * </pre>
     *
     * <code>int32 max_depth = 3;</code>
     */
    fun clearMaxDepth() {
      _builder.clearMaxDepth()
    }

    /**
     * <pre>
     * min_depth (if &gt; 0) is the minimum number of InnerOps allowed (mainly for fixed-depth tries)
     * </pre>
     *
     * <code>int32 min_depth = 4;</code>
     */
    var minDepth: kotlin.Int
      @JvmName("getMinDepth")
      get() = _builder.getMinDepth()
      @JvmName("setMinDepth")
      set(value) {
        _builder.setMinDepth(value)
      }
    /**
     * <pre>
     * min_depth (if &gt; 0) is the minimum number of InnerOps allowed (mainly for fixed-depth tries)
     * </pre>
     *
     * <code>int32 min_depth = 4;</code>
     */
    fun clearMinDepth() {
      _builder.clearMinDepth()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun ics23.Proofs.ProofSpec.copy(block: ics23.ProofSpecKt.Dsl.() -> Unit): ics23.Proofs.ProofSpec =
  ics23.ProofSpecKt.Dsl._create(this.toBuilder()).apply { block() }._build()