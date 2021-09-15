//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/reflection/v2alpha1/reflection.proto

package cosmos.base.reflection.v2alpha1;

@kotlin.jvm.JvmSynthetic
inline fun queryServicesDescriptor(block: cosmos.base.reflection.v2alpha1.QueryServicesDescriptorKt.Dsl.() -> Unit): cosmos.base.reflection.v2alpha1.Reflection.QueryServicesDescriptor =
  cosmos.base.reflection.v2alpha1.QueryServicesDescriptorKt.Dsl._create(cosmos.base.reflection.v2alpha1.Reflection.QueryServicesDescriptor.newBuilder()).apply { block() }._build()
object QueryServicesDescriptorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: cosmos.base.reflection.v2alpha1.Reflection.QueryServicesDescriptor.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.reflection.v2alpha1.Reflection.QueryServicesDescriptor.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.reflection.v2alpha1.Reflection.QueryServicesDescriptor = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class QueryServicesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * query_services is a list of cosmos-sdk QueryServiceDescriptor
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.QueryServiceDescriptor query_services = 1;</code>
     */
     val queryServices: com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.QueryServiceDescriptor, QueryServicesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getQueryServicesList()
      )
    /**
     * <pre>
     * query_services is a list of cosmos-sdk QueryServiceDescriptor
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.QueryServiceDescriptor query_services = 1;</code>
     * @param value The queryServices to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addQueryServices")
    fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.QueryServiceDescriptor, QueryServicesProxy>.add(value: cosmos.base.reflection.v2alpha1.Reflection.QueryServiceDescriptor) {
      _builder.addQueryServices(value)
    }/**
     * <pre>
     * query_services is a list of cosmos-sdk QueryServiceDescriptor
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.QueryServiceDescriptor query_services = 1;</code>
     * @param value The queryServices to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignQueryServices")
    inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.QueryServiceDescriptor, QueryServicesProxy>.plusAssign(value: cosmos.base.reflection.v2alpha1.Reflection.QueryServiceDescriptor) {
      add(value)
    }/**
     * <pre>
     * query_services is a list of cosmos-sdk QueryServiceDescriptor
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.QueryServiceDescriptor query_services = 1;</code>
     * @param values The queryServices to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllQueryServices")
    fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.QueryServiceDescriptor, QueryServicesProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.reflection.v2alpha1.Reflection.QueryServiceDescriptor>) {
      _builder.addAllQueryServices(values)
    }/**
     * <pre>
     * query_services is a list of cosmos-sdk QueryServiceDescriptor
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.QueryServiceDescriptor query_services = 1;</code>
     * @param values The queryServices to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllQueryServices")
    inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.QueryServiceDescriptor, QueryServicesProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.reflection.v2alpha1.Reflection.QueryServiceDescriptor>) {
      addAll(values)
    }/**
     * <pre>
     * query_services is a list of cosmos-sdk QueryServiceDescriptor
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.QueryServiceDescriptor query_services = 1;</code>
     * @param index The index to set the value at.
     * @param value The queryServices to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setQueryServices")
    operator fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.QueryServiceDescriptor, QueryServicesProxy>.set(index: kotlin.Int, value: cosmos.base.reflection.v2alpha1.Reflection.QueryServiceDescriptor) {
      _builder.setQueryServices(index, value)
    }/**
     * <pre>
     * query_services is a list of cosmos-sdk QueryServiceDescriptor
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.QueryServiceDescriptor query_services = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearQueryServices")
    fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.QueryServiceDescriptor, QueryServicesProxy>.clear() {
      _builder.clearQueryServices()
    }}
}
@kotlin.jvm.JvmSynthetic
inline fun cosmos.base.reflection.v2alpha1.Reflection.QueryServicesDescriptor.copy(block: cosmos.base.reflection.v2alpha1.QueryServicesDescriptorKt.Dsl.() -> Unit): cosmos.base.reflection.v2alpha1.Reflection.QueryServicesDescriptor =
  cosmos.base.reflection.v2alpha1.QueryServicesDescriptorKt.Dsl._create(this.toBuilder()).apply { block() }._build()