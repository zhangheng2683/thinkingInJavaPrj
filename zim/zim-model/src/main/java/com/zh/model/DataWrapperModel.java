// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_wrapper.proto

package com.zh.model;

public final class DataWrapperModel {
  private DataWrapperModel() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DataWrapper_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DataWrapper_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\022data_wrapper.proto\032\013login.proto\032\024login" +
      "_response.proto\032\016register.proto\032\027registe" +
      "r_response.proto\"\305\003\n\013DataWrapper\022#\n\004type" +
      "\030\001 \001(\0162\025.DataWrapper.DataType\0221\n\022registe" +
      "rRequestDTO\030\002 \001(\0132\023.RegisterRequestDTOH\000" +
      "\0223\n\023registerResponseDTO\030\003 \001(\0132\024.Register" +
      "ResponseDTOH\000\022+\n\017loginRequestDTO\030\004 \001(\0132\020" +
      ".LoginRequestDTOH\000\022-\n\020loginResponseDTO\030\005" +
      " \001(\0132\021.LoginResponseDTOH\000\"\304\001\n\010DataType\022\024" +
      "\n\020register_request\020\000\022\025\n\021register_respons",
      "e\020\001\022\021\n\rlogin_request\020\002\022\022\n\016login_response" +
      "\020\003\022\026\n\022friend_add_request\020\004\022\027\n\023friend_add" +
      "_response\020\005\022\030\n\024message_send_request\020\006\022\031\n" +
      "\025message_send_response\020\007B\006\n\004dataB\"\n\014com." +
      "zh.modelB\020DataWrapperModelP\001b\006proto3"
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
          LoginRequestDTOModel.getDescriptor(),
          LoginResponseDTOModel.getDescriptor(),
          RegisterRequestDTOModel.getDescriptor(),
          RegisterResponseDTOModel.getDescriptor(),
        }, assigner);
    internal_static_DataWrapper_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DataWrapper_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DataWrapper_descriptor,
        new String[] { "Type", "RegisterRequestDTO", "RegisterResponseDTO", "LoginRequestDTO", "LoginResponseDTO", "Data", });
    LoginRequestDTOModel.getDescriptor();
    LoginResponseDTOModel.getDescriptor();
    RegisterRequestDTOModel.getDescriptor();
    RegisterResponseDTOModel.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}