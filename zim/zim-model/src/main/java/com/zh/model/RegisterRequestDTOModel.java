// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: register.proto

package com.zh.model;

public final class RegisterRequestDTOModel {
  private RegisterRequestDTOModel() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RegisterRequestDTO_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RegisterRequestDTO_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\016register.proto\"4\n\022RegisterRequestDTO\022\014" +
      "\n\004code\030\001 \001(\t\022\020\n\010password\030\002 \001(\tB)\n\014com.zh" +
      ".modelB\027RegisterRequestDTOModelP\001b\006proto" +
      "3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_RegisterRequestDTO_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RegisterRequestDTO_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RegisterRequestDTO_descriptor,
        new String[] { "Code", "Password", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}