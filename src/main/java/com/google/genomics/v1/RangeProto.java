// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/range.proto

package com.google.genomics.v1;

public final class RangeProto {
  private RangeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_Range_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_genomics_v1_Range_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036google/genomics/v1/range.proto\022\022google" +
      ".genomics.v1\";\n\005Range\022\026\n\016reference_name\030" +
      "\001 \001(\t\022\r\n\005start\030\002 \001(\003\022\013\n\003end\030\003 \001(\003B&\n\026com" +
      ".google.genomics.v1B\nRangeProtoP\001b\006proto" +
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
    internal_static_google_genomics_v1_Range_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_genomics_v1_Range_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_genomics_v1_Range_descriptor,
        new java.lang.String[] { "ReferenceName", "Start", "End", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
